/*
 * The control package contains utilities to build and control
 * simulations using a central control.
 * Copyright (c) June 2002 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control;

import java.util.ArrayList;
import java.util.List;

import org.colos.ejs.library.control.value.DoubleValue;
import org.colos.ejs.library.control.value.Value;

/**
 * A utility class that holds information about a value that can be shared
 * by different ControlElement internal variables and that can also trigger
 * methods of a class
 */
public class GroupVariable {
  private String name;
  private Value value;
  private boolean definedInModel=false, obsolete=false;
  private List<Item> elementList;
  private List<MethodWithOneParameter> methodList;

  // A GroupVariable should be created with a non-null value
  // that matches the type it is going to be used.
  public GroupVariable (String _aName, Value _aValue) {
    name = _aName;
    elementList = new ArrayList<Item>();
    methodList  = new ArrayList<MethodWithOneParameter> ();
//    value = _aValue.cloneValue();
    if (_aValue!=null) value = _aValue.cloneValue();
    else value  = new DoubleValue(0.0);
//    else value = null; // This is rather dangerous if one doesn't follow the instructions above
  }

  public String getName () { return name; }

  @Override
public String toString() { return name; }

  public void setValue (Value _aValue) {
    // This can be optimized by removing the check
    // Again, this forces the instantiation to hold a non-null Value
    // which must hold the right subclass of Value
    // Unfortunately Ejs' users tend to modify the variable class
    if (value.getClass()!=_aValue.getClass()) value = _aValue.cloneValue();
    else
      value.copyValue(_aValue);
  }

  public Value getValue () { return value; }

  public void setDefinedInModel (boolean _defined) { definedInModel = _defined; }

  public boolean isDefinedInModel () { return definedInModel; }

  public void setValueObsolete (boolean _obsolete) { obsolete = _obsolete; }

  public boolean isValueObsolete () { return obsolete; }

// --------------------------------------------------------
// Adding and removing control elements
// --------------------------------------------------------

  public void addElementListener (ControlElement _element, int _index) {
    elementList.add (new Item(_element, _index));
  }

  public boolean hasElementsRegistered () {
    return !elementList.isEmpty();
  }

	public void removeElementListener(ControlElement _element, int _index) {
		// BH 2020.03.27 optimization
		for (int i = elementList.size(); --i >= 0;) {
			Item item = elementList.get(i);
			if ((item.element == _element) && (item.index == _index)) {
				elementList.remove(i);
				return;
			}
		}
	}

	public void propagateValue(ControlElement _element, boolean _collectingData) {
		for (int i = elementList.size(); --i >= 0;) {
			Item item = elementList.get(i);
			if (_collectingData ? item.element instanceof DataCollector : item.element != _element) {
				item.element.setActive(false);
				MethodWithOneParameter method = item.element.myMethodsForProperties[item.index];
				Value exp;
				if (method != null) { // AMAVP (See note in ControlElement)
					item.element.setValue(item.index, method.invoke(ControlElement.METHOD_FOR_VARIABLE, null)); // null = no calling object
				} else if ((exp = item.element.myExpressionsForProperties[item.index]) != null) { // AMAVP (See note in
																							// ControlElement)
					item.element.setValue(item.index, exp);
				} else
					item.element.setValue(item.index, value);
				item.element.setActive(true);
			}
		}
//		if (_collectingData) {
//			for (int i = elementList.size(); --i >= 0;) {
//				Item item = elementList.get(i);
//				if (item.element instanceof DataCollector) {
//					item.element.setActive(false);
//					MethodWithOneParameter method = item.element.myMethodsForProperties[item.index];
//					Value exp;
//					if (method != null) { // AMAVP (See note in ControlElement)
//						item.element.setValue(item.index, method.invoke(ControlElement.METHOD_FOR_VARIABLE, null)); // null = no calling object
//					} else if ((exp = item.element.myExpressionsForProperties[item.index]) != null) { // AMAVP (See note in
//																								// ControlElement)
//						item.element.setValue(item.index, exp);
//					} else
//						item.element.setValue(item.index, value);
//					item.element.setActive(true);
//				}
//			}
//		} else {
//			for (int i = elementList.size(); --i >= 0;) {
//				Item item = elementList.get(i);
//				if (item.element != _element) {
//					item.element.setActive(false);
//					MethodWithOneParameter method = item.element.myMethodsForProperties[item.index];
//					Value exp;
//					if (method != null) { // AMAVP (See note in ControlElement)
//						item.element.setValue(item.index, method.invoke(ControlElement.METHOD_FOR_VARIABLE, null));
//					} else if ((exp=item.element.myExpressionsForProperties[item.index]) != null) { 
//						item.element.setValue(item.index, exp);
//					} else
//						item.element.setValue(item.index, value);
//					item.element.setActive(true);
//				}
//			}
//		}
	}

// --------------------------------------------------------
// Adding and removing method elements
// --------------------------------------------------------

  public void addListener (Object _target, String _method) { addListener (_target,_method,null); }

  public void addListener (Object _target, String _method, Object _anObject) {
    methodList.add(new MethodWithOneParameter (ControlElement.VARIABLE_CHANGED,_target,_method,null,null,_anObject));
  }

	public void removeListener(Object _target, String _method) {
		for (int i = methodList.size(); --i >= 0;) {
			MethodWithOneParameter method = methodList.get(i);
			if (method.equals(ControlElement.VARIABLE_CHANGED, _target, _method)) {
				methodList.remove(i);
				return;
			}
		}
	}

  public void invokeListeners (ControlElement _element) {
    for (MethodWithOneParameter method : methodList) method.invoke(ControlElement.VARIABLE_CHANGED,_element);
  }

// --------------------------------------------------------
// Internal classes
// --------------------------------------------------------

  private class Item {
    public ControlElement element;
    public int index;
    Item (ControlElement _anElement, int _anIndex) {
      element = _anElement;
      index   = _anIndex;
    }
  }

}
