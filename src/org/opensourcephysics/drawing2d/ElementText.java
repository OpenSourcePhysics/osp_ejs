/*
 * Open Source Physics software is free software as described near the bottom of this code file.
 *
 * For additional information and documentation on Open Source Physics please see:
 * <http://www.opensourcephysics.org/>
 */

package org.opensourcephysics.drawing2d;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

import org.opensourcephysics.display.DrawableTextLine;
import org.opensourcephysics.display.OSPRuntime;
import org.opensourcephysics.display.TextLine;

/**
 * <p>Title: ElementText</p>
 * <p>Description: A text.</p>
 * @author Francisco Esquembre
 * @version June 2008
 */
public class ElementText extends Element {
  // Configuration variables
  private String text="";
  private Font font;
  private boolean trueSize=false;
  
  private boolean useDrawableTL = OSPRuntime.isJS;
  // Implementation variables
  private double[] coordinates = new double[3]; // The input for all projections
  private double[] pixel = new double[3]; // The output of all projections
  private TextLine textLine = (useDrawableTL ? new DrawableTextLine("", 0, 0) : new TextLine());
  private AffineTransform trAlign = new AffineTransform();
private double xAlign;
private double yAlign;

  {
    setSizeXY(0.4,0.4);
    setFont(new Font("dialog",Font.PLAIN,12));
    getStyle().setRelativePosition(Style.CENTERED);
    getStyle().setFillColor(getStyle().getLineColor());
  }
  
  // -------------------------------------
  // New configuration methods
  // -------------------------------------

  /**
   * Sets the text to be displayed
   * @param text the String
   */
  public void setText(String _text) {
    textLine.setText(text = _text); //org.opensourcephysics.display.TeXParser.parseTeX(_text));
  }

  /**
   * Gets the text displayed
   */
  public String getText() {
    return this.text;
  }

  /**
   * Sets the font for the text
   * @param font Font
   */
  public void setFont(Font _font) {
    this.font = _font;
    textLine.setFont(_font);
  }

  /**
   * Gets the font of the text
   * @return Font
   */
  public Font getFont() {
    return this.font;
  }

  /**
   * Set whether the size should be that prescribed by the font
   * @param _s boolean
   */
  public void setTrueSize (boolean _s) { 
    trueSize = _s; 
    setNeedToProject(true);
  }
  
  /**
   * Get whether the size should be that prescribed by the font
   * @return boolean
   */
  public boolean isTrueSize () { return trueSize; }
  
  @Override
  protected void styleChanged(int styleThatChanged) {
    if (styleThatChanged==Style.CHANGED_RELATIVE_POSITION) {
      switch (getStyle().getRelativePosition()) {
        default :
        case Style.CENTERED   : 
        case Style.NORTH      : 
        case Style.SOUTH      : textLine.setJustification(TextLine.CENTER); break;
        case Style.EAST       : 
        case Style.NORTH_EAST : 
        case Style.SOUTH_EAST : textLine.setJustification(TextLine.RIGHT); break;
        case Style.WEST       : 
        case Style.NORTH_WEST : 
        case Style.SOUTH_WEST : textLine.setJustification(TextLine.LEFT); break;
      }
      double x1,y1;
      switch (getStyle().getRelativePosition()) {
        default :
        case Style.CENTERED   : x1 = -0.5; y1 = -0.5; break;
        case Style.NORTH      : x1 = -0.5; y1 = -1.0; break;
        case Style.SOUTH      : x1 = -0.5; y1 =  0.0; break;
        case Style.EAST       : x1 = -1.0; y1 = -0.5; break;
        case Style.WEST       : x1 =  0.0; y1 = -0.5; break;
        case Style.NORTH_EAST : x1 = -1.0; y1 = -1.0; break;
        case Style.NORTH_WEST : x1 =  0.0; y1 = -1.0; break;
        case Style.SOUTH_EAST : x1 = -1.0; y1 =  0.0; break;
        case Style.SOUTH_WEST : x1 =  0.0; y1 =  0.0; break;
      }
      xAlign = x1;
      yAlign = y1;
      trAlign = AffineTransform.getTranslateInstance(x1, y1);
    }
  }
  
  // -------------------------------------
  // Abstract part of Element or Parent methods overwritten
  // -------------------------------------
 
  @Override
  protected int getCorners(double[] _corners) {
    if (trueSize) {
      _corners[0] = _corners[1] = 0;
      return 1;
    }
    switch (getStyle().getRelativePosition()) {
      default :
      case Style.CENTERED   : _corners[0] = -0.5; _corners[1] = -0.5; break;
      case Style.NORTH      : _corners[0] = -0.5; _corners[1] = -1.0; break;
      case Style.SOUTH      : _corners[0] = -0.5; _corners[1] =  0.0; break;
      case Style.EAST       : _corners[0] = -1.0; _corners[1] = -0.5; break;
      case Style.WEST       : _corners[0] =  0.0; _corners[1] = -0.5; break;
      case Style.NORTH_EAST : _corners[0] = -1.0; _corners[1] = -1.0; break;
      case Style.NORTH_WEST : _corners[0] =  0.0; _corners[1] = -1.0; break;
      case Style.SOUTH_EAST : _corners[0] = -1.0; _corners[1] =  0.0; break;
      case Style.SOUTH_WEST : _corners[0] =  0.0; _corners[1] =  0.0; break;
    }
    _corners[4] = _corners[2] = _corners[0] + 1.0;
    _corners[6] = _corners[0];
    _corners[3] = _corners[1];
    _corners[5] = _corners[7] = _corners[1] + 1.0;
    return 4;
  }

  private AffineTransform trET = new AffineTransform();
  private AffineTransform trETinv = new AffineTransform();
  private Point2D.Double pixelPt = new Point2D.Double();
  
  public void draw(org.opensourcephysics.display.DrawingPanel _panel, Graphics _g) {
		if (!isReallyVisible() || text == null || text.length() <= 0)
			return;
		// if (hasChanged() || needsToProject()) projectPoints();
		Graphics2D g2 = (Graphics2D) _g;
		AffineTransform at = getPixelTransform(_panel);
		pixelPt.setLocation(0, 0);
		at.transform(pixelPt, pixelPt);

		Stroke stroke = getStyle().getLineStroke();
		Color color = getStyle().getLineColor();
		Paint fill = getStyle().getFillColor();
		g2.setStroke(stroke);

		FontMetrics fm = g2.getFontMetrics(font);
		if (!trueSize && !useDrawableTL) {
			// Java only -- but do we need to go throw all this trouble?
			TextLayout tl = new TextLayout(text, font, g2.getFontRenderContext());
			java.awt.geom.Rectangle2D rect = tl.getBounds();
			int cw = fm.stringWidth("X");
		    at.setTransform(trAlign);
		    // BH 2020.03.29 Java Bug - -There was a coding error here -- was 
		    //tr.scale(1.0 / rect.getWidth(), -1.0 / rect.getHeight());
			// but that makes the w and h the same, regardless of the number of characters in the text.
		    at.scale(1.0 / cw, -1.0 / cw);
			at.translate(-rect.getX(), -rect.getMaxY());
			//at.rotate(Math.PI/2); // just testing
			Shape shape = transformShape(_panel, tl.getOutline(at));
//			System.out.println("\nrect=" + rect + "\nshape=" 
//			+ shape.getBounds() + "\ntr="
//					+ at + "\n" + trAlign);
			if (fill != null && getStyle().isDrawingFill()) { // First fill the inside
				g2.setPaint(fill);
				g2.fill(shape);
			}
			if (color != null && getStyle().isDrawingLines()) {
				g2.setColor(color);
				g2.draw(shape);
			}
		} else {
			// JavaScript or trueSize
		    AffineTransform tr0 = g2.getTransform();
			textLine.setColor(color);
			int px = 0, py = 0;
			if (trueSize) {
				 px = (int) pixel[0];
				 py = (int) pixel[1];
				if (hasChanged() || needsToProject())
					projectPoints();
				try {
					trET.setTransform(tr0);
					trET.translate(pixel[0], pixel[1]);
					trET.concatenate(trETinv);
					trET.translate(-pixel[0], -pixel[1]);
					g2.setTransform(trET);
				} catch (Exception exc) {
				}
			} else {
				// JavaScript only -- very simple!
				px = (int) pixelPt.x;
				py = (int) pixelPt.y;
			}
			
			// adjust from baseline to center of an "X"
			int leny = textLine.getHeight(_g) / 2;
			switch (getStyle().getRelativePosition()) {
			case Style.CENTERED:
			case Style.EAST:
			case Style.WEST:
				py += leny / 2;
				break;
			case Style.NORTH:
			case Style.NORTH_EAST:
			case Style.NORTH_WEST:
				py += leny;
				break;
			default:
				break;
			}
			
			//g2.transform(AffineTransform.getRotateInstance(Math.PI/2,  px,  py)); // just testing
			g2.setFont(font); // BH -- oops, forgot this? or is it set earlier?
			textLine.drawText(g2, px, py);
			g2.setTransform(tr0);
		}
//		g2.drawLine((int) pixelPt.x,(int) pixelPt.y-5,(int) pixelPt.x,(int) pixelPt.y + 5 );
//		g2.drawLine((int) pixelPt.x-5,(int) pixelPt.y,(int) pixelPt.x+5,(int) pixelPt.y);
	}

  // -------------------------------------
  // Interaction
  // -------------------------------------
  
  public org.opensourcephysics.display.Interactive findInteractive(org.opensourcephysics.display.DrawingPanel _panel, int _xpix, int _ypix) {
    if (!targetPosition.isEnabled()) return null;
    if (!isReallyVisible()) return null;
    if (hasChanged()||needsToProject()) projectPoints();
    int sensitivity = getStyle().getSensitivity();
    if (Math.abs(pixel[0]-_xpix)<sensitivity && Math.abs(pixel[1]-_ypix)<sensitivity) {
      return this.targetPosition;
    }
    return null;
  }

  // -------------------------------------
  // Private methods
  // -------------------------------------
  
  private void projectPoints() {
    coordinates[0] = 0.0; 
    coordinates[1] = 0.0;
    getTotalTransform().transform(coordinates,0,coordinates,0,1);
    getPanel().projectPosition(coordinates, pixel);
    setNeedToProject(false);
  }
  
}

/*
 * Open Source Physics software is free software; you can redistribute
 * it and/or modify it under the terms of the GNU General Public License (GPL) as
 * published by the Free Software Foundation; either version 2 of the License,
 * or(at your option) any later version.

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
