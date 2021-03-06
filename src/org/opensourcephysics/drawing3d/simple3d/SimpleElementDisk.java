/*
 * Open Source Physics software is free software as described near the bottom of this code file.
 *
 * For additional information and documentation on Open Source Physics please see: 
 * <http://www.opensourcephysics.org/>
 */

package org.opensourcephysics.drawing3d.simple3d;

import org.opensourcephysics.drawing3d.Element;
import org.opensourcephysics.drawing3d.ElementDisk;
import org.opensourcephysics.drawing3d.ElementCylinder;
import org.opensourcephysics.drawing3d.utils.Resolution;

/**
 * <p>Title: SimpleElementCylinder</p>
 * <p>Description: Painter's algorithm implementation of a cylinder</p>
 * @author Francisco Esquembre
 * @version August 2009
 */
public class SimpleElementDisk extends SimpleAbstractTile {

  public SimpleElementDisk(ElementDisk _element) { super(_element); }

  @Override
  protected double[][][] computeTile() {
    ElementDisk circle = (ElementDisk) element;
    int nr = 1, nu = 1;
    double angle1 = circle.getMinimumAngle(), angle2 = circle.getMaximumAngle();
    if (Math.abs(angle2-angle1)>360) {
      angle2 = angle1+360;
    }
    Resolution res = style.getResolution();
    if(res!=null) {
      switch(res.getType()) {
      case Resolution.DIVISIONS :
        nr = Math.max(res.getN1(), 1);
        nu = Math.max(res.getN2(), 1);
        break;
      case Resolution.MAX_LENGTH :
        double dx = Math.abs(element.getSizeX())/2;
        double dy = Math.abs(element.getSizeY())/2;
        nr = Math.max((int) Math.round(0.49+Math.max(dx, dy)/res.getMaxLength()), 1);
        nu = Math.max((int) Math.round(0.49+Math.abs(angle2-angle1)*Element.TO_RADIANS*(dx+dy)/res.getMaxLength()), 1);
        break;
      }
    }
    return ElementCylinder.createStandardCylinder(nr, nu, 1, angle1, angle2, true, false, true, true);
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
