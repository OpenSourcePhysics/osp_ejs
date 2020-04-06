/*
 * Open Source Physics software is free software as described near the bottom of this code file.
 *
 * For additional information and documentation on Open Source Physics please see:
 * <http://www.opensourcephysics.org/>
 */

package org.opensourcephysics.drawing2d;

import java.util.List;

import org.opensourcephysics.display.Data;
import org.opensourcephysics.display.Dataset;

/**
 * <p>Title: Set</p>
 * <p>Description: A Set is a Group which all its elements of the same type.
 * @author Francisco Esquembre
 * @version April 2009
 */
public class Set extends Group {

//  private Dataset dataset=null;
  private String xLabel="x", yLabel="y";
  
  public void setXLabel(String label) { xLabel = label; }
  
  public void setYLabel(String label) { yLabel = label; }
  
  // ----------------------------------------------------
  // Implementation of Data
  // ----------------------------------------------------

  @Override
  public java.util.List<Data> getDataList() { return null; }

  
    private double[][] aadata;
    /**
     * Return the list data as an array[x[],y[]].
     * Note that this array is maintained as a field in Set.
     * It is not a clone.
     * 
     */
	public double[][] getData2D() {
		List<Element> list = elementList;
		int n = list.size();
		if (aadata == null || aadata[0].length != n) {
			aadata = new double[2][n];
		}
		int index = 0;
		for (Element el : list) {
			aadata[0][index] = el.getX();
			aadata[1][index] = el.getY();
			index++;
		}
		return aadata;
	}

	public int getElementCount() {
		return elementList.size();
	}
	
  private String[] defaultColNames = new String[2];

  public String[] getColumnNames() {
		List<Element> list = elementList;
		for (int i = 0, n = list.size(); i < n; i++) {
			Element el = list.get(i);
			if (el instanceof Data)
				return ((Data) el).getColumnNames();
		}
		defaultColNames[0] = xLabel;
		defaultColNames[1] = yLabel;
		return defaultColNames;
	}
  
  public java.util.ArrayList<Dataset>  getDatasets() { return null; } 

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
