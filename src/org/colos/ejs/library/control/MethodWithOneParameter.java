/*
 * The control package contains utilities to build and control
 * simulations using a central control.
 * Copyright (c) June 2002 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control;

import java.lang.reflect.Method;

import org.colos.ejs.library.control.value.BooleanValue;
import org.colos.ejs.library.control.value.DoubleValue;
import org.colos.ejs.library.control.value.IntegerValue;
import org.colos.ejs.library.control.value.ObjectValue;
import org.colos.ejs.library.control.value.StringValue;
import org.colos.ejs.library.control.value.Value;
import org.opensourcephysics.display.OSPRuntime;

/**
 * A class to store and invoke methods using reflection.
 */
public class MethodWithOneParameter {
  private String   methodName;
  private int      methodType;
  private boolean isArray=false;
  private Object   targetObject=null;
  private Object[] parameterList = {};
  private Method   methodToCall;
  private MethodWithOneParameter secondMethod=null;

  private Value returnValue = null; // AMAVP (See Note in ControlElement)

	/**
	 * Equivalent to MethodWithOneParameter (_type, _target, _name, null);
	 */
//  MethodWithOneParameter (int _type, Object _target, String _name) {
//    this(_type, _target, _name, null);
//  }

	/**
	 * Creates a new method from the input parameters.
	 * 
	 * @param                        int _type An integer type to help create
	 *                               families of actions
	 * @param Object                 _target The object that implements the method
	 * @param String                 _name The description of the method. 1.- If the
	 *                               method's parameter list is void, then you can
	 *                               specify either 'method()' or just 'method' 2.-
	 *                               If the method accepts a boolean, you can
	 *                               specify either 'method(true)' or
	 *                               'method(false)' 3.- If the method accepts a
	 *                               double, you can specify something like
	 *                               'method(1.0)' 4.- If the method accepts an
	 *                               integer, you can specify something like
	 *                               'method(1)' 5.- If the method accepts a String,
	 *                               you can specify something like 'method("my
	 *                               string")' In all cases, the first version is
	 *                               the recommended one.
	 * @param MethodWithOneParameter _secondMethod A second action that will be
	 *                               invoked following this one. This is useful when
	 *                               you want to call more than one methods at once
	 * @param _anObject              and object for the very special case of
	 *                               method("#CONTROL#"); //Added on Jan 31st 2004
	 */
	public MethodWithOneParameter(int _type, Object _target, String _name, String _returnType,
			MethodWithOneParameter _secondMethod, Object _anObject) {
		Class<?>[] classList = {};
		Object parameter = null;
		Class<?> parameterClass = null;

		methodName = _name;
		methodType = _type;
		targetObject = _target;
		secondMethod = _secondMethod;

		String parts[] = splitMethodName(_name.trim());
		if ("#CONTROL#".equals(parts[2]) && _anObject != null) {
			parameter = _anObject;
			parameterClass = _anObject.getClass();
//      System.out.println ("Class of OBJECT is "+parameterClass);
		} else {
			Value value = Value.parseConstant(parts[2], false); // NO silent mode
			if (value instanceof StringValue) { // method ("String")
				parameter = value.getString();
				parameterClass = _name.getClass(); // String
			} else if (value instanceof BooleanValue) { // method (boolean)
				parameter = new Boolean(value.getBoolean());
				parameterClass = Boolean.TYPE;
			} else if (value instanceof DoubleValue) { // method (double)
				parameter = new Double(value.getDouble());
				parameterClass = Double.TYPE;
			} else if (value instanceof IntegerValue) { // method (int)
				parameter = Integer.valueOf(value.getInteger());
				parameterClass = Integer.TYPE;
			}
		}
		if (parameter != null) { // method(parameter);
			classList = new Class[1];
			classList[0] = parameterClass; // parameter
			parameterList = new Object[1];
			parameterList[0] = parameter;
		}
		methodToCall = resolveMethod(targetObject, parts[1], classList);
		Class<?> returnTypeClass = methodToCall.getReturnType();
		isArray = returnTypeClass.isArray();
		/*
		 * This code could be used to force the real return type, but other parts of the
		 * system won't understand it String realReturnType; if
		 * (returnTypeClass.isArray()) realReturnType =
		 * returnTypeClass.getComponentType().getName()+"[]"; else realReturnType =
		 * returnTypeClass.getName(); System.out.println ("Method is "+parts[1]);
		 * System.out.println ("Return type class is "+realReturnType);
		 * System.out.println ("declared return type is "+returnTypeClass); _returnType
		 * = realReturnType;
		 */

		if (methodToCall == null) {
			System.err.println(getClass().getName() + " : Error! Unable to find a suitable method " + methodName
					+ " in class " + targetObject.getClass().getName());
		}
		// BH 2020.03.27 cannot determine return type for JavaScript -- just assign
		// ObjectValue
		if (OSPRuntime.isJS || _returnType == null) 
			returnValue = null;
		else if (isArray)
			returnValue = new ObjectValue(null);
		else {
			_returnType = _returnType.trim().toLowerCase();
			if (_returnType.equals("double"))
				returnValue = new DoubleValue(0.0);
//      else if (_returnType.equals("byte"))    returnValue = new IntegerValue(0);
			else if (_returnType.equals("int"))
				returnValue = new IntegerValue(0);
			else if (_returnType.equals("string"))
				returnValue = new StringValue("");
			else if (_returnType.equals("boolean"))
				returnValue = Value.VALUE_FALSE;
			else if (_returnType.equals("object"))
				returnValue = new ObjectValue(null);
			else
				returnValue = null; // return type is void or in SwingJS unknown
		}
	}
  
	/**
	 * Infer the return type from the return value. Note that methods that return
	 * Object may instead return a different type, and methods that return null will
	 * return ObjectValue
	 * 
	 * @param val
	 * @return Value
	 * 
	 */
	private static Value inferType(Object val) {
		switch (val.getClass().getName()) {
		case "java.lang.String":
			return new StringValue(null);
		case "java.lang.Float":
		case "java.lang.Double":
			return new DoubleValue(0);
		case "java.lang.Integer":
			return new IntegerValue(0);
		case "java.lang.Boolean":
			return Value.VALUE_FALSE;
		default:
			return new ObjectValue(null);
		}
	}

	public Value invoke(int _type, Object _callingObject) { // Modified for AMAVP
		if (methodType != _type)
			return null;
		Value ret = returnValue;
		try {
			Object val = methodToCall.invoke(targetObject, parameterList);
			if (val == null) {
				ret = Value.VALUE_NULL;
			} else if (ret == null) {
				ret = inferType(val);
			}
			switch (ret.getType()) {
			default:
			case Value.TYPE_OBJECT:
				((ObjectValue) ret).value = val;
				break;
			case Value.TYPE_BOOLEAN:
				ret = (((Boolean) val).booleanValue() ? Value.VALUE_TRUE : Value.VALUE_FALSE);
				break;
			case Value.TYPE_DOUBLE:
				((DoubleValue) ret).value = ((Double) val).doubleValue();
				break;
			case Value.TYPE_EXPRESSION:
				break;
			case Value.TYPE_INTEGER:
				((IntegerValue) ret).value = ((Integer) val).intValue();
				break;
			case Value.TYPE_STRING:
				((StringValue) ret).value = val.toString();
				break;
			}

			if (secondMethod != null) {
				if (_callingObject instanceof ControlElement) {
					if (((ControlElement) _callingObject).hasDelayedActions())
						secondMethod.invoke(_type, _callingObject);
				} else
					secondMethod.invoke(_type, _callingObject);
			}
		} catch (Exception exc) {
			exc.printStackTrace(System.err);
			return null;
		}
		return ret;
	}

public boolean equals  (int _type, Object _target, String _name) {
    if (methodType!=_type) return false;
    if (targetObject!=_target) return false;
    return methodName.equals(_name);
  }

  @Override
public String toString () { return methodName; }

  static public Method resolveMethod (Object _target, String _name, Class<?>[] _classList) {
      java.lang.reflect.Method[] allMethods = _target.getClass().getMethods();
      for (int i = 0; i < allMethods.length; i++) {
        if (!allMethods[i].getName().equals(_name)) continue;
        Class<?>[] parameters = allMethods[i].getParameterTypes();
        if (parameters.length!=_classList.length) continue;
        boolean fits=true;
        for (int j=0; j<parameters.length; j++) {
          if (!parameters[j].isAssignableFrom(_classList[j])) { fits = false; break; }
        }
        if (fits) return allMethods[i];
      }
      return null;
  }

  static public String[] splitMethodName (String _inputName) {
//    System.err.println ("Splitting "+_inputName);
    String part[] = new String [3];
    String restOfIt = _inputName;
    int index1 = _inputName.indexOf('.');
    int index2 = _inputName.indexOf('(');
    if (index1>0 && (index2<0 || index2>index1)) {
      part[0] = _inputName.substring(0,index1); // target
      restOfIt = _inputName.substring(index1+1); // rest of it
      }
    else part[0] = null; // No target
    index1 = restOfIt.indexOf("(");
    if (index1<=0) { // format 'method'
      part[1] = restOfIt;
      part[2] = "";
    }
    else {
       // format 'method()' or 'method(parameter)'
      part[1] = restOfIt.substring (0,index1).trim();
      restOfIt = restOfIt.substring(index1);
      index2 = restOfIt.lastIndexOf(')');
      if (index2<0) {
        System.err.println (" : Error! Incorrect method description "+_inputName);
        return null;
      }
      part[2] = restOfIt.substring(1,index2).trim();
    }
 //   for (int i=0; i<part.length; i++) System.out.println ("Part["+i+"] = "+part[i]);
    return part;
  }


} // End of class

