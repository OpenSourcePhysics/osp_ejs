/*
 * Class : ParticleMotionNearMagneticDipoleView.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package motionneardipole;

import org.opensourcephysics.display.OSPRuntime;

// Imports suggested by Model Elements:
// End of imports from Model Elements


class ParticleMotionNearMagneticDipoleView extends org.colos.ejs.library.control.EjsControl implements org.colos.ejs.library.View {
  private ParticleMotionNearMagneticDipoleSimulation _simulation=null;
  private ParticleMotionNearMagneticDipole _model=null;

  // Public variables for wrapped view elements:
  public java.awt.Component frame;
  public org.opensourcephysics.drawing3d.DrawingPanel3D drawingPanel3D;
  public org.opensourcephysics.drawing3d.MultiTrail trail;
  public org.opensourcephysics.drawing3d.ElementArrow dipoleArrow;
  public javax.swing.JPanel controlPanel;
  public javax.swing.JPanel energyPanel;
  public javax.swing.JLabel energyLabel;
  public javax.swing.JTextField energyField;
  public javax.swing.JPanel radioPanel;
  public javax.swing.JRadioButton radio3D;
  public javax.swing.JRadioButton radioXY;
  public javax.swing.JRadioButton radioYZ;
  public javax.swing.JRadioButton radioXZ;
  public javax.swing.JPanel buttonPanel;
  public javax.swing.JButton startStopButton;
  public javax.swing.JButton stepButton;
  public javax.swing.JButton resetTime;
  public javax.swing.JButton resetButton;
  public javax.swing.JPanel upperPanel;
  public javax.swing.JPanel vxPanel;
  public javax.swing.JLabel vxLabel;
  public javax.swing.JTextField vxField;
  public javax.swing.JPanel vyPanel;
  public javax.swing.JLabel vyLabel;
  public javax.swing.JTextField vyField;
  public javax.swing.JPanel vzPanel;
  public javax.swing.JLabel vzLabel;
  public javax.swing.JTextField vzField;

  // private variables to block changes in the view variables:
  private boolean __vx0_canBeChanged__ = true; // Variables.Initial Conditions:1
  private boolean __vy0_canBeChanged__ = true; // Variables.Initial Conditions:2
  private boolean __vz0_canBeChanged__ = true; // Variables.Initial Conditions:3
  private boolean __k_canBeChanged__ = true; // Variables.Dynamics Vars:1
  private boolean __r_canBeChanged__ = true; // Variables.Dynamics Vars:2
  private boolean __v_canBeChanged__ = true; // Variables.Dynamics Vars:3
  private boolean __t_canBeChanged__ = true; // Variables.Dynamics Vars:4
  private boolean __dt_canBeChanged__ = true; // Variables.Dynamics Vars:5
  private boolean __size_canBeChanged__ = true; // Variables.Aux Vars:1
  private boolean __E_canBeChanged__ = true; // Variables.Aux Vars:2
  private boolean __projection_canBeChanged__ = true; // Variables.Aux Vars:3

// ---------- Class constructor -------------------

  public ParticleMotionNearMagneticDipoleView (ParticleMotionNearMagneticDipoleSimulation _sim, String _replaceName, java.awt.Frame _replaceOwnerFrame) {
    super(_sim,_replaceName,_replaceOwnerFrame);
    _simulation = _sim;
    _model = (ParticleMotionNearMagneticDipole) _sim.getModel();
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
		public void run () { 
          createControl();
        }
      });
    addElementsMenuEntries();
    update();
    setUpdateSimulation(true);
    addListener("vx0"); // Variables.Initial Conditions:1
    addListener("vy0"); // Variables.Initial Conditions:2
    addListener("vz0"); // Variables.Initial Conditions:3
    addListener("k"); // Variables.Dynamics Vars:1
    addListener("r"); // Variables.Dynamics Vars:2
    addListener("v"); // Variables.Dynamics Vars:3
    addListener("t"); // Variables.Dynamics Vars:4
    addListener("dt"); // Variables.Dynamics Vars:5
    addListener("size"); // Variables.Aux Vars:1
    addListener("E"); // Variables.Aux Vars:2
    addListener("projection"); // Variables.Aux Vars:3
  }

// ---------- Implementation of View -------------------

  @Override
public void read() {
    // Ejs requires no read(). Actually, having it might cause problems!
  }

  @Override
  public void read(String _variable) {
    if ("vx0".equals(_variable)) {
      _model.vx0 = getDouble("vx0"); // Variables.Initial Conditions:1
      __vx0_canBeChanged__ = true;
    }
    if ("vy0".equals(_variable)) {
      _model.vy0 = getDouble("vy0"); // Variables.Initial Conditions:2
      __vy0_canBeChanged__ = true;
    }
    if ("vz0".equals(_variable)) {
      _model.vz0 = getDouble("vz0"); // Variables.Initial Conditions:3
      __vz0_canBeChanged__ = true;
    }
    if ("k".equals(_variable)) {
      _model.k = getDouble("k"); // Variables.Dynamics Vars:1
      __k_canBeChanged__ = true;
    }
    if ("r".equals(_variable)) {
      double[] _data = (double[]) getValue("r").getObject();
      int _n0 = _data.length;
      if (_n0>_model.r.length) _n0 = _model.r.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.r[_i0] = _data[_i0];
      }
      __r_canBeChanged__ = true;
    }
    if ("v".equals(_variable)) {
      double[] _data = (double[]) getValue("v").getObject();
      int _n0 = _data.length;
      if (_n0>_model.v.length) _n0 = _model.v.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.v[_i0] = _data[_i0];
      }
      __v_canBeChanged__ = true;
    }
    if ("t".equals(_variable)) {
      _model.t = getDouble("t"); // Variables.Dynamics Vars:4
      __t_canBeChanged__ = true;
    }
    if ("dt".equals(_variable)) {
      _model.dt = getDouble("dt"); // Variables.Dynamics Vars:5
      __dt_canBeChanged__ = true;
    }
    if ("size".equals(_variable)) {
      _model.size = getDouble("size"); // Variables.Aux Vars:1
      __size_canBeChanged__ = true;
    }
    if ("E".equals(_variable)) {
      _model.E = getDouble("E"); // Variables.Aux Vars:2
      __E_canBeChanged__ = true;
    }
    if ("projection".equals(_variable)) {
      _model.projection = getInt("projection"); // Variables.Aux Vars:3
      __projection_canBeChanged__ = true;
    }
  }

  @Override
public void propagateValues () {
    setValue ("_isPlaying",_simulation.isPlaying());
    setValue ("_isPaused", _simulation.isPaused());
    if(__vx0_canBeChanged__) setValue("vx0",_model.vx0); // Variables.Initial Conditions:1
    if(__vy0_canBeChanged__) setValue("vy0",_model.vy0); // Variables.Initial Conditions:2
    if(__vz0_canBeChanged__) setValue("vz0",_model.vz0); // Variables.Initial Conditions:3
    if(__k_canBeChanged__) setValue("k",_model.k); // Variables.Dynamics Vars:1
    if(__r_canBeChanged__) setValue("r",_model.r); // Variables.Dynamics Vars:2
    if(__v_canBeChanged__) setValue("v",_model.v); // Variables.Dynamics Vars:3
    if(__t_canBeChanged__) setValue("t",_model.t); // Variables.Dynamics Vars:4
    if(__dt_canBeChanged__) setValue("dt",_model.dt); // Variables.Dynamics Vars:5
    if(__size_canBeChanged__) setValue("size",_model.size); // Variables.Aux Vars:1
    if(__E_canBeChanged__) setValue("E",_model.E); // Variables.Aux Vars:2
    if(__projection_canBeChanged__) setValue("projection",_model.projection); // Variables.Aux Vars:3
  }

  @Override
  public void blockVariable(String _variable) {
    if ("vx0".equals(_variable)) __vx0_canBeChanged__ = false; // Variables.Initial Conditions:1
    if ("vy0".equals(_variable)) __vy0_canBeChanged__ = false; // Variables.Initial Conditions:2
    if ("vz0".equals(_variable)) __vz0_canBeChanged__ = false; // Variables.Initial Conditions:3
    if ("k".equals(_variable)) __k_canBeChanged__ = false; // Variables.Dynamics Vars:1
    if ("r".equals(_variable)) __r_canBeChanged__ = false; // Variables.Dynamics Vars:2
    if ("v".equals(_variable)) __v_canBeChanged__ = false; // Variables.Dynamics Vars:3
    if ("t".equals(_variable)) __t_canBeChanged__ = false; // Variables.Dynamics Vars:4
    if ("dt".equals(_variable)) __dt_canBeChanged__ = false; // Variables.Dynamics Vars:5
    if ("size".equals(_variable)) __size_canBeChanged__ = false; // Variables.Aux Vars:1
    if ("E".equals(_variable)) __E_canBeChanged__ = false; // Variables.Aux Vars:2
    if ("projection".equals(_variable)) __projection_canBeChanged__ = false; // Variables.Aux Vars:3
  }

// ---------- Creation of the interface  -------------------

  private void createControl() {
    // This first frame is added due to what I consider a bug in Java (Paco)
    addElement( new org.colos.ejs.library.control.swing.ControlFrame(),"_TOP_SECRET_")
      .setProperty("waitForReset","true")
      .setProperty("visible","false")
      .setProperty("background","green")
      .setProperty("size","100,100");
    frame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"mainFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("exit","true")
      .setProperty("waitForReset","true")
      .setProperty("title","Charged Particle Motion Near a Magnetic Dipole")
      .setProperty("layout","border")
      .setProperty("visible","true")
      .setProperty("location","10,23")
      .setProperty("size","579,685")
      .getObject();
    drawingPanel3D = (org.opensourcephysics.drawing3d.DrawingPanel3D)
      addElement(new org.colos.ejs.library.control.drawing3d.ControlDrawingPanel3D(),"drawingPanel3D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","mainFrame")
      .setProperty("minimumX","%_model._method_for_drawingPanel3D_minimumX()%" )
      .setProperty("maximumX","size")
      .setProperty("minimumY","%_model._method_for_drawingPanel3D_minimumY()%" )
      .setProperty("maximumY","size")
      .setProperty("minimumZ","%_model._method_for_drawingPanel3D_minimumZ()%" )
      .setProperty("maximumZ","size")
      .setProperty("projectionMode","projection")
      .setProperty("cameraAzimuth","-0.0")
      .setProperty("cameraAltitude","0.005")
      .setProperty("cameraFocusX","0.0")
      .setProperty("cameraFocusY","0.0")
      .setProperty("cameraFocusZ","0.0")
      .setProperty("cameraRotation","0.0")
      .setProperty("cameraDistanceToScreen","100.0")
      .setProperty("decorationType","AXES")
      .getObject();
    trail = (org.opensourcephysics.drawing3d.MultiTrail)
      addElement(new org.colos.ejs.library.control.drawing3d.ControlTrail3D(),"trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","drawingPanel3D")
      .setProperty("inputX","%_model._method_for_trail_inputX()%" )
      .setProperty("inputY","%_model._method_for_trail_inputY()%" )
      .setProperty("inputZ","%_model._method_for_trail_inputZ()%" )
      .setProperty("lineWidth","2")
      .getObject();
    dipoleArrow = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.colos.ejs.library.control.drawing3d.ControlArrow3D(),"dipoleArrow")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","drawingPanel3D")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("z","%_model._method_for_dipoleArrow_z()%" )
      .setProperty("sizeX","0")
      .setProperty("sizeY","0")
      .setProperty("sizeZ","%_model._method_for_dipoleArrow_sizeZ()%" )
      .getObject();
    controlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"controlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","mainFrame")
      .setProperty("layout","BORDER:0,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    energyPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"energyPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","controlPanel")
      .setProperty("layout","border")
      .setProperty("visible","false")
      .getObject();
    energyLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"energyLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","energyPanel")
      .setProperty("text","    E = ")
      .getObject();
    energyField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"energyField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","energyPanel")
      .setProperty("variable","E")
      .setProperty("format","0.00000")
      .setProperty("editable","false")
      .setProperty("size","70,20")
      .getObject();
    radioPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"radioPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","controlPanel")
      .setProperty("layout","FLOW:center,0,0")
      .getObject();
    radio3D = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"radio3D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","radioPanel")
      .setProperty("selected","true")
      .setProperty("text","3D")
      .setProperty("noUnselect","true")
      .setProperty("actionon","_model._method_for_radio3D_actionon()" )
      .getObject();
    radioXY = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"radioXY")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","radioPanel")
      .setProperty("text","XY")
      .setProperty("noUnselect","true")
      .setProperty("actionon","_model._method_for_radioXY_actionon()" )
      .getObject();
    radioYZ = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"radioYZ")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","radioPanel")
      .setProperty("text","YZ")
      .setProperty("noUnselect","true")
      .setProperty("actionon","_model._method_for_radioYZ_actionon()" )
      .getObject();
    radioXZ = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"radioXZ")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","radioPanel")
      .setProperty("text","XZ")
      .setProperty("noUnselect","true")
      .setProperty("actionon","_model._method_for_radioXZ_actionon()" )
      .getObject();
    buttonPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"buttonPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","controlPanel")
      .setProperty("layout","GRID:1,4,0,0")
      .setProperty("size","160,24")
      .getObject();
    startStopButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"startStopButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","buttonPanel")
      .setProperty("variable","_isPaused")
      .setProperty("tooltip","Starts and stops the simulation.")
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
      .setProperty("tooltip","Single steps the simulation.")
      .getObject();
    resetTime = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetTime")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("action","_model._method_for_resetTime_action()" )
      .getObject();
    resetButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("action","_model._method_for_resetButton_action()" )
      .setProperty("tooltip","Resets the simulation.")
      .getObject();
    upperPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"upperPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","mainFrame")
      .setProperty("layout","FLOW:center,8,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    vxPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vxPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","upperPanel")
      .setProperty("layout","border")
      .getObject();
    vxLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"vxLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vxPanel")
      .setProperty("text"," vx(0) = ")
      .getObject();
    vxField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vxField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","vxPanel")
      .setProperty("variable","vx0")
      .setProperty("format","0.00")
      .setProperty("action","_model._method_for_vxField_action()" )
      .setProperty("columns","3")
      .getObject();
    vyPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vyPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","upperPanel")
      .setProperty("layout","border")
      .getObject();
    vyLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"vyLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vyPanel")
      .setProperty("text"," vy(0) = ")
      .getObject();
    vyField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vyField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","vyPanel")
      .setProperty("variable","vy0")
      .setProperty("format","0.00")
      .setProperty("action","_model._method_for_vyField_action()" )
      .setProperty("columns","3")
      .getObject();
    vzPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vzPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","upperPanel")
      .setProperty("layout","border")
      .getObject();
    vzLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"vzLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vzPanel")
      .setProperty("text"," vz(0) = ")
      .getObject();
    vzField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vzField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","vzPanel")
      .setProperty("variable","vz0")
      .setProperty("format","0.00")
      .setProperty("action","_model._method_for_vzField_action()" )
      .setProperty("columns","3")
      .getObject();
  }

// ---------- Resetting the interface  -------------------

  @Override
public void reset() {
    getElement("mainFrame")
      .setProperty("title","Charged Particle Motion Near a Magnetic Dipole")
      .setProperty("visible","true");
    getElement("drawingPanel3D")
      .setProperty("cameraAzimuth","-0.0")
      .setProperty("cameraAltitude","0.005")
      .setProperty("cameraFocusX","0.0")
      .setProperty("cameraFocusY","0.0")
      .setProperty("cameraFocusZ","0.0")
      .setProperty("cameraRotation","0.0")
      .setProperty("cameraDistanceToScreen","100.0")
      .setProperty("decorationType","AXES");
    getElement("trail")
      .setProperty("lineWidth","2");
    getElement("dipoleArrow")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("sizeX","0")
      .setProperty("sizeY","0");
    getElement("controlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("energyPanel")
      .setProperty("visible","false");
    getElement("energyLabel")
      .setProperty("text","    E = ");
    getElement("energyField")
      .setProperty("format","0.00000")
      .setProperty("editable","false")
      .setProperty("size","70,20");
    getElement("radioPanel");
    getElement("radio3D")
      .setProperty("selected","true")
      .setProperty("text","3D")
      .setProperty("noUnselect","true");
    getElement("radioXY")
      .setProperty("text","XY")
      .setProperty("noUnselect","true");
    getElement("radioYZ")
      .setProperty("text","YZ")
      .setProperty("noUnselect","true");
    getElement("radioXZ")
      .setProperty("text","XZ")
      .setProperty("noUnselect","true");
    getElement("buttonPanel")
      .setProperty("size","160,24");
    getElement("startStopButton")
      .setProperty("tooltip","Starts and stops the simulation.")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    getElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif")
      .setProperty("tooltip","Single steps the simulation.");
    getElement("resetTime")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif");
    getElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Resets the simulation.");
    getElement("upperPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("vxPanel");
    getElement("vxLabel")
      .setProperty("text"," vx(0) = ");
    getElement("vxField")
      .setProperty("format","0.00")
      .setProperty("columns","3");
    getElement("vyPanel");
    getElement("vyLabel")
      .setProperty("text"," vy(0) = ");
    getElement("vyField")
      .setProperty("format","0.00")
      .setProperty("columns","3");
    getElement("vzPanel");
    getElement("vzLabel")
      .setProperty("text"," vz(0) = ");
    getElement("vzField")
      .setProperty("format","0.00")
      .setProperty("columns","3");
    __vx0_canBeChanged__ = true; // Variables.Initial Conditions:1
    __vy0_canBeChanged__ = true; // Variables.Initial Conditions:2
    __vz0_canBeChanged__ = true; // Variables.Initial Conditions:3
    __k_canBeChanged__ = true; // Variables.Dynamics Vars:1
    __r_canBeChanged__ = true; // Variables.Dynamics Vars:2
    __v_canBeChanged__ = true; // Variables.Dynamics Vars:3
    __t_canBeChanged__ = true; // Variables.Dynamics Vars:4
    __dt_canBeChanged__ = true; // Variables.Dynamics Vars:5
    __size_canBeChanged__ = true; // Variables.Aux Vars:1
    __E_canBeChanged__ = true; // Variables.Aux Vars:2
    __projection_canBeChanged__ = true; // Variables.Aux Vars:3
    super.reset();
  }

} // End of class ParticleMotionNearMagneticDipoleView

