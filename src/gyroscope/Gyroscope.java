/*
 * Class : Gyroscope.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package gyroscope;

import org.colos.ejs.library._EjsConstants;

import org.opensourcephysics.numerics.*;
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

public class Gyroscope extends org.opensourcephysics.ejs.EjsModel {

  static {
    __translatorUtil = new org.colos.ejs.library.utils.TranslatorUtil();
  }

  static public boolean _sSwingView = true;

  static public int _sServerPort = -1;
  static public int _getServerPort() { return _sServerPort; }

  public GyroscopeSimulation _simulation=null;
  public GyroscopeView _view=null;
  public Gyroscope _model=this;

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

  static public String _getEjsModel() { return "/testing/Gyroscope.xml"; }

  static public String _getModelDirectory() { return "testing/"; }

  static public java.awt.Dimension _getEjsAppletDimension() {
    return new java.awt.Dimension(554,540);
  }

  static public java.util.Set<String> _getEjsResources() {
    java.util.Set<String> list = new java.util.HashSet<String>();
    list.add("/testing/TEXTURES/metal.jpg");
    list.add("/testing/TEXTURES/wood_planks.jpg");
    list.add("/testing/Gyroscope/momerntum_rate_eqn.gif");
    list.add("/testing/Gyroscope/torque_eqn.gif");
    list.add("/testing/Gyroscope/gyroscope.jpg");
    list.add("/testing/Gyroscope/Gyroscope.html");
    list.add("/testing/Gyroscope/Euler_eqn.gif");
    list.add("/testing/Gyroscope/RigidBodyDynamics.html");
    list.add("/testing/Gyroscope/torque_body_frame.gif");
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

    Gyroscope __theModel = new Gyroscope (_args);
  }

  static public javax.swing.JComponent getModelPane(String[] _args, javax.swing.JFrame _parentFrame) {
    if (!_common_initialization(_args)) return null;
    Gyroscope __theModel = new Gyroscope ("mainFrame",_parentFrame,null,null,_args,true);
    return (javax.swing.JComponent) __theModel._getView().getComponent("mainFrame");
  }

  public Gyroscope () { this (null, null, null,null,null,false); } // slave application

  public Gyroscope (String[] _args) { this (null, null, null,null,_args,true); }

  public Gyroscope (String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, org.colos.ejs.library.LauncherApplet _anApplet, String[] _args, boolean _allowAutoplay) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = _args;
    __theApplet = _anApplet;
    java.text.NumberFormat _Ejs_format = java.text.NumberFormat.getInstance();
    if (_Ejs_format instanceof java.text.DecimalFormat) {
      ((java.text.DecimalFormat) _Ejs_format).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new GyroscopeSimulation (this,_replaceName,_replaceOwnerFrame,_codebase,_allowAutoplay);
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
    _isEnabled_initialization1 = true; // Reset enabled condition for Model.Initialization.Initialize Vectors
    _isEnabled_evolution1 = true; // Reset enabled condition for Model.Evolution.Evol Page
    _isEnabled_constraints1 = true; // Reset enabled condition for Model.Constraints.Compute space and body frame vectors
    q = new double[]{1,0,0,0}; // Variables.Dynamic Vars:1
    qDot = new double [4]; // Variables.Dynamic Vars:2
    t = 0; // Variables.Dynamic Vars:3    t = 0; // Variables.Dynamic Vars:3
    dt = .1; // Variables.Dynamic Vars:4    dt = .1; // Variables.Dynamic Vars:4
    tol = 1.0E-8; // Variables.Dynamic Vars:5    tol = 1.0E-8; // Variables.Dynamic Vars:5
    showBodyTrail = true; // Variables.Rotor Vars:1    showBodyTrail = true; // Variables.Rotor Vars:1
    showSpace = true; // Variables.Rotor Vars:2    showSpace = true; // Variables.Rotor Vars:2
    showRotor = true; // Variables.Rotor Vars:4    showRotor = true; // Variables.Rotor Vars:4
    boundingBox = 2; // Variables.Rotor Vars:5    boundingBox = 2; // Variables.Rotor Vars:5
    size = 2; // Variables.Rotor Vars:6    size = 2; // Variables.Rotor Vars:6
    m = 1; // Variables.Rotor Vars:7    m = 1; // Variables.Rotor Vars:7
    g = 1; // Variables.Rotor Vars:8    g = 1; // Variables.Rotor Vars:8
    z0 = size/2; // Variables.Rotor Vars:9    z0 = size/2; // Variables.Rotor Vars:9
    R = size/3; // Variables.Rotor Vars:10    R = size/3; // Variables.Rotor Vars:10
    a = 2*R; // Variables.Rotor Vars:11    a = 2*R; // Variables.Rotor Vars:11
    b = 2*R; // Variables.Rotor Vars:12    b = 2*R; // Variables.Rotor Vars:12
    c = R/5; // Variables.Rotor Vars:13    c = R/5; // Variables.Rotor Vars:13
    I1 = m*(b*b+c*c)/20+m*z0*z0; // Variables.Rotor Vars:14    I1 = m*(b*b+c*c)/20+m*z0*z0; // Variables.Rotor Vars:14
    I2 = m*(a*a+c*c)/20+m*z0*z0; // Variables.Rotor Vars:15    I2 = m*(a*a+c*c)/20+m*z0*z0; // Variables.Rotor Vars:15
    I3 = m*(b*b+a*a)/20; // Variables.Rotor Vars:16    I3 = m*(b*b+a*a)/20; // Variables.Rotor Vars:16
    arrowScale = size/4; // Variables.Vector Vars:4    arrowScale = size/4; // Variables.Vector Vars:4
    tilt = Math.PI/3; // Variables.Vector Vars:5    tilt = Math.PI/3; // Variables.Vector Vars:5
    omegaOne = 0.5; // Variables.Vector Vars:6    omegaOne = 0.5; // Variables.Vector Vars:6
    omegaThree = 20; // Variables.Vector Vars:7    omegaThree = 20; // Variables.Vector Vars:7
    omega = new double [3]; // Variables.Vector Vars:8
    angularMomentum = new double [3]; // Variables.Vector Vars:9
    torque = new double [3]; // Variables.Vector Vars:10
    shaftTip = new double [3]; // Variables.Vector Vars:11
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
    boolean _wasEnabled_constraints1 = _isEnabled_constraints1;
    if (_wasEnabled_constraints1) _constraints1 ();
    if (__shouldBreak) return;
  }

  public void _readFromViewAfterUpdate () {
  }

  public void _freeMemory () {
    getSimulation().setEnded(); // Signal that the simulation ended already
    q = null;  // Variables.Dynamic Vars:1
    qDot = null;  // Variables.Dynamic Vars:2
    omega = null;  // Variables.Vector Vars:8
    angularMomentum = null;  // Variables.Vector Vars:9
    torque = null;  // Variables.Vector Vars:10
    shaftTip = null;  // Variables.Vector Vars:11
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

 public double q []; // Variables.Dynamic Vars:1
 public double qDot []; // Variables.Dynamic Vars:2
 public double t  = 0; // Variables.Dynamic Vars:3
 public double dt  = .1; // Variables.Dynamic Vars:4
 public double tol  = 1.0E-8; // Variables.Dynamic Vars:5
 public boolean showBodyTrail  = true; // Variables.Rotor Vars:1
 public boolean showSpace  = true; // Variables.Rotor Vars:2
 public boolean showVectors ; // Variables.Rotor Vars:3
 public boolean showRotor  = true; // Variables.Rotor Vars:4
 public double boundingBox  = 2; // Variables.Rotor Vars:5
 public double size  = 2; // Variables.Rotor Vars:6
 public double m  = 1; // Variables.Rotor Vars:7
 public double g  = 1; // Variables.Rotor Vars:8
 public double z0  = size/2; // Variables.Rotor Vars:9
 public double R  = size/3; // Variables.Rotor Vars:10
 public double a  = 2*R; // Variables.Rotor Vars:11
 public double b  = 2*R; // Variables.Rotor Vars:12
 public double c  = R/5; // Variables.Rotor Vars:13
 public double I1  = m*(b*b+c*c)/20+m*z0*z0; // Variables.Rotor Vars:14
 public double I2  = m*(a*a+c*c)/20+m*z0*z0; // Variables.Rotor Vars:15
 public double I3  = m*(b*b+a*a)/20; // Variables.Rotor Vars:16
 public boolean showElevationPlot ; // Variables.Vector Vars:1
 public double axisElevation ; // Variables.Vector Vars:2
 public double momentumElevation ; // Variables.Vector Vars:3
 public double arrowScale  = size/4; // Variables.Vector Vars:4
 public double tilt  = Math.PI/3; // Variables.Vector Vars:5
 public double omegaOne  = 0.5; // Variables.Vector Vars:6
 public double omegaThree  = 20; // Variables.Vector Vars:7
 public double omega []; // Variables.Vector Vars:8
 public double angularMomentum []; // Variables.Vector Vars:9
 public double torque []; // Variables.Vector Vars:10
 public double shaftTip []; // Variables.Vector Vars:11

 // -------------------------------------------
 // Enabled condition of pages 
 // -------------------------------------------

  private boolean _isEnabled_initialization1 = true; // Enabled condition for Model.Initialization.Initialize Vectors
  private boolean _isEnabled_evolution1 = true; // Enabled condition for Model.Evolution.Evol Page
  private boolean _isEnabled_constraints1 = true; // Enabled condition for Model.Constraints.Compute space and body frame vectors

  public void _setPageEnabled(String _pageName, boolean _enabled) { // Sets the enabled state of a page
    boolean _pageFound = false;
    if ("Initialize Vectors".equals(_pageName)) { _pageFound = true; _isEnabled_initialization1 = _enabled; } // Change enabled condition for Model.Initialization.Initialize Vectors
    if ("Evol Page".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1 = _enabled; _automaticResetSolvers(); } // Change enabled condition for Model.Evolution.Evol Page
    if ("Compute space and body frame vectors".equals(_pageName)) { _pageFound = true; _isEnabled_constraints1 = _enabled; } // Change enabled condition for Model.Constraints.Compute space and body frame vectors
    if (!_pageFound) System.out.println ("_setPageEnabled() warning. Page not found: "+_pageName);
  }

 // -------------------------------------------
 // Methods defined by the user 
 // -------------------------------------------

 // --- Initialization

  public void _initialization1 () { // > Initialization.Initialize Vectors
    t=0;  // > Initialization.Initialize Vectors:1
    // box may have changed so recompute principal moments  // > Initialization.Initialize Vectors:2
    I1=m*(b*b+c*c)/20+m*z0*z0;  // > Initialization.Initialize Vectors:3
    I2=m*(a*a+c*c)/20+m*z0*z0;  // > Initialization.Initialize Vectors:4
    I3=m*(b*b+a*a)/20;  // > Initialization.Initialize Vectors:5
    // set the orientation by rotating around x-axis  // > Initialization.Initialize Vectors:6
    q[0]=Math.cos(tilt/2);  // > Initialization.Initialize Vectors:7
    q[1]=Math.sin(tilt/2);  // > Initialization.Initialize Vectors:8
    q[2]=0;  // > Initialization.Initialize Vectors:9
    q[3]=0;  // > Initialization.Initialize Vectors:10
    // inital angular velocity is along rotor shaft  // > Initialization.Initialize Vectors:11
    omega[0]=omegaOne;    // 1-axis component  // > Initialization.Initialize Vectors:12
    omega[1]=0;           // 2-axis component  // > Initialization.Initialize Vectors:13
    omega[2]=omegaThree;  // 3-axis component  // > Initialization.Initialize Vectors:14
    // set initial quaternion rate  // > Initialization.Initialize Vectors:15
    qDot[0]=0.5*(-q[1]*omega[0]-q[2]*omega[1]-q[3]*omega[2]);     // q0-dot  // > Initialization.Initialize Vectors:16
    qDot[1]=0.5*( q[0]*omega[0]-q[3]*omega[1]+q[2]*omega[2]);     // q1-dot  // > Initialization.Initialize Vectors:17
    qDot[2]=0.5*( q[3]*omega[0]+q[0]*omega[1]-q[1]*omega[2]);     // q2-dot  // > Initialization.Initialize Vectors:18
    qDot[3]=0.5*(-q[2]*omega[0]+q[1]*omega[1]+q[0]*omega[2]);     // q3-dot  // > Initialization.Initialize Vectors:19
    _view.gravityCheck.setSelected(g==1);  // > Initialization.Initialize Vectors:20
  }  // > Initialization.Initialize Vectors

 // --- Evolution

  private _ODE_evolution1 _ODEi_evolution1;


  // ----------- private class for ODE in page Evolution:Evol Page

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
    private double[] _q;
    private double[] _qDot;

    _ODE_evolution1() { // Class constructor
      __solverClass = org.opensourcephysics.numerics.ode_solvers.rk.CashKarp45.class;
      __instantiateSolver();
      _privateOdesList.put("Evol Page",this);
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
      __state = new double[1+q.length+qDot.length];
      // allocate temporary arrays
      _q = new double[q.length];
      _qDot = new double[qDot.length];
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
        for (int __i=0,__n=__cIn; __i<q.length; __i++)
          if (__state[__n++]!=q[__i] || __state[__n++]!=qDot[__i]) { __mustReinitialize = true; break; }
      for (int __i=0; __i<q.length; __i++) { // These two alternate in the state
         __state[__cIn++] = q[__i];
         __state[__cIn++] = qDot[__i];
      }
      if (__state[__cIn]!=t) __mustReinitialize = true;
      __state[__cIn++] = t;
    }

    private boolean __arraysChanged () {
      if (q.length != _q.length) return true;
      if (qDot.length != _qDot.length) return true;
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
      for (int __i=0; __i<q.length; __i++) { // These two alternate in the state
        q[__i] = __state[__cOut++];
        qDot[__i] = __state[__cOut++];
      }
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
      double[] q = _q;
      double[] qDot = _qDot;
      for (int __i=0; __i<q.length; __i++) { // These two alternate in the state
        q[__i] = __aState[__cOut++];
        qDot[__i] = __aState[__cOut++];
      }
      double t = __aState[__cOut++];
      // Preliminary code: Code to be executed before rate equations are evaluated
      // computes gravitational force vector in body frame  // > Evolution:Evol Page.Prelim code Evol Page:1
      double[] gForce =(new Quaternion(q[0],q[1],q[2],q[3])).inverse(new double[] {0, 0, -m*g});  // > Evolution:Evol Page.Prelim code Evol Page:2
      double t1=-gForce[1]*z0;  // > Evolution:Evol Page.Prelim code Evol Page:3
      double t2=gForce[0]*z0;  // > Evolution:Evol Page.Prelim code Evol Page:4
      double t3=0;  // > Evolution:Evol Page.Prelim code Evol Page:5
      // compute omega in body frame  // > Evolution:Evol Page.Prelim code Evol Page:6
      double w1 = 2*(-q[1]*qDot[0]+q[0]*qDot[1]+q[3]*qDot[2]-q[2]*qDot[3]);  // > Evolution:Evol Page.Prelim code Evol Page:7
      double w2 = 2*(-q[2]*qDot[0]-q[3]*qDot[1]+q[0]*qDot[2]+q[1]*qDot[3]);  // > Evolution:Evol Page.Prelim code Evol Page:8
      double w3 = 2*(-q[3]*qDot[0]+q[2]*qDot[1]-q[1]*qDot[2]+q[0]*qDot[3]);  // > Evolution:Evol Page.Prelim code Evol Page:9
      // compute omega rate of change in body frame  // > Evolution:Evol Page.Prelim code Evol Page:10
      double w1dot = (t1+(I2-I3)*w3*w2)/I1; // Euler's equations of motion  // > Evolution:Evol Page.Prelim code Evol Page:11
      double w2dot = (t2+(I3-I1)*w1*w3)/I2;  // > Evolution:Evol Page.Prelim code Evol Page:12
      double w3dot = (t3+(I1-I2)*w2*w1)/I3;  // > Evolution:Evol Page.Prelim code Evol Page:13
      // comptue quaternion acceleration  // > Evolution:Evol Page.Prelim code Evol Page:14
      double[] qAcc=new double[4];  // > Evolution:Evol Page.Prelim code Evol Page:15
      double sum = 0;  // > Evolution:Evol Page.Prelim code Evol Page:16
      for(int i = 0;i<4;i++) {// sum the q dot values  // > Evolution:Evol Page.Prelim code Evol Page:17
        sum += qDot[i]*qDot[i];  // > Evolution:Evol Page.Prelim code Evol Page:18
      }  // > Evolution:Evol Page.Prelim code Evol Page:19
      sum = -2.0*sum;  // > Evolution:Evol Page.Prelim code Evol Page:20
      qAcc[0] = 0.5*(-q[1]*w1dot-q[2]*w2dot-q[3]*w3dot+q[0]*sum);  // > Evolution:Evol Page.Prelim code Evol Page:21
      qAcc[1] = 0.5*( q[0]*w1dot-q[3]*w2dot+q[2]*w3dot+q[1]*sum);  // > Evolution:Evol Page.Prelim code Evol Page:22
      qAcc[2] = 0.5*( q[3]*w1dot+q[0]*w2dot-q[1]*w3dot+q[2]*sum);  // > Evolution:Evol Page.Prelim code Evol Page:23
      qAcc[3] = 0.5*(-q[2]*w1dot+q[1]*w2dot+q[0]*w3dot+q[3]*sum);  // > Evolution:Evol Page.Prelim code Evol Page:24
      // Compute the rate
      int __cRate = 0;
      for (int __i=0; __i<q.length; __i++) {
        __aRate[__cRate++] = qDot[__i]; // Evolution:Evol Page:1
        __aRate[__cRate++] = qAcc[__i]; // Evolution:Evol Page:2
      }
      __aRate[__cRate++] = 1.0; // The independent variable 
    }//end of getRate

  } // End of class _ODE_evolution1

 // --- Constraints

  public void _constraints1 () { // > Fixed relations.Compute space and body frame vectors
    // renormalize to eliminate drift  // > Fixed relations.Compute space and body frame vectors:1
    double norm = 1/Math.sqrt(q[0]*q[0]+q[1]*q[1]+q[2]*q[2]+q[3]*q[3]);   // > Fixed relations.Compute space and body frame vectors:2
    q[0] *= norm; q[1] *= norm;  // > Fixed relations.Compute space and body frame vectors:3
    q[2] *= norm; q[3] *= norm;  // > Fixed relations.Compute space and body frame vectors:4
    // compute current omega in body frame using the gyroscope quaternion  // > Fixed relations.Compute space and body frame vectors:5
    omega[0] = 2*(-q[1]*qDot[0]+q[0]*qDot[1]+q[3]*qDot[2]-q[2]*qDot[3]);  // > Fixed relations.Compute space and body frame vectors:6
    omega[1] = 2*(-q[2]*qDot[0]-q[3]*qDot[1]+q[0]*qDot[2]+q[1]*qDot[3]);  // > Fixed relations.Compute space and body frame vectors:7
    omega[2] = 2*(-q[3]*qDot[0]+q[2]*qDot[1]-q[1]*qDot[2]+q[0]*qDot[3]);  // > Fixed relations.Compute space and body frame vectors:8
    double[] L=new double[3];  // > Fixed relations.Compute space and body frame vectors:9
    L[0]=omega[0]*I1;                               // angular momentum body frame  // > Fixed relations.Compute space and body frame vectors:10
    L[1]=omega[1]*I2;  // > Fixed relations.Compute space and body frame vectors:11
    L[2]=omega[2]*I3;  // > Fixed relations.Compute space and body frame vectors:12
    angularMomentum[0]=L[0]*arrowScale;             // scaled vector for drawing  // > Fixed relations.Compute space and body frame vectors:13
    angularMomentum[1]=L[1]*arrowScale;  // > Fixed relations.Compute space and body frame vectors:14
    angularMomentum[2]=L[2]*arrowScale;  // > Fixed relations.Compute space and body frame vectors:15
    // orient view using current quaternion values so that transformations can be used immediately  // > Fixed relations.Compute space and body frame vectors:16
    _view.quaternion3D.setCoordinates(q[0],q[1],q[2],q[3]);    // > Fixed relations.Compute space and body frame vectors:17
    // comptue shaft direction in space frame  // > Fixed relations.Compute space and body frame vectors:18
    double[] shaftDirection = _view.rotorGroup.toSpaceFrame(new double[]{0,0,1}); // transform 3-direction to space frame  // > Fixed relations.Compute space and body frame vectors:19
    shaftTip[0]=shaftDirection[0]*size;  // > Fixed relations.Compute space and body frame vectors:20
    shaftTip[1]=shaftDirection[1]*size;  // > Fixed relations.Compute space and body frame vectors:21
    shaftTip[2]=shaftDirection[2]*size;  // > Fixed relations.Compute space and body frame vectors:22
    // comptue torque in body frame  // > Fixed relations.Compute space and body frame vectors:23
    double[] zDirection= _view.rotorGroup.toBodyFrame(new double[]{0, 0, 1});  // transform z-direction to body frame  // > Fixed relations.Compute space and body frame vectors:24
    torque[0]=m*g*zDirection[1]*z0;                                            // compute cross product  // > Fixed relations.Compute space and body frame vectors:25
    torque[1]=-m*g*zDirection[0]*z0;  // > Fixed relations.Compute space and body frame vectors:26
    torque[2]=0;  // > Fixed relations.Compute space and body frame vectors:27
    // compute elevation angles  // > Fixed relations.Compute space and body frame vectors:28
    axisElevation=Math.acos(shaftDirection[2]);  // > Fixed relations.Compute space and body frame vectors:29
    double zDotL=L[0]*zDirection[0]+L[1]*zDirection[1]+L[2]*zDirection[2];  // > Fixed relations.Compute space and body frame vectors:30
    momentumElevation=Math.acos(zDotL/Math.sqrt(L[0]*L[0]+L[1]*L[1]+L[2]*L[2]));  // > Fixed relations.Compute space and body frame vectors:31
  }  // > Fixed relations.Compute space and body frame vectors

 // --- Custom

 // --- Methods for view elements

  public void _method_for_radiusField_action () {
    R=Math.max(0.1,R);
    R=Math.min(size,R);
    a=b=2*R;
    c=R/5;
    _initialize();
  }
  public void _method_for_z0Field_action () {
    z0=Math.max(0,z0);
    z0=Math.min(0.75*size,z0);
    _initialize();
  }
  public double _method_for_spaceViewDrawingPanel3D_minimumX () {
    return -boundingBox;
  }

  public double _method_for_spaceViewDrawingPanel3D_minimumY () {
    return -boundingBox;
  }

  public double _method_for_spaceViewDrawingPanel3D_minimumZ () {
    return -boundingBox;
  }

  public double _method_for_shaft_z () {
    return 0.75*size/2;
  }

  public double _method_for_shaft_sizeX () {
    return size/40;
  }

  public double _method_for_shaft_sizeY () {
    return size/40;
  }

  public double _method_for_shaft_sizeZ () {
    return 0.75*size;
  }

  public double _method_for_angularMomentumText_x () {
    return angularMomentum[0]*1.1;
  }

  public double _method_for_angularMomentumText_y () {
    return angularMomentum[1]*1.1;
  }

  public double _method_for_angularMomentumText_z () {
    return angularMomentum[2]*1.1;
  }

  public boolean _method_for_torqueVector_visible () {
    return g!=0;
  }

  public double _method_for_torqueText_x () {
    return angularMomentum[0]*1.1+torque[0];
  }

  public double _method_for_torqueText_y () {
    return angularMomentum[1]*1.1+torque[1];
  }

  public double _method_for_torqueText_z () {
    return angularMomentum[2]*1.1;
  }

  public boolean _method_for_torqueText_visible () {
    return g!=0;
  }

  public double _method_for_omegaVector_sizeX () {
    return omega[0]/10;
  }

  public double _method_for_omegaVector_sizeY () {
    return omega[1]/10;
  }

  public double _method_for_omegaVector_sizeZ () {
    return omega[2]/10;
  }

  public double _method_for_omegaText_x () {
    return omega[0]/10*1.1;
  }

  public double _method_for_omegaText_y () {
    return omega[1]/10*1.1;
  }

  public double _method_for_omegaText_z () {
    return omega[2]/10*1.1;
  }

  public double _method_for_baseCylinder_z () {
    return -size/2;
  }

  public double _method_for_baseCylinder_sizeX () {
    return 0.75*size;
  }

  public double _method_for_baseCylinder_sizeY () {
    return 0.75*size;
  }

  public double _method_for_postCylinder_z () {
    return -size/4;
  }

  public double _method_for_postCylinder_sizeX () {
    return size/20;
  }

  public double _method_for_postCylinder_sizeY () {
    return size/20;
  }

  public double _method_for_postCylinder_sizeZ () {
    return size/2;
  }

  public double _method_for_shaftTrail_inputX () {
    return shaftTip[0];
  }

  public double _method_for_shaftTrail_inputY () {
    return shaftTip[1];
  }

  public double _method_for_shaftTrail_inputZ () {
    return shaftTip[2];
  }

  public double _method_for_spaceAxisGroup_x () {
    return -size;
  }

  public double _method_for_spaceAxisGroup_z () {
    return -size;
  }

  public double _method_for_xArrow3D2_y () {
    return -size;
  }

  public double _method_for_xArrow3D2_sizeX () {
    return size/3;
  }

  public double _method_for_yArrow3D2_y () {
    return -size;
  }

  public double _method_for_yArrow3D2_sizeY () {
    return size/3;
  }

  public double _method_for_zArrow3D2_y () {
    return -size;
  }

  public double _method_for_zArrow3D2_sizeZ () {
    return size/3;
  }

  public double _method_for_xText2_x () {
    return size/2;
  }

  public double _method_for_xText2_y () {
    return -size;
  }

  public double _method_for_yText2_y () {
    return -size/2;
  }

  public double _method_for_zText2_y () {
    return -size;
  }

  public double _method_for_zText2_z () {
    return size/2;
  }

  public void _method_for_startButton_actionOn () {
    _play();
  }
  public void _method_for_startButton_actionOff () {
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
  public void _method_for_tiltField_action () {
    _initialize();
  }
  public void _method_for_omegaOneField_action () {
    omegaOne=Math.max(0,omegaOne);
    omegaOne=Math.min(200,omegaOne);
    _initialize();
  }
  public void _method_for_omegaThreeField_action () {
    omegaThree=Math.max(0,omegaThree);
    omegaThree=Math.min(200,omegaThree);
    _initialize();
  }
  public void _method_for_dtField_action () {
    dt=Math.max(dt,0.01);
    dt=Math.min(dt,1);
    _initialize();
  }
  public void _method_for_gravityCheck_actionon () {
    g=1;
  }
  public void _method_for_gravityCheck_actionoff () {
    g=0;
  }
} // End of class GyroscopeModel

