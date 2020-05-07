/*
 * Class : TrajectoriesInEBView.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package trajectoriesEB;

// Imports suggested by Model Elements:
// End of imports from Model Elements

import org.opensourcephysics.display.OSPRuntime;

class TrajectoriesInEBView extends org.colos.ejs.library.control.EjsControl implements org.colos.ejs.library.View {
  private TrajectoriesInEBSimulation _simulation=null;
  private TrajectoriesInEB _model=null;

  // Public variables for wrapped view elements:
  public java.awt.Component mainFrame;
  public javax.swing.JPanel upperPanel;
  public javax.swing.JPanel BPanel;
  public javax.swing.JLabel BLabel;
  public javax.swing.JTextField BField;
  public javax.swing.JPanel EPanel;
  public javax.swing.JLabel ELabel;
  public javax.swing.JTextField EField;
  public javax.swing.JPanel scalePanel;
  public javax.swing.JLabel scaleLabel;
  public javax.swing.JTextField scaleField;
  public org.opensourcephysics.drawing2d.DrawingPanel2D ballDrawingPanel;
  public org.opensourcephysics.drawing2d.Group group;
  public org.opensourcephysics.drawing2d.Set trailSet;
  public org.opensourcephysics.drawing2d.Set particles;
  public org.opensourcephysics.drawing2d.ElementShape source;
  public javax.swing.JPanel controlPanel;
  public javax.swing.JPanel buttonPanel;
  public javax.swing.JButton startStopButton;
  public javax.swing.JButton stepButton;
  public javax.swing.JButton resetTimeButton;
  public javax.swing.JButton resetButton;
  public javax.swing.JPanel inputPanel;
  public javax.swing.JPanel nPanel;
  public javax.swing.JLabel nLabel;
  public javax.swing.JTextField nField;
  public javax.swing.JPanel vPanel;
  public javax.swing.JLabel vLabel;
  public javax.swing.JTextField vField;
  public javax.swing.JPanel tPanel;
  public javax.swing.JLabel tLabel;
  public javax.swing.JTextField tField;
  public javax.swing.JPanel directionPanel;
  public javax.swing.JRadioButton crossButton;
  public javax.swing.JRadioButton parallelButton;

  // private variables to block changes in the view variables:
  private boolean __msg_canBeChanged__ = true; // Variables.Aux vars:1
  private boolean __componentB_canBeChanged__ = true; // Variables.Aux vars:2
  private boolean __componentE_canBeChanged__ = true; // Variables.Aux vars:3
  private boolean __boxSize_canBeChanged__ = true; // Variables.Aux vars:4
  private boolean __E_canBeChanged__ = true; // Variables.Aux vars:5
  private boolean __B_canBeChanged__ = true; // Variables.Aux vars:6
  private boolean __v0_canBeChanged__ = true; // Variables.Aux vars:7
  private boolean __sx_canBeChanged__ = true; // Variables.Aux vars:8
  private boolean __sy_canBeChanged__ = true; // Variables.Aux vars:9
  private boolean __crossed_canBeChanged__ = true; // Variables.Aux vars:10
  private boolean __n_canBeChanged__ = true; // Variables.Dynamical vars:1
  private boolean __x_canBeChanged__ = true; // Variables.Dynamical vars:2
  private boolean __vx_canBeChanged__ = true; // Variables.Dynamical vars:3
  private boolean __y_canBeChanged__ = true; // Variables.Dynamical vars:4
  private boolean __vy_canBeChanged__ = true; // Variables.Dynamical vars:5
  private boolean __z_canBeChanged__ = true; // Variables.Dynamical vars:6
  private boolean __vz_canBeChanged__ = true; // Variables.Dynamical vars:7
  private boolean __t_canBeChanged__ = true; // Variables.Dynamical vars:8
  private boolean __dt_canBeChanged__ = true; // Variables.Dynamical vars:9
  private boolean __tol_canBeChanged__ = true; // Variables.Dynamical vars:10

// ---------- Class constructor -------------------

  public TrajectoriesInEBView (TrajectoriesInEBSimulation _sim, String _replaceName, java.awt.Frame _replaceOwnerFrame) {
    super(_sim,_replaceName,_replaceOwnerFrame);
    _simulation = _sim;
    _model = (TrajectoriesInEB) _sim.getModel();
    _model._view = this;
    addTarget("_simulation",_simulation);
    addTarget("_model",_model);
    _model._resetModel();
    initialize();
    setUpdateSimulation(false);
    // The following is used by the JNLP file for the simulation to help find resources
    try { setUserCodebase(new java.net.URL(System.getProperty("jnlp.codebase"))); }
    catch (Exception exc) { } // Do nothing and keep quiet if it fails
    update();
	OSPRuntime.dispatchEventWait(new Runnable() {
			@Override
			public void run() {
				createControl();
			}
      });
    addElementsMenuEntries();
    update();
    setUpdateSimulation(true);
    addListener("msg"); // Variables.Aux vars:1
    addListener("componentB"); // Variables.Aux vars:2
    addListener("componentE"); // Variables.Aux vars:3
    addListener("boxSize"); // Variables.Aux vars:4
    addListener("E"); // Variables.Aux vars:5
    addListener("B"); // Variables.Aux vars:6
    addListener("v0"); // Variables.Aux vars:7
    addListener("sx"); // Variables.Aux vars:8
    addListener("sy"); // Variables.Aux vars:9
    addListener("crossed"); // Variables.Aux vars:10
    addListener("n"); // Variables.Dynamical vars:1
    addListener("x"); // Variables.Dynamical vars:2
    addListener("vx"); // Variables.Dynamical vars:3
    addListener("y"); // Variables.Dynamical vars:4
    addListener("vy"); // Variables.Dynamical vars:5
    addListener("z"); // Variables.Dynamical vars:6
    addListener("vz"); // Variables.Dynamical vars:7
    addListener("t"); // Variables.Dynamical vars:8
    addListener("dt"); // Variables.Dynamical vars:9
    addListener("tol"); // Variables.Dynamical vars:10
  }

// ---------- Implementation of View -------------------

  @Override
public void read() {
    // Ejs requires no read(). Actually, having it might cause problems!
  }

  @Override
@SuppressWarnings("unchecked")
  public void read(String _variable) {
    if ("msg".equals(_variable)) {
      _model.msg = getString("msg"); // Variables.Aux vars:1
      __msg_canBeChanged__ = true;
    }
    if ("componentB".equals(_variable)) {
      _model.componentB = getString("componentB"); // Variables.Aux vars:2
      __componentB_canBeChanged__ = true;
    }
    if ("componentE".equals(_variable)) {
      _model.componentE = getString("componentE"); // Variables.Aux vars:3
      __componentE_canBeChanged__ = true;
    }
    if ("boxSize".equals(_variable)) {
      _model.boxSize = getDouble("boxSize"); // Variables.Aux vars:4
      __boxSize_canBeChanged__ = true;
    }
    if ("E".equals(_variable)) {
      _model.E = getDouble("E"); // Variables.Aux vars:5
      __E_canBeChanged__ = true;
    }
    if ("B".equals(_variable)) {
      _model.B = getDouble("B"); // Variables.Aux vars:6
      __B_canBeChanged__ = true;
    }
    if ("v0".equals(_variable)) {
      _model.v0 = getDouble("v0"); // Variables.Aux vars:7
      __v0_canBeChanged__ = true;
    }
    if ("sx".equals(_variable)) {
      _model.sx = getDouble("sx"); // Variables.Aux vars:8
      __sx_canBeChanged__ = true;
    }
    if ("sy".equals(_variable)) {
      _model.sy = getDouble("sy"); // Variables.Aux vars:9
      __sy_canBeChanged__ = true;
    }
    if ("crossed".equals(_variable)) {
      _model.crossed = getBoolean("crossed"); // Variables.Aux vars:10
      __crossed_canBeChanged__ = true;
    }
    if ("n".equals(_variable)) {
      _model.n = getInt("n"); // Variables.Dynamical vars:1
      __n_canBeChanged__ = true;
    }
    if ("x".equals(_variable)) {
      double[] _data = (double[]) getValue("x").getObject();
      int _n0 = _data.length;
      if (_n0>_model.x.length) _n0 = _model.x.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.x[_i0] = _data[_i0];
      }
      __x_canBeChanged__ = true;
    }
    if ("vx".equals(_variable)) {
      double[] _data = (double[]) getValue("vx").getObject();
      int _n0 = _data.length;
      if (_n0>_model.vx.length) _n0 = _model.vx.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.vx[_i0] = _data[_i0];
      }
      __vx_canBeChanged__ = true;
    }
    if ("y".equals(_variable)) {
      double[] _data = (double[]) getValue("y").getObject();
      int _n0 = _data.length;
      if (_n0>_model.y.length) _n0 = _model.y.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.y[_i0] = _data[_i0];
      }
      __y_canBeChanged__ = true;
    }
    if ("vy".equals(_variable)) {
      double[] _data = (double[]) getValue("vy").getObject();
      int _n0 = _data.length;
      if (_n0>_model.vy.length) _n0 = _model.vy.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.vy[_i0] = _data[_i0];
      }
      __vy_canBeChanged__ = true;
    }
    if ("z".equals(_variable)) {
      double[] _data = (double[]) getValue("z").getObject();
      int _n0 = _data.length;
      if (_n0>_model.z.length) _n0 = _model.z.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.z[_i0] = _data[_i0];
      }
      __z_canBeChanged__ = true;
    }
    if ("vz".equals(_variable)) {
      double[] _data = (double[]) getValue("vz").getObject();
      int _n0 = _data.length;
      if (_n0>_model.vz.length) _n0 = _model.vz.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.vz[_i0] = _data[_i0];
      }
      __vz_canBeChanged__ = true;
    }
    if ("t".equals(_variable)) {
      _model.t = getDouble("t"); // Variables.Dynamical vars:8
      __t_canBeChanged__ = true;
    }
    if ("dt".equals(_variable)) {
      _model.dt = getDouble("dt"); // Variables.Dynamical vars:9
      __dt_canBeChanged__ = true;
    }
    if ("tol".equals(_variable)) {
      _model.tol = getDouble("tol"); // Variables.Dynamical vars:10
      __tol_canBeChanged__ = true;
    }
  }

  @Override
public void propagateValues () {
    setValue ("_isPlaying",_simulation.isPlaying());
    setValue ("_isPaused", _simulation.isPaused());
    if(__msg_canBeChanged__) setValue("msg",_model.msg); // Variables.Aux vars:1
    if(__componentB_canBeChanged__) setValue("componentB",_model.componentB); // Variables.Aux vars:2
    if(__componentE_canBeChanged__) setValue("componentE",_model.componentE); // Variables.Aux vars:3
    if(__boxSize_canBeChanged__) setValue("boxSize",_model.boxSize); // Variables.Aux vars:4
    if(__E_canBeChanged__) setValue("E",_model.E); // Variables.Aux vars:5
    if(__B_canBeChanged__) setValue("B",_model.B); // Variables.Aux vars:6
    if(__v0_canBeChanged__) setValue("v0",_model.v0); // Variables.Aux vars:7
    if(__sx_canBeChanged__) setValue("sx",_model.sx); // Variables.Aux vars:8
    if(__sy_canBeChanged__) setValue("sy",_model.sy); // Variables.Aux vars:9
    if(__crossed_canBeChanged__) setValue("crossed",_model.crossed); // Variables.Aux vars:10
    if(__n_canBeChanged__) setValue("n",_model.n); // Variables.Dynamical vars:1
    if(__x_canBeChanged__) setValue("x",_model.x); // Variables.Dynamical vars:2
    if(__vx_canBeChanged__) setValue("vx",_model.vx); // Variables.Dynamical vars:3
    if(__y_canBeChanged__) setValue("y",_model.y); // Variables.Dynamical vars:4
    if(__vy_canBeChanged__) setValue("vy",_model.vy); // Variables.Dynamical vars:5
    if(__z_canBeChanged__) setValue("z",_model.z); // Variables.Dynamical vars:6
    if(__vz_canBeChanged__) setValue("vz",_model.vz); // Variables.Dynamical vars:7
    if(__t_canBeChanged__) setValue("t",_model.t); // Variables.Dynamical vars:8
    if(__dt_canBeChanged__) setValue("dt",_model.dt); // Variables.Dynamical vars:9
    if(__tol_canBeChanged__) setValue("tol",_model.tol); // Variables.Dynamical vars:10
  }

  @Override
@SuppressWarnings("unchecked")
  public void blockVariable(String _variable) {
    if ("msg".equals(_variable)) __msg_canBeChanged__ = false; // Variables.Aux vars:1
    if ("componentB".equals(_variable)) __componentB_canBeChanged__ = false; // Variables.Aux vars:2
    if ("componentE".equals(_variable)) __componentE_canBeChanged__ = false; // Variables.Aux vars:3
    if ("boxSize".equals(_variable)) __boxSize_canBeChanged__ = false; // Variables.Aux vars:4
    if ("E".equals(_variable)) __E_canBeChanged__ = false; // Variables.Aux vars:5
    if ("B".equals(_variable)) __B_canBeChanged__ = false; // Variables.Aux vars:6
    if ("v0".equals(_variable)) __v0_canBeChanged__ = false; // Variables.Aux vars:7
    if ("sx".equals(_variable)) __sx_canBeChanged__ = false; // Variables.Aux vars:8
    if ("sy".equals(_variable)) __sy_canBeChanged__ = false; // Variables.Aux vars:9
    if ("crossed".equals(_variable)) __crossed_canBeChanged__ = false; // Variables.Aux vars:10
    if ("n".equals(_variable)) __n_canBeChanged__ = false; // Variables.Dynamical vars:1
    if ("x".equals(_variable)) __x_canBeChanged__ = false; // Variables.Dynamical vars:2
    if ("vx".equals(_variable)) __vx_canBeChanged__ = false; // Variables.Dynamical vars:3
    if ("y".equals(_variable)) __y_canBeChanged__ = false; // Variables.Dynamical vars:4
    if ("vy".equals(_variable)) __vy_canBeChanged__ = false; // Variables.Dynamical vars:5
    if ("z".equals(_variable)) __z_canBeChanged__ = false; // Variables.Dynamical vars:6
    if ("vz".equals(_variable)) __vz_canBeChanged__ = false; // Variables.Dynamical vars:7
    if ("t".equals(_variable)) __t_canBeChanged__ = false; // Variables.Dynamical vars:8
    if ("dt".equals(_variable)) __dt_canBeChanged__ = false; // Variables.Dynamical vars:9
    if ("tol".equals(_variable)) __tol_canBeChanged__ = false; // Variables.Dynamical vars:10
  }

// ---------- Creation of the interface  -------------------

  private void createControl() {
    // This first frame is added due to what I consider a bug in Java (Paco)
    addElement( new org.colos.ejs.library.control.swing.ControlFrame(),"_TOP_SECRET_")
      .setProperty("waitForReset","true")
      .setProperty("visible","false")
      .setProperty("background","green")
      .setProperty("size","100,100");
    mainFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"mainFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("exit","true")
      .setProperty("waitForReset","true")
      .setProperty("title","Parallel E&B Caustics in 2D")
      .setProperty("layout","border")
      .setProperty("visible","true")
      .setProperty("location","1,23")
      .setProperty("size","586,308")
      .getObject();
    upperPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"upperPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","mainFrame")
      .setProperty("layout","FLOW:center,0,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    BPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"BPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    BLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"BLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","BPanel")
      .setProperty("text","%componentB%")
      .getObject();
    BField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"BField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","BPanel")
      .setProperty("variable","B")
      .setProperty("format","0.0#")
      .setProperty("editable","%_model._method_for_BField_editable()%" )
      .setProperty("action","_model._method_for_BField_action()" )
      .setProperty("columns","3")
      .setProperty("tooltip","Magnetic field")
      .getObject();
    EPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"EPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    ELabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"ELabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","EPanel")
      .setProperty("text","%componentE%")
      .getObject();
    EField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"EField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","EPanel")
      .setProperty("variable","E")
      .setProperty("format","0.0#")
      .setProperty("editable","%_model._method_for_EField_editable()%" )
      .setProperty("action","_model._method_for_EField_action()" )
      .setProperty("columns","3")
      .setProperty("tooltip","Electric field")
      .getObject();
    scalePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"scalePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    scaleLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"scaleLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","scalePanel")
      .setProperty("text"," Scale = ")
      .getObject();
    scaleField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"scaleField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","scalePanel")
      .setProperty("variable","boxSize")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("tooltip","Scale of drawing")
      .getObject();
    ballDrawingPanel = (org.opensourcephysics.drawing2d.DrawingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlDrawingPanel(),"ballDrawingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","mainFrame")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("minimumX","%_model._method_for_ballDrawingPanel_minimumX()%" )
      .setProperty("maximumX","boxSize")
      .setProperty("minimumY","%_model._method_for_ballDrawingPanel_minimumY()%" )
      .setProperty("maximumY","boxSize")
      .setProperty("square","true")
      .setProperty("TLmessage","%msg%")
      .getObject();
    group = (org.opensourcephysics.drawing2d.Group)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlGroup2D(),"group")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","ballDrawingPanel")
      .setProperty("x","sx")
      .setProperty("y","sy")
      .getObject();
    trailSet = (org.opensourcephysics.drawing2d.Set)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrailSet2D(),"trailSet")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","group")
      .setProperty("inputX","x")
      .setProperty("inputY","y")
      .setProperty("maximumPoints","2000")
      .setProperty("norepeat","true")
      .getObject();
    particles = (org.opensourcephysics.drawing2d.Set)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShapeSet2D(),"particles")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","group")
      .setProperty("x","x")
      .setProperty("y","y")
      .setProperty("sizeX","7")
      .setProperty("sizeY","7")
      .setProperty("pixelSize","true")
      .setProperty("enabledPosition","true")
      .getObject();
    source = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"source")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","group")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("sizeX","10")
      .setProperty("sizeY","10")
      .setProperty("pixelSize","true")
      .setProperty("enabledPosition","true")
      .setProperty("movesGroup","true")
      .setProperty("fillColor","RED")
      .getObject();
    controlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"controlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","mainFrame")
      .setProperty("layout","border")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    buttonPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"buttonPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","controlPanel")
      .setProperty("layout","GRID:1,4,0,0")
      .setProperty("size","140,23")
      .getObject();
    startStopButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"startStopButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","buttonPanel")
      .setProperty("variable","_isPaused")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("actionOn","_model._method_for_startStopButton_actionOn()" )
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif")
      .setProperty("actionOff","_model._method_for_startStopButton_actionOff()" )
      .getObject();
    stepButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"stepButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif")
      .setProperty("action","_model._method_for_stepButton_action()" )
      .getObject();
    resetTimeButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetTimeButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("action","_model._method_for_resetTimeButton_action()" )
      .setProperty("tooltip","Reset the time")
      .getObject();
    resetButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("action","_model._method_for_resetButton_action()" )
      .getObject();
    inputPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"inputPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","controlPanel")
      .setProperty("layout","HBOX")
      .getObject();
    nPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"nPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","inputPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    nLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"nLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","nPanel")
      .setProperty("text"," n = ")
      .setProperty("tooltip","number of trajectories")
      .getObject();
    nField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"nField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","nPanel")
      .setProperty("variable","n")
      .setProperty("format","0")
      .setProperty("editable","%_model._method_for_nField_editable()%" )
      .setProperty("action","_model._method_for_nField_action()" )
      .setProperty("columns","3")
      .getObject();
    vPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","inputPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    vLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"vLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vPanel")
      .setProperty("text"," v0 = ")
      .setProperty("tooltip","initial speed")
      .getObject();
    vField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","vPanel")
      .setProperty("variable","v0")
      .setProperty("format","0.0#")
      .setProperty("editable","%_model._method_for_vField_editable()%" )
      .setProperty("action","_model._method_for_vField_action()" )
      .setProperty("columns","3")
      .getObject();
    tPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"tPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","inputPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    tLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","tPanel")
      .setProperty("text"," t = ")
      .getObject();
    tField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"tField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","tPanel")
      .setProperty("variable","t")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .getObject();
    directionPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"directionPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","controlPanel")
      .setProperty("layout","FLOW:center,0,0")
      .getObject();
    crossButton = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"crossButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","directionPanel")
      .setProperty("variable","crossed")
      .setProperty("text","ExB")
      .setProperty("enabled","%_model._method_for_crossButton_enabled()%" )
      .setProperty("noUnselect","true")
      .setProperty("actionon","_model._method_for_crossButton_actionon()" )
      .getObject();
    parallelButton = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"parallelButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","directionPanel")
      .setProperty("variable","%_model._method_for_parallelButton_variable()%" )
      .setProperty("text","E||B")
      .setProperty("enabled","%_model._method_for_parallelButton_enabled()%" )
      .setProperty("noUnselect","true")
      .setProperty("actionon","_model._method_for_parallelButton_actionon()" )
      .getObject();
  }

// ---------- Resetting the interface  -------------------

  @Override
public void reset() {
    getElement("mainFrame")
      .setProperty("title","Parallel E&B Caustics in 2D")
      .setProperty("visible","true");
    getElement("upperPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("BPanel");
    getElement("BLabel");
    getElement("BField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("tooltip","Magnetic field");
    getElement("EPanel");
    getElement("ELabel");
    getElement("EField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("tooltip","Electric field");
    getElement("scalePanel");
    getElement("scaleLabel")
      .setProperty("text"," Scale = ");
    getElement("scaleField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("tooltip","Scale of drawing");
    getElement("ballDrawingPanel")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("square","true");
    getElement("group");
    getElement("trailSet")
      .setProperty("maximumPoints","2000")
      .setProperty("norepeat","true");
    getElement("particles")
      .setProperty("sizeX","7")
      .setProperty("sizeY","7")
      .setProperty("pixelSize","true")
      .setProperty("enabledPosition","true");
    getElement("source")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("sizeX","10")
      .setProperty("sizeY","10")
      .setProperty("pixelSize","true")
      .setProperty("enabledPosition","true")
      .setProperty("movesGroup","true")
      .setProperty("fillColor","RED");
    getElement("controlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("buttonPanel")
      .setProperty("size","140,23");
    getElement("startStopButton")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    getElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif");
    getElement("resetTimeButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Reset the time");
    getElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif");
    getElement("inputPanel");
    getElement("nPanel");
    getElement("nLabel")
      .setProperty("text"," n = ")
      .setProperty("tooltip","number of trajectories");
    getElement("nField")
      .setProperty("format","0")
      .setProperty("columns","3");
    getElement("vPanel");
    getElement("vLabel")
      .setProperty("text"," v0 = ")
      .setProperty("tooltip","initial speed");
    getElement("vField")
      .setProperty("format","0.0#")
      .setProperty("columns","3");
    getElement("tPanel");
    getElement("tLabel")
      .setProperty("text"," t = ");
    getElement("tField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4");
    getElement("directionPanel");
    getElement("crossButton")
      .setProperty("text","ExB")
      .setProperty("noUnselect","true");
    getElement("parallelButton")
      .setProperty("text","E||B")
      .setProperty("noUnselect","true");
    __msg_canBeChanged__ = true; // Variables.Aux vars:1
    __componentB_canBeChanged__ = true; // Variables.Aux vars:2
    __componentE_canBeChanged__ = true; // Variables.Aux vars:3
    __boxSize_canBeChanged__ = true; // Variables.Aux vars:4
    __E_canBeChanged__ = true; // Variables.Aux vars:5
    __B_canBeChanged__ = true; // Variables.Aux vars:6
    __v0_canBeChanged__ = true; // Variables.Aux vars:7
    __sx_canBeChanged__ = true; // Variables.Aux vars:8
    __sy_canBeChanged__ = true; // Variables.Aux vars:9
    __crossed_canBeChanged__ = true; // Variables.Aux vars:10
    __n_canBeChanged__ = true; // Variables.Dynamical vars:1
    __x_canBeChanged__ = true; // Variables.Dynamical vars:2
    __vx_canBeChanged__ = true; // Variables.Dynamical vars:3
    __y_canBeChanged__ = true; // Variables.Dynamical vars:4
    __vy_canBeChanged__ = true; // Variables.Dynamical vars:5
    __z_canBeChanged__ = true; // Variables.Dynamical vars:6
    __vz_canBeChanged__ = true; // Variables.Dynamical vars:7
    __t_canBeChanged__ = true; // Variables.Dynamical vars:8
    __dt_canBeChanged__ = true; // Variables.Dynamical vars:9
    __tol_canBeChanged__ = true; // Variables.Dynamical vars:10
    super.reset();
  }

} // End of class TrajectoriesInEBView

