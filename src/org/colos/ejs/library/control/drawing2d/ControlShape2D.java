/*
 * The control.display3d package contains subclasses of
 * control.ControlElement that deal with the display3d package
 * Copyright (c) July 2006 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawing2d;

import org.opensourcephysics.drawing2d.*;
import org.colos.ejs.library.control.value.*;

/**
 * A 2D shape
 */
public class ControlShape2D extends ControlElement2D {
  static final private int PROPERTIES_ADDED=3;

  private ElementShape shape;

  @Override
public String getObjectClassname () { return "org.opensourcephysics.drawing2d.ElementShape"; }

  @Override
protected org.opensourcephysics.display.Drawable createDrawable () {
    shape = new ElementShape();
    return shape;
  }

  @Override
protected int getPropertiesDisplacement () { return PROPERTIES_ADDED; }

// ------------------------------------------------
// Definition of Properties
// ------------------------------------------------

  static java.util.List<String> infoList=null;

  @Override
public java.util.List<String> getPropertyList() {
    if (infoList==null) {
      infoList = new java.util.ArrayList<String> ();
      infoList.add ("style");
      infoList.add ("pixelSize");
      infoList.add ("elementposition");
      infoList.addAll(super.getPropertyList());
    }
    return infoList;
  }

  @Override
public String getPropertyInfo(String _property) {
    if (_property.equals("style")) return "MarkerShape|int";
    if (_property.equals("pixelSize")) return "boolean";
    if (_property.equals("elementposition"))return "ElementPosition|int";
    return super.getPropertyInfo(_property);
  }

// ------------------------------------------------
// Set and Get the values of the properties
// ------------------------------------------------

  @Override
public void setValue (int _index, Value _value) {
    switch (_index) {
      case 0 : if (_value.getInteger()!=shape.getShapeType()) shape.setShapeType(_value.getInteger()); break;
      case 1 : if (_value.getBoolean()!=shape.isPixelSize()) shape.setPixelSize(_value.getBoolean()); break;
      case 2 : if (_value.getInteger()!=shape.getStyle().getRelativePosition()) shape.getStyle().setRelativePosition(_value.getInteger()); break; 
      default : super.setValue(_index-PROPERTIES_ADDED,_value); break;
    }
  }

  @Override
public void setDefaultValue (int _index) {
    switch (_index) {
      case 0 : shape.setShapeType(ElementShape.DEFAULT); break;
      case 1 : shape.setPixelSize(false); break;
      case 2 : shape.getStyle().setRelativePosition(Style.CENTERED); break; 
      default: super.setDefaultValue(_index-PROPERTIES_ADDED); break;
    }
  }

  @Override
public String getDefaultValueString (int _index) {
    switch (_index) {
      case 0 : return "ELLIPSE";
      case 1 : return "false";
      case 2 : return "CENTERED";
      default : return super.getDefaultValueString(_index-PROPERTIES_ADDED);
    }
  }

  @Override
public Value getValue (int _index) {
    switch (_index) {
      case 0 : case 1 : case 2 : 
        return null;
      default: return super.getValue (_index-PROPERTIES_ADDED);
    }
  }

} // End of class
