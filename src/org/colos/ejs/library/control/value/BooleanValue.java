/*
 * The value package contains utilities to work with primitives
 * Copyright (c) June 2002 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.value;

/**
 * A <code>BooleanValue</code> is a <code>Value</code> object that holds a
 * boolean value.
 * <p>
 * 
 * @see Value
 */
public class BooleanValue extends Value {
	private boolean value;

	public BooleanValue(boolean _val) {
		super(TYPE_BOOLEAN);
		value = _val;
	}

	@Override
	public boolean getBoolean() {
		return value;
	}

	@Override
	public int getInteger() {
		if (value)
			return 1;
		return 0;
	}

	@Override
	public double getDouble() {
		if (value)
			return 1.0;
		return 0.0;
	}

	@Override
	public String getString() {
		if (value)
			return "true";
		return "false";
	}

	@Override
	public Object getObject() {
		return null;
	}

	public void setValue(boolean _value) {
		value = _value;
	}

	public boolean setValue(Value _value) {
		return value = _value.getBoolean();
	}

}
