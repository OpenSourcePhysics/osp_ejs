/*
 * Open Source Physics software is free software as described near the bottom of this code file.
 *
 * For additional information and documentation on Open Source Physics please see:
 * <http://www.opensourcephysics.org/>
 */

package org.opensourcephysics.drawing2d;

import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Paint;
import java.awt.geom.AffineTransform;

import org.opensourcephysics.display.Data;
import org.opensourcephysics.display.Dataset;

/**
 * <p>Title: Group</p>
 * <p>Description: A Group is an element that is made of other elements.</p>
 * The group's position, size, visibility and transformation do affect the
 * elements in the group. The group's style doesn't, though.
 * @author Francisco Esquembre
 * @version July 2008
 * @see Style
 */
public class Group extends Element implements Data {
  // Implementation variables
  protected ArrayList<Element> elementList = new ArrayList<Element>();
//  private ArrayList<Element> elementReversedList = new ArrayList<Element>();
  private int elementInteracted = -1;
  
  public Group() {
	  super();
  }
  
	// Special cases

	/**
	 * Clears all data in child elements of type Trail
	 */
	public void clear() {
		List<Element> list = elementList;
		for (int i = list.size(); --i >= 0;) {
			Element el = list.get(i);
			if (el instanceof ElementTrail)
				((ElementTrail) el).clear();
		}
	}
  
	/**
	 * Initializes all data in child elements of type Trail
	 */
	public void initialize() {
		List<Element> list = elementList;
		for (int i = list.size(); --i >= 0;) {
			Element el = list.get(i);
			if (el instanceof ElementTrail)
				((ElementTrail) el).initialize();
		}
	}

  // ----------------------------------------------------
  // New methods
  // ----------------------------------------------------
  
  /**
   * Adds an Element to this Group.
   * @param element Element
   * @see Element
   */
  public void addElement(Element element) {
	  addElementAtIndex(Integer.MAX_VALUE, element);
  }

  /**
   * Adds an Element to this Group at the specified location
   * @param element Element
   * @param index int
   * @see Element
   */
  public void addElementAtIndex(int index, Element element) {
    if (!elementList.contains(element)) {
//      index = Math.max(index, elementList.size()-1); // BH 2020.03.25 I think this is an error. Why add it just BEFORE the last element?
      elementList.add(Math.min(index, elementList.size()), element);
    }
    element.setGroup(this);
  }

  /**
   * Adds all elements of a collection
   * @param elements
   */
  public void addElements(java.util.Collection<Element> elements) {
    if (elements!=null) {
      for (Element el : elements) addElement(el); 
    }
  }

  /**
   * Removes an Element from this Group
   * @param element Element
   * @see Element
   */
  public void removeElement(Element element) {
    elementList.remove(element);
    element.setGroup(null);
  }

	/**
	 * Removes all Elements from this Group
	 * 
	 * @see Element
	 */
	public void removeAllElements() {
		List<Element> list = elementList;
		for (int i = list.size(); --i >= 0;) {
			list.get(i).setGroup(null);
		}
		elementList.clear();
	}

  /**
   * Gets the cloned list of Elements in the group.
   * (Should be synchronized.)
   * @return cloned list
   */
  @SuppressWarnings("unchecked")
  public synchronized java.util.List<Element> getElementsCloned() {
    return (java.util.List<Element>) elementList.clone();
  }

  
  /**
   * Gets the uncloned list of Elements in the group.
   * @return uncloned list
   */
  public java.util.List<Element> getElementsRaw() {
    return elementList;
  }

//  @SuppressWarnings("unchecked")
//  private synchronized java.util.List<Element> getReversedElements() {
//    return (java.util.List<Element>) elementReversedList.clone();
//  }

  /**
   * Gets the elements of the group at a given index.
   * @return the given element (null if the index is not within allowed bounds)
   */
  public Element getElement(int index) {
    try { return elementList.get(index); }
    catch (IndexOutOfBoundsException exc) { return null; }
  }

//  /**
//   * Returns the index of an element in the group.
//   * @param _element
//   * @return the index. -1 if the element is not in this group
//   */
//  public int indexInGroup(Element _element) {
//    return elementList.indexOf(_element);
//  }
  
  // ----------------------------------------------------
  // Implementation of Data
  // ----------------------------------------------------

  /** an integer ID that identifies this object */
  protected int datasetID = hashCode();

  @Override
public void setID(int id) { datasetID = id; }

  @Override
public int getID() { return datasetID; }

  @Override
public double[][] getData2D() { return null; }

  @Override
public double[][][] getData3D() { return null; }

  @Override
public String[] getColumnNames() {
		List<Element> list = elementList;
		for (int i = 0, n = list.size(); i < n; i++) {
			Element el = list.get(i);
			if (el instanceof Data) return ((Data) el).getColumnNames();
		}
    return null; 
  }

  @Override
public Color[] getLineColors() { 
    return new Color[] { Color.BLACK, getStyle().getLineColor()}; 
  }

  @Override
public Color[] getFillColors() { 
    Paint fill = getStyle().getFillColor();
    if (fill instanceof Color) return new Color[] { Color.BLACK, (Color) fill };
    return new Color[] { Color.BLACK, Color.BLUE };
  }

	@Override
	public java.util.List<Data> getDataList() {
		java.util.List<Data> list = new java.util.ArrayList<Data>();
		List<Element> elist = elementList;
		for (int i = 0, n = elist.size(); i < n; i++) {
			Element el = elist.get(i);
			if (el instanceof Data)
				list.add((Data) el);
		}
		return list;
	}

  @Override
public java.util.ArrayList<Dataset>  getDatasets() { return null; }
  
	// ----------------------------------------------------
	// Overwriting Element's methods
	// ----------------------------------------------------

	@Override
	public boolean hasChanged() {
		if (super.hasChanged())
			return true;
		List<Element> list = elementList;
		for (int i = list.size(); --i >= 0;) {
			Element el = list.get(i);
			if (el.hasChanged())
				return true;
		}
		return false;
	}

  private AffineTransform groupTransform = new AffineTransform();
  
  protected AffineTransform getGroupTransform() {
	  return groupTransform;	  
  }
  
	@Override
	public void draw(org.opensourcephysics.display.DrawingPanel _panel, Graphics _g) {
		if (!isVisible() || !isReallyVisible())
			return;
		List<Element> elems = elementList;
		groupTransform.setTransform(_panel.getPixelTransform());
		groupTransform.concatenate(getTotalTransform());
		for (int i = 0, n = elems.size(); i < n; i++) {
			Element el = elems.get(i);
			if (el.isVisible())
				el.draw(_panel, _g);
		}
	}

	@Override
	public void setNeedToProject(boolean _need) {
		List<Element> list = elementList;
		for (int i = list.size(); --i >= 0;) {
			list.get(i).setNeedToProject(_need);
		}
	}

	@Override
	public boolean isMeasured() { // required by Measurable (in Interactive)
		if (!super.isMeasured())
			return false;
		List<Element> list = elementList;
		for (int i = list.size(); --i >= 0;) {
			if (list.get(i).isMeasured())
				return true;
		}
		return false;
	}

  @Override
  protected void updateExtrema() {
    if (!hasChanged()) return;
    initExtrema();
	List<Element> list = elementList; 
	for (int i = list.size(); --i >= 0;) {
		Element el = list.get(i);
      if (el.isMeasured()) {
        double minx = el.getXMin(), maxx = el.getXMax();
        double miny = el.getYMin(), maxy = el.getYMax();
        compareToExtrema(minx,miny);
        compareToExtrema(maxx,miny);
        compareToExtrema(maxx,maxy);
        compareToExtrema(minx,maxy);
        double logminx = el.getXMinLogscale(), logmaxx = el.getXMaxLogscale();
        double logminy = el.getYMinLogscale(), logmaxy = el.getYMaxLogscale();
        compareToLogExtrema(logminx,logminy);
        compareToLogExtrema(logmaxx,logminy);
        compareToLogExtrema(logmaxx,logmaxy);
        compareToLogExtrema(logminx,logmaxy);
      }
    }
  }

//  public int getElementInteracted () { return elementInteracted; }

  public int getInteractedIndex() { return elementInteracted; }

  @Override
public org.opensourcephysics.display.Interactive findInteractive(org.opensourcephysics.display.DrawingPanel _panel, int _xpix, int _ypix) {
    if (!isReallyVisible()) return null;
    List<Element> elList = elementList;
    for (int i=elList.size()-1; i>=0; i--) {
      org.opensourcephysics.display.Interactive target = elList.get(i).findInteractive(_panel,_xpix,_ypix);
      if (target!=null) {
        elementInteracted = i;
        return target;
      }
    }
//    elementInteracted = -1; This caused problem with delayed actions
    return null;
  }

}

/*
 * Open Source Physics software is free software; you can redistribute
 * it and/or modify it under the terms of the GNU General Public License (GPL) as
 * published by the Free Software Foundation; either version 2 of the License,
 * or(at your option) any later version.

 * Code that uses any portion of the code in the org.opensourcephysics package
 * or any subpackage (subdirectory) of this package must must also be be released
 * under the GNU GPL license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston MA 02111-1307 USA
 * or view the license online at http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2007  The Open Source Physics project
 *                     http://www.opensourcephysics.org
 */
