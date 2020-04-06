/*
 * Class : ParticleMotionNearMagneticDipole.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package motionneardipole;

import org.opensourcephysics.numerics.Matrix3DTransformation;
// Imports suggested by Model Elements:
// End of imports from Model Elements

public class ParticleMotionNearMagneticDipole extends org.opensourcephysics.ejs.EjsModel {

  static {
    org.opensourcephysics.tools.ToolForData.setTool(new org.opensourcephysics.tools.ToolForDataFull());
    __translatorUtil = new org.opensourcephysics.ejs.utils.TranslatorUtil();
  }

  static public boolean _sSwingView = true;

  static public int _sServerPort = -1;
  static public int _getServerPort() { return _sServerPort; }

  public ParticleMotionNearMagneticDipoleSimulation _simulation=null;
  public ParticleMotionNearMagneticDipoleView _view=null;
  public ParticleMotionNearMagneticDipole _model=this;

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

  static public String _getEjsModel() { return "/testing/ParticleMotionNearMagneticDipole.xml"; }

  static public String _getModelDirectory() { return "testing/"; }

  static public java.awt.Dimension _getEjsAppletDimension() {
    return new java.awt.Dimension(579,685);
  }

  static public java.util.Set<String> _getEjsResources() {
    java.util.Set<String> list = new java.util.HashSet<String>();
    list.add("/users/dav/wc/ejsPage.css");
    list.add("/testing/ChargedParticleMotionNearMagneticDipole/ChargedParticleMotionNearMagneticDipole.html");
    list.add("/testing/ChargedParticleMotionNearMagneticDipole/ChargeTrajectoryNearDipole.gif");
    list.add("/testing/ChargedParticleMotionNearMagneticDipole/force_eqn.gif");
    list.add("/testing/ChargedParticleMotionNearMagneticDipole/dipole_eqn.gif");
    list.add("/testing/ChargedParticleMotionNearMagneticDipole/field_eqn.gif");
    list.add("/testing/ChargedParticleMotionNearMagneticDipole/lorentz_force_eqn.gif");
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

    ParticleMotionNearMagneticDipole __theModel = new ParticleMotionNearMagneticDipole (_args);
  }

  static public javax.swing.JComponent getModelPane(String[] _args, javax.swing.JFrame _parentFrame) {
    if (!_common_initialization(_args)) return null;
    ParticleMotionNearMagneticDipole __theModel = new ParticleMotionNearMagneticDipole ("frame",_parentFrame,null,null,_args,true);
    return (javax.swing.JComponent) __theModel._getView().getComponent("frame");
  }

  public ParticleMotionNearMagneticDipole () { this (null, null, null,null,null,false); } // slave application

  public ParticleMotionNearMagneticDipole (String[] _args) { this (null, null, null,null,_args,true); }

  public ParticleMotionNearMagneticDipole (String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, org.opensourcephysics.ejs.EjsLauncherApplet _anApplet, String[] _args, boolean _allowAutoplay) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = _args;
    __theApplet = _anApplet;
    java.text.NumberFormat _Ejs_format = java.text.NumberFormat.getInstance();
    if (_Ejs_format instanceof java.text.DecimalFormat) {
      ((java.text.DecimalFormat) _Ejs_format).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new ParticleMotionNearMagneticDipoleSimulation (this,_replaceName,_replaceOwnerFrame,_codebase,_allowAutoplay);
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

  public int _getPreferredStepsPerDisplay() { return 10; }

  public void _resetModel () {
    _isEnabled_evolution1 = true; // Reset enabled condition for Model.Evolution.Magnetic Dipole
    _isEnabled_constraints1 = true; // Reset enabled condition for Model.Constraints.Energy Relations
    vx0 = 0.0; // Variables.Initial Conditions:1    vx0 = 0.0; // Variables.Initial Conditions:1
    vy0 = 0; // Variables.Initial Conditions:2    vy0 = 0; // Variables.Initial Conditions:2
    vz0 = 10; // Variables.Initial Conditions:3    vz0 = 10; // Variables.Initial Conditions:3
    k = 1.0e5; // Variables.Dynamics Vars:1    k = 1.0e5; // Variables.Dynamics Vars:1
    r = new double []{20,0,0}; // Variables.Dynamics Vars:2
    v = new double []{vx0,vy0,vz0}; // Variables.Dynamics Vars:3
    t = 0; // Variables.Dynamics Vars:4    t = 0; // Variables.Dynamics Vars:4
    dt = 0.02; // Variables.Dynamics Vars:5    dt = 0.02; // Variables.Dynamics Vars:5
    size = 20; // Variables.Aux Vars:1    size = 20; // Variables.Aux Vars:1
    E = 0; // Variables.Aux Vars:2    E = 0; // Variables.Aux Vars:2
    projection = 11; // Variables.Aux Vars:3    projection = 11; // Variables.Aux Vars:3
    _ODEi_evolution1 = new _ODE_evolution1();
  }

  public void _initializeSolvers () { for (org.opensourcephysics.numerics.ode_solvers.EjsS_ODE __pode : _privateOdesList.values()) __pode.initializeSolver(); }

  public void _initializeModel () {
    __shouldBreak = false;
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
    r = null;  // Variables.Dynamics Vars:2
    v = null;  // Variables.Dynamics Vars:3
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

 public double vx0  = 0.0; // Variables.Initial Conditions:1
 public double vy0  = 0; // Variables.Initial Conditions:2
 public double vz0  = 10; // Variables.Initial Conditions:3
 public double k  = 1.0e5; // Variables.Dynamics Vars:1
 public double r []; // Variables.Dynamics Vars:2
 public double v []; // Variables.Dynamics Vars:3
 public double t  = 0; // Variables.Dynamics Vars:4
 public double dt  = 0.02; // Variables.Dynamics Vars:5
 public double size  = 20; // Variables.Aux Vars:1
 public double E  = 0; // Variables.Aux Vars:2
 public int projection  = 11; // Variables.Aux Vars:3

 // -------------------------------------------
 // Enabled condition of pages 
 // -------------------------------------------

  private boolean _isEnabled_evolution1 = true; // Enabled condition for Model.Evolution.Magnetic Dipole
  private boolean _isEnabled_constraints1 = true; // Enabled condition for Model.Constraints.Energy Relations

  public void _setPageEnabled(String _pageName, boolean _enabled) { // Sets the enabled state of a page
    boolean _pageFound = false;
    if ("Magnetic Dipole".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1 = _enabled; _automaticResetSolvers(); } // Change enabled condition for Model.Evolution.Magnetic Dipole
    if ("Energy Relations".equals(_pageName)) { _pageFound = true; _isEnabled_constraints1 = _enabled; } // Change enabled condition for Model.Constraints.Energy Relations
    if (!_pageFound) System.out.println ("_setPageEnabled() warning. Page not found: "+_pageName);
  }

 // -------------------------------------------
 // Methods defined by the user 
 // -------------------------------------------

 // --- Initialization

 // --- Evolution

  private _ODE_evolution1 _ODEi_evolution1;


  // ----------- private class for ODE in page Evolution:Magnetic Dipole

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
    private double[] _r;
    private double[] _v;

    _ODE_evolution1() { // Class constructor
      __solverClass = org.opensourcephysics.numerics.ode_solvers.rk.Dopri853.class;
      __instantiateSolver();
      _privateOdesList.put("Magnetic Dipole",this);
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
      __state = new double[1+r.length+v.length];
      // allocate temporary arrays
      _r = new double[r.length];
      _v = new double[v.length];
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
      __eventSolver.setTolerances(1.0e-9,1.0e-9);
      __mustReinitialize = true;
      __mustInitialize = false;
    }

    private void __pushState () { // Copy our variables to the state
      // Copy our variables to __state[] 
      int __cIn=0;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<r.length; __i++)
           if (__state[__n++]!=r[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(r,0,__state,__cIn,r.length); __cIn += r.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<v.length; __i++)
           if (__state[__n++]!=v[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(v,0,__state,__cIn,v.length); __cIn += v.length;
      if (__state[__cIn]!=t) __mustReinitialize = true;
      __state[__cIn++] = t;
    }

    private boolean __arraysChanged () {
      if (r.length != _r.length) return true;
      if (v.length != _v.length) return true;
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
      __eventSolver.setTolerances(1.0e-9,1.0e-9);
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
      System.arraycopy(__state,__cOut,r,0,r.length); __cOut+=r.length;
      System.arraycopy(__state,__cOut,v,0,v.length); __cOut+=v.length;
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
      double[] r = _r;
      System.arraycopy(__aState,__cOut,r,0,r.length); __cOut+=r.length;
      double[] v = _v;
      System.arraycopy(__aState,__cOut,v,0,v.length); __cOut+=v.length;
      double t = __aState[__cOut++];
      // Preliminary code: Code to be executed before rate equations are evaluated
      double r2=r[0]*r[0]+r[1]*r[1]+r[2]*r[2];  // > Evolution:Magnetic Dipole.Prelim code Magnetic Dipole:1
      double rmag=Math.sqrt(r2);  // > Evolution:Magnetic Dipole.Prelim code Magnetic Dipole:2
      double zr5= rmag==0 ? 0: 3*k*r[2]/(r2*r2*rmag);  // > Evolution:Magnetic Dipole.Prelim code Magnetic Dipole:3
      double[] a = new double[3];                       // allocate array memory  // > Evolution:Magnetic Dipole.Prelim code Magnetic Dipole:4
      a[0]=(r[2]*v[1]-r[1]*v[2])*zr5 - k*v[1]/r2/rmag;  // dvx/dt  // > Evolution:Magnetic Dipole.Prelim code Magnetic Dipole:5
      a[1]=(r[0]*v[2]-r[2]*v[0])*zr5 + k*v[0]/r2/rmag;  // dvy/dt  // > Evolution:Magnetic Dipole.Prelim code Magnetic Dipole:6
      a[2]=(r[1]*v[0]-r[0]*v[1])*zr5;                   // dvz/dt  // > Evolution:Magnetic Dipole.Prelim code Magnetic Dipole:7
      // Compute the rate
      int __cRate = 0;
      System.arraycopy(v,0,__aRate,__cRate,_r.length); // Evolution:Magnetic Dipole:1
      __cRate += r.length;
      System.arraycopy(a,0,__aRate,__cRate,_v.length); // Evolution:Magnetic Dipole:2
      __cRate += v.length;
      __aRate[__cRate++] = 1.0; // The independent variable 
    }//end of getRate

  } // End of class _ODE_evolution1

 // --- Constraints

  public void _constraints1 () { // > Fixed relations.Energy Relations
    E = 0.5*(v[0]*v[0]+v[1]*v[1]+v[2]*v[2]);  // > Fixed relations.Energy Relations:1
  }  // > Fixed relations.Energy Relations

 // --- Custom

  public void resetTime () {  // > Custom.Reset Time:1
    t=0;  // > Custom.Reset Time:2
    r[0]=20;  // > Custom.Reset Time:3
    r[1]=0;  // > Custom.Reset Time:4
    r[2]=0;  // > Custom.Reset Time:5
    v[0]=vx0;  // > Custom.Reset Time:6
    v[1]=vy0;  // > Custom.Reset Time:7
    v[2]=vz0;  // > Custom.Reset Time:8
    _view.clearData();  // > Custom.Reset Time:9
  }  // > Custom.Reset Time:10

 // --- Methods for view elements

  public double _method_for_drawingPanel3D_minimumX () {
    return -size;
  }

  public double _method_for_drawingPanel3D_minimumY () {
    return -size;
  }

  public double _method_for_drawingPanel3D_minimumZ () {
    return -size;
  }

  public double _method_for_trail_inputX () {
    return r[0];
  }

  public double _method_for_trail_inputY () {
    return r[1];
  }

  public double _method_for_trail_inputZ () {
    return r[2];
  }

  public double _method_for_dipoleArrow_z () {
    return -size/10;
  }

  public double _method_for_dipoleArrow_sizeZ () {
    return size/5;
  }

  public void _method_for_radio3D_actionon () {
    projection=11;
  }
  public void _method_for_radioXY_actionon () {
    projection=0;
  }
  public void _method_for_radioYZ_actionon () {
    projection=2;
  }
  public void _method_for_radioXZ_actionon () {
    projection=1;
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
  public void _method_for_resetTime_action () {
    resetTime ();
  }
  public void _method_for_resetButton_action () {
    _reset();
  }
  public void _method_for_vxField_action () {
    resetTime ();
  }
  public void _method_for_vyField_action () {
    resetTime ();
  }
  public void _method_for_vzField_action () {
    resetTime ();
  }
} // End of class ParticleMotionNearMagneticDipoleModel

