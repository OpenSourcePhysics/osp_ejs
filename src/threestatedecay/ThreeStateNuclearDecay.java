/*
 * Class : ThreeStateNuclearDecay.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package threestatedecay;

// Imports suggested by Model Elements:
// End of imports from Model Elements

import java.awt.*;

import org.opensourcephysics.display.OSPRuntime;
import org.opensourcephysics.tools.ResourceLoader;

public class ThreeStateNuclearDecay extends org.opensourcephysics.ejs.EjsModel {
	
  static {
    __translatorUtil = new org.colos.ejs.library.utils.TranslatorUtil();
  }

  static public boolean _sSwingView = true;

  static public int _sServerPort = -1;
  static public int _getServerPort() { return _sServerPort; }

  public ThreeStateNuclearDecaySimulation _simulation=null;
  public ThreeStateNuclearDecayView _view=null;
  public ThreeStateNuclearDecay _model=this;

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

  static public String _getEjsModel() { return "/threestatedecay/ThreeStateNuclearDecay.ejs"; }

  static public String _getModelDirectory() { return "threestatedecay/"; }

  static public java.awt.Dimension _getEjsAppletDimension() {
    return new java.awt.Dimension(619,474);
  }

  static public java.util.Set<String> _getEjsResources() {
    java.util.Set<String> list = new java.util.HashSet<String>();
    list.add("ThreeStateDecay/ThreeStateNuclearDecay/ThreeStateDecayTheory.html");
    list.add("ThreeStateDecay/ThreeStateNuclearDecay/ThreeStateSample.gif");
    list.add("ThreeStateDecay/ThreeStateNuclearDecay/ThreeStateNuclearDecay.html");
    list.add("ThreeStateDecay/ThreeStateNuclearDecay/three_state_ode.gif");
    return list;
  };

	static public boolean _common_initialization(String[] _args) {
		String lookAndFeel = null;
		boolean decorated = true;
		if (_args != null)
			for (int i = 0; i < _args.length; i++) {
				if (_args[i].equals("-_lookAndFeel"))
					lookAndFeel = _args[++i];
				else if (_args[i].equals("-_decorateWindows"))
					decorated = true;
				else if (_args[i].equals("-_doNotDecorateWindows"))
					decorated = false;
				else if (_args[i].equals("-_noSwingView"))
					_sSwingView = false;
				else if (_args[i].equals("-_serverPort"))
					try {
						_sServerPort = Integer.parseInt(_args[++i]);
					} catch (Exception exc) {
						_sServerPort = -1;
						exc.printStackTrace();
					}
			}
		if (lookAndFeel != null)
			OSPRuntime.setLookAndFeel(decorated, lookAndFeel);
		ResourceLoader.addSearchPath("testing/"); // This is for relative resources
		return _common_model_initialization();
	}

static public void main (String[] _args) {
    if (!_common_initialization(_args)) {
      if (org.opensourcephysics.display.OSPRuntime.isLauncherMode()) return;
      System.exit(-1);
    }

    ThreeStateNuclearDecay __theModel = new ThreeStateNuclearDecay (_args);
  }

  static public javax.swing.JComponent getModelPane(String[] _args, javax.swing.JFrame _parentFrame) {
    if (!_common_initialization(_args)) return null;
    ThreeStateNuclearDecay __theModel = new ThreeStateNuclearDecay ("mainFrame",_parentFrame,null,null,_args,true);
    return (javax.swing.JComponent) __theModel._getView().getComponent("mainFrame");
  }

  public ThreeStateNuclearDecay () { this (null, null, null,null,null,false); } // slave application

  public ThreeStateNuclearDecay (String[] _args) { this (null, null, null,null,_args,true); }

  public ThreeStateNuclearDecay (String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, org.opensourcephysics.ejs.EjsLauncherApplet _anApplet, String[] _args, boolean _allowAutoplay) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = _args;
    __theApplet = _anApplet;
    java.text.NumberFormat _Ejs_format = java.text.NumberFormat.getInstance();
    if (_Ejs_format instanceof java.text.DecimalFormat) {
      ((java.text.DecimalFormat) _Ejs_format).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new ThreeStateNuclearDecaySimulation (this,_replaceName,_replaceOwnerFrame,_codebase,_allowAutoplay);
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
    _isEnabled_initialization1 = true; // Reset enabled condition for Model.Initialization.Initialize Particles
    _isEnabled_evolution1 = false; // Reset enabled condition for Model.Evolution.ODE Evolution
    _isEnabled_evolution2 = true; // Reset enabled condition for Model.Evolution.Stochastic Evolution
    N10 = 1000; // Variables.Stochastic Vars:1    N10 = 1000; // Variables.Stochastic Vars:1
    N20 = 0; // Variables.Stochastic Vars:2    N20 = 0; // Variables.Stochastic Vars:2
    N = N10+N20; // Variables.Stochastic Vars:3    N = N10+N20; // Variables.Stochastic Vars:3
    N1 = N10; // Variables.Stochastic Vars:4    N1 = N10; // Variables.Stochastic Vars:4
    N2 = N20; // Variables.Stochastic Vars:5    N2 = N20; // Variables.Stochastic Vars:5
    N3 = 0; // Variables.Stochastic Vars:6    N3 = 0; // Variables.Stochastic Vars:6
    dN1 = Double.NaN; // Variables.Stochastic Vars:11    dN1 = Double.NaN; // Variables.Stochastic Vars:11
    dN2 = Double.NaN; // Variables.Stochastic Vars:12    dN2 = Double.NaN; // Variables.Stochastic Vars:12
    n1 = N10; // Variables.Dynamical Vars:1    n1 = N10; // Variables.Dynamical Vars:1
    n2 = N20; // Variables.Dynamical Vars:2    n2 = N20; // Variables.Dynamical Vars:2
    n3 = 0; // Variables.Dynamical Vars:3    n3 = 0; // Variables.Dynamical Vars:3
    t = 0; // Variables.Dynamical Vars:4    t = 0; // Variables.Dynamical Vars:4
    dt = 0.01; // Variables.Dynamical Vars:5    dt = 0.01; // Variables.Dynamical Vars:5
    tol = 1E-8; // Variables.Dynamical Vars:6    tol = 1E-8; // Variables.Dynamical Vars:6
    stride = 5; // Variables.Aux Vars:5    stride = 5; // Variables.Aux Vars:5
    k1 = 1; // Variables.Aux Vars:6    k1 = 1; // Variables.Aux Vars:6
    k2 = 0.5; // Variables.Aux Vars:7    k2 = 0.5; // Variables.Aux Vars:7
    x = new double [N]; // Variables.Aux Vars:8
    y = new double [N]; // Variables.Aux Vars:9
    yTitle = "N1,N2,N3"; // Variables.Aux Vars:10    yTitle = "N1,N2,N3"; // Variables.Aux Vars:10
    colors = new Color [N]; // Variables.Aux Vars:11
    for (int _i0=0; _i0<N; _i0++) colors[_i0] = java.awt.Color.RED; // Variables.Aux Vars:11
    sampleSize = 10; // Variables.Aux Vars:12    sampleSize = 10; // Variables.Aux Vars:12
    particleDiameter = 0.5; // Variables.Aux Vars:13    particleDiameter = 0.5; // Variables.Aux Vars:13
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
    if (_wasEnabled_evolution1) _ODEi_evolution1.step();
    if (__shouldBreak) return;
    if (_wasEnabled_evolution2) _evolution2 ();
    if (__shouldBreak) return;
  }

  public void _updateModel () {
    __shouldBreak = false;
  }

  public void _readFromViewAfterUpdate () {
  }

  public void _freeMemory () {
    getSimulation().setEnded(); // Signal that the simulation ended already
    x = null;  // Variables.Aux Vars:8
    y = null;  // Variables.Aux Vars:9
    colors = null;  // Variables.Aux Vars:11
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

 public int N10  = 1000; // Variables.Stochastic Vars:1
 public int N20  = 0; // Variables.Stochastic Vars:2
 public int N  = N10+N20; // Variables.Stochastic Vars:3
 public int N1  = N10; // Variables.Stochastic Vars:4
 public int N2  = N20; // Variables.Stochastic Vars:5
 public int N3  = 0; // Variables.Stochastic Vars:6
 public double p1 ; // Variables.Stochastic Vars:7
 public double p2 ; // Variables.Stochastic Vars:8
 public double p12 ; // Variables.Stochastic Vars:9
 public double p13 ; // Variables.Stochastic Vars:10
 public double dN1  = Double.NaN; // Variables.Stochastic Vars:11
 public double dN2  = Double.NaN; // Variables.Stochastic Vars:12
 public double n1  = N10; // Variables.Dynamical Vars:1
 public double n2  = N20; // Variables.Dynamical Vars:2
 public double n3  = 0; // Variables.Dynamical Vars:3
 public double t  = 0; // Variables.Dynamical Vars:4
 public double dt  = 0.01; // Variables.Dynamical Vars:5
 public double tol  = 1E-8; // Variables.Dynamical Vars:6
 public boolean plotChange ; // Variables.Aux Vars:1
 public boolean showTable ; // Variables.Aux Vars:2
 public boolean showPlot ; // Variables.Aux Vars:3
 public int plotMode ; // Variables.Aux Vars:4
 public int stride  = 5; // Variables.Aux Vars:5
 public double k1  = 1; // Variables.Aux Vars:6
 public double k2  = 0.5; // Variables.Aux Vars:7
 public double x []; // Variables.Aux Vars:8
 public double y []; // Variables.Aux Vars:9
 public String yTitle  = "N1,N2,N3"; // Variables.Aux Vars:10
 public Color colors []; // Variables.Aux Vars:11
 public double sampleSize  = 10; // Variables.Aux Vars:12
 public double particleDiameter  = 0.5; // Variables.Aux Vars:13

 // -------------------------------------------
 // Enabled condition of pages 
 // -------------------------------------------

  private boolean _isEnabled_initialization1 = true; // Enabled condition for Model.Initialization.Initialize Particles
  private boolean _isEnabled_evolution1 = false; // Enabled condition for Model.Evolution.ODE Evolution
  private boolean _isEnabled_evolution2 = true; // Enabled condition for Model.Evolution.Stochastic Evolution

  public void _setPageEnabled(String _pageName, boolean _enabled) { // Sets the enabled state of a page
    boolean _pageFound = false;
    if ("Initialize Particles".equals(_pageName)) { _pageFound = true; _isEnabled_initialization1 = _enabled; } // Change enabled condition for Model.Initialization.Initialize Particles
    if ("ODE Evolution".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1 = _enabled; _automaticResetSolvers(); } // Change enabled condition for Model.Evolution.ODE Evolution
    if ("Stochastic Evolution".equals(_pageName)) { _pageFound = true; _isEnabled_evolution2 = _enabled; } // Change enabled condition for Model.Evolution.Stochastic Evolution
    if (!_pageFound) System.out.println ("_setPageEnabled() warning. Page not found: "+_pageName);
  }

 // -------------------------------------------
 // Methods defined by the user 
 // -------------------------------------------

 // --- Initialization

  public void _initialization1 () { // > Initialization.Initialize Particles
    if(plotMode==0) _view.bothRadioButton.setSelected(true);  // > Initialization.Initialize Particles:1
    t=0;  // > Initialization.Initialize Particles:2
    n1=1;  // > Initialization.Initialize Particles:3
    n2=0;  // > Initialization.Initialize Particles:4
    n3=0;  // > Initialization.Initialize Particles:5
    _resetSolvers();  // > Initialization.Initialize Particles:6
    org.opensourcephysics.numerics.ode_solvers.EjsS_ODE ode= _getODE("ODE Evolution");  // > Initialization.Initialize Particles:7
    ode.step();  // > Initialization.Initialize Particles:8
    p1=1-Math.exp(-k1*dt);  // > Initialization.Initialize Particles:9
    p2=1-Math.exp(-k2*dt);  // > Initialization.Initialize Particles:10
    p12=n2;  // > Initialization.Initialize Particles:11
    p13=n3;  // > Initialization.Initialize Particles:12
    //_println("topDecay="+p1+"  p12+p13="+(p12+p13));  // > Initialization.Initialize Particles:13
    //_println("n1="+n1+" n2="+n2+" n3="+n3+" total="+(n1+n2+n3));  // > Initialization.Initialize Particles:14
    checkParticleNumber();  // > Initialization.Initialize Particles:15
    setParticlePosition();  // > Initialization.Initialize Particles:16
    t=0;  // > Initialization.Initialize Particles:17
    n1=N1=N10;  // > Initialization.Initialize Particles:18
    n2=N2=N20;  // > Initialization.Initialize Particles:19
    n3=N3=0;  // > Initialization.Initialize Particles:20
    _view.resetTraces();  // > Initialization.Initialize Particles:21
    dN1=Double.NaN;  // > Initialization.Initialize Particles:22
    dN2=Double.NaN;  // > Initialization.Initialize Particles:23
    _resetSolvers();  // > Initialization.Initialize Particles:24
  }  // > Initialization.Initialize Particles

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
      __eventSolver.setEstimateFirstStep(false);
      __eventSolver.setEnableExceptions(false);
      __eventSolver.setTolerances(tol,tol);
      __mustReinitialize = true;
      __mustInitialize = false;
    }

    private void __pushState () { // Copy our variables to the state
      // Copy our variables to __state[] 
      int __cIn=0;
      if (__state[__cIn]!=n1) __mustReinitialize = true;
      __state[__cIn++] = n1;
      if (__state[__cIn]!=n2) __mustReinitialize = true;
      __state[__cIn++] = n2;
      if (__state[__cIn]!=n3) __mustReinitialize = true;
      __state[__cIn++] = n3;
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
      n1 = __state[__cOut++];
      n2 = __state[__cOut++];
      n3 = __state[__cOut++];
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
      double n1 = __aState[__cOut++];
      double n2 = __aState[__cOut++];
      double n3 = __aState[__cOut++];
      double t = __aState[__cOut++];
      // Preliminary code: Code to be executed before rate equations are evaluated
      // Compute the rate
      int __cRate = 0;
      __aRate[__cRate++] = -k1*n1; // Evolution:ODE Evolution:1
      __aRate[__cRate++] = +k1*n1-k2*n2; // Evolution:ODE Evolution:2
      __aRate[__cRate++] = k2*n2; // Evolution:ODE Evolution:3
      __aRate[__cRate++] = 1.0; // The independent variable 
    }//end of getRate

  } // End of class _ODE_evolution1

  public void _evolution2 () { // > Evolution.Stochastic Evolution
    org.opensourcephysics.numerics.ode_solvers.EjsS_ODE ode= _getODE("ODE Evolution");  // > Evolution.Stochastic Evolution:1
    ode.step();  // > Evolution.Stochastic Evolution:2
    computeStochasticDecay();  // > Evolution.Stochastic Evolution:3
    if(N1==0 && N2==0){  // all particles have decayed  // > Evolution.Stochastic Evolution:4
      _pause();  // > Evolution.Stochastic Evolution:5
    }  // > Evolution.Stochastic Evolution:6
  }  // > Evolution.Stochastic Evolution

 // --- Constraints

 // --- Custom

  public void checkParticleNumber(){  // > Custom.Check Particle Number:1
    N=N10+N20;  // > Custom.Check Particle Number:2
    if(N==x.length) return;  // > Custom.Check Particle Number:3
    x=new double[N];  // > Custom.Check Particle Number:4
    y=new double[N];  // > Custom.Check Particle Number:5
    colors=new java.awt.Color[N];  // > Custom.Check Particle Number:6
  }  // > Custom.Check Particle Number:7

  public void setParticlePosition() {  // > Custom.Set Particle Position:1
    double radius=particleDiameter/2;  // > Custom.Set Particle Position:2
    double sampleWidth=sampleSize-particleDiameter;  // > Custom.Set Particle Position:3
    for(int i=0; i<N10; i++){  // > Custom.Set Particle Position:4
      x[i]=radius+sampleWidth*Math.random();  // > Custom.Set Particle Position:5
      y[i]=radius+sampleWidth*Math.random();  // > Custom.Set Particle Position:6
      colors[i]=java.awt.Color.RED;  // > Custom.Set Particle Position:7
    }  // > Custom.Set Particle Position:8
    for(int i=N10; i<N; i++){  // > Custom.Set Particle Position:9
      x[i]=radius+sampleWidth*Math.random();  // > Custom.Set Particle Position:10
      y[i]=radius+sampleWidth*Math.random();  // > Custom.Set Particle Position:11
      colors[i]=java.awt.Color.GREEN;  // > Custom.Set Particle Position:12
    }  // > Custom.Set Particle Position:13
    if(N10==0 || N20==0) return;  // > Custom.Set Particle Position:14
    for(int i=0; i<4*N; i++){// randomize color order  // > Custom.Set Particle Position:15
      int r1=(int)(N*Math.random());  // > Custom.Set Particle Position:16
      int r2=(int)(N*Math.random());  // > Custom.Set Particle Position:17
      Color c=colors[r1];  // > Custom.Set Particle Position:18
      colors[r1]=colors[r2];  // > Custom.Set Particle Position:19
      colors[r2]=c;  // > Custom.Set Particle Position:20
        // > Custom.Set Particle Position:21
    }  // > Custom.Set Particle Position:22
  }  // > Custom.Set Particle Position:23

  public void computeStochasticDecay () {  // > Custom.Stochastic Decay:1
    double topToMiddleProbability=1-Math.exp(-k1*dt);       // 1->2 decay probability within dt  // > Custom.Stochastic Decay:2
    //double topToBottomProbability=1-Math.exp(-(k1+k2)*dt);  // 1->3 decay probability within dt  // > Custom.Stochastic Decay:3
    double middleToBottomProbability=1-Math.exp(-k2*dt);    // 2->3 decay probability within dt  // > Custom.Stochastic Decay:4
    dN1=0;  // > Custom.Stochastic Decay:5
    dN2=0;  // > Custom.Stochastic Decay:6
    for (int i = 0; i < N; i++) {  // > Custom.Stochastic Decay:7
      double p=Math.random();  // > Custom.Stochastic Decay:8
      if(colors[i].equals(java.awt.Color.RED)&& p<p12) { // decay from state 1 to 2  // > Custom.Stochastic Decay:9
        colors[i]=java.awt.Color.GREEN;  // > Custom.Stochastic Decay:10
        N1--;  // > Custom.Stochastic Decay:11
        N2++;  // > Custom.Stochastic Decay:12
        dN1++;  // > Custom.Stochastic Decay:13
      } else if(colors[i].equals(java.awt.Color.RED)&& p<p12+p13) { // decvay from state 1 to 3  // > Custom.Stochastic Decay:14
        colors[i]=java.awt.Color.BLUE;  // > Custom.Stochastic Decay:15
        N1--;  // > Custom.Stochastic Decay:16
        N3++;  // > Custom.Stochastic Decay:17
        dN1++;  // > Custom.Stochastic Decay:18
        dN2++;  // > Custom.Stochastic Decay:19
      } else if(colors[i].equals(java.awt.Color.GREEN)&&p<p2) { // decay from state 2  // > Custom.Stochastic Decay:20
        colors[i]=java.awt.Color.BLUE;  // > Custom.Stochastic Decay:21
        N2--;  // > Custom.Stochastic Decay:22
        N3++;  // > Custom.Stochastic Decay:23
        dN2++;  // > Custom.Stochastic Decay:24
      }  // > Custom.Stochastic Decay:25
    }  // > Custom.Stochastic Decay:26
  }  // > Custom.Stochastic Decay:27

 // --- Methods for view elements

  public boolean _method_for_n1Field_editable () {
    return t==0;
  }

  public void _method_for_n1Field_action () {
    N1=Math.max(1,N1);
    N1=Math.min(10000,N1);
    N10=N1;
    _initialize();
  }
  public boolean _method_for_k1Field_editable () {
    return t==0;
  }

  public void _method_for_k1Field_action () {
    k1=Math.min(k1,1000);
    k1=Math.max(k1,0);
    _initialize();
  }
  public boolean _method_for_n2Field_editable () {
    return t==0;
  }

  public void _method_for_n2Field_action () {
    N2=Math.max(1,N2);
    N2=Math.min(10000,N2);
    N20=N2;
    _initialize();
  }
  public boolean _method_for_k2Field_editable () {
    return t==0;
  }

  public void _method_for_k2Field_action () {
    k1=Math.min(k1,1000);
    k1=Math.max(k1,0);
    _initialize();
  }
  public void _method_for_n3Field_action () {
    _initialize();
  }
  public void _method_for_startButton_actionOn () {
    _play();
  }
  public void _method_for_startButton_actionOff () {
    _pause();
    // BH 2020.03.30 needed because table does not revalidate during row addition, only when paused.
    refreshTable("_pause");
  }

	private void refreshTable(String from) {
		_view.dataTable.refreshTable(from);
	}

public void _method_for_stepButton_action () {
    _step();
  }
  public void _method_for_resetTime_action () {
    _initialize();
  }
  public void _method_for_resetButton_action () {
    _reset();
  }
  public void _method_for_timeField_action () {
    _initialize();
  }
  public boolean _method_for_dtField_editable () {
    return t==0;
  }

  public void _method_for_dtField_action () {
    _initialize();
  }
  public double[] _method_for_dataTable_input () {
    return new double[]{t,N1,N2,N3,dN1,dN2};
  }

  public void _method_for_clearTabel_action () {
    _view.dataTable.clearData();
    _view.dataTable.appendRow(new double[]{t,N1,N2,N3, Double.NaN, Double.NaN });
  }
  public void _method_for_strideField_action () {
    stride=Math.max(1,stride);
  }
  public boolean _method_for_n1Trail_visible () {
    return plotMode!=2 && !plotChange;
  }

  public boolean _method_for_n1Trail_measured () {
    return !plotChange;
  }

  public boolean _method_for_n2Trail_visible () {
    return plotMode!=2&& !plotChange;
  }

  public boolean _method_for_n2Trail_measured () {
    return !plotChange;
  }

  public boolean _method_for_n3Trail_visible () {
    return plotMode!=2 && !plotChange;
  }

  public boolean _method_for_n3Trail_measured () {
    return !plotChange;
  }

  public boolean _method_for_N1Trail_visible () {
    return plotMode!=1 && !plotChange;
  }

  public boolean _method_for_N1Trail_measured () {
    return !plotChange;
  }

  public boolean _method_for_N2Trail_visible () {
    return plotMode!=1 && !plotChange;
  }

  public boolean _method_for_N2Trail_measured () {
    return !plotChange;
  }

  public boolean _method_for_N3Trail_visible () {
    return plotMode!=1 && !plotChange;
  }

  public boolean _method_for_N3Trail_measured () {
    return !plotChange;
  }

  public boolean _method_for_dN1Trace_visible () {
    return plotMode!=1 && plotChange;
  }

  public boolean _method_for_dN2Trace_visible () {
    return plotMode!=1 && plotChange;
  }

  public double _method_for_dn1Trail_inputX () {
    return t+dt;
  }

  public double _method_for_dn1Trail_inputY () {
    return n1*p1;
  }

  public boolean _method_for_dn1Trail_visible () {
    return plotMode!=2 &&  plotChange;
  }

  public double _method_for_dn2Trail_inputX () {
    return t+dt;
  }

  public double _method_for_dn2Trail_inputY () {
    return n2*p2+n1*p13;
  }

  public boolean _method_for_dn2Trail_visible () {
    return plotMode!=2 &&  plotChange;
  }

  public void _method_for_continuousRadioButton_action () {
    plotMode=1;
  }
  public void _method_for_stochasticRadioButton_action () {
    plotMode=2;
  }
  public void _method_for_bothRadioButton_action () {
    plotMode=0;
  }
  public void _method_for_deltaCheckBox_actionon () {
    yTitle="$\\Delta$N1,$\\Delta$N2";
  }
  public void _method_for_deltaCheckBox_actionoff () {
    yTitle="N1,N2,N3";
  }
} // End of class ThreeStateNuclearDecayModel

