/*
 * The control package contains utilities to build and control
 * simulations using a central control.
 * Copyright (c) Jan 2004 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control;

/**
 * An interface for panels that need to be redrawn only once, after all update is done.
 */
public interface NeedsFinalUpdate {

  public void finalUpdate ();

} // End of class

