/*
 * The control.display3d package contains subclasses of
 * control.ControlElement that deal with the display3d package
 * Copyright (c) July 2006 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawing3d;

import org.colos.ejs.library.control.value.Value;
import org.opensourcephysics.drawing3d.*;

public class ControlArrow3D extends ControlElement3D {
  static final protected int ARROW_PROPERTIES_ADDED=1;

  private ElementArrow arrow;
  
  @Override
public String getObjectClassname () { return "org.opensourcephysics.drawing3d.ElementArrow"; }

  @Override
protected Element createElement () { 
    arrow = new ElementArrow();
    return arrow;
  }

  @Override
protected int getPropertiesDisplacement () { return ARROW_PROPERTIES_ADDED; }
  
//------------------------------------------------
//Definition of Properties
//------------------------------------------------

 static private java.util.List<String> infoList=null;

 @Override
public java.util.List<String> getPropertyList() {
   if (infoList==null) {
     infoList = new java.util.ArrayList<String> ();
     infoList.add ("style");
     infoList.addAll(super.getPropertyList());
   }
   return infoList;
 }

 @Override
public String getPropertyInfo(String _property) {
   if (_property.equals("style")) return "NewArrowStyle|int";
   if (_property.equals("elementposition"))return "ArrowPosition|int";
   return super.getPropertyInfo(_property);
 }

//------------------------------------------------
//Set and Get the values of the properties
//------------------------------------------------

 @Override
public void setValue (int _index, Value _value) {
   switch (_index) {
     case 0 : arrow.setArrowType(_value.getInteger()); break;
     default : super.setValue(_index-ARROW_PROPERTIES_ADDED,_value); break;
   }
   if (isUnderEjs) updatePanel();
 }

 @Override
public void setDefaultValue (int _index) {
   switch (_index) {
     case 0 : arrow.setArrowType(ElementArrow.ARROW); break;
     default: super.setDefaultValue(_index-ARROW_PROPERTIES_ADDED); break;
   }
   if (isUnderEjs) updatePanel();
 }

 @Override
public String getDefaultValueString (int _index) {
   switch (_index) {
     case 0 : return "ARROW";
     default : return super.getDefaultValueString(_index-ARROW_PROPERTIES_ADDED);
   }
 }

 @Override
public Value getValue (int _index) {
   switch (_index) {
     case 0 : 
       return null;
     default: return super.getValue (_index-ARROW_PROPERTIES_ADDED);
   }
 }


} // End of class
