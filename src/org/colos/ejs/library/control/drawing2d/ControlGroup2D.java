/*
 * The control.display3d package contains subclasses of
 * control.ControlElement that deal with the display3d package
 * Copyright (c) July 2006 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawing2d;

import java.util.*;
import org.colos.ejs.library.control.ControlElement;
import org.colos.ejs.library.control.swing.*;
import org.opensourcephysics.display.Drawable;
import org.opensourcephysics.display.DrawingPanel;
import org.opensourcephysics.drawing2d.*;


/**
 * A group 2d
 */
public class ControlGroup2D extends ControlElement2D implements NeedsPreUpdate, ControlParentOfDrawables {
  private Group group;

  @Override
public String getObjectClassname () { return "org.opensourcephysics.drawing2d.Group"; }

  @Override
protected Drawable createDrawable () {
    return group = new Group();
  }

  final Group getGroup2D () { return group; }
  
  @Override
protected int getPropertiesDisplacement () { return 0; }

  @Override
public boolean acceptsChild (ControlElement _child) {
    if (_child instanceof ControlElement2D) return true;
    return false;
  }
  
//------------------------------------------
//Implementation of ControlParentOfDrawables
//------------------------------------------

   // List of children that need to do something before repainting the panel
   private Vector<NeedsPreUpdate> preupdateList = new Vector<NeedsPreUpdate>();

   @Override
public DrawingPanel getDrawingPanel() { return (DrawingPanel) group.getPanel().getComponent(); }
   
   @Override
public void preupdate () { // Pass it over to children
     for (Enumeration<NeedsPreUpdate> e=preupdateList.elements(); e.hasMoreElements(); ) e.nextElement().preupdate();
   }

   @Override
public void addToPreupdateList (NeedsPreUpdate _child) { preupdateList.add(_child); }

   @Override
public void removeFromPreupdateList (NeedsPreUpdate _child) { preupdateList.remove(_child); }

   @Override
public void addDrawable (Drawable _element) { 
     group.addElement((Element)_element); 
     if (isUnderEjs && group.getPanel()!=null) getDrawingPanel().render();
   }

   @Override
public void addDrawableAtIndex(int _index, Drawable _element) { 
     group.addElementAtIndex(_index,(Element)_element);
     if (isUnderEjs && group.getPanel()!=null) getDrawingPanel().render();
   }

   
   @Override
public void removeDrawable (Drawable _element) { 
     group.removeElement((Element)_element);
     if (isUnderEjs && group.getPanel()!=null) getDrawingPanel().render();
   }

} // End of class
