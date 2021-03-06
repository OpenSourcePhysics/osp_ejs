/*
 * The control.display3d package contains subclasses of
 * control.ControlElement that deal with the display3d package
 * Copyright (c) July 2006 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawing3d;

import org.colos.ejs.library.control.value.*;
import org.opensourcephysics.drawing3d.Element;
import org.opensourcephysics.drawing3d.ElementSpring;

/**
 * Abstract superclass for display3d Elements (children of ControlElements3DParent)
 */
public class ControlSpring3D extends ControlElement3D {
  static final private int SPRING3D_PROPERTIES_ADDED=5;

  private ElementSpring spring;

  @Override
public String getObjectClassname () { return "org.opensourcephysics.drawing3d.ElementSpring"; }

  @Override
protected Element createElement () { return spring = new ElementSpring(); }

  @Override
protected int getPropertiesDisplacement () { return SPRING3D_PROPERTIES_ADDED; }

// ------------------------------------------------
// Definition of Properties
// ------------------------------------------------

  static java.util.List<String> infoList=null;

  @Override
public java.util.List<String> getPropertyList() {
    if (infoList==null) {
      infoList = new java.util.ArrayList<String> ();
      infoList.add ("radius");
      infoList.add ("solenoid");
      infoList.add ("thinExtremes");
      infoList.add ("loops");
      infoList.add ("pointsPerLoop");
      infoList.addAll(super.getPropertyList());
    }
    return infoList;
  }

  @Override
public String getPropertyInfo(String _property) {
    if (_property.equals("radius"))          return "int|double";
    if (_property.equals("solenoid"))        return "int|double";
    if (_property.equals("thinExtremes"))    return "boolean";
    if (_property.equals("loops"))           return "int";
    if (_property.equals("pointsPerLoop"))   return "int";

    return super.getPropertyInfo(_property);
  }

// ------------------------------------------------
// Set and Get the values of the properties
// ------------------------------------------------

  @Override
public void setValue (int _index, Value _value) {
    switch (_index) {
      case 0 : spring.setRadius(_value.getDouble()); break;
      case 1 : spring.setSolenoid(_value.getDouble()); break;
      case 2 : spring.setThinExtremes(_value.getBoolean()); break;
      case 3 : spring.setResolution(_value.getInteger(),spring.getPointsPerLoop()); break; 
      case 4 : spring.setResolution(spring.getLoops(),_value.getInteger()); break; 
      default : super.setValue(_index-SPRING3D_PROPERTIES_ADDED,_value); break;
    }
    if (isUnderEjs) updatePanel();
  }

  @Override
public void setDefaultValue (int _index) {
    switch (_index) {
      case 0 : spring.setRadius(ElementSpring.DEF_RADIUS); break;
      case 1 : spring.setSolenoid(0.0); break;
      case 2 : spring.setThinExtremes(true); break;
      case 3 : spring.setResolution(ElementSpring.DEF_LOOPS,spring.getPointsPerLoop()); break; 
      case 4 : spring.setResolution(spring.getLoops(),ElementSpring.DEF_PPL); break; 
      default: super.setDefaultValue(_index-SPRING3D_PROPERTIES_ADDED); break;
    }
    if (isUnderEjs) updatePanel();
  }

  @Override
public String getDefaultValueString (int _index) {
    switch (_index) {
      case 0 : return Double.toString(ElementSpring.DEF_RADIUS);
      case 1 : return "0.0";
      case 2 : return "true";
      case 3 : return Integer.toString(ElementSpring.DEF_LOOPS);
      case 4 : return Integer.toString(ElementSpring.DEF_PPL);
      default : return super.getDefaultValueString(_index-SPRING3D_PROPERTIES_ADDED);
    }
  }

  @Override
public Value getValue (int _index) {
    switch (_index) {
      case 0 : case 1 : case 2 : case 3 : case 4 : 
        return null;
      default: return super.getValue (_index-SPRING3D_PROPERTIES_ADDED);
    }
  }

} // End of class
