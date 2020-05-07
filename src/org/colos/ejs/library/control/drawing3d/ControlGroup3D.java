/*
 * The control.display3d package contains subclasses of
 * control.ControlElement that deal with the display3d package
 * Copyright (c) July 2006 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawing3d;

import java.util.*;
import org.colos.ejs.library.control.ControlElement;
import org.colos.ejs.library.control.swing.NeedsPreUpdate;
import org.opensourcephysics.drawing3d.DrawingPanel3D;
import org.opensourcephysics.drawing3d.Element;
import org.opensourcephysics.drawing3d.Group;

/**
 * Abstract superclass for display3d Elements (children of ControlElements3DParent)
 */
public class ControlGroup3D extends ControlElement3D implements NeedsPreUpdate, ControlParentOfElement3D {
  private Group group;

  @Override
public String getObjectClassname () { return "org.opensourcephysics.drawing3d.Group"; }

  @Override
protected Element createElement () {
    return group = new Group();
  }

  @Override
protected int getPropertiesDisplacement () { return 0; }

  @Override
public boolean acceptsChild (ControlElement _child) {
    if (_child instanceof ControlElement3D) return true;
    return super.acceptsChild(_child);
  }
  
// ------------------------------------------
// Implementation of ControlElements3DParent
// ------------------------------------------

    // List of children that need to do something before repainting the panel
    private Vector<NeedsPreUpdate> preupdateList = new Vector<NeedsPreUpdate>();

    @Override
	public void preupdate () { // Pass it over to children
      for (Enumeration<NeedsPreUpdate> e=preupdateList.elements(); e.hasMoreElements(); ) e.nextElement().preupdate();
    }

    @Override
	public void addToPreupdateList (NeedsPreUpdate _child) { preupdateList.add(_child); }

    @Override
	public void removeFromPreupdateList (NeedsPreUpdate _child) { preupdateList.remove(_child); }

    @Override
	public void addElement (Element _element) { group.addElement(_element); }

    @Override
	public void removeElement (Element _element) { group.removeElement(_element); }

    @Override
	public DrawingPanel3D getDrawingPanel3D() { return myParent.getDrawingPanel3D(); }

} // End of class
