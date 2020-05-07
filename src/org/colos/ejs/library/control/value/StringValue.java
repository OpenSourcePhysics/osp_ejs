/*
 * The value package contains utilities to work with primitives
 * Copyright (c) June 2002 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.value;

 /**
  * A <code>StringValue</code> is a <code>Value</code> object that
  * holds a String value.
  * <p>
  * @see     Value
  */
public class StringValue extends Value {
  public String value;

	public StringValue(String _val) {
		super(TYPE_STRING);
		value = _val;
	}

  @Override
public boolean getBoolean() { return value.equals("true"); }

  @Override
public int getInteger() {
    return (int) Math.round(getDouble());
  }

  @Override
public double  getDouble()  {
    try { return Double.valueOf(value).doubleValue(); }
    catch (Exception exc) { return 0.0; }
  }

  @Override
public String  getString()  { return value; }

  @Override
public Object  getObject()  { return null; }

}

