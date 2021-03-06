/*
 * The value package contains utilities to work with primitives
 * Copyright (c) June 2002 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.value;

 /**
  * A <code>Value</code> is an object that holds an internal (but public)
  * variable. This abstract class provides a unified way of acessing the
  * variable value. The fact the variable is public permits quick access
  * to it.
  * <p>
  * When using subclasses, it is a good idea to directly access the
  * internal variable or use the correct 'get' method in order to
  * increase speed.
  * <p>
  * Using <code>Number</code> is not suitable for two reasons:
  * <ll>
  *   <li> <code>Number</code> does not include Strings and Objects
  *   <li> <code>Number</code> does not allow direct access to the
  *        internal variable
  * </ll>
  * @see java.lang.Number
  */
public abstract class Value {

	public final static int TYPE_OBJECT     = 0;
	public final static int TYPE_BOOLEAN    = 1;
	public final static int TYPE_DOUBLE     = 2;
	public final static int TYPE_EXPRESSION = 3;
	public final static int TYPE_INTEGER    = 4;
	public final static int TYPE_STRING     = 5;
	
	
	public static final ObjectValue VALUE_NULL = new ObjectValue(null);	
	public static final BooleanValue VALUE_FALSE = new BooleanValue(false);
	public static final BooleanValue VALUE_TRUE = new BooleanValue(true);

	protected int type;
	
	Value(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}

 /**
  * Returns the value of the variable as a boolean
  */
  public abstract boolean getBoolean();

 /**
  * Returns the value of the variable as a byte
  */
//  public byte getByte() { return (byte) getInteger(); }

 /**
  * Returns the value of the variable as an int
  */
  public abstract int getInteger();

 /**
  * Returns the value of the variable as a double
  */
  public abstract double getDouble();

 /**
  * Returns the value of the variable as a String
  */
  public abstract String getString();

 /**
  * Returns the value of the variable as an Object. Ideal for arrays!
  */
  public abstract Object getObject();

	/**
	 * Copies one value into another
	 */
	public void copyValue(Value _source) {
		switch (type) {
		case Value.TYPE_OBJECT:
			((ObjectValue) this).value = _source.getObject();
			break;
		case Value.TYPE_BOOLEAN:
			((BooleanValue) this).setValue(_source);
			break;
		case Value.TYPE_DOUBLE:
			((DoubleValue) this).value = _source.getDouble();
			break;
		case Value.TYPE_EXPRESSION:
			break;
		case Value.TYPE_INTEGER:
			((IntegerValue) this).value = _source.getInteger();
			break;
		case Value.TYPE_STRING:
			((StringValue) this).value = _source.getString();
			break;
		}
	}

 /**
  * Clones one value into another
  */
  public Value cloneValue() {
	  switch (type) {
      case Value.TYPE_OBJECT:
          return new ObjectValue(this.getObject());
      case Value.TYPE_BOOLEAN:
          return new BooleanValue(this.getBoolean());
      case Value.TYPE_DOUBLE:
          return new DoubleValue(this.getDouble());
      case Value.TYPE_EXPRESSION:
    	  break;
      case Value.TYPE_INTEGER:
          return new IntegerValue(this.getInteger());
      case Value.TYPE_STRING:
          return new StringValue(this.getString());
	  }
    return null;
  }

  @Override
public String  toString()  { return getString(); }

  static public Value parseConstantOrArray (String _input, boolean _silentMode) {
    String inputTrimmed = _input.trim();
    boolean isArray=false;
    boolean hasDoubles = false, hasInts = false, hasBooleans=false, hasStrings=false;
    if (inputTrimmed.startsWith("new ")) {
      int index = inputTrimmed.indexOf('{');
      if (index>0) { // Check for a declaration of type
        String prevStr = inputTrimmed.substring(4,index);
        if (prevStr.contains("double")) hasDoubles = true;
        else if (prevStr.contains("int")) hasInts = true;
        else if (prevStr.contains("boolean")) hasBooleans = true;
        else if (prevStr.contains("String")) hasStrings = true;
        inputTrimmed = inputTrimmed.substring(index);
      }
    }
    if (inputTrimmed.startsWith("{") && inputTrimmed.endsWith("}") ) {
      _input = inputTrimmed.substring(1,inputTrimmed.length()-1);
      isArray = true;
    }
    if (inputTrimmed.startsWith("\"") && inputTrimmed.endsWith("\"")) return parseConstant(_input,_silentMode);
    java.util.StringTokenizer tkn = new java.util.StringTokenizer(_input,",");
    int dim = tkn.countTokens();
    if (!isArray && dim<=1) return parseConstant(_input,_silentMode);
    Value[] data = new Value[dim];
    for (int i=0; i<dim; i++) {
      String token = tkn.nextToken();
      //System.out.println ("Parsing <"+token+">");
      data[i] = parseConstant(token,_silentMode);
      if (data[i]==null) return parseConstant(_input,_silentMode);
      if      (data[i] instanceof DoubleValue)  hasDoubles  = true;
      else if (data[i] instanceof IntegerValue) hasInts     = true;
      else if (data[i] instanceof BooleanValue) hasBooleans = true;
      else if (data[i] instanceof StringValue) hasStrings = true;
    }
    if (hasDoubles) {
      double[] doubleArray = new double[dim];
      for (int i=0; i<dim; i++) doubleArray[i] = data[i].getDouble();
      return new ObjectValue(doubleArray);
    }
    else if (hasInts) {
      int[] intArray = new int[dim];
      for (int i=0; i<dim; i++) intArray[i] = data[i].getInteger();
      return new ObjectValue(intArray);
    }
    else if (hasBooleans) {
      boolean[] booleanArray = new boolean[dim];
      for (int i=0; i<dim; i++) booleanArray[i] = data[i].getBoolean();
      return new ObjectValue(booleanArray);
    }
    else if (hasStrings) {
      String[] stringArray = new String[dim];
      for (int i=0; i<dim; i++) stringArray[i] = data[i].getString();
      return new ObjectValue(stringArray);
    }
    return parseConstant(_input,_silentMode);
  }

//  static public String removeScapes (String str) {
//    String txt="";
//    int l = str.length();
//    for (int i=0; i<l; i++) {
//      char c = str.charAt(i);
//      if (c=='\\') {
//        if (i==(l-1)) return txt+c;
//        c = str.charAt(++i);
//      }
//      txt += c;
//    }
//    return txt;
//  }

	static public Value parseConstant(String _input, boolean _silentMode) {
		_input = _input.trim();
		if (_input.length() == 0)
			return null;
		char c0 = _input.charAt(0);
		switch (c0) {
		case 'n':
			return (_input.equals("null") ? VALUE_NULL : null);
		case '"':
			if (_input.length() <= 1)
				return null;
			if (!_input.endsWith("\"")) {
				// if (!_silentMode) System.err.println ("Value : Error 1! Incorrect input to
				// parse "+_input);
				return null;
			}
			return new StringValue(_input.substring(1, _input.length() - 1)); // removeScapes(_input.substring(1,_input.length()-1)));
		case '\'':
			if (!_input.endsWith("'")) {
//		        if (!_silentMode) System.err.println ("Value : Error 1! Incorrect input to parse "+_input);
				return null;
			}
			return new StringValue(_input.substring(1, _input.length() - 1)); // removeScapes(_input.substring(1,_input.length()-1)));
		case 't':
			return (_input.equals("true") ? VALUE_TRUE : null);
		case 'f':
			return (_input.equals("false") ? VALUE_FALSE : null);
		case 'M':
				// author:
				// I am not sure if this could cause any problem...
				//		    if (_input.equals("Math.PI")) return new DoubleValue(Math.PI);
				//		    if (_input.equals("Math.E"))  return new DoubleValue(Math.E);
			return null;
		default:
			if (_input.indexOf('.') >= 0) { // double
				try {
					return new DoubleValue(Double.parseDouble(_input));
				} catch (Exception e) {
					if (!_silentMode)
						System.err.println("Value : Error 2! Incorrect input to parse " + _input);
				}
				return null;
			}
			try {
				// BH 2020.03.28 optimizing minimal use of intentional throw
				return ("+-0123456789".indexOf(c0) < 0 ? null : new IntegerValue(Integer.parseInt(_input)));
			} catch (Exception e) {
				if (!_silentMode)
					System.err.println("Value : Error 3! Incorrect input to parse " + _input);
				return null;
			}
		}
	}

}

