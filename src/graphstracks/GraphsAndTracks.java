/*
 * Class : GraphsAndTracks.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package graphstracks;

import org.opensourcephysics.display.OSPRuntime;
// Imports suggested by Model Elements:
// End of imports from Model Elements
import org.opensourcephysics.ejs._EjsConstants;

import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class GraphsAndTracks extends org.opensourcephysics.ejs.EjsModel {

  static {
    __translatorUtil = new org.opensourcephysics.ejs.utils.TranslatorUtil();
  }

  static public boolean _sSwingView = true;

  static public int _sServerPort = -1;
  static public int _getServerPort() { return _sServerPort; }

  public GraphsAndTracksSimulation _simulation=null;
  public GraphsAndTracksView _view=null;
  public GraphsAndTracks _model=this;

  // -------------------------- 
  // Information on HTML pages
  // -------------------------- 

  static private java.util.Map<String,java.util.Set<org.opensourcephysics.ejs.utils.HtmlPageInfo>> __htmlPagesMap =
    new java.util.HashMap<String,java.util.Set<org.opensourcephysics.ejs.utils.HtmlPageInfo>>();

  /**
   * Adds info about an html on the model
   */
  static public void _addHtmlPageInfo(String _pageName, String _localeStr, String _title, String _link) {
    java.util.Set<org.opensourcephysics.ejs.utils.HtmlPageInfo> pages = __htmlPagesMap.get(_pageName);
    if (pages==null) {
      pages = new java.util.HashSet<org.opensourcephysics.ejs.utils.HtmlPageInfo>();
      __htmlPagesMap.put(_pageName, pages);
    }
    org.opensourcephysics.ejs.utils.LocaleItem item = org.opensourcephysics.ejs.utils.LocaleItem.getLocaleItem(_localeStr);
    if (item!=null) pages.add(new org.opensourcephysics.ejs.utils.HtmlPageInfo(item, _title, _link));
  }

  /**
   * Returns info about an html on the model
   */
  static public org.opensourcephysics.ejs.utils.HtmlPageInfo _getHtmlPageClassInfo(String _pageName, org.opensourcephysics.ejs.utils.LocaleItem _item) {
    java.util.Set<org.opensourcephysics.ejs.utils.HtmlPageInfo> pages = __htmlPagesMap.get(_pageName);
    if (pages==null) return null;
    org.opensourcephysics.ejs.utils.HtmlPageInfo defaultInfo=null;
    for (org.opensourcephysics.ejs.utils.HtmlPageInfo info : pages) {
      if (info.getLocaleItem().isDefaultItem()) defaultInfo = info;
      if (info.getLocaleItem().equals(_item)) return info;
    }
    return defaultInfo;
  }

  public org.opensourcephysics.ejs.utils.HtmlPageInfo _getHtmlPageInfo(String _pageName, org.opensourcephysics.ejs.utils.LocaleItem _item) { return _getHtmlPageClassInfo(_pageName,_item); }

  // -------------------------- 
  // static methods 
  // -------------------------- 

  static public String _getEjsModel() { return "graphstracks/GraphsAndTracks.xml"; }

  static public String _getModelDirectory() { return "graphstracks/"; }

  static public java.awt.Dimension _getEjsAppletDimension() {
    return new java.awt.Dimension(789,393);
  }

  static public java.util.Set<String> _getEjsResources() {
    java.util.Set<String> list = new java.util.HashSet<String>();
    list.add("graphstracks/GraphsAndTracks/GraphsAndTracks.jpg");
    list.add("graphstracks/GraphsAndTracks/ejsPage.css");
    list.add("graphstracks/GraphsAndTracks/GraphsAndTracks.html");
    return list;
  };

  static public boolean _common_initialization(String[] _args) {
    String lookAndFeel = null;
    boolean decorated = true;
    if (_args!=null) for (int i=0; i<_args.length; i++) {
      if      (_args[i].equals("-_lookAndFeel"))          lookAndFeel = _args[++i];
      else if (_args[i].equals("-_decorateWindows"))      decorated = true;
      else if (_args[i].equals("-_doNotDecorateWindows")) decorated = false;
      else if (_args[i].equals("-_noSwingView")) _sSwingView = false;
      else if (_args[i].equals("-_serverPort")) try { _sServerPort = Integer.parseInt(_args[++i]); } catch (Exception exc) { _sServerPort = -1; exc.printStackTrace(); } 
    }
    if (lookAndFeel!=null) org.opensourcephysics.display.OSPRuntime.setLookAndFeel(decorated,lookAndFeel);
    org.opensourcephysics.tools.ResourceLoader.addSearchPath("testing/"); // This is for relative resources
    boolean pathsSet = false, underEjs = false;
    try { // in case of security problems
      if ("true".equals(System.getProperty("org.osp.launcher"))) { // Running under Launcher
        org.opensourcephysics.display.OSPRuntime.setLauncherMode(true);
      }
    }
    catch (Exception _exception) { } // do not complain
    try { // in case of security problems
      if (System.getProperty("osp_ejs")!=null) { // Running under EJS
        underEjs = true;
        org.opensourcephysics.ejs.EjsSimulation.setPathToLibrary("/Users/wochristian/Desktop/EjsS_5.3 2/bin/config/"); // This is for classes (such as EjsMatlab) which needs to know where the library is
        pathsSet = true;
      }
    }
    catch (Exception _exception) { pathsSet = false; } // maybe an unsigned Web start?
    try { org.colos.ejs.library.control.EjsControl.setDefaultScreen(Integer.parseInt(System.getProperty("screen"))); } // set default screen 
    catch (Exception _exception) { } // Ignore any error here
    if (!pathsSet) {
      org.opensourcephysics.ejs.EjsSimulation.setPathToLibrary("/Users/wochristian/Desktop/EjsS_5.3 2/bin/config/"); // This is for classes (such as EjsMatlab) which needs to know where the library is
    }
    if (!underEjs) {
    }
    return true; // Everything went ok
  }

  static public void main (String[] _args) {
    if (!_common_initialization(_args)) {
      if (org.opensourcephysics.display.OSPRuntime.isLauncherMode()) return;
      System.exit(-1);
    }

    GraphsAndTracks __theModel = new GraphsAndTracks (_args);
  }

  static public javax.swing.JComponent getModelPane(String[] _args, javax.swing.JFrame _parentFrame) {
    if (!_common_initialization(_args)) return null;
    GraphsAndTracks __theModel = new GraphsAndTracks ("mainFrame",_parentFrame,null,null,_args,true);
    return (javax.swing.JComponent) __theModel._getView().getComponent("mainFrame");
  }

  public GraphsAndTracks () { this (null, null, null,null,null,false); } // slave application

  public GraphsAndTracks (String[] _args) { this (null, null, null,null,_args,true); }

  public GraphsAndTracks (String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, org.opensourcephysics.ejs.EjsLauncherApplet _anApplet, String[] _args, boolean _allowAutoplay) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = _args;
    __theApplet = _anApplet;
    java.text.NumberFormat _Ejs_format = java.text.NumberFormat.getInstance();
    if (_Ejs_format instanceof java.text.DecimalFormat) {
      ((java.text.DecimalFormat) _Ejs_format).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new GraphsAndTracksSimulation (this,_replaceName,_replaceOwnerFrame,_codebase,_allowAutoplay);
    _simulation.processArguments(_args);
    if (_sSwingView)       org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(false);
  }

 // -------------------------------------------
 // Abstract part of Model 
 // -------------------------------------------

  public String _getClassEjsModel() { return _getEjsModel(); }

  public java.util.Set<String> _getClassEjsResources() { return _getEjsResources(); }

  public String _getClassModelDirectory() { return _getModelDirectory(); }

  public org.opensourcephysics.ejs.EjsView _getView() { return _view; }

  public org.opensourcephysics.ejs.EjsSimulation _getSimulation() { return _simulation; }

  public int _getPreferredStepsPerDisplay() { return 1; }

  public void _resetModel () {
    _isEnabled_initialization1 = true; // Reset enabled condition for Model.Initialization.Initialize
    _isEnabled_evolution1 = true; // Reset enabled condition for Model.Evolution.Ball Evolution
    _isEnabled_evolution1_Event1 = true; // reset enabled condition for event Left Event 
    _isEnabled_evolution1_Event2 = true; // reset enabled condition for event Right Event 
    _isEnabled_evolution2 = true; // Reset enabled condition for Model.Evolution.Update Table
    _isEnabled_evolution3 = true; // Reset enabled condition for Model.Evolution.Update Ghosts
    _isEnabled_constraints1 = true; // Reset enabled condition for Model.Constraints.Compute Display Vars
    v0 = 1; // Variables.Constants:2    v0 = 1; // Variables.Constants:2
    xmin = 0; // Variables.Constants:3    xmin = 0; // Variables.Constants:3
    xmax = 20; // Variables.Constants:4    xmax = 20; // Variables.Constants:4
    ymin = -1; // Variables.Constants:5    ymin = -1; // Variables.Constants:5
    ymax = 10; // Variables.Constants:6    ymax = 10; // Variables.Constants:6
    vScale = 1; // Variables.Constants:7    vScale = 1; // Variables.Constants:7
    g = 1; // Variables.Constants:8    g = 1; // Variables.Constants:8
    gScale = 1; // Variables.Constants:9    gScale = 1; // Variables.Constants:9
    xAxisTitle = "x"; // Variables.Constants:11    xAxisTitle = "x"; // Variables.Constants:11
    vAxisTitle = "v"; // Variables.Constants:12    vAxisTitle = "v"; // Variables.Constants:12
    aAxisTitle = "a"; // Variables.Constants:13    aAxisTitle = "a"; // Variables.Constants:13
    maxTime = 1000; // Variables.Constants:14    maxTime = 1000; // Variables.Constants:14
    bounce = true; // Variables.Constants:15    bounce = true; // Variables.Constants:15
    ng = 5; // Variables.Ghost Vars:1    ng = 5; // Variables.Ghost Vars:1
    gCounter = 0; // Variables.Ghost Vars:2    gCounter = 0; // Variables.Ghost Vars:2
    gStride = 10; // Variables.Ghost Vars:3    gStride = 10; // Variables.Ghost Vars:3
    xghost = new double [ng]; // Variables.Ghost Vars:4
    yghost = new double [ng]; // Variables.Ghost Vars:5
    ghostColors = new Color [ng]; // Variables.Ghost Vars:6
    for (int _i0=0; _i0<ng; _i0++) ghostColors[_i0] = Color.PINK; // Variables.Ghost Vars:6
    xtrack = 0; // Variables.Dynamical Vars:1    xtrack = 0; // Variables.Dynamical Vars:1
    t = 0; // Variables.Dynamical Vars:4    t = 0; // Variables.Dynamical Vars:4
    dt = 0.1; // Variables.Dynamical Vars:5    dt = 0.1; // Variables.Dynamical Vars:5
    tol = 1.0E-7; // Variables.Dynamical Vars:6    tol = 1.0E-7; // Variables.Dynamical Vars:6
    stationary = false; // Variables.Dynamical Vars:7    stationary = false; // Variables.Dynamical Vars:7
    nt = 5; // Variables.Track Vars:1    nt = 5; // Variables.Track Vars:1
    xt = new double [nt]; // Variables.Track Vars:2
    jointsData = new double [2][nt]; // Variables.Track Vars:3
    ht = new double [nt]; // Variables.Track Vars:4
    for (int _i0=0; _i0<nt; _i0++) ht[_i0] = ymax/2; // Variables.Track Vars:4
    st = new double [nt]; // Variables.Track Vars:6
    dy = new double [nt]; // Variables.Track Vars:7
    for (int _i0=0; _i0<nt; _i0++) dy[_i0] = 0; // Variables.Track Vars:7
    theta = new double [nt]; // Variables.Track Vars:8
    for (int _i0=0; _i0<nt; _i0++) theta[_i0] = 0; // Variables.Track Vars:8
    postWidth = (xmax-xmin)/150; // Variables.Track Vars:9    postWidth = (xmax-xmin)/150; // Variables.Track Vars:9
    yBall = ymax/2; // Variables.Track Vars:12    yBall = ymax/2; // Variables.Track Vars:12
    labels = new String [nt]; // Variables.Track Vars:18
    for (int _i0=0; _i0<nt; _i0++) labels[_i0] = "A"; // Variables.Track Vars:18
    dragMode = 3; // Variables.Track Vars:19    dragMode = 3; // Variables.Track Vars:19
    saveInStudentMode = false; // Variables.Customization Vars:1    saveInStudentMode = false; // Variables.Customization Vars:1
    studentMode = false; // Variables.Customization Vars:2    studentMode = false; // Variables.Customization Vars:2
    fileName = ""; // Variables.Customization Vars:3    fileName = ""; // Variables.Customization Vars:3
    frameTitle = "Graphs and Tracks"; // Variables.Customization Vars:4    frameTitle = "Graphs and Tracks"; // Variables.Customization Vars:4
    startMsg = "Drag the joints to change track height"; // Variables.Customization Vars:6    startMsg = "Drag the joints to change track height"; // Variables.Customization Vars:6
    msg = startMsg; // Variables.Customization Vars:7    msg = startMsg; // Variables.Customization Vars:7
    showTime = true; // Variables.Customization Vars:11    showTime = true; // Variables.Customization Vars:11
    showX0 = true; // Variables.Customization Vars:12    showX0 = true; // Variables.Customization Vars:12
    showV0 = true; // Variables.Customization Vars:13    showV0 = true; // Variables.Customization Vars:13
    stride = 1; // Variables.Customization Vars:21    stride = 1; // Variables.Customization Vars:21
    tableColNames = new String[] {"row","time","x","v","a"}; // Variables.Customization Vars:22
    tableRow = new double[]{t,xtrack,vBall,aBall}; // Variables.Customization Vars:23
    _ODEi_evolution1 = new _ODE_evolution1();
  }

  public void _initializeSolvers () { for (org.opensourcephysics.numerics.ode_solvers.EjsS_ODE __pode : _privateOdesList.values()) __pode.initializeSolver(); }

  public void _initializeModel () {
    __shouldBreak = false;
    boolean _wasEnabled_initialization1 = _isEnabled_initialization1;
    if (_wasEnabled_initialization1) _initialization1 ();
    if (__shouldBreak) return;
    _initializeSolvers();
  }

  public void _automaticResetSolvers() { 
    _ODEi_evolution1.automaticResetSolver();
  }
  public void _resetSolvers() { 
    _ODEi_evolution1.resetSolver();
  }
  public void _stepModel () {
    __shouldBreak = false;
    boolean _wasEnabled_evolution1 = _isEnabled_evolution1;
    boolean _wasEnabled_evolution2 = _isEnabled_evolution2;
    boolean _wasEnabled_evolution3 = _isEnabled_evolution3;
    if (_wasEnabled_evolution1) _ODEi_evolution1.step();
    if (__shouldBreak) return;
    if (_wasEnabled_evolution2) _evolution2 ();
    if (__shouldBreak) return;
    if (_wasEnabled_evolution3) _evolution3 ();
    if (__shouldBreak) return;
  }

  public void _updateModel () {
    __shouldBreak = false;
    boolean _wasEnabled_constraints1 = _isEnabled_constraints1;
    if (_wasEnabled_constraints1) _constraints1 ();
    if (__shouldBreak) return;
  }

  public void _readFromViewAfterUpdate () {
  }

  public void _freeMemory () {
    getSimulation().setEnded(); // Signal that the simulation ended already
    xghost = null;  // Variables.Ghost Vars:4
    yghost = null;  // Variables.Ghost Vars:5
    ghostColors = null;  // Variables.Ghost Vars:6
    xt = null;  // Variables.Track Vars:2
    jointsData = null;  // Variables.Track Vars:3
    ht = null;  // Variables.Track Vars:4
    st = null;  // Variables.Track Vars:6
    dy = null;  // Variables.Track Vars:7
    theta = null;  // Variables.Track Vars:8
    labels = null;  // Variables.Track Vars:18
    tableColNames = null;  // Variables.Customization Vars:22
    tableRow = null;  // Variables.Customization Vars:23
    _ODEi_evolution1=null;
    System.gc(); // Free memory from unused old arrays
  }

 // -------------------------------------------
 // ODEs declaration 
 // -------------------------------------------

  protected java.util.Hashtable<String,org.opensourcephysics.numerics.ode_solvers.EjsS_ODE> _privateOdesList = new java.util.Hashtable<String,org.opensourcephysics.numerics.ode_solvers.EjsS_ODE>();

  public org.opensourcephysics.numerics.ode_solvers.EjsS_ODE _getODE(String _odeName) {
    try { return _privateOdesList.get(_odeName); }
    catch (Exception __exc) { return null; }
  }

  public org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver _getEventSolver(String _odeName) {
    try { return _privateOdesList.get(_odeName).getEventSolver(); }
    catch (Exception __exc) { return null; }
  }

  public void _setSolverClass (String _odeName, Class<?> _solverClass) { // Change the solver in run-time
    try { _privateOdesList.get(_odeName).setSolverClass(_solverClass); }
    catch (Exception __exc) { System.err.println ("There is no ODE with this name "+_odeName); }
  }

  public String _setSolverClass (String _odeName, String _solverClassName) { // Change the solver in run-time
    if (_solverClassName==null) { System.err.println ("Null solver class name!"); return null; }
    try { return _privateOdesList.get(_odeName).setSolverClass(_solverClassName); }
    catch (Exception __exc) { System.err.println ("There is no ODE with this name "+_odeName); return null; }
  }

 // -------------------------------------------
 // Variables defined by the user
 // -------------------------------------------

 public double x0 ; // Variables.Constants:1
 public double v0  = 1; // Variables.Constants:2
 public double xmin  = 0; // Variables.Constants:3
 public double xmax  = 20; // Variables.Constants:4
 public double ymin  = -1; // Variables.Constants:5
 public double ymax  = 10; // Variables.Constants:6
 public double vScale  = 1; // Variables.Constants:7
 public double g  = 1; // Variables.Constants:8
 public double gScale  = 1; // Variables.Constants:9
 public boolean xyComponents ; // Variables.Constants:10
 public String xAxisTitle  = "x"; // Variables.Constants:11
 public String vAxisTitle  = "v"; // Variables.Constants:12
 public String aAxisTitle  = "a"; // Variables.Constants:13
 public double maxTime  = 1000; // Variables.Constants:14
 public boolean bounce  = true; // Variables.Constants:15
 public double E ; // Variables.Constants:16
 public double KE ; // Variables.Constants:17
 public double PE ; // Variables.Constants:18
 public int ng  = 5; // Variables.Ghost Vars:1
 public int gCounter  = 0; // Variables.Ghost Vars:2
 public int gStride  = 10; // Variables.Ghost Vars:3
 public double xghost []; // Variables.Ghost Vars:4
 public double yghost []; // Variables.Ghost Vars:5
 public Color ghostColors []; // Variables.Ghost Vars:6
 public double xtrack  = 0; // Variables.Dynamical Vars:1
 public double x ; // Variables.Dynamical Vars:2
 public double vx ; // Variables.Dynamical Vars:3
 public double t  = 0; // Variables.Dynamical Vars:4
 public double dt  = 0.1; // Variables.Dynamical Vars:5
 public double tol  = 1.0E-7; // Variables.Dynamical Vars:6
 public boolean stationary  = false; // Variables.Dynamical Vars:7
 public int nt  = 5; // Variables.Track Vars:1
 public double xt []; // Variables.Track Vars:2
 public double jointsData [][]; // Variables.Track Vars:3
 public double ht []; // Variables.Track Vars:4
 public double dx ; // Variables.Track Vars:5
 public double st []; // Variables.Track Vars:6
 public double dy []; // Variables.Track Vars:7
 public double theta []; // Variables.Track Vars:8
 public double postWidth  = (xmax-xmin)/150; // Variables.Track Vars:9
 public int index ; // Variables.Track Vars:10
 public int segment ; // Variables.Track Vars:11
 public double yBall  = ymax/2; // Variables.Track Vars:12
 public double vBall ; // Variables.Track Vars:13
 public double vy ; // Variables.Track Vars:14
 public double aBall ; // Variables.Track Vars:15
 public double axBall ; // Variables.Track Vars:16
 public double ayBall ; // Variables.Track Vars:17
 public String labels []; // Variables.Track Vars:18
 public int dragMode  = 3; // Variables.Track Vars:19
 public boolean dragBall ; // Variables.Track Vars:20
 public boolean saveInStudentMode  = false; // Variables.Customization Vars:1
 public boolean studentMode  = false; // Variables.Customization Vars:2
 public String fileName  = ""; // Variables.Customization Vars:3
 public String frameTitle  = "Graphs and Tracks"; // Variables.Customization Vars:4
 public boolean showToolButton ; // Variables.Customization Vars:5
 public String startMsg  = "Drag the joints to change track height"; // Variables.Customization Vars:6
 public String msg  = startMsg; // Variables.Customization Vars:7
 public boolean showX ; // Variables.Customization Vars:8
 public boolean showV ; // Variables.Customization Vars:9
 public boolean showA ; // Variables.Customization Vars:10
 public boolean showTime  = true; // Variables.Customization Vars:11
 public boolean showX0  = true; // Variables.Customization Vars:12
 public boolean showV0  = true; // Variables.Customization Vars:13
 public boolean showVArrow ; // Variables.Customization Vars:14
 public boolean showGArrow ; // Variables.Customization Vars:15
 public boolean hideD ; // Variables.Customization Vars:16
 public boolean hideV ; // Variables.Customization Vars:17
 public boolean hideA ; // Variables.Customization Vars:18
 public boolean showJointsTable ; // Variables.Customization Vars:19
 public boolean showTable ; // Variables.Customization Vars:20
 public int stride  = 1; // Variables.Customization Vars:21
 public String tableColNames []; // Variables.Customization Vars:22
 public double tableRow []; // Variables.Customization Vars:23
 public boolean visTable ; // Variables.Customization Vars:24
 public boolean visXGraph ; // Variables.Customization Vars:25
 public boolean visVGraph ; // Variables.Customization Vars:26
 public boolean visAGraph ; // Variables.Customization Vars:27
 public boolean visEGraph ; // Variables.Customization Vars:28
 public boolean showE ; // Variables.Customization Vars:29
 public boolean visJointsTable ; // Variables.Customization Vars:30

 // -------------------------------------------
 // Enabled condition of pages 
 // -------------------------------------------

  private boolean _isEnabled_initialization1 = true; // Enabled condition for Model.Initialization.Initialize
  private boolean _isEnabled_evolution1 = true; // Enabled condition for Model.Evolution.Ball Evolution
  private boolean _isEnabled_evolution1_Event1 = true; // Enabled condition for event Left Event 
  private boolean _isEnabled_evolution1_Event2 = true; // Enabled condition for event Right Event 
  private boolean _isEnabled_evolution2 = true; // Enabled condition for Model.Evolution.Update Table
  private boolean _isEnabled_evolution3 = true; // Enabled condition for Model.Evolution.Update Ghosts
  private boolean _isEnabled_constraints1 = true; // Enabled condition for Model.Constraints.Compute Display Vars

  public void _setPageEnabled(String _pageName, boolean _enabled) { // Sets the enabled state of a page
    boolean _pageFound = false;
    if ("Initialize".equals(_pageName)) { _pageFound = true; _isEnabled_initialization1 = _enabled; } // Change enabled condition for Model.Initialization.Initialize
    if ("Ball Evolution".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1 = _enabled; _automaticResetSolvers(); } // Change enabled condition for Model.Evolution.Ball Evolution
    if ("Left Event".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1_Event1 = _enabled; _ODEi_evolution1.initializeSolver(); } // Change enabled condition for event Left Event 
    if ("Right Event".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1_Event2 = _enabled; _ODEi_evolution1.initializeSolver(); } // Change enabled condition for event Right Event 
    if ("Update Table".equals(_pageName)) { _pageFound = true; _isEnabled_evolution2 = _enabled; } // Change enabled condition for Model.Evolution.Update Table
    if ("Update Ghosts".equals(_pageName)) { _pageFound = true; _isEnabled_evolution3 = _enabled; } // Change enabled condition for Model.Evolution.Update Ghosts
    if ("Compute Display Vars".equals(_pageName)) { _pageFound = true; _isEnabled_constraints1 = _enabled; } // Change enabled condition for Model.Constraints.Compute Display Vars
    if (!_pageFound) System.out.println ("_setPageEnabled() warning. Page not found: "+_pageName);
  }

 // -------------------------------------------
 // Methods defined by the user 
 // -------------------------------------------

 // --- Initialization

  public void _initialization1 () { // > Initialization.Initialize
    setGhostColors();  // > Initialization.Initialize:1
    double xi=xmin;  // > Initialization.Initialize:2
    char label='A';  // > Initialization.Initialize:3
    dx=(xmax-xmin)/(nt-1);  // > Initialization.Initialize:4
    for(int i=0; i<nt; i++){  // > Initialization.Initialize:5
      xt[i]=xi;  // > Initialization.Initialize:6
      ht[i]=ymax/2;  // > Initialization.Initialize:7
      dy[i]=0;  // > Initialization.Initialize:8
      st[i]=dx;  // > Initialization.Initialize:9
      theta[i]=0;  // > Initialization.Initialize:10
      labels[i]="A"; //Character.toString(label);  // > Initialization.Initialize:11  WC:  Bug in JS.  Character.toString not implemented
      label++;  // > Initialization.Initialize:12
      xi+=dx;  // > Initialization.Initialize:13
    }  // > Initialization.Initialize:14
    x0=x=dx/2;  // > Initialization.Initialize:15
    yBall=ymax/2;  // > Initialization.Initialize:16
    _view.dragJointsCheck.setSelected(dragMode==3);  // > Initialization.Initialize:17
    resetTime ();  // > Initialization.Initialize:18
  }  // > Initialization.Initialize

 // --- Evolution

  private _ODE_evolution1 _ODEi_evolution1;


  // ----------- private class for ODE in page Evolution:Ball Evolution

  private class _ODE_evolution1 implements org.opensourcephysics.numerics.ode_solvers.EjsS_ODE, org.opensourcephysics.numerics.ode_solvers.symplectic.VelocityVerletSavvy {
    private org.opensourcephysics.numerics.ode_solvers.SolverEngine __solver=null; // The solver engine
    private org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver __eventSolver=null; // The event solver
    private Class<?> __solverClass=null; // The solver class
    private double[] __state=null; // Our state array
    private boolean __ignoreErrors=false; // Whether to ignore solver errors
    private boolean __mustInitialize=true; // Be sure to initialize the solver
    private boolean __isEnabled=true; // Whether it is enabled
    private boolean __mustUserReinitialize=false; // Whether the user asked to reset the solver
    private boolean __mustReinitialize=true; // flag to reinitialize the solver

    _ODE_evolution1() { // Class constructor
      __solverClass = org.opensourcephysics.numerics.ode_solvers.rk.CashKarp45.class;
      __instantiateSolver();
      _privateOdesList.put("Ball Evolution",this);
    }

    public org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver getEventSolver() { return __eventSolver; } 

    public void setSolverClass (Class<?> __aSolverClass) { // Change the solver in run-time
      this.__solverClass = __aSolverClass;
      __instantiateSolver();
    }

    public String setSolverClass (String _solverClassName) { // Change the solver in run-time
      String _prefix = "org.opensourcephysics.numerics.ode_solvers.";
      _solverClassName = _solverClassName.trim().toLowerCase();
      if (_solverClassName.indexOf("euler")>=0) {
        if (_solverClassName.indexOf("rich")>=0) _solverClassName = _prefix + "rk.EulerRichardson";
        else _solverClassName = _prefix + "rk.Euler";
      }
      else if (_solverClassName.indexOf("verlet")>=0) _solverClassName = _prefix + "symplectic.VelocityVerlet";
      else if (_solverClassName.indexOf("runge")>=0)  _solverClassName = _prefix + "rk.RK4";
      else if (_solverClassName.indexOf("rk4")>=0)    _solverClassName = _prefix + "rk.RK4";
      else if (_solverClassName.indexOf("boga")>=0)  _solverClassName = _prefix + "rk.BogackiShampine23";
      else if (_solverClassName.indexOf("cash")>=0)  _solverClassName = _prefix + "rk.CashKarp45";
      else if (_solverClassName.indexOf("fehl")>=0) {
        if (_solverClassName.indexOf("7")>=0) _solverClassName = _prefix + "rk.Fehlberg78";
        else _solverClassName = _prefix + "rk.Fehlberg8";
      }
      else if (_solverClassName.indexOf("dorm")>=0 || _solverClassName.indexOf("dopri")>=0) {
        if (_solverClassName.indexOf("8")>=0) _solverClassName = _prefix + "rk.Dopri853";
        else _solverClassName = _prefix + "rk.Dopri5";
      }
      else if (_solverClassName.indexOf("radau")>=0) _solverClassName = _prefix + "rk.Radau5";
      else { System.err.println ("There is no solver with this name "+_solverClassName); return null; }
      try { setSolverClass(Class.forName(_solverClassName)); }
      catch (Exception exc) { exc.printStackTrace(); }
      return _solverClassName;
    }

    private void __instantiateSolver () {
      __state = new double[1+1+1+1];
      __pushState();
      try { // Create the solver by reflection
        Class<?>[] __c = { };
        Object[] __o = { };
        java.lang.reflect.Constructor<?> __constructor = __solverClass.getDeclaredConstructor(__c);
        __solver = (org.opensourcephysics.numerics.ode_solvers.SolverEngine) __constructor.newInstance(__o);
      } catch (Exception exc) { exc.printStackTrace(); } 
      __eventSolver = new org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver(__solver,this);
      __mustInitialize = true;
    }

    public void setEnabled (boolean __enabled) { __isEnabled = __enabled; }

    public double getIndependentVariableValue () { return __eventSolver.getIndependentVariableValue(); }

    public double getInternalStepSize () { return __eventSolver.getInternalStepSize(); }

    public boolean isAccelerationIndependentOfVelocity() { return false; }

    public void initializeSolver () {
      __pushState();
      __eventSolver.initialize(dt);
      __eventSolver.setBestInterpolation(false);
      __eventSolver.setMaximumInternalSteps(10000);
      __eventSolver.removeAllEvents();
      if (_isEnabled_evolution1_Event1) __eventSolver.addEvent( new _ODE_evolution1_Event1());
      if (_isEnabled_evolution1_Event2) __eventSolver.addEvent( new _ODE_evolution1_Event2());
      __eventSolver.setEstimateFirstStep(false);
      __eventSolver.setEnableExceptions(false);
      __eventSolver.setTolerances(tol,tol);
      __mustReinitialize = true;
      __mustInitialize = false;
    }

    private void __pushState () { // Copy our variables to the state
      // Copy our variables to __state[] 
      int __cIn=0;
      if (__state[__cIn]!=xtrack) __mustReinitialize = true;
      __state[__cIn++] = xtrack;
      if (__state[__cIn]!=x) __mustReinitialize = true;
      __state[__cIn++] = x;
      if (__state[__cIn]!=vx) __mustReinitialize = true;
      __state[__cIn++] = vx;
      if (__state[__cIn]!=t) __mustReinitialize = true;
      __state[__cIn++] = t;
    }

    public void resetSolver () {
      __mustUserReinitialize = true;
    }

    public void automaticResetSolver () {
      __mustReinitialize = true;
    }

    private void __errorAction () {
      if (__ignoreErrors) return;
      System.err.println (__eventSolver.getErrorMessage());
      int __option = javax.swing.JOptionPane.showConfirmDialog(_view.getComponent(_simulation.getMainWindow()),org.opensourcephysics.ejs.EjsSimulation.getEjsString("ODEError.Continue"),
        org.opensourcephysics.ejs.EjsSimulation.getEjsString("Error"), javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
      if (__option==javax.swing.JOptionPane.YES_OPTION) __ignoreErrors = true;
      else if (__option==javax.swing.JOptionPane.CANCEL_OPTION) _pause();
      // Make sure the solver is reinitialized;
      __mustReinitialize = true;
    }

    public double step() { return __privateStep(false); }

    public double solverStep() { return __privateStep(true); }

    private double __privateStep(boolean __takeMaximumStep) {
      if (!__isEnabled) return 0;
      if (dt==0) return 0;
      if (__mustInitialize) initializeSolver();
      __eventSolver.setStepSize(dt);
      __eventSolver.setInternalStepSize(dt);
      __eventSolver.setMaximumInternalSteps(10000);
      __eventSolver.setTolerances(tol,tol);
      __pushState();
      if (__mustUserReinitialize) { 
        __eventSolver.userReinitialize();
        __mustUserReinitialize = false;
        __mustReinitialize = false;
        if (__eventSolver.getErrorCode()!=org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver.ERROR.NO_ERROR) __errorAction();
      }
      else if (__mustReinitialize) { 
        __eventSolver.reinitialize();
        __mustReinitialize = false;
        if (__eventSolver.getErrorCode()!=org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver.ERROR.NO_ERROR) __errorAction();
      }
      double __stepTaken = __takeMaximumStep ? __eventSolver.maxStep() : __eventSolver.step();
      // Extract our variables from __state
      int __cOut=0;
      xtrack = __state[__cOut++];
      x = __state[__cOut++];
      vx = __state[__cOut++];
      t = __state[__cOut++];
      // Check for error
      if (__eventSolver.getErrorCode()!=org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver.ERROR.NO_ERROR) __errorAction();
      return __stepTaken;
    }

    public double[] getState () { return __state; }

    public void getRate (double[] __aState, double[] __aRate) {
      __aRate[__aRate.length-1] = 0.0; // In case the prelim code returns
      int __index=-1; // so that it can be used in preliminary code
      // Extract our variables from __aState
      int __cOut=0;
      double xtrack = __aState[__cOut++];
      double x = __aState[__cOut++];
      double vx = __aState[__cOut++];
      double t = __aState[__cOut++];
      // Preliminary code: Code to be executed before rate equations are evaluated
      double ax=-g*Math.sin(theta[segment])*Math.cos(theta[segment]);  // > Evolution:Ball Evolution.Prelim code Ball Evolution:1
      if(stationary)ax=0;  // > Evolution:Ball Evolution.Prelim code Ball Evolution:2
      // Compute the rate
      int __cRate = 0;
      __aRate[__cRate++] = vx/Math.cos(theta[segment]); // Evolution:Ball Evolution:1
      __aRate[__cRate++] = vx; // Evolution:Ball Evolution:2
      __aRate[__cRate++] = ax; // Evolution:Ball Evolution:3
      __aRate[__cRate++] = 1.0; // The independent variable 
    }//end of getRate

    private class _ODE_evolution1_Event1 implements org.opensourcephysics.numerics.ode_solvers.StateEvent {

      public int getTypeOfEvent() { return STATE_EVENT; }

      public int getRootFindingMethod() { return SECANT; }

      public int getMaxIterations() { return 100; }

      public String toString () { return "Left Event"; }

      public double getTolerance () { return tol; }

      public double evaluate (double[] __aState) { 
      // Extract our variables from __aState
      int __cOut=0;
      double xtrack = __aState[__cOut++];
      double x = __aState[__cOut++];
      double vx = __aState[__cOut++];
      double t = __aState[__cOut++];
        if(vx>0 || stationary)return Double.MAX_VALUE;  // particle is moving to right   // > Evolution:Ball Evolution:Left Event.Zero Condition:1
        return x-xt[segment];  // > Evolution:Ball Evolution:Left Event.Zero Condition:2
      }

      public boolean action () { 
      // Extract our variables from __state
      int __cOut=0;
      xtrack = __state[__cOut++];
      x = __state[__cOut++];
      vx = __state[__cOut++];
      t = __state[__cOut++];
        boolean _returnValue = userDefinedAction();
      // Copy our variables to __state[] 
      int __cIn=0;
      __state[__cIn++] = xtrack;
      __state[__cIn++] = x;
      __state[__cIn++] = vx;
      __state[__cIn++] = t;
        return _returnValue;
      }

      private boolean userDefinedAction() {
        if(segment==0){  // > Evolution:Ball Evolution:Left Event.Action:1
          vx=Math.abs(vx);// bounce from left end  // > Evolution:Ball Evolution:Left Event.Action:2
          if(!bounce){  // > Evolution:Ball Evolution:Left Event.Action:3
            stationary=true;  // > Evolution:Ball Evolution:Left Event.Action:4
            vx=0;  // > Evolution:Ball Evolution:Left Event.Action:5
          }stationary=(Math.abs(vx)<=tol);  // > Evolution:Ball Evolution:Left Event.Action:6
        }else{  // > Evolution:Ball Evolution:Left Event.Action:7
          segment--;// next segment  // > Evolution:Ball Evolution:Left Event.Action:8
          vx=vx*Math.cos(theta[segment])/Math.cos(theta[segment+1]);  // > Evolution:Ball Evolution:Left Event.Action:9
          stationary=((theta[segment]>0)&&(Math.abs(vx)<=tol));  // > Evolution:Ball Evolution:Left Event.Action:10
        }  // > Evolution:Ball Evolution:Left Event.Action:11
        if(stationary)vx=0;  // > Evolution:Ball Evolution:Left Event.Action:12
        return false;
      }

    } // End of event class _ODE_evolution1_Event1

    private class _ODE_evolution1_Event2 implements org.opensourcephysics.numerics.ode_solvers.StateEvent {

      public int getTypeOfEvent() { return STATE_EVENT; }

      public int getRootFindingMethod() { return SECANT; }

      public int getMaxIterations() { return 100; }

      public String toString () { return "Right Event"; }

      public double getTolerance () { return tol; }

      public double evaluate (double[] __aState) { 
      // Extract our variables from __aState
      int __cOut=0;
      double xtrack = __aState[__cOut++];
      double x = __aState[__cOut++];
      double vx = __aState[__cOut++];
      double t = __aState[__cOut++];
        if(vx<0 || stationary)return Double.MAX_VALUE;  // particle is moving to right   // > Evolution:Ball Evolution:Right Event.Zero Condition:1
        return xt[segment+1]-x;  // > Evolution:Ball Evolution:Right Event.Zero Condition:2
      }

      public boolean action () { 
      // Extract our variables from __state
      int __cOut=0;
      xtrack = __state[__cOut++];
      x = __state[__cOut++];
      vx = __state[__cOut++];
      t = __state[__cOut++];
        boolean _returnValue = userDefinedAction();
      // Copy our variables to __state[] 
      int __cIn=0;
      __state[__cIn++] = xtrack;
      __state[__cIn++] = x;
      __state[__cIn++] = vx;
      __state[__cIn++] = t;
        return _returnValue;
      }

      private boolean userDefinedAction() {
        //_println("segment before="+segment+ "  vx="+vx);  // > Evolution:Ball Evolution:Right Event.Action:1
        if(segment==nt-2){  // > Evolution:Ball Evolution:Right Event.Action:2
          vx=-Math.abs(vx);// bounce from end  // > Evolution:Ball Evolution:Right Event.Action:3
          if(!bounce){  // > Evolution:Ball Evolution:Right Event.Action:4
            stationary=true;  // > Evolution:Ball Evolution:Right Event.Action:5
          }else stationary=(Math.abs(vx)<=tol);  // > Evolution:Ball Evolution:Right Event.Action:6
        }else{  // > Evolution:Ball Evolution:Right Event.Action:7
          segment++;// next segment  // > Evolution:Ball Evolution:Right Event.Action:8
          vx=vx*Math.cos(theta[segment])/Math.cos(theta[segment-1]);  // > Evolution:Ball Evolution:Right Event.Action:9
          stationary=((theta[segment]>0)&&(Math.abs(vx)<=tol));  // > Evolution:Ball Evolution:Right Event.Action:10
        }  // > Evolution:Ball Evolution:Right Event.Action:11
        if(stationary)vx=0;  // > Evolution:Ball Evolution:Right Event.Action:12
        //_println("theta left="+theta[segment-1]+" theta right="+theta[segment]);  // > Evolution:Ball Evolution:Right Event.Action:13
        //_println("segment after="+segment+"  vx="+vx);  // > Evolution:Ball Evolution:Right Event.Action:14
        return false;
      }

    } // End of event class _ODE_evolution1_Event2

  } // End of class _ODE_evolution1

  public void _evolution2 () { // > Evolution.Update Table
    if(visTable) {  // > Evolution.Update Table:1
      vBall=vx/Math.cos(theta[segment]);  // > Evolution.Update Table:2
      aBall=-g*Math.sin(theta[segment]);  // > Evolution.Update Table:3
      xAxisTitle=xyComponents?"x and y":"displacement on track";  // > Evolution.Update Table:4
      vAxisTitle=xyComponents?"v_ {x} and v_y":"track v";  // > Evolution.Update Table:5
      tableRow= new double[] {t,xtrack,vBall,aBall} ;  // > Evolution.Update Table:6
    }  // > Evolution.Update Table:7
  }  // > Evolution.Update Table

  public void _evolution3 () { // > Evolution.Update Ghosts
    msg=null;  // > Evolution.Update Ghosts:1
    gCounter++;  // > Evolution.Update Ghosts:2
    if(t>dt && gCounter%gStride==0 && ng>0){  // > Evolution.Update Ghosts:3
      for(int i=1; i<ng; i++){  // > Evolution.Update Ghosts:4
        xghost[i-1]=xghost[i];  // > Evolution.Update Ghosts:5
        yghost[i-1]=yghost[i];  // > Evolution.Update Ghosts:6
      }  // > Evolution.Update Ghosts:7
      xghost[ng-1]=x;  // > Evolution.Update Ghosts:8
      yghost[ng-1]=yBall=ht[segment]+st[segment]*Math.sin(theta[segment])*(x-xt[segment])/dx;  // > Evolution.Update Ghosts:9
    }  // > Evolution.Update Ghosts:10
    if(t>=maxTime){  // > Evolution.Update Ghosts:11
      _pause();  // > Evolution.Update Ghosts:12
      msg="Done";  // > Evolution.Update Ghosts:13
    }  // > Evolution.Update Ghosts:14
  }  // > Evolution.Update Ghosts

 // --- Constraints

  public void _constraints1 () { // > Fixed relations.Compute Display Vars
    _showDescriptionAtStartUp(!studentMode);  // > Fixed relations.Compute Display Vars:1
    yBall=ht[segment]+st[segment]*Math.sin(theta[segment])*(x-xt[segment])/dx;  // > Fixed relations.Compute Display Vars:2
    vBall=vx/Math.cos(theta[segment]);  // > Fixed relations.Compute Display Vars:3
    vy=vBall*Math.sin(theta[segment]);  // > Fixed relations.Compute Display Vars:4
    aBall=-g*Math.sin(theta[segment]);  // > Fixed relations.Compute Display Vars:5
    axBall=aBall*Math.sin(theta[segment]);  // > Fixed relations.Compute Display Vars:6
    ayBall=aBall*Math.cos(theta[segment]);  // > Fixed relations.Compute Display Vars:7
    xAxisTitle=xyComponents?"x and y":"displacement on track";  // > Fixed relations.Compute Display Vars:8
    vAxisTitle=xyComponents?"v_{x} and v_{y}":"track v";  // > Fixed relations.Compute Display Vars:9
    aAxisTitle=xyComponents?"a_{x} and a_{y}":"track a";  // > Fixed relations.Compute Display Vars:10
    KE=0.5*vBall*vBall;  // > Fixed relations.Compute Display Vars:11
    PE=g*yBall;// assume mass=1  // > Fixed relations.Compute Display Vars:12
    E=KE+PE;  // > Fixed relations.Compute Display Vars:13
  }  // > Fixed relations.Compute Display Vars

 // --- Custom

  public void resetTime () {  // > Custom.Reset Time:1
    stationary=false;  // > Custom.Reset Time:2
    t=0;  // > Custom.Reset Time:3
    x=x0;  // > Custom.Reset Time:4
    findSegment();  // > Custom.Reset Time:5
    xtrack=0;  // > Custom.Reset Time:6
    postWidth=(xmax-xmin)/150;  // > Custom.Reset Time:7
    yBall=ht[segment]+st[segment]*Math.sin(theta[segment])*(x-xt[segment])/dx;  // > Custom.Reset Time:8
    vBall=v0;  // > Custom.Reset Time:9
    vx=vBall*Math.cos(theta[segment]);  // > Custom.Reset Time:10
    vy=vBall*Math.sin(theta[segment]);  // > Custom.Reset Time:11
    aBall=-g*Math.sin(theta[segment]);  // > Custom.Reset Time:12
    xAxisTitle=xyComponents?"x and y":"displacement on track";  // > Custom.Reset Time:13
    vAxisTitle=xyComponents?"v_ {x} and v_{y}":"track v";  // > Custom.Reset Time:14
    aAxisTitle=xyComponents?"a_{x} and a_{y}":"track a";  // > Custom.Reset Time:15
    tableRow= new double[] {t,xtrack,vBall,aBall} ;  // > Custom.Reset Time:16
    KE=0.5*vBall*vBall;  // > Custom.Reset Time:17
    PE=g*yBall;// assume mass=1  // > Custom.Reset Time:18
    E=KE+PE;  // > Custom.Reset Time:19
    _view.clearData();  // > Custom.Reset Time:20
    for(int i=0; i<ng; i++) {  // > Custom.Reset Time:21
      xghost[i]=x;  // > Custom.Reset Time:22
      yghost[i]=yBall;  // > Custom.Reset Time:23
    }  // > Custom.Reset Time:24
    gCounter=0;  // > Custom.Reset Time:25
    msg=startMsg;  // > Custom.Reset Time:26
    _view.clearData();  // > Custom.Reset Time:27
    jointsData[0]=xt;  // > Custom.Reset Time:28
    jointsData[1]=ht;  // > Custom.Reset Time:29
  }  // > Custom.Reset Time:30
  public void setGhostColors() {  // > Custom.Reset Time:31
    for(int i=1; i<ng+1; i++) {  // > Custom.Reset Time:32
      int sat=i*255/(ng+1);  // > Custom.Reset Time:33
      ghostColors[i-1]=new Color(255,255-sat,255-sat,sat);  // > Custom.Reset Time:34
    }  // > Custom.Reset Time:35
  }  // > Custom.Reset Time:36

  public void dragPost (int index) {  // > Custom.Drag Post:1
    ht[index]=Math.max(postWidth, ht[index]);  // > Custom.Drag Post:2
    ht[index]=Math.min(ymax, ht[index]);  // > Custom.Drag Post:3
    if(index<nt-1) { // compute angle to right  // > Custom.Drag Post:4
      double dh=ht[index+1]-ht[index];  // > Custom.Drag Post:5
      theta[index]=Math.atan2(dh,dx);  // > Custom.Drag Post:6
      st[index]=Math.sqrt(dx*dx+dh*dh);  // length of post  // > Custom.Drag Post:7
    }  // > Custom.Drag Post:8
    if(index>0) {  // > Custom.Drag Post:9
      double dh=ht[index]-ht[index-1];  // > Custom.Drag Post:10
      theta[index-1]=Math.atan2(dh,dx);  // > Custom.Drag Post:11
      st[index-1]=Math.sqrt(dx*dx+dh*dh);  // > Custom.Drag Post:12
    }  // > Custom.Drag Post:13
    resetTime();  // > Custom.Drag Post:14
  }  // > Custom.Drag Post:15
  public void findSegment() {  // > Custom.Drag Post:16
    x=Math.max(x,xmin);  // > Custom.Drag Post:17
    x=Math.min(x,xmax);  // > Custom.Drag Post:18
    segment=0;  // > Custom.Drag Post:19
    for(int i=1; i<nt-1; i++) {  // > Custom.Drag Post:20
      if(x>xt[i]) segment++;  // > Custom.Drag Post:21
      else return;  // > Custom.Drag Post:22
    }  // > Custom.Drag Post:23
  }  // > Custom.Drag Post:24

  public void changeN () {  // > Custom.Change N:1
    nt=Math.max(nt,2);  // > Custom.Change N:2
    nt=Math.min(nt,10);  // > Custom.Change N:3
    xt=new double[nt];  // > Custom.Change N:4
    ht=new double[nt];  // > Custom.Change N:5
    st=new double[nt];  // > Custom.Change N:6
    dy=new double[nt];  // > Custom.Change N:7
    theta=new double[nt];  // > Custom.Change N:8
    labels=new String[nt];  // > Custom.Change N:9
    _initialize();  // > Custom.Change N:10
  }  // > Custom.Change N:11
  public void changeNG () {  // > Custom.Change N:12
    ng=Math.max(0,ng);  // > Custom.Change N:13
    ng=Math.min(99,ng);  // > Custom.Change N:14
    xghost = new double[ng];  // > Custom.Change N:15
    yghost = new double[ng];  // > Custom.Change N:16
    ghostColors = new Color[ng];  // > Custom.Change N:17
    setGhostColors();  // > Custom.Change N:18
    resetTime();  // > Custom.Change N:19
  }  // > Custom.Change N:20

  public void saveMyState () {  // > Custom.Save State:1
    studentMode=saveInStudentMode;  // > Custom.Save State:2
    _updateModel();  // > Custom.Save State:3
    _view.update();  // > Custom.Save State:4
    //if(OSPRuntime.isLauncherMode() || OSPRuntime.isAppletMode() || _simulation.isEmersionConnected()) {  // > Custom.Save State:5
    if(OSPRuntime.isLauncherMode() || OSPRuntime.isAppletMode()) {  // > Custom.Save State:6
      _saveState(null);  // > Custom.Save State:7
    } else {  // > Custom.Save State:8
       if(fileName==null)fileName="";  // > Custom.Save State:9
       fileName=fileName.trim();  // > Custom.Save State:10
      _saveDefaultStateToJar(fileName);  // > Custom.Save State:11
    }  // > Custom.Save State:12
  }  // > Custom.Save State:13

 // --- Methods for view elements

  public boolean _method_for_tracksPlottingPanel_menu () {
    return !studentMode;
  }

  public double _method_for_groundShape_sizeX () {
    return 4*(xmax-xmin);
  }

  public double _method_for_groundShape_sizeY () {
    return 4*(ymax-ymin);
  }

  public void _method_for_postSet_dragAction () {
    dragPost(index);
  }
  public int _method_for_trackSet_numberOfElements () {
    return nt-1;
  }

  public void _method_for_trackSet_dragAction () {
    ht[index]=Math.max(postWidth, ht[index]);
  }
  public double _method_for_ghostSet_sizeX () {
    return 4*postWidth;
  }

  public double _method_for_ghostSet_sizeY () {
    return 4*postWidth;
  }

  public boolean _method_for_ghostSet_visible () {
    return ng>0;
  }

  public double _method_for_ballGroup_transformation () {
    return theta[segment];
  }

  public double _method_for_ballShape_sizeX () {
    return 4*postWidth;
  }

  public double _method_for_ballShape_sizeY () {
    return 4*postWidth;
  }

  public void _method_for_ballShape_dragAction () {
    findSegment();
    x0=x;
    yBall=ht[segment]+st[segment]*Math.sin(theta[segment])*(x-xt[segment])/dx;
  }
  public void _method_for_ballShape_releaseAction () {
    x0=x;
    resetTime();
  }
  public double _method_for_vArrow_y () {
    return 3*postWidth;
  }

  public double _method_for_vText_x () {
    return vBall+postWidth;
  }

  public double _method_for_gArrow_sizeY () {
    return -g;
  }

  public double _method_for_gText_x () {
    return x+postWidth;
  }

  public double _method_for_gText_y () {
    return yBall-g*gScale-postWidth;
  }

  public boolean _method_for_controlPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_buttonPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_startButton_enabled () {
    return t<maxTime;
  }

  public void _method_for_startButton_actionOn () {
    msg=null;
    _play();
  }
  public void _method_for_startButton_actionOff () {
    _pause();
  }
  public boolean _method_for_stepButton_enabled () {
    return t<maxTime;
  }

  public void _method_for_stepButton_action () {
    _step();
  }
  public void _method_for_resetTimeButton_action () {
    resetTime ();
  }
  public void _method_for_docButton_action () {
    if(fileName!=null)_view.showDocument(fileName);
  }
  public boolean _method_for_docButton_visible () {
    return fileName!=null && !fileName.trim().equals("");
  }

  public void _method_for_toolButton_action () {
    _tools.showDataTool(_view.xtrackTrail,_view.vTrail);
  }
  public boolean _method_for_initialConditions_menu () {
    return !studentMode;
  }

  public boolean _method_for_x0Field_editable () {
    return _isPaused();
  }

  public void _method_for_x0Field_action () {
    resetTime ();
  }
  public boolean _method_for_v0Field_editable () {
    return _isPaused();
  }

  public void _method_for_v0Field_action () {
    resetTime ();
  }
  public boolean _method_for_checkPanel_visible () {
    return showX||showV||showA||showTable||showE||showJointsTable;
  }

  public boolean _method_for_tableCheckPanel_visible () {
    return showTable||showJointsTable;
  }

  public boolean _method_for_graphCheckPanel_visible () {
    return showX||showV||showA||showE;
  }

  public boolean _method_for_dataFrame_menu () {
    return !studentMode;
  }

  public boolean _method_for_optionPanel_visible () {
    return !studentMode;
  }

  public void _method_for_hideXCheck_action () {
    _view.xyDataTable.clear();
  }
  public void _method_for_hideVCheck_action () {
    _view.xyDataTable.clear();
  }
  public void _method_for_hideACheck_action () {
    _view.xyDataTable.clear();
  }
  public boolean _method_for_tableControlPanel_menu () {
    return !studentMode;
  }

  public void _method_for_eraseTableButton_action () {
    _view.xyDataTable.clearData();
  }
  public double _method_for_positionPlottingPanel_maximumX () {
    return Math.min(100*dt,maxTime);
  }

  public boolean _method_for_positionPlottingPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_xtrackTrail_visible () {
    return !xyComponents;
  }

  public boolean _method_for_xtrackTrail_measured () {
    return !xyComponents;
  }

  public boolean _method_for_xMarker_visible () {
    return !xyComponents;
  }

  public boolean _method_for_positionControlPanel_menu () {
    return !studentMode;
  }

  public void _method_for_erasePositionButton_action () {
    _view.xtrackTrail.clear();
    _view.xTrail.clear();
    _view.yBallTrail.clear();
  }
  public boolean _method_for_positionVarsPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_xtrackPanel_visible () {
    return !xyComponents;
  }

  public double _method_for_velocityPlottingPanel_maximumX () {
    return Math.min(100*dt,maxTime);
  }

  public boolean _method_for_velocityPlottingPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_vTrail_visible () {
    return !xyComponents;
  }

  public boolean _method_for_vTrail_measured () {
    return !xyComponents;
  }

  public boolean _method_for_yMarker_visible () {
    return !xyComponents;
  }

  public boolean _method_for_vControlPanel_menu () {
    return !studentMode;
  }

  public void _method_for_eraseVelocityButton_action () {
    _view.vTrail.clear();
    _view.vxTrail.clear();
    _view.vyTrail.clear();
  }
  public boolean _method_for_velocityVarsPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_vPanel_visible () {
    return !xyComponents;
  }

  public double _method_for_accelerationPlottingPanel_maximumX () {
    return Math.min(100*dt,maxTime);
  }

  public boolean _method_for_accelerationPlottingPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_aTrail_visible () {
    return !xyComponents;
  }

  public boolean _method_for_aTrail_measured () {
    return !xyComponents;
  }

  public boolean _method_for_aMarker_visible () {
    return !xyComponents;
  }

  public boolean _method_for_aControlPanel_menu () {
    return !studentMode;
  }

  public void _method_for_eraseAccelerationButton_action () {
    _view.vTrail.clear();
    _view.vxTrail.clear();
    _view.vyTrail.clear();
  }
  public boolean _method_for_accelerationVarsPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_aPanel_visible () {
    return !xyComponents;
  }

  public double _method_for_energyPlottingPanel_maximumX () {
    return Math.min(100*dt,maxTime);
  }

  public boolean _method_for_energyPlottingPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_energyControlPanel_menu () {
    return !studentMode;
  }

  public void _method_for_eraseEnergyButton_action () {
    _view.energyTrail.clear();
    _view.peTrail.clear();
    _view.keTrail.clear();
  }
  public boolean _method_for_energyVarsPanel_menu () {
    return !studentMode;
  }

  public boolean _method_for_jointsFrame_menu () {
    return !studentMode;
  }

  public void _method_for_jointsArrayPanel_action () {
    int r= _view.jointsArrayPanel.getRowEdited();
    dragPost(r);
  }
  public boolean _method_for_customizationFrame_visible () {
    return !studentMode;
  }

  public boolean _method_for_teacherControlPanel_visible () {
    return !studentMode;
  }

  public boolean _method_for_displayPanel_visible () {
    return !studentMode;
  }

  public void _method_for_dragJointsCheck_actionon () {
    dragMode=3;
  }
  public void _method_for_dragJointsCheck_actionoff () {
    dragMode=0;
  }
  public void _method_for_ngFieldField_action () {
    changeNG ();
  }
  public boolean _method_for_scalePanel_visible () {
    return !studentMode;
  }

  public void _method_for_xminField_action () {
    _initialize();
  }
  public void _method_for_xmaxField_action () {
    _initialize();
  }
  public void _method_for_yminField_action () {
    _initialize();
  }
  public void _method_for_ymaxField_action () {
    _initialize();
  }
  public void _method_for_nField_action () {
    changeN ();
  }
  public boolean _method_for_gField_editable () {
    return _isPaused();
  }

  public void _method_for_gField_action () {
    resetTime ();
  }
  public void _method_for_dtField_action () {
    resetTime ();
  }
  public boolean _method_for_maxTimeField_editable () {
    return _isPaused();
  }

  public boolean _method_for_parametersPanel_visible () {
    return !studentMode;
  }

  public void _method_for_saveButton_action () {
    saveMyState ();
  }
  public boolean _method_for_msgPanel_visible () {
    return !studentMode;
  }

  public void _method_for_msgField_action () {
    msg=startMsg;
  }
  public void _method_for_resetButton_action () {
    _reset();
  }
} // End of class GraphsAndTracksModel

