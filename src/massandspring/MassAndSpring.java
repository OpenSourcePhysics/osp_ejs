/*
 * Class : MassAndSpring.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 180211. Visit http://www.um.es/fem/Ejs
 */ 

package massandspring;

import org.opensourcephysics.display.OSPRuntime;
import org.opensourcephysics.tools.ResourceLoader;

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

public class MassAndSpring extends org.opensourcephysics.ejs.EjsModel {

  static {
    org.opensourcephysics.tools.ToolForData.setTool(new org.opensourcephysics.tools.ToolForDataFull());
    __translatorUtil = new org.opensourcephysics.ejs.utils.TranslatorUtil();
  }

  static public boolean _sSwingView = true;

  static public int _sServerPort = -1;
  static public int _getServerPort() { return _sServerPort; }

  public MassAndSpringSimulation _simulation=null;
  public MassAndSpringView _view=null;
  public MassAndSpring _model=this;

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

  static public String _getEjsModel() { return "/testing/MassAndSpring.ejs"; }

  static public String _getModelDirectory() { return "testing/"; }

  static public java.awt.Dimension _getEjsAppletDimension() {
    return new java.awt.Dimension(383,330);
  }

  static public java.util.Set<String> _getEjsResources() {
    java.util.Set<String> list = new java.util.HashSet<String>();
    list.add("/testing/MassAndSpring/MassAndSpring.png");
    list.add("/testing/MassAndSpring/PacoEsquembre2011.png");
    list.add("/testing/MassAndSpring/MassAndSpringComplete.png");
    list.add("/testing/MassAndSpring/MassAndSpring.gif");
    list.add("/testing/MassAndSpring/WC_logo.png");
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

    MassAndSpring __theModel = new MassAndSpring (_args);
  }

  static public javax.swing.JComponent getModelPane(String[] _args, javax.swing.JFrame _parentFrame) {
    if (!_common_initialization(_args)) return null;
    MassAndSpring __theModel = new MassAndSpring ("frame",_parentFrame,null,null,_args,true);
    return (javax.swing.JComponent) __theModel._getView().getComponent("frame");
  }

  public MassAndSpring () { this (null, null, null,null,null,false); } // slave application

  public MassAndSpring (String[] _args) { this (null, null, null,null,_args,true); }

  public MassAndSpring (String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, org.opensourcephysics.ejs.EjsLauncherApplet _anApplet, String[] _args, boolean _allowAutoplay) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = _args;
    __theApplet = _anApplet;
    java.text.NumberFormat _Ejs_format = java.text.NumberFormat.getInstance();
    if (_Ejs_format instanceof java.text.DecimalFormat) {
      ((java.text.DecimalFormat) _Ejs_format).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new MassAndSpringSimulation (this,_replaceName,_replaceOwnerFrame,_codebase,_allowAutoplay);
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
    _isEnabled_evolution1 = true; // Reset enabled condition for Model.Evolution.Equations
    _isEnabled_constraints1 = true; // Reset enabled condition for Model.Constraints.Energy
    x = 1.5; // Variables.Dynamical Vars:1    x = 1.5; // Variables.Dynamical Vars:1
    vx = 0.0; // Variables.Dynamical Vars:2    vx = 0.0; // Variables.Dynamical Vars:2
    t = 0.0; // Variables.Dynamical Vars:3    t = 0.0; // Variables.Dynamical Vars:3
    dt = 0.05; // Variables.Dynamical Vars:4    dt = 0.05; // Variables.Dynamical Vars:4
    showPlot = true; // Variables.Constants:1    showPlot = true; // Variables.Constants:1
    y = 0.0; // Variables.Constants:2    y = 0.0; // Variables.Constants:2
    m = 1.0; // Variables.Constants:3    m = 1.0; // Variables.Constants:3
    k = 1.0; // Variables.Constants:4    k = 1.0; // Variables.Constants:4
    L = 1.0; // Variables.Constants:5    L = 1.0; // Variables.Constants:5
    T = 0.5*m*vx*vx; // Variables.Constrained Vars:1    T = 0.5*m*vx*vx; // Variables.Constrained Vars:1
    V = 0.5*k*(x-L)*(x-L); // Variables.Constrained Vars:2    V = 0.5*k*(x-L)*(x-L); // Variables.Constrained Vars:2
    E = T + V; // Variables.Constrained Vars:3    E = T + V; // Variables.Constrained Vars:3
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

 public double x  = 1.5; // Variables.Dynamical Vars:1
 public double vx  = 0.0; // Variables.Dynamical Vars:2
 public double t  = 0.0; // Variables.Dynamical Vars:3
 public double dt  = 0.05; // Variables.Dynamical Vars:4
 public boolean showPlot  = true; // Variables.Constants:1
 public double y  = 0.0; // Variables.Constants:2
 public double m  = 1.0; // Variables.Constants:3
 public double k  = 1.0; // Variables.Constants:4
 public double L  = 1.0; // Variables.Constants:5
 public double T  = 0.5*m*vx*vx; // Variables.Constrained Vars:1
 public double V  = 0.5*k*(x-L)*(x-L); // Variables.Constrained Vars:2
 public double E  = T + V; // Variables.Constrained Vars:3

 // -------------------------------------------
 // Enabled condition of pages 
 // -------------------------------------------

  private boolean _isEnabled_evolution1 = true; // Enabled condition for Model.Evolution.Equations
  private boolean _isEnabled_constraints1 = true; // Enabled condition for Model.Constraints.Energy

  public void _setPageEnabled(String _pageName, boolean _enabled) { // Sets the enabled state of a page
    boolean _pageFound = false;
    if ("Equations".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1 = _enabled; _automaticResetSolvers(); } // Change enabled condition for Model.Evolution.Equations
    if ("Energy".equals(_pageName)) { _pageFound = true; _isEnabled_constraints1 = _enabled; } // Change enabled condition for Model.Constraints.Energy
    if (!_pageFound) System.out.println ("_setPageEnabled() warning. Page not found: "+_pageName);
  }

 // -------------------------------------------
 // Methods defined by the user 
 // -------------------------------------------

 // --- Initialization

 // --- Evolution

  private _ODE_evolution1 _ODEi_evolution1;


  // ----------- private class for ODE in page Evolution:Equations

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
      __solverClass = org.opensourcephysics.numerics.ode_solvers.rk.EulerRichardson.class;
      __instantiateSolver();
      _privateOdesList.put("Equations",this);
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
      __state = new double[1+1+1];
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
      __mustReinitialize = true;
      __mustInitialize = false;
    }

    private void __pushState () { // Copy our variables to the state
      // Copy our variables to __state[] 
      int __cIn=0;
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
      double x = __aState[__cOut++];
      double vx = __aState[__cOut++];
      double t = __aState[__cOut++];
      // Preliminary code: 
      // Compute the rate
      int __cRate = 0;
      __aRate[__cRate++] = vx; // Evolution:Equations:1
      __aRate[__cRate++] = -k/m *(x-L); // Evolution:Equations:2
      __aRate[__cRate++] = 1.0; // The independent variable 
    }//end of getRate

  } // End of class _ODE_evolution1

 // --- Constraints

  public void _constraints1 () { // > Fixed relations.Energy
    T = 0.5*m*vx*vx;  // > Fixed relations.Energy:1
    V = 0.5*k*(x-L)*(x-L);  // > Fixed relations.Energy:2
    E = T + V;  // > Fixed relations.Energy:3
  }  // > Fixed relations.Energy

 // --- Custom

 // --- Methods for view elements

  public String _method_for_drawingPanel_BRmessage () {
    return "time="+_format(t,"0.00");
  }

  public double _method_for_spring2D_sizeX () {
    return x-0.2;
  }

  public boolean _method_for_massShape2D_enabledPosition () {
    return _isPaused();
  }

  public void _method_for_massShape2D_dragAction () {
    y=0;
  }
  public void _method_for_massShape2D_releaseAction () {
    vx = 0.0;            // sets the velocity to zero
    _view.resetTraces(); // clears all plots;
  }
  public void _method_for_playPauseButton_actionOn () {
    _play();
  }
  public void _method_for_playPauseButton_actionOff () {
    _pause();
  }
  public void _method_for_resetButton_action () {
    _reset();
  }
  public double _method_for_displacementTrail2D_inputY () {
    return x-L;
  }

} // End of class MassAndSpringModel

