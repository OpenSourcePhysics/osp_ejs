/*
 * The control.drawables package contains subclasses of
 * control.ControlElement that create Drawables2D for inclusion in
 * a DrawingPanel
 * Copyright (c) Dec 2007 F. Esquembre
 * @author F. Esquembre (http://fem.um.es).
 */

package org.colos.ejs.library.control.drawables;

import org.opensourcephysics.display2d.*;
import javax.swing.JFrame;
import java.awt.Color;
import org.opensourcephysics.display.DrawingPanel;
import java.awt.Graphics;

/**
 * A wrapper for a plot2D that changes in run-time
 */

public class Plot2DWrapper implements Plot2D {

  Plot2D plot;

  void setPlot2D (Plot2D _plot) { this.plot = _plot; }

// --------------------------------------
// Implementation of Plot2D
// --------------------------------------
  @Override
public void setAll(Object val) { plot.setAll(val); }
  @Override
public void setAll(Object obj, double xmin, double xmax, double ymin, double ymax) { plot.setAll(obj,xmin,xmax,ymin,ymax); }
  @Override
public void setGridData(GridData _griddata) { plot.setGridData(_griddata); }
  @Override
public GridData getGridData() { return plot.getGridData(); }
  @Override
public double indexToX(int i) { return plot.indexToX(i); }
  @Override
public double indexToY(int i) { return plot.indexToY(i); }
  @Override
public int xToIndex(double x) { return plot.xToIndex(x); }
  @Override
public int yToIndex(double y) { return plot.yToIndex(y); }
  @Override
public boolean isAutoscaleZ() { return plot.isAutoscaleZ(); }
  @Override
public double getFloor() { return plot.getFloor(); }
  @Override
public double getCeiling()  { return plot.getCeiling(); }
  @Override
public void setAutoscaleZ(boolean isAutoscale, double floor, double ceil) { plot.setAutoscaleZ(isAutoscale,floor,ceil); }
  @Override
public void setFloorCeilColor(Color floorColor, Color ceilColor) { plot.setFloorCeilColor(floorColor,ceilColor); }
  @Override
public void setColorPalette(Color[] colors) { plot.setColorPalette(colors); }
  @Override
public void setPaletteType(int type) { plot.setPaletteType(type); }
  @Override
public void setGridLineColor(Color c) { plot.setGridLineColor(c); }
  @Override
public void setShowGridLines(boolean showGrid) { plot.setShowGridLines(showGrid); }
  @Override
public JFrame showLegend() { return plot.showLegend(); }
  @Override
public void setVisible(boolean isVisible) { plot.setVisible(isVisible); }
  @Override
public void setIndexes(int[] indexes) { plot.setIndexes(indexes); }
  @Override
public void update() { plot.update(); }
  @Override
public void setExpandedZ (boolean expanded, double factor) { plot.setExpandedZ(expanded,factor); }
  @Override
public void setSymmetricZ(boolean symmetric) { plot.setSymmetricZ(symmetric); }
  @Override
public boolean isSymmetricZ() { return plot.isSymmetricZ(); }

// --------------------------------------
// Implementation of Measurable
// --------------------------------------

  @Override
public double getXMin() { return plot.getXMin(); }
  @Override
public double getXMax() { return plot.getXMax(); }
  @Override
public double getYMin() { return plot.getYMin(); }
  @Override
public double getYMax() { return plot.getYMax(); }
  @Override
public boolean isMeasured() { return plot.isMeasured(); }

// --------------------------------------
// Implementation of Drawable
// --------------------------------------

  @Override
public void draw(DrawingPanel panel, Graphics g) { plot.draw(panel,g); }

}
