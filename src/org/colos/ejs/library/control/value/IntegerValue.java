/*
 * The value package contains utilities to work with primitives
 * Copyright (c) June 2002 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.value;

 /**
  * A <code>IntegerValue</code> is a <code>Value</code> object that
  * holds an integer value.
  * <p>
  * @see     Value
  */
public class IntegerValue extends Value {
  public int value;

	public IntegerValue(int _val) {
		super(TYPE_INTEGER);
		value = _val;
	}

  @Override
public boolean getBoolean() { return (value!=0); }

  @Override
public int     getInteger() { return value; }

  @Override
public double  getDouble()  { return value; }

  @Override
public String  getString()  { return String.valueOf(value); }

  @Override
public Object  getObject()  { return null; }

}

