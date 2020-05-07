/*
 * The control.display3d package contains subclasses of
 * control.ControlElement that deal with the display3d package
 * Copyright (c) July 2006 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawing2d;

import org.colos.ejs.library.control.value.Value;
import org.opensourcephysics.drawing2d.*;


/**
 * A 2D segment
 */
public class ControlSegment2D extends ControlElement2D {
  static final private int PROPERTIES_ADDED=1;

  private ElementSegment segment;

  @Override
public String getObjectClassname () { return "org.opensourcephysics.drawing2d.ElementSegment"; }

  @Override
protected org.opensourcephysics.display.Drawable createDrawable () { 
    return segment = new ElementSegment(); 
  }

  
  @Override
protected int getPropertiesDisplacement () { return PROPERTIES_ADDED; }

  //------------------------------------------------
  //Definition of Properties
  //------------------------------------------------

  static java.util.List<String> infoList=null;

  @Override
public java.util.List<String> getPropertyList() {
    if (infoList==null) {
      infoList = new java.util.ArrayList<String> ();
      infoList.add ("elementposition");
      infoList.addAll(super.getPropertyList());
    }
    return infoList;
  }

  @Override
public String getPropertyInfo(String _property) {
    if (_property.equals("elementposition"))return "ArrowPosition|int";
    return super.getPropertyInfo(_property);
  }

  //------------------------------------------------
  //Set and Get the values of the properties
  //------------------------------------------------

  @Override
public void setValue (int _index, Value _value) {
    switch (_index) {
      case 0 : if (_value.getInteger()!=segment.getStyle().getRelativePosition()) segment.getStyle().setRelativePosition(_value.getInteger()); break; 
      default : super.setValue(_index-PROPERTIES_ADDED,_value); break;
    }
  }

  @Override
public void setDefaultValue (int _index) {
    switch (_index) {
      case 0 : segment.getStyle().setRelativePosition(Style.NORTH_EAST); break; 
      default: super.setDefaultValue(_index-PROPERTIES_ADDED); break;
    }
  }

  @Override
public String getDefaultValueString (int _index) {
    switch (_index) {
      case 0 : return "NORTH_EAST";
      default : return super.getDefaultValueString(_index-PROPERTIES_ADDED);
    }
  }

  @Override
public Value getValue (int _index) {
    switch (_index) {
      case 0 : 
        return null;
      default: return super.getValue (_index-PROPERTIES_ADDED);
    }
  }


} // End of class
