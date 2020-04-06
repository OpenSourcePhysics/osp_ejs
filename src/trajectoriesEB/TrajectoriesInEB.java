/*
 * Class : TrajectoriesInEB.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package trajectoriesEB;

// Imports suggested by Model Elements:
// End of imports from Model Elements

import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class TrajectoriesInEB extends org.opensourcephysics.ejs.EjsModel {

  static {
    org.opensourcephysics.tools.ToolForData.setTool(new org.opensourcephysics.tools.ToolForDataFull());
    __translatorUtil = new org.colos.ejs.library.utils.TranslatorUtil();
  }

  static public boolean _sSwingView = true;

  static public int _sServerPort = -1;
  static public int _getServerPort() { return _sServerPort; }

  public TrajectoriesInEBSimulation _simulation=null;
  public TrajectoriesInEBView _view=null;
  public TrajectoriesInEB _model=this;

  // -------------------------- 
  // Information on HTML pages
  // -------------------------- 

  static private java.util.Map<String,java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo>> __htmlPagesMap =
    new java.util.HashMap<String,java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo>>();

  /**
   * Adds info about an html on the model
   */
  static public void _addHtmlPageInfo(String _pageName, String _localeStr, String _title, String _link) {
    java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo> pages = __htmlPagesMap.get(_pageName);
    if (pages==null) {
      pages = new java.util.HashSet<org.colos.ejs.library.utils.HtmlPageInfo>();
      __htmlPagesMap.put(_pageName, pages);
    }
    org.colos.ejs.library.utils.LocaleItem item = org.colos.ejs.library.utils.LocaleItem.getLocaleItem(_localeStr);
    if (item!=null) pages.add(new org.colos.ejs.library.utils.HtmlPageInfo(item, _title, _link));
  }

  /**
   * Returns info about an html on the model
   */
  static public org.colos.ejs.library.utils.HtmlPageInfo _getHtmlPageClassInfo(String _pageName, org.colos.ejs.library.utils.LocaleItem _item) {
    java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo> pages = __htmlPagesMap.get(_pageName);
    if (pages==null) return null;
    org.colos.ejs.library.utils.HtmlPageInfo defaultInfo=null;
    for (org.colos.ejs.library.utils.HtmlPageInfo info : pages) {
      if (info.getLocaleItem().isDefaultItem()) defaultInfo = info;
      if (info.getLocaleItem().equals(_item)) return info;
    }
    return defaultInfo;
  }

  public org.colos.ejs.library.utils.HtmlPageInfo _getHtmlPageInfo(String _pageName, org.colos.ejs.library.utils.LocaleItem _item) { return _getHtmlPageClassInfo(_pageName,_item); }

  // -------------------------- 
  // static methods 
  // -------------------------- 

  static public String _getEjsModel() { return "/testing/TrajectoriesInEB.xml"; }

  static public String _getModelDirectory() { return "testing/"; }

  static public java.awt.Dimension _getEjsAppletDimension() {
    return new java.awt.Dimension(586,308);
  }

  static public java.util.Set<String> _getEjsResources() {
    java.util.Set<String> list = new java.util.HashSet<String>();
    list.add("/testing/TrajectoriesInEB/TrajectoriesInEB.html");
    list.add("/testing/TrajectoriesInEB/trajectories.jpg");
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

    TrajectoriesInEB __theModel = new TrajectoriesInEB (_args);
  }

  static public javax.swing.JComponent getModelPane(String[] _args, javax.swing.JFrame _parentFrame) {
    if (!_common_initialization(_args)) return null;
    TrajectoriesInEB __theModel = new TrajectoriesInEB ("mainFrame",_parentFrame,null,null,_args,true);
    return (javax.swing.JComponent) __theModel._getView().getComponent("mainFrame");
  }

  public TrajectoriesInEB () { this (null, null, null,null,null,false); } // slave application

  public TrajectoriesInEB (String[] _args) { this (null, null, null,null,_args,true); }

  public TrajectoriesInEB (String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, org.colos.ejs.library.LauncherApplet _anApplet, String[] _args, boolean _allowAutoplay) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = _args;
    __theApplet = _anApplet;
    java.text.NumberFormat _Ejs_format = java.text.NumberFormat.getInstance();
    if (_Ejs_format instanceof java.text.DecimalFormat) {
      ((java.text.DecimalFormat) _Ejs_format).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new TrajectoriesInEBSimulation (this,_replaceName,_replaceOwnerFrame,_codebase,_allowAutoplay);
    _simulation.processArguments(_args);
    if (_sSwingView)       org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(false);
  }

 // -------------------------------------------
 // Abstract part of Model 
 // -------------------------------------------

  public String _getClassEjsModel() { return _getEjsModel(); }

  public java.util.Set<String> _getClassEjsResources() { return _getEjsResources(); }

  public String _getClassModelDirectory() { return _getModelDirectory(); }

  public org.colos.ejs.library.View _getView() { return _view; }

  public org.opensourcephysics.ejs.EjsSimulation _getSimulation() { return _simulation; }

  public int _getPreferredStepsPerDisplay() { return 1; }

  public void _resetModel () {
    _isEnabled_initialization1 = true; // Reset enabled condition for Model.Initialization.Ball initialization
    _isEnabled_evolution1 = true; // Reset enabled condition for Model.Evolution.ODE Evolution
    msg = "Drag the source position."; // Variables.Aux vars:1    msg = "Drag the source position."; // Variables.Aux vars:1
    componentB = " Bx = "; // Variables.Aux vars:2    componentB = " Bx = "; // Variables.Aux vars:2
    componentE = " Ex = "; // Variables.Aux vars:3    componentE = " Ex = "; // Variables.Aux vars:3
    boxSize = 10; // Variables.Aux vars:4    boxSize = 10; // Variables.Aux vars:4
    E = 1; // Variables.Aux vars:5    E = 1; // Variables.Aux vars:5
    B = 1; // Variables.Aux vars:6    B = 1; // Variables.Aux vars:6
    v0 = 2; // Variables.Aux vars:7    v0 = 2; // Variables.Aux vars:7
    sx = -boxSize; // Variables.Aux vars:8    sx = -boxSize; // Variables.Aux vars:8
    sy = 0; // Variables.Aux vars:9    sy = 0; // Variables.Aux vars:9
    n = 50; // Variables.Dynamical vars:1    n = 50; // Variables.Dynamical vars:1
    x = new double [n]; // Variables.Dynamical vars:2
    for (int _i0=0; _i0<n; _i0++) x[_i0] = 0; // Variables.Dynamical vars:2
    vx = new double [n]; // Variables.Dynamical vars:3
    y = new double [n]; // Variables.Dynamical vars:4
    for (int _i0=0; _i0<n; _i0++) y[_i0] = 0; // Variables.Dynamical vars:4
    vy = new double [n]; // Variables.Dynamical vars:5
    z = new double [n]; // Variables.Dynamical vars:6
    vz = new double [n]; // Variables.Dynamical vars:7
    t = 0; // Variables.Dynamical vars:8    t = 0; // Variables.Dynamical vars:8
    dt = 0.1; // Variables.Dynamical vars:9    dt = 0.1; // Variables.Dynamical vars:9
    tol = 1.0E-6; // Variables.Dynamical vars:10    tol = 1.0E-6; // Variables.Dynamical vars:10
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
    if (_wasEnabled_evolution1) _ODEi_evolution1.step();
    if (__shouldBreak) return;
  }

  public void _updateModel () {
    __shouldBreak = false;
  }

  public void _readFromViewAfterUpdate () {
  }

  public void _freeMemory () {
    getSimulation().setEnded(); // Signal that the simulation ended already
    x = null;  // Variables.Dynamical vars:2
    vx = null;  // Variables.Dynamical vars:3
    y = null;  // Variables.Dynamical vars:4
    vy = null;  // Variables.Dynamical vars:5
    z = null;  // Variables.Dynamical vars:6
    vz = null;  // Variables.Dynamical vars:7
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

 public String msg  = "Drag the source position."; // Variables.Aux vars:1
 public String componentB  = " Bx = "; // Variables.Aux vars:2
 public String componentE  = " Ex = "; // Variables.Aux vars:3
 public double boxSize  = 10; // Variables.Aux vars:4
 public double E  = 1; // Variables.Aux vars:5
 public double B  = 1; // Variables.Aux vars:6
 public double v0  = 2; // Variables.Aux vars:7
 public double sx  = -boxSize; // Variables.Aux vars:8
 public double sy  = 0; // Variables.Aux vars:9
 public boolean crossed ; // Variables.Aux vars:10
 public int n  = 50; // Variables.Dynamical vars:1
 public double x []; // Variables.Dynamical vars:2
 public double vx []; // Variables.Dynamical vars:3
 public double y []; // Variables.Dynamical vars:4
 public double vy []; // Variables.Dynamical vars:5
 public double z []; // Variables.Dynamical vars:6
 public double vz []; // Variables.Dynamical vars:7
 public double t  = 0; // Variables.Dynamical vars:8
 public double dt  = 0.1; // Variables.Dynamical vars:9
 public double tol  = 1.0E-6; // Variables.Dynamical vars:10

 // -------------------------------------------
 // Enabled condition of pages 
 // -------------------------------------------

  private boolean _isEnabled_initialization1 = true; // Enabled condition for Model.Initialization.Ball initialization
  private boolean _isEnabled_evolution1 = true; // Enabled condition for Model.Evolution.ODE Evolution

  public void _setPageEnabled(String _pageName, boolean _enabled) { // Sets the enabled state of a page
    boolean _pageFound = false;
    if ("Ball initialization".equals(_pageName)) { _pageFound = true; _isEnabled_initialization1 = _enabled; } // Change enabled condition for Model.Initialization.Ball initialization
    if ("ODE Evolution".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1 = _enabled; _automaticResetSolvers(); } // Change enabled condition for Model.Evolution.ODE Evolution
    if (!_pageFound) System.out.println ("_setPageEnabled() warning. Page not found: "+_pageName);
  }

 // -------------------------------------------
 // Methods defined by the user 
 // -------------------------------------------

 // --- Initialization

  public void _initialization1 () { // > Initialization.Ball initialization
    double theta=0, dTheta=2*Math.PI/n;  // > Initialization.Ball initialization:1
    t=0;  // > Initialization.Ball initialization:2
    for(int i=0; i<n; i++){                // beginning of loop  // > Initialization.Ball initialization:3
      x[i]=0;  // > Initialization.Ball initialization:4
      y[i]=0;  // > Initialization.Ball initialization:5
      z[i]=0;  // > Initialization.Ball initialization:6
      vx[i]=v0*Math.sin(theta);             // x velocity component  // > Initialization.Ball initialization:7
      vy[i]=v0*Math.cos(theta);             // y velocity component  // > Initialization.Ball initialization:8
      vz[i]=0;  // > Initialization.Ball initialization:9
      theta += dTheta;  // > Initialization.Ball initialization:10
    }                                      // end of loop  // > Initialization.Ball initialization:11
    componentB=crossed?" Bz = ":" Bx = ";  // > Initialization.Ball initialization:12
    componentE=crossed?" Ey = ":" Ex = ";  // > Initialization.Ball initialization:13
  }  // > Initialization.Ball initialization

 // --- Evolution

  private _ODE_evolution1 _ODEi_evolution1;


  // ----------- private class for ODE in page Evolution:ODE Evolution

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

    // Temporary array variables matching those defined by the user
    private double[] _x;
    private double[] _vx;
    private double[] _y;
    private double[] _vy;
    private double[] _z;
    private double[] _vz;

    _ODE_evolution1() { // Class constructor
      __solverClass = org.opensourcephysics.numerics.ode_solvers.rk.CashKarp45.class;
      __instantiateSolver();
      _privateOdesList.put("ODE Evolution",this);
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
      __state = new double[1+x.length+vx.length+y.length+vy.length+z.length+vz.length];
      // allocate temporary arrays
      _x = new double[x.length];
      _vx = new double[vx.length];
      _y = new double[y.length];
      _vy = new double[vy.length];
      _z = new double[z.length];
      _vz = new double[vz.length];
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
      if (__arraysChanged()) { __instantiateSolver(); initializeSolver(); return; }
      __pushState();
      __eventSolver.initialize(dt);
      __eventSolver.setBestInterpolation(false);
      __eventSolver.setMaximumInternalSteps(10000);
      __eventSolver.removeAllEvents();
      __eventSolver.setEstimateFirstStep(false);
      __eventSolver.setEnableExceptions(false);
      __eventSolver.setTolerances(tol,tol);
      __mustReinitialize = true;
      __mustInitialize = false;
    }

    private void __pushState () { // Copy our variables to the state
      // Copy our variables to __state[] 
      int __cIn=0;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<x.length; __i++)
           if (__state[__n++]!=x[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(x,0,__state,__cIn,x.length); __cIn += x.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<vx.length; __i++)
           if (__state[__n++]!=vx[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(vx,0,__state,__cIn,vx.length); __cIn += vx.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<y.length; __i++)
           if (__state[__n++]!=y[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(y,0,__state,__cIn,y.length); __cIn += y.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<vy.length; __i++)
           if (__state[__n++]!=vy[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(vy,0,__state,__cIn,vy.length); __cIn += vy.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<z.length; __i++)
           if (__state[__n++]!=z[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(z,0,__state,__cIn,z.length); __cIn += z.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<vz.length; __i++)
           if (__state[__n++]!=vz[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(vz,0,__state,__cIn,vz.length); __cIn += vz.length;
      if (__state[__cIn]!=t) __mustReinitialize = true;
      __state[__cIn++] = t;
    }

    private boolean __arraysChanged () {
      if (x.length != _x.length) return true;
      if (vx.length != _vx.length) return true;
      if (y.length != _y.length) return true;
      if (vy.length != _vy.length) return true;
      if (z.length != _z.length) return true;
      if (vz.length != _vz.length) return true;
      return false;
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
      if (__arraysChanged()) { __instantiateSolver(); initializeSolver(); }
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
      System.arraycopy(__state,__cOut,x,0,x.length); __cOut+=x.length;
      System.arraycopy(__state,__cOut,vx,0,vx.length); __cOut+=vx.length;
      System.arraycopy(__state,__cOut,y,0,y.length); __cOut+=y.length;
      System.arraycopy(__state,__cOut,vy,0,vy.length); __cOut+=vy.length;
      System.arraycopy(__state,__cOut,z,0,z.length); __cOut+=z.length;
      System.arraycopy(__state,__cOut,vz,0,vz.length); __cOut+=vz.length;
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
      double[] x = _x;
      System.arraycopy(__aState,__cOut,x,0,x.length); __cOut+=x.length;
      double[] vx = _vx;
      System.arraycopy(__aState,__cOut,vx,0,vx.length); __cOut+=vx.length;
      double[] y = _y;
      System.arraycopy(__aState,__cOut,y,0,y.length); __cOut+=y.length;
      double[] vy = _vy;
      System.arraycopy(__aState,__cOut,vy,0,vy.length); __cOut+=vy.length;
      double[] z = _z;
      System.arraycopy(__aState,__cOut,z,0,z.length); __cOut+=z.length;
      double[] vz = _vz;
      System.arraycopy(__aState,__cOut,vz,0,vz.length); __cOut+=vz.length;
      double t = __aState[__cOut++];
      // Preliminary code: Code to be executed before rate equations are evaluated
      msg=null;  // > Evolution:ODE Evolution.Prelim code ODE Evolution:1
      double[] ax=new double[n];  // > Evolution:ODE Evolution.Prelim code ODE Evolution:2
      double[] ay=new double[n];  // > Evolution:ODE Evolution.Prelim code ODE Evolution:3
      double[] az=new double[n];  // > Evolution:ODE Evolution.Prelim code ODE Evolution:4
      for(int i=0; i<n; i++){  // > Evolution:ODE Evolution.Prelim code ODE Evolution:5
        ax[i]=crossed?vy[i]*B   :E;  // > Evolution:ODE Evolution.Prelim code ODE Evolution:6
        ay[i]=crossed?E-vx[i]*B :B*vz[i];  // > Evolution:ODE Evolution.Prelim code ODE Evolution:7
        az[i]=crossed? 0        :-B*vy[i];  // > Evolution:ODE Evolution.Prelim code ODE Evolution:8
      }  // > Evolution:ODE Evolution.Prelim code ODE Evolution:9
      // Compute the rate
      int __cRate = 0;
      System.arraycopy(vx,0,__aRate,__cRate,_x.length); // Evolution:ODE Evolution:1
      __cRate += x.length;
      System.arraycopy(ax,0,__aRate,__cRate,_vx.length); // Evolution:ODE Evolution:2
      __cRate += vx.length;
      System.arraycopy(vy,0,__aRate,__cRate,_y.length); // Evolution:ODE Evolution:3
      __cRate += y.length;
      System.arraycopy(ay,0,__aRate,__cRate,_vy.length); // Evolution:ODE Evolution:4
      __cRate += vy.length;
      System.arraycopy(vz,0,__aRate,__cRate,_z.length); // Evolution:ODE Evolution:5
      __cRate += z.length;
      System.arraycopy(az,0,__aRate,__cRate,_vz.length); // Evolution:ODE Evolution:6
      __cRate += vz.length;
      __aRate[__cRate++] = 1.0; // The independent variable 
    }//end of getRate

  } // End of class _ODE_evolution1

 // --- Constraints

 // --- Custom

  public void changeN () {  // > Custom.Change N:1
    n=Math.max(1,n);  // > Custom.Change N:2
    n=Math.min(1024,n);  // > Custom.Change N:3
    x=new double[n];  // > Custom.Change N:4
    vx=new double[n];  // > Custom.Change N:5
    y=new double[n];  // > Custom.Change N:6
    vy=new double[n];  // > Custom.Change N:7
    z=new double[n];  // > Custom.Change N:8
    vz=new double[n];  // > Custom.Change N:9
    _initialize();  // > Custom.Change N:10
  }  // > Custom.Change N:11

 // --- Methods for view elements

  public boolean _method_for_BField_editable () {
    return _isPaused();
  }

  public void _method_for_BField_action () {
    _initialize();
  }
  public boolean _method_for_EField_editable () {
    return _isPaused();
  }

  public void _method_for_EField_action () {
    _initialize();
  }
  public double _method_for_ballDrawingPanel_minimumX () {
    return -boxSize;
  }

  public double _method_for_ballDrawingPanel_minimumY () {
    return -boxSize;
  }

  public void _method_for_startStopButton_actionOn () {
    _play();
  }
  public void _method_for_startStopButton_actionOff () {
    _pause();
  }
  public void _method_for_stepButton_action () {
    _step();
  }
  public void _method_for_resetTimeButton_action () {
    _initialize();
  }
  public void _method_for_resetButton_action () {
    _reset();
  }
  public boolean _method_for_nField_editable () {
    return _isPaused();
  }

  public void _method_for_nField_action () {
    changeN();
  }
  public boolean _method_for_vField_editable () {
    return _isPaused();
  }

  public void _method_for_vField_action () {
    _initialize();
  }
  public boolean _method_for_crossButton_enabled () {
    return _isPaused();
  }

  public void _method_for_crossButton_actionon () {
    _initialize();
  }
  public boolean _method_for_parallelButton_variable () {
    return !crossed;
  }

  public boolean _method_for_parallelButton_enabled () {
    return _isPaused();
  }

  public void _method_for_parallelButton_actionon () {
    crossed=false;
    _initialize();
  }
} // End of class TrajectoriesInEBModel

