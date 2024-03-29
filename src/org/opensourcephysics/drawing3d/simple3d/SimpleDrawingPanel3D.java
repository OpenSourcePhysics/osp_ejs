/*
 * Open Source Physics software is free software as described near the bottom of this code file.
 *
 * For additional information and documentation on Open Source Physics please see:
 * <http://www.opensourcephysics.org/>
 */

package org.opensourcephysics.drawing3d.simple3d;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JViewport;

import org.opensourcephysics.display.DrawingPanel;
import org.opensourcephysics.display.MessageDrawable;
import org.opensourcephysics.display.OSPRuntime;
import org.opensourcephysics.drawing3d.DrawingPanel3D;
import org.opensourcephysics.drawing3d.Element;
import org.opensourcephysics.drawing3d.utils.ImplementingObject;
import org.opensourcephysics.drawing3d.utils.ImplementingPanel;
import org.opensourcephysics.drawing3d.utils.VisualizationHints;
import org.opensourcephysics.tools.ResourceLoader;

/**
 *
 * <p>Title: SimpleDrawingPanel3D</p>
 * <p>Description: The simple3d implementation of a DrawingPanel3D.</p>
 * <p>Copyright: Open Source Physics project</p>
 * 
 * @author Francisco Esquembre
 * @author Wolfgang Christian
 * @version August 2009
 */
public class SimpleDrawingPanel3D extends javax.swing.JPanel implements ImplementingPanel, Printable, ActionListener {

  // Implementation variables
   private boolean fastRedraw = false;
   private ArrayList<Object3D> list3D = new ArrayList<Object3D>();
   private Object3D.Comparator3D comparator = new Object3D.Comparator3D();

   private boolean needResize = true, needsToRecompute = true;
   volatile private boolean dirtyImage = true; // offscreenImage needs to be recomputed
   volatile private BufferedImage offscreenImage = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
   private BufferedImage workingImage = offscreenImage;
   private javax.swing.Timer updateTimer = new javax.swing.Timer(100, this); // delay before updating the panel
   private Rectangle viewRect = null;
   private Image backgroundImage = null;
   
   private DrawingPanel3D panel3D;
   
   protected MessageDrawable messages = new MessageDrawable();

   public SimpleDrawingPanel3D(DrawingPanel3D _panel) {
     this.panel3D = _panel;
     super.setBackground(panel3D.getVisualizationHints().getBackgroundColor());
     setLayout(new BorderLayout());
     addComponentListener(new java.awt.event.ComponentAdapter() {
       @Override
	public void componentResized(java.awt.event.ComponentEvent e) {
         needResize = true;
         dirtyImage = true;
       }
     });
   }

   // ------------------------------------
   // Implementation of ImplementingPanel
   // ------------------------------------

   @Override
	public void cameraChanged(int howItChanged) {} // Does nothing
   
   @Override
public Component getComponent() { return this; }

   @Override
public void forceRefresh() { 
     needsToRecompute = true;
     dirtyImage = true;
   }

   @Override
public void update() {
     dirtyImage = true;
     updatePanel();
   }

   @Override
public void setFastRedraw(boolean fast) {
     fastRedraw = fast;
   }
   
	/**
	 * Shows a message in a yellow text box in the lower right hand corner.
	 *
	 * @param msg
	 */
	@Override
	public void setMessage(String msg) {
		setMessage(msg, DrawingPanel.BOTTOM_RIGHT);
	}

	
	private String[] lastMessage = new String[4];
	/**
	 * Shows a message in a yellow text box.
	 *
	 * location 0=bottom left location 1=bottom right location 2=top right location
	 * 3=top left
	 *
	 * @param msg
	 * @param location
	 */
	@Override
	public void setMessage(String msg, int location) {
		if (msg != null && msg.length() == 0)
			msg = null;
		messages.setMessage(null, msg, location);
		if (msg == null ? lastMessage == null : msg.equals(lastMessage[location])) {
			return;
		}
		lastMessage[location] = msg;
		repaint();
	}

   // ------------------------------------
   // Implementation of Renderable
   // ------------------------------------

   @Override
   public BufferedImage render(BufferedImage image) {
     Graphics g = image.getGraphics();
     paintEverything(g, image.getWidth(null), image.getHeight(null));
     g.dispose(); // Disposes of the graphics context and releases any system resources that it is using.
     return image;
   }

   @Override
public BufferedImage render() {
      if (!isShowing()||isIconified()) { // don't render if panel cannot be seen
         needsToRecompute = true;       // make sure we recompute later when we are showing
         return null;                   // no need to render if the frame is not visible
      }
      BufferedImage thisWorkingImage = checkImageSize(this.workingImage);
      synchronized(thisWorkingImage) {           // do not let threads access workingImage while it is being painted
         if (needResize) {
            panel3D.computeConstants(thisWorkingImage.getWidth(), thisWorkingImage.getHeight());
            needResize = false;
         }
         render(thisWorkingImage);
         // swap the images
         this.workingImage = offscreenImage; // use current offscreen image for the next drawing
         offscreenImage = thisWorkingImage;      // recently drawn image is now the offscreenImage
         dirtyImage = false;                 // offscreenImage is up to date
      }
      // the offscreenImage is now ready to be copied to the screen
      // always update a Swing component from the event thread
		OSPRuntime.dispatchEventWait(new Runnable() {
			@Override
			public void run() {
				paintImmediately(getVisibleRect());
			}
		});
      org.opensourcephysics.tools.VideoTool vidCap = panel3D.getVideoTool();
      if (vidCap!=null && offscreenImage!=null && vidCap.isRecording()) { // buffered image should exists so use it.
        vidCap.addFrame(offscreenImage);
      }
      return thisWorkingImage;
   }

   // ------------------------------------
   // Implementation of ActionListener
   // ------------------------------------

   /**
    * Performs an action for the update timer by rendering a new background image
    * @param  evt
    */
   @Override
public void actionPerformed(ActionEvent evt) { // render a new image if the current image is dirty
      if (dirtyImage || needsUpdate()) render(); // renders the scene from within the timer thread
   }

   // ---------------------------------
   // Override super's methods
   // ---------------------------------

   /**
    * Tell the panels whether the simulation thread will repaint the scene
    * @param ignoreRepaint
    */
   @Override
   public void setIgnoreRepaint(boolean ignoreRepaint) {
     messages.setIgnoreRepaint(ignoreRepaint);
     super.setIgnoreRepaint(ignoreRepaint);
   }
   
   /**
    * Paints the component by copying the offscreen image into the graphics context.
    * @param g Graphics
    */
   @Override
   public void paintComponent(Graphics g) {
     // find the clipping rectangle within a scroll pane viewport
     viewRect = null;
     Container c = getParent();
     while(c!=null) {
       if (c instanceof JViewport) {
         viewRect = ((JViewport) c).getViewRect();
         break;
       }
       c = c.getParent();
     }
     int xoff = (getWidth()-offscreenImage.getWidth())/2;
     int yoff = (getHeight()-offscreenImage.getHeight())/2;
     g.drawImage(offscreenImage, xoff, yoff, null); // copy image to the center of the panel
     if (dirtyImage || needsUpdate()) { // Paco : can this be commented out?
       updatePanel();               // starts an update timer event
     }
   }

   /**
    * Invalidates this component.  This component and all parents
    * above it are marked as needing to be laid out.  This method can
    * be called often, so it needs to execute quickly.
    * @see       #validate
    * @see       #doLayout
    * @see       LayoutManager
    * @since     JDK1.0
    */
   @Override
   public void invalidate(){
      needResize = true;
      super.invalidate();
   }

   // ----------------------------------------------------
   // private methods
   // ----------------------------------------------------

   /**
    * Update the panel's buffered image from within a separate timer thread.
    */
   private void updatePanel() {
      if (getIgnoreRepaint()) return; // the animation thread will take care of the update
      updateTimer.setRepeats(false); // perform only one render event
      updateTimer.setCoalesce(true); // coalesce render events
      updateTimer.start();           // start update timer
   }

   /**
    * Whether the image is dirty or any of the elements has changed
    * @return boolean
    */
   private final boolean needsUpdate() {
      for(Element el : panel3D.getElements()) if (el.hasChanged()) return true;
      return false;
   }

   /**
    * Checks the image to see if the working image has the correct Dimension.
    * @return <code>true <\code> if the offscreen image matches the panel;  <code>false <\code> otherwise
    */
   private BufferedImage checkImageSize(BufferedImage image) {
      int width = getWidth(), height = getHeight();
      if((width<=2)||(height<=2)) { // image is too small to draw anything useful
         return new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
      }
      if((image==null)||(width!=image.getWidth())||(height!=image.getHeight())) {
         // a new image with the correct size will be created
         return getGraphicsConfiguration().createCompatibleImage(width, height);
      }
      return image; // given image is the correct size
   }

   /**
    * Gets the iconified flag from the top level frame.
    * @return boolean true if frame is iconified; false otherwise
    */
   private boolean isIconified() {
     Component c = getTopLevelAncestor();
     if(c instanceof Frame) {
       return(((Frame) c).getExtendedState()&Frame.ICONIFIED)==1;
     }
     return false;
   }

   // ----------------------------------------------------
   // All the painting stuff
   // ----------------------------------------------------

   /**
    * Paints everyting assuming an object of the given width and height in pixels.
    * @param g Graphics
    * @param width int
    * @param height int
    */
   private synchronized void paintEverything(Graphics g, int width, int height) {
      // W. Christian recompute scale if something has changed
      if(needsToRecompute||(width!=getWidth())||(height!=getHeight())) {
         panel3D.computeConstants(width, height);
      }
      java.util.List<Element> tempList = panel3D.getElements();
      tempList.addAll(panel3D.getDecoration().getElementList());
      if (backgroundImage!=null) {
        AffineTransform transform = new AffineTransform();
        transform.scale((1.0*width)/backgroundImage.getWidth(this),(1.0*height)/backgroundImage.getHeight(this));
        ((Graphics2D) g).drawImage(backgroundImage,transform,this);
//        System.out.println ("Painted background image is "+backgroundImage);
      }
      else {
        g.setColor(panel3D.getVisualizationHints().getBackgroundColor());
        g.fillRect(0, 0, width, height); // fill the component with the background color
      }
      paintDrawableList(g, tempList);
   }

   private void paintDrawableList(Graphics g, java.util.List<Element> tempList) {
      Graphics2D g2 = (Graphics2D) g;
      if (fastRedraw||!panel3D.getVisualizationHints().isRemoveHiddenLines()) { // Do a quick sketch of the scene
        for (Element el : tempList) {
          if (!el.isVisible()) continue; 
          el.processChanges(Element.CHANGE_NONE);
          ((SimpleElement) el.getImplementingObject()).drawQuickly(g2);
        }
        return;
      }
      // Collect objects, sort and draw them one by one. Takes time!!!
      list3D.clear();
      for (Element el : tempList) { // Collect all Objects3D
        if (!el.isVisible()) continue; 
         ImplementingObject io = el.getImplementingObject();
        if (! (io instanceof SimpleElement)) return; // the implementation has changed 
        el.processChanges(Element.CHANGE_NONE);
        Object3D[] objects = ((SimpleElement) io).getObjects3D();
        if (objects==null) continue;
        for(int i = 0, n = objects.length; i<n; i++) {
          // providing NaN as distance can be used by Drawables3D to hide a given Object3D
          if (!Double.isNaN(objects[i].getDistance())) list3D.add(objects[i]);
        }
      }
      if(list3D.size()<=0) return;
      Object3D[] objects = list3D.toArray(new Object3D[0]);
      Arrays.sort(objects, comparator);
      for(int i = 0, n = objects.length; i<n; i++) {
         Object3D obj = objects[i];
         obj.getSimpleElement().draw(g2, obj.getIndex());
      }
   }

   // ----------------------------------------------------
   // Printable interface
   // ----------------------------------------------------
   
   @Override
public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
      if(pageIndex>=1) {
         return Printable.NO_SUCH_PAGE;
      }
      if(g==null) {
         return Printable.NO_SUCH_PAGE;
      }
      Graphics2D g2 = (Graphics2D) g;
      double scalex = pageFormat.getImageableWidth()/getWidth();
      double scaley = pageFormat.getImageableHeight()/getHeight();
      double scale = Math.min(scalex, scaley);
      g2.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
      g2.scale(scale, scale);
      paintEverything(g2, getWidth(), getHeight());
      return Printable.PAGE_EXISTS;
   }

   @Override
public void visualizationChanged(int _change){
     switch(_change){
       case VisualizationHints.HINT_BACKGROUND_IMAGE:
         if (panel3D.getVisualizationHints().getBackgroundImageFilename()!=null) {
           backgroundImage = ResourceLoader.getBufferedImage(panel3D.getVisualizationHints().getBackgroundImageFilename());
         }
         else backgroundImage = panel3D.getVisualizationHints().getBackgroundImage();
//         System.out.println ("Background image is "+backgroundImage);
         updatePanel();
         break;
     }
   }

   /***************************************************Andres*******************************************************
    * DO nothing with simple3D
    **************************************************************************************************************/
   @Override
public void setEyeDistance(double d) {
     // do nothing   
   }
   //*************************************************************************************************************+
  
   
}
/*
 * Open Source Physics software is free software; you can redistribute
 * it and/or modify it under the terms of the GNU General Public License (GPL) as
 * published by the Free Software Foundation; either version 2 of the License,
 * or(at your option) any later version.
 *
 * Code that uses any portion of the code in the org.opensourcephysics package
 * or any subpackage (subdirectory) of this package must must also be be released
 * under the GNU GPL license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston MA 02111-1307 USA
 * or view the license online at http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2007  The Open Source Physics project
 *                     http://www.opensourcephysics.org
 */
