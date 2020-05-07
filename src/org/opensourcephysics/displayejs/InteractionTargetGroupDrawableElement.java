/*
 * The display3D package contains 3D drawing classes and drawables
 * @author F. Esquembre (http://fem.um.es).
 * Last version : July 2003
 */

package org.opensourcephysics.displayejs;

import org.opensourcephysics.display.*;

public class InteractionTargetGroupDrawableElement implements InteractionTarget {
  private GroupDrawable group;
  private InteractiveElement element;
  private InteractionTarget targetHit;

  InteractionTargetGroupDrawableElement(GroupDrawable _group, InteractiveElement _element, InteractionTarget _targetHit) {
    group = _group;
    element = _element;
    targetHit = _targetHit;
  }

  @Override
public InteractionSource getSource () { return group; }

  @Override
public Point3D getHotspot (DrawingPanel _panel) { return targetHit.getHotspot(_panel); }

  @Override
public void updateHotspot (DrawingPanel _panel, Point3D _point) { targetHit.updateHotspot(_panel,_point); }

  /* Extra information */

  public InteractiveElement getElement() { return element; }

  /* Dummy implementation of Interactive */

  @Override
public Interactive findInteractive(DrawingPanel _panel, int _xpix, int _ypix) { return null; }
  @Override
public void setEnabled(boolean _enabled) { }
  @Override
public boolean isEnabled() { return true; }
  @Override
public void setXY(double _x, double _y) { }
  @Override
public void setX(double _x){ }
  @Override
public void setY(double _y){ }
  @Override
public double getX(){ return Double.NaN; }
  @Override
public double getY(){ return Double.NaN; }

  @Override
public boolean isMeasured () { return true; }
  @Override
public double getXMin(){ return Double.NaN; }
  @Override
public double getXMax(){ return Double.NaN; }
  @Override
public double getYMin(){ return Double.NaN; }
  @Override
public double getYMax(){ return Double.NaN; }

  @Override
public void draw (DrawingPanel _panel, java.awt.Graphics _g) { }

}


