/*
 * The control.swing package contains subclasses of control.ControlElement
 * that create visuals using Java's Swing library
 * Copyright (c) June 2002 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.swing;

import org.colos.ejs.library.control.ControlElement;
import org.colos.ejs.library.control.value.*;

import javax.swing.JCheckBox;
import javax.swing.AbstractButton;

/**
 * A configurable checkbox. It will trigger an action when the
 * state changes. It has a boolean internal value.
 */
public class ControlCheckBox extends ControlSwingElement {
  static final int VARIABLE  = 4;
  static final int SELECTED  = 5;

  protected AbstractButton checkbox;
  protected BooleanValue internalValue;
  protected boolean defaultState, defaultStateSet;
  protected String imageFile = null, selectedimageFile = null, labelString="";

// ------------------------------------------------
// Visual component
// ------------------------------------------------

  protected int getVariableIndex () { return ControlCheckBox.VARIABLE; }
  protected int getValueIndex () { return ControlCheckBox.SELECTED; }

  @Override
protected java.awt.Component createVisual () {
    checkbox = new JCheckBox ();
    defaultStateSet = false;
    internalValue = new BooleanValue(defaultState=checkbox.isSelected());
    checkbox.addActionListener (
      new java.awt.event.ActionListener() {
        @Override
		public void actionPerformed (java.awt.event.ActionEvent _e) {
          setInternalValue (checkbox.isSelected());
          if (isUnderEjs) setFieldListValueWithAlternative(getVariableIndex(), getValueIndex(),internalValue);
        }
      }
    );
    return checkbox;
  }

  @Override
public void reset() {
    if (defaultStateSet) {
      checkbox.setSelected(defaultState);
      setInternalValue (defaultState); // This can cause cyclic behaviour
    }
  }

  protected void setInternalValue (boolean _state) {
    //System.out.println ("Setting internal value of "+this.toString()+" to "+_state);
    internalValue.setValue(_state);
    variableChanged (getVariableIndex (),internalValue);
    invokeActions ();
    if (internalValue.getBoolean()) invokeActions(ControlSwingElement.ACTION_ON);
    else invokeActions(ControlSwingElement.ACTION_OFF);
  }


// ------------------------------------------------
// Properties
// ------------------------------------------------

  static private java.util.List<String> infoList=null;

  @Override
public java.util.List<String> getPropertyList() {
    if (infoList==null) {
      infoList = new java.util.ArrayList<String> ();
      infoList.add ("text");
      infoList.add ("image");
      infoList.add ("selectedimage");
      infoList.add ("alignment");
      infoList.add ("variable");
      infoList.add ("selected");
      infoList.add ("action");
      infoList.add ("actionon");
      infoList.add ("actionoff");
      infoList.add ("mnemonic");
      infoList.addAll(super.getPropertyList());
    }
    return infoList;
  }

  @Override
public String getPropertyInfo(String _property) {
    if (_property.equals("text"))           return "String NotTrimmed TRANSLATABLE";
    if (_property.equals("image"))          return "File|String TRANSLATABLE";
    if (_property.equals("selectedimage"))  return "File|String TRANSLATABLE";
    if (_property.equals("alignment"))      return "Alignment|int";
    if (_property.equals("variable"))       return "boolean";
    if (_property.equals("selected"))       return "boolean CONSTANT POSTPROCESS";
    if (_property.equals("action"))         return "Action  CONSTANT";
    if (_property.equals("actionon"))       return "Action  CONSTANT";
    if (_property.equals("actionoff"))      return "Action  CONSTANT";
    if (_property.equals("mnemonic"))       return "String TRANSLATABLE";
    return super.getPropertyInfo(_property);
  }

// ------------------------------------------------
// Set and Get the values of the properties
// ------------------------------------------------

	@Override
	public void setValue(int _index, Value _value) {
		switch (_index) {
		case 0:
			if (!labelString.equals(_value.getString())) {
				labelString = _value.getString();
				if (labelString == null)
					labelString = "";
				checkbox.setText(org.opensourcephysics.display.TeXParser.parseTeX(_value.getString()));
			}
			break; // text
		case 1: // image
			if (_value.getString().equals(imageFile))
				return; // no need to do it again
			checkbox.setIcon(getIcon(imageFile = _value.getString()));
			break;
		case 2: // selectedImage
			if (_value.getString().equals(selectedimageFile))
				return; // no need to do it again
			checkbox.setSelectedIcon(getIcon(selectedimageFile = _value.getString()));
			break;
		case 3:
			checkbox.setHorizontalAlignment(_value.getInteger());
			break; // alignment
		case VARIABLE:
			checkbox.setSelected(internalValue.setValue(_value));
			break;
		case SELECTED:
			defaultStateSet = true;
			defaultState = _value.getBoolean();
			setActive(false);
			reset();
			setActive(true);
			break;
		case 6: // action
			removeAction(ControlElement.ACTION, getProperty("action"));
			addAction(ControlElement.ACTION, _value.getString());
			break;
		case 7: // actionon
			removeAction(ControlSwingElement.ACTION_ON, getProperty("actionon"));
			addAction(ControlSwingElement.ACTION_ON, _value.getString());
			break;
		case 8: // actionoff
			removeAction(ControlSwingElement.ACTION_OFF, getProperty("actionoff"));
			addAction(ControlSwingElement.ACTION_OFF, _value.getString());
			break;
		case 9:
			checkbox.setMnemonic(_value.getString().charAt(0));
			break;
		default:
			super.setValue(_index - 10, _value);
			break;
		}
	}

  @Override
public void setDefaultValue (int _index) {
    switch (_index) {
      case 0 : checkbox.setText(labelString = ""); break;
      case 1 : checkbox.setIcon(null); imageFile=null; break;
      case 2 : checkbox.setSelectedIcon(null); selectedimageFile=null; break;
      case 3 : checkbox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER ); break;
      case VARIABLE : break; // Do nothing
      case SELECTED : defaultStateSet = false; break;
      case 6 : removeAction (ControlElement.ACTION,getProperty("action"));            break;
      case 7 : removeAction (ControlSwingElement.ACTION_ON,getProperty("actionon"));  break;
      case 8 : removeAction (ControlSwingElement.ACTION_OFF,getProperty("actionoff"));break;
      case 9 : checkbox.setMnemonic(-1); break;
      default: super.setDefaultValue(_index-10); break;
    }
  }

  @Override
public Value getValue (int _index) {
    switch (_index) {
      case VARIABLE : return internalValue;
      case 0 : case 1 : case 2 : case 3 :
      case SELECTED : case 6 : case 7 : case 8 :
      case 9 :
        return null;
      default: return super.getValue(_index-10);
    }
  }

  @Override
public String getDefaultValueString (int _index) {
    switch (_index) {
      case 0 : 
      case 1 : 
      case 2 : return "<none>";
      case 3 : return "CENTER";
      case VARIABLE : 
      case SELECTED : return "<none>";
      case 6 : 
      case 7 : 
      case 8 : return "<no_action>";
      case 9 : return "<none>";
      default : return super.getDefaultValueString(_index-10);
    }
  }

  
} // End of class
