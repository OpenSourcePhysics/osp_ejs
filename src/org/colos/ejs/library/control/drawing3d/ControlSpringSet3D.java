/*
 * The control.display3D package contains classes that wrap display3d objects
 * Copyright (c) February 2007 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawing3d;

import org.colos.ejs.library.control.value.*;
import org.opensourcephysics.drawing3d.*;

/**
 * A set of Springs
 */
public class ControlSpringSet3D extends ControlSet3D {
  static final private int SPRINGSET_PROPERTIES_ADDED=1;

  @Override
protected int getPropertiesAddedToSet () { return SPRINGSET_PROPERTIES_ADDED; }

  @Override
protected Element createAnElement() {
    return new ElementSpring();
  }

  @Override
protected void copyAnElement (Element oldElement, Element newElement) {
      super.copyAnElement(oldElement,newElement);
      ((ElementSpring)newElement).setRadius(((ElementSpring)oldElement).getRadius());
      ((ElementSpring)newElement).setSolenoid(((ElementSpring)oldElement).getSolenoid());
      ((ElementSpring)newElement).setThinExtremes(((ElementSpring)oldElement).isThinExtremes());
      ((ElementSpring)newElement).setResolution(((ElementSpring)oldElement).getLoops(),((ElementSpring)oldElement).getPointsPerLoop());
  }

// ------------------------------------------------
// Definition of Properties
// ------------------------------------------------

    static private java.util.List<String> infoList=null;

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
      if (_property.equals("radius"))          return "int|double|double[]";
      if (_property.equals("solenoid"))        return "int|double|double[]";
      if (_property.equals("thinExtremes"))    return "boolean|boolean[]";
      if (_property.equals("loops"))           return "int|int[]";
      if (_property.equals("pointsPerLoop"))   return "int|int[]";

      return super.getPropertyInfo(_property);
    }

// ------------------------------------------------
// Set and Get the values of the properties
// ------------------------------------------------

    @Override
	public void setValue (int _index, Value _value) {
      switch (_index) {
        case 0 : 
          if (_value.getObject() instanceof double[]) {
            double[] val = (double[]) _value.getObject();
            for (int i=0, n=Math.min(numElements,val.length); i<n; i++) ((ElementSpring)elements[i]).setRadius(val[i]);
          }
          else {
            double val = _value.getDouble();
            for (int i=0; i<numElements; i++) ((ElementSpring)elements[i]).setRadius(val);
          }
          break;
        case 1 : 
          if (_value.getObject() instanceof double[]) {
            double[] val = (double[]) _value.getObject();
            for (int i=0, n=Math.min(numElements,val.length); i<n; i++) ((ElementSpring)elements[i]).setSolenoid(val[i]);
          }
          else {
            double val = _value.getDouble();
            for (int i=0; i<numElements; i++) ((ElementSpring)elements[i]).setSolenoid(val);
          }
          break;
        case 2 : 
          if (_value.getObject() instanceof boolean[]) {
            boolean[] val = (boolean[]) _value.getObject();
            for (int i=0, n=Math.min(numElements,val.length); i<n; i++) ((ElementSpring)elements[i]).setThinExtremes(val[i]);
          }
          else {
            boolean val = _value.getBoolean();
            for (int i=0; i<numElements; i++) ((ElementSpring)elements[i]).setThinExtremes(val);
          }
          break;
        case 3 : 
          if (_value.getObject() instanceof int[]) {
            int[] val = (int[]) _value.getObject();
            for (int i=0, n=Math.min(numElements,val.length); i<n; i++) {
              ElementSpring spring = (ElementSpring) elements[i];
              spring.setResolution(val[i],spring.getPointsPerLoop());
            }
          }
          else {
            int val = _value.getInteger();
            for (int i=0; i<numElements; i++) {
              ElementSpring spring = (ElementSpring) elements[i];
              spring.setResolution(val,spring.getPointsPerLoop());
            }
          }
          break;
        case 4 : 
          if (_value.getObject() instanceof int[]) {
            int[] val = (int[]) _value.getObject();
            for (int i=0, n=Math.min(numElements,val.length); i<n; i++) {
              ElementSpring spring = (ElementSpring) elements[i];
              spring.setResolution(spring.getLoops(),val[i]);
            }
          }
          else {
            int val = _value.getInteger();
            for (int i=0; i<numElements; i++) {
              ElementSpring spring = (ElementSpring) elements[i];
              spring.setResolution(spring.getLoops(),val);
            }
          }
          break;
        default : super.setValue(_index-SPRINGSET_PROPERTIES_ADDED,_value); break;
      }
      if (isUnderEjs) updatePanel();
    }

    @Override
	public void setDefaultValue (int _index) {
      switch (_index) {
        case 0 : for (int i=0; i<numElements; i++) ((ElementSpring)elements[i]).setRadius(ElementSpring.DEF_RADIUS); break;
        case 1 : for (int i=0; i<numElements; i++) ((ElementSpring)elements[i]).setSolenoid(0.0); break;
        case 2 : for (int i=0; i<numElements; i++) ((ElementSpring)elements[i]).setThinExtremes(true); break;
        case 3 : for (int i=0; i<numElements; i++) {
          ElementSpring spring = (ElementSpring) elements[i];
          spring.setResolution(ElementSpring.DEF_LOOPS,spring.getPointsPerLoop());
        }
        break;
        case 4 : for (int i=0; i<numElements; i++) {
          ElementSpring spring = (ElementSpring) elements[i];
          spring.setResolution(spring.getLoops(),ElementSpring.DEF_PPL);
        }
        break;
        default: super.setDefaultValue(_index-SPRINGSET_PROPERTIES_ADDED); break;
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
        default : return super.getDefaultValueString(_index-SPRINGSET_PROPERTIES_ADDED);
      }
    }

    @Override
	public Value getValue (int _index) {
      switch (_index) {
        case 0 : case 1 : case 2 : case 3 : case 4 : 
          return null;
        default: return super.getValue (_index-SPRINGSET_PROPERTIES_ADDED);
      }
    }

} // End of class
