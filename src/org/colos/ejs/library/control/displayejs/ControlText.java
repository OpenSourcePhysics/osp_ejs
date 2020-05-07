/*
 * The control.displayejs package contains subclasses of
 * control.ControlElement that deal with the displayejs package
 * Copyright (c) October 2003 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.displayejs;

import org.colos.ejs.library.control.value.Value;
import org.opensourcephysics.displayejs.*;
import org.opensourcephysics.display.Drawable;

/**
 * An interactive particle
 */
public class ControlText extends ControlInteractiveElement {
  protected InteractiveText text;

  public ControlText () { super (); enabledEjsEdit = true; }

  @Override
protected Drawable createDrawable () {
    text = new InteractiveText();
    text.setEnabled(InteractiveElement.TARGET_POSITION,true);  // Backwards compatibility
    return text;
  }

  @Override
protected int getPropertiesDisplacement () { return 1; }

// ------------------------------------------------
// Properties
// ------------------------------------------------

  static java.util.List<String> infoList=null;

  @Override
public java.util.List<String> getPropertyList() {
    if (infoList==null) {
      infoList = new java.util.ArrayList<String> ();
      infoList.add ("text");
      infoList.addAll(super.getPropertyList());
    }
    return infoList;
  }

  @Override
public String getPropertyInfo(String _property) {
    if (_property.equals("text"))             return "String TRANSLATABLE";
    return super.getPropertyInfo(_property);
  }

// ------------------------------------------------
// Set and Get the values of the properties
// ------------------------------------------------

  @Override
public void setValue (int _index, Value _value) {
    switch (_index) {
      case  0 : text.getStyle().setDisplayObject(_value.getString()); break;
      default: super.setValue(_index-1,_value); break;
    }
  }

  @Override
public void setDefaultValue (int _index) {
    switch (_index) {
      case  0 : text.getStyle().setDisplayObject(""); break;
      default: super.setDefaultValue(_index-1); break;
    }
  }

  @Override
public String getDefaultValueString (int _index) {
    switch (_index) {
      case 0 : return "<none>";
      default : return super.getDefaultValueString(_index-1);
    }
  }

  @Override
public Value getValue (int _index) {
    switch (_index) {
      case 0 : return null;
      default: return super.getValue(_index-1);
    }
  }

} // End of class
