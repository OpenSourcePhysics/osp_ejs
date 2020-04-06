/*
 * The control.display3d package contains subclasses of
 * control.ControlElement that deal with the display3d package
 * Copyright (c) July 2006 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.opensourcephysics.ejs.control.drawing3d;

import org.opensourcephysics.drawing3d.Element;
import org.opensourcephysics.drawing3d.ElementSegment;

public class ControlSegment3D extends ControlElement3D {

  public String getObjectClassname () { return "org.opensourcephysics.drawing3d.ElementSegment"; }

  protected Element createElement () { return new ElementSegment(); }

  protected int getPropertiesDisplacement () { return 0; }

} // End of class
