/*
 * Class : GyroscopeView.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package gyroscope;


import org.opensourcephysics.ejs.EjsView;
import org.opensourcephysics.ejs._EjsConstants;
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

class GyroscopeView extends org.colos.ejs.library.control.EjsControl implements org.opensourcephysics.ejs.EjsView {
  private GyroscopeSimulation _simulation=null;
  private Gyroscope _model=null;

  // Public variables for wrapped view elements:
  public java.awt.Component mainFrame;
  public javax.swing.JPanel upperPanel;
  public javax.swing.JPanel showPanel;
  public javax.swing.JLabel showLabel;
  public javax.swing.JCheckBox showRotorCheck;
  public javax.swing.JCheckBox showSpaceCheck;
  public javax.swing.JCheckBox showBodyTrailCheck;
  public javax.swing.JCheckBox showVectors;
  public javax.swing.JCheckBox elevation;
  public javax.swing.JPanel rotorPanel;
  public javax.swing.JPanel radiusPanel;
  public javax.swing.JLabel radiusLabel;
  public javax.swing.JTextField radiusField;
  public javax.swing.JPanel z0Panel;
  public javax.swing.JLabel z0Label;
  public javax.swing.JTextField z0Field;
  public org.opensourcephysics.drawing3d.DrawingPanel3D spaceViewDrawingPanel3D;
  public org.opensourcephysics.drawing3d.Group rotorGroup;
  public org.opensourcephysics.drawing3d.utils.transformations.QuaternionRotation quaternion3D;
  public org.opensourcephysics.drawing3d.ElementArrow shaftArrow;
  public org.opensourcephysics.drawing3d.ElementEllipsoid rotor;
  public org.opensourcephysics.drawing3d.ElementCylinder shaft;
  public org.opensourcephysics.drawing3d.Group vectorGroup;
  public org.opensourcephysics.drawing3d.ElementArrow angularMomentumVector;
  public org.opensourcephysics.drawing3d.ElementText angularMomentumText;
  public org.opensourcephysics.drawing3d.ElementArrow torqueVector;
  public org.opensourcephysics.drawing3d.ElementText torqueText;
  public org.opensourcephysics.drawing3d.ElementArrow omegaVector;
  public org.opensourcephysics.drawing3d.ElementText omegaText;
  public org.opensourcephysics.drawing3d.ElementCylinder baseCylinder;
  public org.opensourcephysics.drawing3d.ElementCylinder postCylinder;
  public org.opensourcephysics.drawing3d.MultiTrail shaftTrail;
  public org.opensourcephysics.drawing3d.Group spaceAxisGroup;
  public org.opensourcephysics.drawing3d.ElementArrow xArrow3D2;
  public org.opensourcephysics.drawing3d.ElementArrow yArrow3D2;
  public org.opensourcephysics.drawing3d.ElementArrow zArrow3D2;
  public org.opensourcephysics.drawing3d.ElementText xText2;
  public org.opensourcephysics.drawing3d.ElementText yText2;
  public org.opensourcephysics.drawing3d.ElementText zText2;
  public javax.swing.JPanel controlPanel;
  public javax.swing.JPanel buttonPanel;
  public javax.swing.JButton startButton;
  public javax.swing.JButton stepButton;
  public javax.swing.JButton resetTimeButton;
  public javax.swing.JButton resetButton;
  public javax.swing.JPanel inputPanel;
  public javax.swing.JPanel tiltPanel;
  public javax.swing.JLabel tiltLabel;
  public javax.swing.JTextField tiltField;
  public javax.swing.JPanel omegaOnePanel;
  public javax.swing.JLabel omegaOneLabel;
  public javax.swing.JTextField omegaOneField;
  public javax.swing.JPanel omegaThreePanel;
  public javax.swing.JLabel omegaThreeLabel;
  public javax.swing.JTextField omegaThreeField;
  public javax.swing.JPanel dtPanel;
  public javax.swing.JLabel dtLabel;
  public javax.swing.JTextField dtField;
  public javax.swing.JPanel tPanel;
  public javax.swing.JLabel tLabel;
  public javax.swing.JTextField tField;
  public javax.swing.JPanel checkPanel;
  public javax.swing.JCheckBox gravityCheck;
  public javax.swing.JDialog elevationDialog;
  public org.opensourcephysics.drawing2d.PlottingPanel2D elevationPlottingPanel;
  public org.opensourcephysics.drawing2d.ElementTrail axisElevationTrail;
  public org.opensourcephysics.drawing2d.ElementTrail momentumElevationTrail;

  // private variables to block changes in the view variables:
  private boolean __q_canBeChanged__ = true; // Variables.Dynamic Vars:1
  private boolean __qDot_canBeChanged__ = true; // Variables.Dynamic Vars:2
  private boolean __t_canBeChanged__ = true; // Variables.Dynamic Vars:3
  private boolean __dt_canBeChanged__ = true; // Variables.Dynamic Vars:4
  private boolean __tol_canBeChanged__ = true; // Variables.Dynamic Vars:5
  private boolean __showBodyTrail_canBeChanged__ = true; // Variables.Rotor Vars:1
  private boolean __showSpace_canBeChanged__ = true; // Variables.Rotor Vars:2
  private boolean __showVectors_canBeChanged__ = true; // Variables.Rotor Vars:3
  private boolean __showRotor_canBeChanged__ = true; // Variables.Rotor Vars:4
  private boolean __boundingBox_canBeChanged__ = true; // Variables.Rotor Vars:5
  private boolean __size_canBeChanged__ = true; // Variables.Rotor Vars:6
  private boolean __m_canBeChanged__ = true; // Variables.Rotor Vars:7
  private boolean __g_canBeChanged__ = true; // Variables.Rotor Vars:8
  private boolean __z0_canBeChanged__ = true; // Variables.Rotor Vars:9
  private boolean __R_canBeChanged__ = true; // Variables.Rotor Vars:10
  private boolean __a_canBeChanged__ = true; // Variables.Rotor Vars:11
  private boolean __b_canBeChanged__ = true; // Variables.Rotor Vars:12
  private boolean __c_canBeChanged__ = true; // Variables.Rotor Vars:13
  private boolean __I1_canBeChanged__ = true; // Variables.Rotor Vars:14
  private boolean __I2_canBeChanged__ = true; // Variables.Rotor Vars:15
  private boolean __I3_canBeChanged__ = true; // Variables.Rotor Vars:16
  private boolean __showElevationPlot_canBeChanged__ = true; // Variables.Vector Vars:1
  private boolean __axisElevation_canBeChanged__ = true; // Variables.Vector Vars:2
  private boolean __momentumElevation_canBeChanged__ = true; // Variables.Vector Vars:3
  private boolean __arrowScale_canBeChanged__ = true; // Variables.Vector Vars:4
  private boolean __tilt_canBeChanged__ = true; // Variables.Vector Vars:5
  private boolean __omegaOne_canBeChanged__ = true; // Variables.Vector Vars:6
  private boolean __omegaThree_canBeChanged__ = true; // Variables.Vector Vars:7
  private boolean __omega_canBeChanged__ = true; // Variables.Vector Vars:8
  private boolean __angularMomentum_canBeChanged__ = true; // Variables.Vector Vars:9
  private boolean __torque_canBeChanged__ = true; // Variables.Vector Vars:10
  private boolean __shaftTip_canBeChanged__ = true; // Variables.Vector Vars:11

// ---------- Class constructor -------------------

  public GyroscopeView (GyroscopeSimulation _sim, String _replaceName, java.awt.Frame _replaceOwnerFrame) {
    super(_sim,_replaceName,_replaceOwnerFrame);
    _simulation = _sim;
    _model = (Gyroscope) _sim.getModel();
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
    if (javax.swing.SwingUtilities.isEventDispatchThread()) createControl();
    else try {
      javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
        public void run () { 
          createControl();
        }
      });
    } catch (java.lang.reflect.InvocationTargetException it_exc) { it_exc.printStackTrace(); 
    } catch (InterruptedException i_exc) { i_exc.printStackTrace(); };
    addElementsMenuEntries();
    update();
    setUpdateSimulation(true);
    addListener("q"); // Variables.Dynamic Vars:1
    addListener("qDot"); // Variables.Dynamic Vars:2
    addListener("t"); // Variables.Dynamic Vars:3
    addListener("dt"); // Variables.Dynamic Vars:4
    addListener("tol"); // Variables.Dynamic Vars:5
    addListener("showBodyTrail"); // Variables.Rotor Vars:1
    addListener("showSpace"); // Variables.Rotor Vars:2
    addListener("showVectors"); // Variables.Rotor Vars:3
    addListener("showRotor"); // Variables.Rotor Vars:4
    addListener("boundingBox"); // Variables.Rotor Vars:5
    addListener("size"); // Variables.Rotor Vars:6
    addListener("m"); // Variables.Rotor Vars:7
    addListener("g"); // Variables.Rotor Vars:8
    addListener("z0"); // Variables.Rotor Vars:9
    addListener("R"); // Variables.Rotor Vars:10
    addListener("a"); // Variables.Rotor Vars:11
    addListener("b"); // Variables.Rotor Vars:12
    addListener("c"); // Variables.Rotor Vars:13
    addListener("I1"); // Variables.Rotor Vars:14
    addListener("I2"); // Variables.Rotor Vars:15
    addListener("I3"); // Variables.Rotor Vars:16
    addListener("showElevationPlot"); // Variables.Vector Vars:1
    addListener("axisElevation"); // Variables.Vector Vars:2
    addListener("momentumElevation"); // Variables.Vector Vars:3
    addListener("arrowScale"); // Variables.Vector Vars:4
    addListener("tilt"); // Variables.Vector Vars:5
    addListener("omegaOne"); // Variables.Vector Vars:6
    addListener("omegaThree"); // Variables.Vector Vars:7
    addListener("omega"); // Variables.Vector Vars:8
    addListener("angularMomentum"); // Variables.Vector Vars:9
    addListener("torque"); // Variables.Vector Vars:10
    addListener("shaftTip"); // Variables.Vector Vars:11
  }

// ---------- Implementation of View -------------------

  public void read() {
    // Ejs requires no read(). Actually, having it might cause problems!
  }

  @SuppressWarnings("unchecked")
  public void read(String _variable) {
    if ("q".equals(_variable)) {
      double[] _data = (double[]) getValue("q").getObject();
      int _n0 = _data.length;
      if (_n0>_model.q.length) _n0 = _model.q.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.q[_i0] = _data[_i0];
      }
      __q_canBeChanged__ = true;
    }
    if ("qDot".equals(_variable)) {
      double[] _data = (double[]) getValue("qDot").getObject();
      int _n0 = _data.length;
      if (_n0>_model.qDot.length) _n0 = _model.qDot.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.qDot[_i0] = _data[_i0];
      }
      __qDot_canBeChanged__ = true;
    }
    if ("t".equals(_variable)) {
      _model.t = getDouble("t"); // Variables.Dynamic Vars:3
      __t_canBeChanged__ = true;
    }
    if ("dt".equals(_variable)) {
      _model.dt = getDouble("dt"); // Variables.Dynamic Vars:4
      __dt_canBeChanged__ = true;
    }
    if ("tol".equals(_variable)) {
      _model.tol = getDouble("tol"); // Variables.Dynamic Vars:5
      __tol_canBeChanged__ = true;
    }
    if ("showBodyTrail".equals(_variable)) {
      _model.showBodyTrail = getBoolean("showBodyTrail"); // Variables.Rotor Vars:1
      __showBodyTrail_canBeChanged__ = true;
    }
    if ("showSpace".equals(_variable)) {
      _model.showSpace = getBoolean("showSpace"); // Variables.Rotor Vars:2
      __showSpace_canBeChanged__ = true;
    }
    if ("showVectors".equals(_variable)) {
      _model.showVectors = getBoolean("showVectors"); // Variables.Rotor Vars:3
      __showVectors_canBeChanged__ = true;
    }
    if ("showRotor".equals(_variable)) {
      _model.showRotor = getBoolean("showRotor"); // Variables.Rotor Vars:4
      __showRotor_canBeChanged__ = true;
    }
    if ("boundingBox".equals(_variable)) {
      _model.boundingBox = getDouble("boundingBox"); // Variables.Rotor Vars:5
      __boundingBox_canBeChanged__ = true;
    }
    if ("size".equals(_variable)) {
      _model.size = getDouble("size"); // Variables.Rotor Vars:6
      __size_canBeChanged__ = true;
    }
    if ("m".equals(_variable)) {
      _model.m = getDouble("m"); // Variables.Rotor Vars:7
      __m_canBeChanged__ = true;
    }
    if ("g".equals(_variable)) {
      _model.g = getDouble("g"); // Variables.Rotor Vars:8
      __g_canBeChanged__ = true;
    }
    if ("z0".equals(_variable)) {
      _model.z0 = getDouble("z0"); // Variables.Rotor Vars:9
      __z0_canBeChanged__ = true;
    }
    if ("R".equals(_variable)) {
      _model.R = getDouble("R"); // Variables.Rotor Vars:10
      __R_canBeChanged__ = true;
    }
    if ("a".equals(_variable)) {
      _model.a = getDouble("a"); // Variables.Rotor Vars:11
      __a_canBeChanged__ = true;
    }
    if ("b".equals(_variable)) {
      _model.b = getDouble("b"); // Variables.Rotor Vars:12
      __b_canBeChanged__ = true;
    }
    if ("c".equals(_variable)) {
      _model.c = getDouble("c"); // Variables.Rotor Vars:13
      __c_canBeChanged__ = true;
    }
    if ("I1".equals(_variable)) {
      _model.I1 = getDouble("I1"); // Variables.Rotor Vars:14
      __I1_canBeChanged__ = true;
    }
    if ("I2".equals(_variable)) {
      _model.I2 = getDouble("I2"); // Variables.Rotor Vars:15
      __I2_canBeChanged__ = true;
    }
    if ("I3".equals(_variable)) {
      _model.I3 = getDouble("I3"); // Variables.Rotor Vars:16
      __I3_canBeChanged__ = true;
    }
    if ("showElevationPlot".equals(_variable)) {
      _model.showElevationPlot = getBoolean("showElevationPlot"); // Variables.Vector Vars:1
      __showElevationPlot_canBeChanged__ = true;
    }
    if ("axisElevation".equals(_variable)) {
      _model.axisElevation = getDouble("axisElevation"); // Variables.Vector Vars:2
      __axisElevation_canBeChanged__ = true;
    }
    if ("momentumElevation".equals(_variable)) {
      _model.momentumElevation = getDouble("momentumElevation"); // Variables.Vector Vars:3
      __momentumElevation_canBeChanged__ = true;
    }
    if ("arrowScale".equals(_variable)) {
      _model.arrowScale = getDouble("arrowScale"); // Variables.Vector Vars:4
      __arrowScale_canBeChanged__ = true;
    }
    if ("tilt".equals(_variable)) {
      _model.tilt = getDouble("tilt"); // Variables.Vector Vars:5
      __tilt_canBeChanged__ = true;
    }
    if ("omegaOne".equals(_variable)) {
      _model.omegaOne = getDouble("omegaOne"); // Variables.Vector Vars:6
      __omegaOne_canBeChanged__ = true;
    }
    if ("omegaThree".equals(_variable)) {
      _model.omegaThree = getDouble("omegaThree"); // Variables.Vector Vars:7
      __omegaThree_canBeChanged__ = true;
    }
    if ("omega".equals(_variable)) {
      double[] _data = (double[]) getValue("omega").getObject();
      int _n0 = _data.length;
      if (_n0>_model.omega.length) _n0 = _model.omega.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.omega[_i0] = _data[_i0];
      }
      __omega_canBeChanged__ = true;
    }
    if ("angularMomentum".equals(_variable)) {
      double[] _data = (double[]) getValue("angularMomentum").getObject();
      int _n0 = _data.length;
      if (_n0>_model.angularMomentum.length) _n0 = _model.angularMomentum.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.angularMomentum[_i0] = _data[_i0];
      }
      __angularMomentum_canBeChanged__ = true;
    }
    if ("torque".equals(_variable)) {
      double[] _data = (double[]) getValue("torque").getObject();
      int _n0 = _data.length;
      if (_n0>_model.torque.length) _n0 = _model.torque.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.torque[_i0] = _data[_i0];
      }
      __torque_canBeChanged__ = true;
    }
    if ("shaftTip".equals(_variable)) {
      double[] _data = (double[]) getValue("shaftTip").getObject();
      int _n0 = _data.length;
      if (_n0>_model.shaftTip.length) _n0 = _model.shaftTip.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.shaftTip[_i0] = _data[_i0];
      }
      __shaftTip_canBeChanged__ = true;
    }
  }

  public void propagateValues () {
    setValue ("_isPlaying",_simulation.isPlaying());
    setValue ("_isPaused", _simulation.isPaused());
    if(__q_canBeChanged__) setValue("q",_model.q); // Variables.Dynamic Vars:1
    if(__qDot_canBeChanged__) setValue("qDot",_model.qDot); // Variables.Dynamic Vars:2
    if(__t_canBeChanged__) setValue("t",_model.t); // Variables.Dynamic Vars:3
    if(__dt_canBeChanged__) setValue("dt",_model.dt); // Variables.Dynamic Vars:4
    if(__tol_canBeChanged__) setValue("tol",_model.tol); // Variables.Dynamic Vars:5
    if(__showBodyTrail_canBeChanged__) setValue("showBodyTrail",_model.showBodyTrail); // Variables.Rotor Vars:1
    if(__showSpace_canBeChanged__) setValue("showSpace",_model.showSpace); // Variables.Rotor Vars:2
    if(__showVectors_canBeChanged__) setValue("showVectors",_model.showVectors); // Variables.Rotor Vars:3
    if(__showRotor_canBeChanged__) setValue("showRotor",_model.showRotor); // Variables.Rotor Vars:4
    if(__boundingBox_canBeChanged__) setValue("boundingBox",_model.boundingBox); // Variables.Rotor Vars:5
    if(__size_canBeChanged__) setValue("size",_model.size); // Variables.Rotor Vars:6
    if(__m_canBeChanged__) setValue("m",_model.m); // Variables.Rotor Vars:7
    if(__g_canBeChanged__) setValue("g",_model.g); // Variables.Rotor Vars:8
    if(__z0_canBeChanged__) setValue("z0",_model.z0); // Variables.Rotor Vars:9
    if(__R_canBeChanged__) setValue("R",_model.R); // Variables.Rotor Vars:10
    if(__a_canBeChanged__) setValue("a",_model.a); // Variables.Rotor Vars:11
    if(__b_canBeChanged__) setValue("b",_model.b); // Variables.Rotor Vars:12
    if(__c_canBeChanged__) setValue("c",_model.c); // Variables.Rotor Vars:13
    if(__I1_canBeChanged__) setValue("I1",_model.I1); // Variables.Rotor Vars:14
    if(__I2_canBeChanged__) setValue("I2",_model.I2); // Variables.Rotor Vars:15
    if(__I3_canBeChanged__) setValue("I3",_model.I3); // Variables.Rotor Vars:16
    if(__showElevationPlot_canBeChanged__) setValue("showElevationPlot",_model.showElevationPlot); // Variables.Vector Vars:1
    if(__axisElevation_canBeChanged__) setValue("axisElevation",_model.axisElevation); // Variables.Vector Vars:2
    if(__momentumElevation_canBeChanged__) setValue("momentumElevation",_model.momentumElevation); // Variables.Vector Vars:3
    if(__arrowScale_canBeChanged__) setValue("arrowScale",_model.arrowScale); // Variables.Vector Vars:4
    if(__tilt_canBeChanged__) setValue("tilt",_model.tilt); // Variables.Vector Vars:5
    if(__omegaOne_canBeChanged__) setValue("omegaOne",_model.omegaOne); // Variables.Vector Vars:6
    if(__omegaThree_canBeChanged__) setValue("omegaThree",_model.omegaThree); // Variables.Vector Vars:7
    if(__omega_canBeChanged__) setValue("omega",_model.omega); // Variables.Vector Vars:8
    if(__angularMomentum_canBeChanged__) setValue("angularMomentum",_model.angularMomentum); // Variables.Vector Vars:9
    if(__torque_canBeChanged__) setValue("torque",_model.torque); // Variables.Vector Vars:10
    if(__shaftTip_canBeChanged__) setValue("shaftTip",_model.shaftTip); // Variables.Vector Vars:11
  }

  @SuppressWarnings("unchecked")
  public void blockVariable(String _variable) {
    if ("q".equals(_variable)) __q_canBeChanged__ = false; // Variables.Dynamic Vars:1
    if ("qDot".equals(_variable)) __qDot_canBeChanged__ = false; // Variables.Dynamic Vars:2
    if ("t".equals(_variable)) __t_canBeChanged__ = false; // Variables.Dynamic Vars:3
    if ("dt".equals(_variable)) __dt_canBeChanged__ = false; // Variables.Dynamic Vars:4
    if ("tol".equals(_variable)) __tol_canBeChanged__ = false; // Variables.Dynamic Vars:5
    if ("showBodyTrail".equals(_variable)) __showBodyTrail_canBeChanged__ = false; // Variables.Rotor Vars:1
    if ("showSpace".equals(_variable)) __showSpace_canBeChanged__ = false; // Variables.Rotor Vars:2
    if ("showVectors".equals(_variable)) __showVectors_canBeChanged__ = false; // Variables.Rotor Vars:3
    if ("showRotor".equals(_variable)) __showRotor_canBeChanged__ = false; // Variables.Rotor Vars:4
    if ("boundingBox".equals(_variable)) __boundingBox_canBeChanged__ = false; // Variables.Rotor Vars:5
    if ("size".equals(_variable)) __size_canBeChanged__ = false; // Variables.Rotor Vars:6
    if ("m".equals(_variable)) __m_canBeChanged__ = false; // Variables.Rotor Vars:7
    if ("g".equals(_variable)) __g_canBeChanged__ = false; // Variables.Rotor Vars:8
    if ("z0".equals(_variable)) __z0_canBeChanged__ = false; // Variables.Rotor Vars:9
    if ("R".equals(_variable)) __R_canBeChanged__ = false; // Variables.Rotor Vars:10
    if ("a".equals(_variable)) __a_canBeChanged__ = false; // Variables.Rotor Vars:11
    if ("b".equals(_variable)) __b_canBeChanged__ = false; // Variables.Rotor Vars:12
    if ("c".equals(_variable)) __c_canBeChanged__ = false; // Variables.Rotor Vars:13
    if ("I1".equals(_variable)) __I1_canBeChanged__ = false; // Variables.Rotor Vars:14
    if ("I2".equals(_variable)) __I2_canBeChanged__ = false; // Variables.Rotor Vars:15
    if ("I3".equals(_variable)) __I3_canBeChanged__ = false; // Variables.Rotor Vars:16
    if ("showElevationPlot".equals(_variable)) __showElevationPlot_canBeChanged__ = false; // Variables.Vector Vars:1
    if ("axisElevation".equals(_variable)) __axisElevation_canBeChanged__ = false; // Variables.Vector Vars:2
    if ("momentumElevation".equals(_variable)) __momentumElevation_canBeChanged__ = false; // Variables.Vector Vars:3
    if ("arrowScale".equals(_variable)) __arrowScale_canBeChanged__ = false; // Variables.Vector Vars:4
    if ("tilt".equals(_variable)) __tilt_canBeChanged__ = false; // Variables.Vector Vars:5
    if ("omegaOne".equals(_variable)) __omegaOne_canBeChanged__ = false; // Variables.Vector Vars:6
    if ("omegaThree".equals(_variable)) __omegaThree_canBeChanged__ = false; // Variables.Vector Vars:7
    if ("omega".equals(_variable)) __omega_canBeChanged__ = false; // Variables.Vector Vars:8
    if ("angularMomentum".equals(_variable)) __angularMomentum_canBeChanged__ = false; // Variables.Vector Vars:9
    if ("torque".equals(_variable)) __torque_canBeChanged__ = false; // Variables.Vector Vars:10
    if ("shaftTip".equals(_variable)) __shaftTip_canBeChanged__ = false; // Variables.Vector Vars:11
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
      .setProperty("title","Gyroscope")
      .setProperty("layout","border")
      .setProperty("visible","true")
      .setProperty("location","10,23")
      .setProperty("size","554,540")
      .getObject();
    upperPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"upperPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","mainFrame")
      .setProperty("layout","BORDER:0,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    showPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"showPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","upperPanel")
      .setProperty("layout","FLOW:right,0,0")
      .getObject();
    showLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"showLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","showPanel")
      .setProperty("text","   Show: ")
      .getObject();
    showRotorCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showRotorCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","showPanel")
      .setProperty("variable","showRotor")
      .setProperty("text","rotor")
      .getObject();
    showSpaceCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showSpaceCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","showPanel")
      .setProperty("variable","showSpace")
      .setProperty("text","space")
      .getObject();
    showBodyTrailCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showBodyTrailCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","showPanel")
      .setProperty("variable","showBodyTrail")
      .setProperty("text","trail")
      .getObject();
    showVectors = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showVectors")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","showPanel")
      .setProperty("variable","showVectors")
      .setProperty("text","vectors")
      .getObject();
    elevation = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"elevation")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","showPanel")
      .setProperty("variable","showElevationPlot")
      .setProperty("text","elevation")
      .setProperty("tooltip","Shows the elevation angle plot")
      .getObject();
    rotorPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"rotorPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","upperPanel")
      .setProperty("layout","FLOW:center,0,0")
      .getObject();
    radiusPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"radiusPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","rotorPanel")
      .setProperty("layout","border")
      .getObject();
    radiusLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"radiusLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","radiusPanel")
      .setProperty("text"," R = ")
      .getObject();
    radiusField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"radiusField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","radiusPanel")
      .setProperty("variable","R")
      .setProperty("format","0.0#")
      .setProperty("action","_model._method_for_radiusField_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Rotor radius")
      .getObject();
    z0Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"z0Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","rotorPanel")
      .setProperty("layout","border")
      .getObject();
    z0Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"z0Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","z0Panel")
      .setProperty("text"," z0 = ")
      .getObject();
    z0Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"z0Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","z0Panel")
      .setProperty("variable","z0")
      .setProperty("format","0.0#")
      .setProperty("action","_model._method_for_z0Field_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Rotor position on shaft")
      .getObject();
    spaceViewDrawingPanel3D = (org.opensourcephysics.drawing3d.DrawingPanel3D)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlDrawingPanel3D(),"spaceViewDrawingPanel3D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","mainFrame")
      .setProperty("minimumX","%_model._method_for_spaceViewDrawingPanel3D_minimumX()%" )
      .setProperty("maximumX","boundingBox")
      .setProperty("minimumY","%_model._method_for_spaceViewDrawingPanel3D_minimumY()%" )
      .setProperty("maximumY","boundingBox")
      .setProperty("minimumZ","%_model._method_for_spaceViewDrawingPanel3D_minimumZ()%" )
      .setProperty("maximumZ","boundingBox")
      .setProperty("projectionMode","PERSPECTIVE_ON")
      .setProperty("cameraAzimuth","-0.28000000000000025")
      .setProperty("cameraAltitude","-0.06772081470552319")
      .setProperty("cameraFocusX","0.0")
      .setProperty("cameraFocusY","-1.3877787807814457E-17")
      .setProperty("cameraFocusZ","0.12000000000000002")
      .setProperty("cameraRotation","0.0")
      .setProperty("cameraDistanceToScreen","15.080000000000002")
      .setProperty("implementation","SIMPLE3D")
      .setProperty("decorationType","NONE")
      .setProperty("allowQuickRedraw","false")
      .getObject();
    rotorGroup = (org.opensourcephysics.drawing3d.Group)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlGroup3D(),"rotorGroup")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceViewDrawingPanel3D")
      .getObject();
    quaternion3D = (org.opensourcephysics.drawing3d.utils.transformations.QuaternionRotation)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.utils.ControlQuaternionTransformation(),"quaternion3D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","rotorGroup")
      .setProperty("q","q")
      .getObject();
    shaftArrow = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlArrow3D(),"shaftArrow")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","rotorGroup")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("z","0")
      .setProperty("sizeX","0")
      .setProperty("sizeY","0")
      .setProperty("sizeZ","size")
      .setProperty("visible","showBodyTrail")
      .setProperty("fillColor","RED")
      .setProperty("lineWidth","2")
      .getObject();
    rotor = (org.opensourcephysics.drawing3d.ElementEllipsoid)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlEllipsoid3D(),"rotor")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","rotorGroup")
      .setProperty("z","z0")
      .setProperty("sizeX","a")
      .setProperty("sizeY","b")
      .setProperty("sizeZ","c")
      .setProperty("visible","showRotor")
      .setProperty("fillColor","RED")
      .setProperty("resolution","5,60,5")
      .getObject();
    shaft = (org.opensourcephysics.drawing3d.ElementCylinder)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlCylinder3D(),"shaft")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","rotorGroup")
      .setProperty("z","%_model._method_for_shaft_z()%" )
      .setProperty("sizeX","%_model._method_for_shaft_sizeX()%" )
      .setProperty("sizeY","%_model._method_for_shaft_sizeY()%" )
      .setProperty("sizeZ","%_model._method_for_shaft_sizeZ()%" )
      .setProperty("visible","showRotor")
      .setProperty("fillColor","RED")
      .getObject();
    vectorGroup = (org.opensourcephysics.drawing3d.Group)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlGroup3D(),"vectorGroup")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","rotorGroup")
      .setProperty("visible","showVectors")
      .getObject();
    angularMomentumVector = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlArrow3D(),"angularMomentumVector")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","vectorGroup")
      .setProperty("size","angularMomentum")
      .setProperty("fillColor","YELLOW")
      .setProperty("lineWidth","2")
      .setProperty("resolution","20")
      .getObject();
    angularMomentumText = (org.opensourcephysics.drawing3d.ElementText)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlText3D(),"angularMomentumText")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","vectorGroup")
      .setProperty("x","%_model._method_for_angularMomentumText_x()%" )
      .setProperty("y","%_model._method_for_angularMomentumText_y()%" )
      .setProperty("z","%_model._method_for_angularMomentumText_z()%" )
      .setProperty("pixelSize","true")
      .setProperty("text","L")
      .getObject();
    torqueVector = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlArrow3D(),"torqueVector")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","vectorGroup")
      .setProperty("position","angularMomentum")
      .setProperty("size","torque")
      .setProperty("visible","%_model._method_for_torqueVector_visible()%" )
      .setProperty("fillColor","GREEN")
      .setProperty("lineWidth","2")
      .getObject();
    torqueText = (org.opensourcephysics.drawing3d.ElementText)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlText3D(),"torqueText")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","vectorGroup")
      .setProperty("x","%_model._method_for_torqueText_x()%" )
      .setProperty("y","%_model._method_for_torqueText_y()%" )
      .setProperty("z","%_model._method_for_torqueText_z()%" )
      .setProperty("pixelSize","true")
      .setProperty("visible","%_model._method_for_torqueText_visible()%" )
      .setProperty("text","N")
      .getObject();
    omegaVector = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlArrow3D(),"omegaVector")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","vectorGroup")
      .setProperty("sizeX","%_model._method_for_omegaVector_sizeX()%" )
      .setProperty("sizeY","%_model._method_for_omegaVector_sizeY()%" )
      .setProperty("sizeZ","%_model._method_for_omegaVector_sizeZ()%" )
      .setProperty("fillColor","BLUE")
      .setProperty("lineWidth","2")
      .getObject();
    omegaText = (org.opensourcephysics.drawing3d.ElementText)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlText3D(),"omegaText")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","vectorGroup")
      .setProperty("x","%_model._method_for_omegaText_x()%" )
      .setProperty("y","%_model._method_for_omegaText_y()%" )
      .setProperty("z","%_model._method_for_omegaText_z()%" )
      .setProperty("pixelSize","true")
      .setProperty("text","$\\omega$")
      .getObject();
    baseCylinder = (org.opensourcephysics.drawing3d.ElementCylinder)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlCylinder3D(),"baseCylinder")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceViewDrawingPanel3D")
      .setProperty("z","%_model._method_for_baseCylinder_z()%" )
      .setProperty("sizeX","%_model._method_for_baseCylinder_sizeX()%" )
      .setProperty("sizeY","%_model._method_for_baseCylinder_sizeY()%" )
      .setProperty("sizeZ","0.1")
      .setProperty("visible","showSpace")
      .setProperty("fillColor","LIGHTGRAY")
      .getObject();
    postCylinder = (org.opensourcephysics.drawing3d.ElementCylinder)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlCylinder3D(),"postCylinder")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceViewDrawingPanel3D")
      .setProperty("z","%_model._method_for_postCylinder_z()%" )
      .setProperty("sizeX","%_model._method_for_postCylinder_sizeX()%" )
      .setProperty("sizeY","%_model._method_for_postCylinder_sizeY()%" )
      .setProperty("sizeZ","%_model._method_for_postCylinder_sizeZ()%" )
      .setProperty("visible","showSpace")
      .setProperty("fillColor","LIGHTGRAY")
      .getObject();
    shaftTrail = (org.opensourcephysics.drawing3d.MultiTrail)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlTrail3D(),"shaftTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceViewDrawingPanel3D")
      .setProperty("inputX","%_model._method_for_shaftTrail_inputX()%" )
      .setProperty("inputY","%_model._method_for_shaftTrail_inputY()%" )
      .setProperty("inputZ","%_model._method_for_shaftTrail_inputZ()%" )
      .setProperty("visible","showBodyTrail")
      .setProperty("lineColor","175,96,128,255")
      .setProperty("lineWidth","2")
      .getObject();
    spaceAxisGroup = (org.opensourcephysics.drawing3d.Group)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlGroup3D(),"spaceAxisGroup")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceViewDrawingPanel3D")
      .setProperty("x","%_model._method_for_spaceAxisGroup_x()%" )
      .setProperty("z","%_model._method_for_spaceAxisGroup_z()%" )
      .setProperty("visible","showSpace")
      .getObject();
    xArrow3D2 = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlArrow3D(),"xArrow3D2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceAxisGroup")
      .setProperty("x","0")
      .setProperty("y","%_model._method_for_xArrow3D2_y()%" )
      .setProperty("z","0")
      .setProperty("sizeX","%_model._method_for_xArrow3D2_sizeX()%" )
      .setProperty("sizeY","0")
      .setProperty("sizeZ","0")
      .setProperty("fillColor","RED")
      .setProperty("lineWidth","2")
      .getObject();
    yArrow3D2 = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlArrow3D(),"yArrow3D2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceAxisGroup")
      .setProperty("x","0")
      .setProperty("y","%_model._method_for_yArrow3D2_y()%" )
      .setProperty("z","0")
      .setProperty("sizeX","0")
      .setProperty("sizeY","%_model._method_for_yArrow3D2_sizeY()%" )
      .setProperty("sizeZ","0")
      .setProperty("fillColor","GREEN")
      .setProperty("lineWidth","2")
      .getObject();
    zArrow3D2 = (org.opensourcephysics.drawing3d.ElementArrow)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlArrow3D(),"zArrow3D2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceAxisGroup")
      .setProperty("x","0")
      .setProperty("y","%_model._method_for_zArrow3D2_y()%" )
      .setProperty("z","0")
      .setProperty("sizeX","0")
      .setProperty("sizeY","0")
      .setProperty("sizeZ","%_model._method_for_zArrow3D2_sizeZ()%" )
      .setProperty("fillColor","BLUE")
      .setProperty("lineWidth","2")
      .getObject();
    xText2 = (org.opensourcephysics.drawing3d.ElementText)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlText3D(),"xText2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceAxisGroup")
      .setProperty("x","%_model._method_for_xText2_x()%" )
      .setProperty("y","%_model._method_for_xText2_y()%" )
      .setProperty("z","0")
      .setProperty("text","X")
      .getObject();
    yText2 = (org.opensourcephysics.drawing3d.ElementText)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlText3D(),"yText2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceAxisGroup")
      .setProperty("x","0")
      .setProperty("y","%_model._method_for_yText2_y()%" )
      .setProperty("z","0")
      .setProperty("text","Y")
      .getObject();
    zText2 = (org.opensourcephysics.drawing3d.ElementText)
      addElement(new org.opensourcephysics.ejs.control.drawing3d.ControlText3D(),"zText2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","spaceAxisGroup")
      .setProperty("x","0")
      .setProperty("y","%_model._method_for_zText2_y()%" )
      .setProperty("z","%_model._method_for_zText2_z()%" )
      .setProperty("text","Z")
      .getObject();
    controlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"controlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","mainFrame")
      .setProperty("layout","BORDER:0,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    buttonPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"buttonPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","controlPanel")
      .setProperty("layout","GRID:1,3,0,0")
      .setProperty("size","150,23")
      .getObject();
    startButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"startButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","buttonPanel")
      .setProperty("variable","_isPaused")
      .setProperty("tooltip","Starts and stops the simulation")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("actionOn","_model._method_for_startButton_actionOn()" )
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif")
      .setProperty("actionOff","_model._method_for_startButton_actionOff()" )
      .getObject();
    stepButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"stepButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif")
      .setProperty("action","_model._method_for_stepButton_action()" )
      .setProperty("tooltip","Single steps the simulation")
      .getObject();
    resetTimeButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetTimeButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("action","_model._method_for_resetTimeButton_action()" )
      .setProperty("tooltip","Resets the time without chagning the inputs")
      .getObject();
    resetButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("action","_model._method_for_resetButton_action()" )
      .setProperty("tooltip","Resets the simulation")
      .getObject();
    inputPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"inputPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","controlPanel")
      .setProperty("layout","FLOW:right,0,0")
      .getObject();
    tiltPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"tiltPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","inputPanel")
      .setProperty("layout","border")
      .getObject();
    tiltLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tiltLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","tiltPanel")
      .setProperty("text"," $\\theta$ = ")
      .getObject();
    createControl50();
  }

  private void createControl50() {
    tiltField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"tiltField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","tiltPanel")
      .setProperty("variable","tilt")
      .setProperty("format","0.0#")
      .setProperty("action","_model._method_for_tiltField_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial tilt angle")
      .getObject();
    omegaOnePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"omegaOnePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","inputPanel")
      .setProperty("layout","border")
      .getObject();
    omegaOneLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"omegaOneLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","omegaOnePanel")
      .setProperty("text"," $\\omega$1 = ")
      .getObject();
    omegaOneField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"omegaOneField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","omegaOnePanel")
      .setProperty("variable","omegaOne")
      .setProperty("format","0.0#")
      .setProperty("action","_model._method_for_omegaOneField_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial angular velocity perpendicular to shaft in radians/s")
      .getObject();
    omegaThreePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"omegaThreePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","inputPanel")
      .setProperty("layout","border")
      .getObject();
    omegaThreeLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"omegaThreeLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","omegaThreePanel")
      .setProperty("text"," $\\omega$3 = ")
      .getObject();
    omegaThreeField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"omegaThreeField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","omegaThreePanel")
      .setProperty("variable","omegaThree")
      .setProperty("format","0.0#")
      .setProperty("action","_model._method_for_omegaThreeField_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial angular velocity parallel to shaft in radians/s")
      .getObject();
    dtPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"dtPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","inputPanel")
      .setProperty("layout","border")
      .getObject();
    dtLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"dtLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","dtPanel")
      .setProperty("text"," $\\Delta$t = ")
      .getObject();
    dtField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"dtField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","dtPanel")
      .setProperty("variable","dt")
      .setProperty("format","0.0#")
      .setProperty("action","_model._method_for_dtField_action()" )
      .setProperty("columns","2")
      .setProperty("size","0,25")
      .setProperty("tooltip","Time step")
      .getObject();
    tPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"tPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","inputPanel")
      .setProperty("layout","border")
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
      .setProperty("format","0.##")
      .setProperty("editable","false")
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Time")
      .getObject();
    checkPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"checkPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","controlPanel")
      .setProperty("layout","FLOW:right,0,0")
      .getObject();
    gravityCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"gravityCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","checkPanel")
      .setProperty("text","gravity")
      .setProperty("actionon","_model._method_for_gravityCheck_actionon()" )
      .setProperty("actionoff","_model._method_for_gravityCheck_actionoff()" )
      .setProperty("tooltip","Turns gravity on and off")
      .getObject();
    elevationDialog = (javax.swing.JDialog)
      addElement(new org.colos.ejs.library.control.swing.ControlDialog(),"elevationDialog")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Elevation Angle")
      .setProperty("layout","border")
      .setProperty("visible","showElevationPlot")
      .setProperty("location","9,596")
      .setProperty("size","660,358")
      .getObject();
    elevationPlottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"elevationPlottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","elevationDialog")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("title","Axis and Angular Momentum Elevation")
      .setProperty("titleX","t")
      .setProperty("titleY","elevation angle")
      .getObject();
    axisElevationTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.opensourcephysics.ejs.control.drawing2d.ControlTrail2D(),"axisElevationTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","elevationPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","axisElevation")
      .setProperty("maximumPoints","2000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .getObject();
    momentumElevationTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.opensourcephysics.ejs.control.drawing2d.ControlTrail2D(),"momentumElevationTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","elevationPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","momentumElevation")
      .setProperty("maximumPoints","2000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","196,196,0,255")
      .setProperty("lineWidth","2")
      .getObject();
  }

// ---------- Resetting the interface  -------------------

  public void reset() {
    getElement("mainFrame")
      .setProperty("title","Gyroscope")
      .setProperty("visible","true");
    getElement("upperPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("showPanel");
    getElement("showLabel")
      .setProperty("text","   Show: ");
    getElement("showRotorCheck")
      .setProperty("text","rotor");
    getElement("showSpaceCheck")
      .setProperty("text","space");
    getElement("showBodyTrailCheck")
      .setProperty("text","trail");
    getElement("showVectors")
      .setProperty("text","vectors");
    getElement("elevation")
      .setProperty("text","elevation")
      .setProperty("tooltip","Shows the elevation angle plot");
    getElement("rotorPanel");
    getElement("radiusPanel");
    getElement("radiusLabel")
      .setProperty("text"," R = ");
    getElement("radiusField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Rotor radius");
    getElement("z0Panel");
    getElement("z0Label")
      .setProperty("text"," z0 = ");
    getElement("z0Field")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Rotor position on shaft");
    getElement("spaceViewDrawingPanel3D")
      .setProperty("projectionMode","PERSPECTIVE_ON")
      .setProperty("cameraAzimuth","-0.28000000000000025")
      .setProperty("cameraAltitude","-0.06772081470552319")
      .setProperty("cameraFocusX","0.0")
      .setProperty("cameraFocusY","-1.3877787807814457E-17")
      .setProperty("cameraFocusZ","0.12000000000000002")
      .setProperty("cameraRotation","0.0")
      .setProperty("cameraDistanceToScreen","15.080000000000002")
      .setProperty("implementation","SIMPLE3D")
      .setProperty("decorationType","NONE")
      .setProperty("allowQuickRedraw","false");
    getElement("rotorGroup");
    getElement("quaternion3D");
    getElement("shaftArrow")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("z","0")
      .setProperty("sizeX","0")
      .setProperty("sizeY","0")
      .setProperty("fillColor","RED")
      .setProperty("lineWidth","2");
    getElement("rotor")
      .setProperty("fillColor","RED")
      .setProperty("resolution","5,60,5");
    getElement("shaft")
      .setProperty("fillColor","RED");
    getElement("vectorGroup");
    getElement("angularMomentumVector")
      .setProperty("fillColor","YELLOW")
      .setProperty("lineWidth","2")
      .setProperty("resolution","20");
    getElement("angularMomentumText")
      .setProperty("pixelSize","true")
      .setProperty("text","L");
    getElement("torqueVector")
      .setProperty("fillColor","GREEN")
      .setProperty("lineWidth","2");
    getElement("torqueText")
      .setProperty("pixelSize","true")
      .setProperty("text","N");
    getElement("omegaVector")
      .setProperty("fillColor","BLUE")
      .setProperty("lineWidth","2");
    getElement("omegaText")
      .setProperty("pixelSize","true")
      .setProperty("text","$\\omega$");
    getElement("baseCylinder")
      .setProperty("sizeZ","0.1")
      .setProperty("fillColor","LIGHTGRAY");
    getElement("postCylinder")
      .setProperty("fillColor","LIGHTGRAY");
    getElement("shaftTrail")
      .setProperty("lineColor","175,96,128,255")
      .setProperty("lineWidth","2");
    getElement("spaceAxisGroup");
    getElement("xArrow3D2")
      .setProperty("x","0")
      .setProperty("z","0")
      .setProperty("sizeY","0")
      .setProperty("sizeZ","0")
      .setProperty("fillColor","RED")
      .setProperty("lineWidth","2");
    getElement("yArrow3D2")
      .setProperty("x","0")
      .setProperty("z","0")
      .setProperty("sizeX","0")
      .setProperty("sizeZ","0")
      .setProperty("fillColor","GREEN")
      .setProperty("lineWidth","2");
    getElement("zArrow3D2")
      .setProperty("x","0")
      .setProperty("z","0")
      .setProperty("sizeX","0")
      .setProperty("sizeY","0")
      .setProperty("fillColor","BLUE")
      .setProperty("lineWidth","2");
    getElement("xText2")
      .setProperty("z","0")
      .setProperty("text","X");
    getElement("yText2")
      .setProperty("x","0")
      .setProperty("z","0")
      .setProperty("text","Y");
    getElement("zText2")
      .setProperty("x","0")
      .setProperty("text","Z");
    getElement("controlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("buttonPanel")
      .setProperty("size","150,23");
    getElement("startButton")
      .setProperty("tooltip","Starts and stops the simulation")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    getElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif")
      .setProperty("tooltip","Single steps the simulation");
    getElement("resetTimeButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Resets the time without chagning the inputs");
    getElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Resets the simulation");
    getElement("inputPanel");
    getElement("tiltPanel");
    getElement("tiltLabel")
      .setProperty("text"," $\\theta$ = ");
    getElement("tiltField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial tilt angle");
    getElement("omegaOnePanel");
    getElement("omegaOneLabel")
      .setProperty("text"," $\\omega$1 = ");
    getElement("omegaOneField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial angular velocity perpendicular to shaft in radians/s");
    getElement("omegaThreePanel");
    getElement("omegaThreeLabel")
      .setProperty("text"," $\\omega$3 = ");
    getElement("omegaThreeField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial angular velocity parallel to shaft in radians/s");
    getElement("dtPanel");
    getElement("dtLabel")
      .setProperty("text"," $\\Delta$t = ");
    getElement("dtField")
      .setProperty("format","0.0#")
      .setProperty("columns","2")
      .setProperty("size","0,25")
      .setProperty("tooltip","Time step");
    getElement("tPanel");
    getElement("tLabel")
      .setProperty("text"," t = ");
    getElement("tField")
      .setProperty("format","0.##")
      .setProperty("editable","false")
      .setProperty("columns","3")
      .setProperty("size","0,25")
      .setProperty("tooltip","Time");
    getElement("checkPanel");
    getElement("gravityCheck")
      .setProperty("text","gravity")
      .setProperty("tooltip","Turns gravity on and off");
    getElement("elevationDialog")
      .setProperty("title","Elevation Angle");
    getElement("elevationPlottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("title","Axis and Angular Momentum Elevation")
      .setProperty("titleX","t")
      .setProperty("titleY","elevation angle");
    getElement("axisElevationTrail")
      .setProperty("maximumPoints","2000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2");
    getElement("momentumElevationTrail")
      .setProperty("maximumPoints","2000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","196,196,0,255")
      .setProperty("lineWidth","2");
    __q_canBeChanged__ = true; // Variables.Dynamic Vars:1
    __qDot_canBeChanged__ = true; // Variables.Dynamic Vars:2
    __t_canBeChanged__ = true; // Variables.Dynamic Vars:3
    __dt_canBeChanged__ = true; // Variables.Dynamic Vars:4
    __tol_canBeChanged__ = true; // Variables.Dynamic Vars:5
    __showBodyTrail_canBeChanged__ = true; // Variables.Rotor Vars:1
    __showSpace_canBeChanged__ = true; // Variables.Rotor Vars:2
    __showVectors_canBeChanged__ = true; // Variables.Rotor Vars:3
    __showRotor_canBeChanged__ = true; // Variables.Rotor Vars:4
    __boundingBox_canBeChanged__ = true; // Variables.Rotor Vars:5
    __size_canBeChanged__ = true; // Variables.Rotor Vars:6
    __m_canBeChanged__ = true; // Variables.Rotor Vars:7
    __g_canBeChanged__ = true; // Variables.Rotor Vars:8
    __z0_canBeChanged__ = true; // Variables.Rotor Vars:9
    __R_canBeChanged__ = true; // Variables.Rotor Vars:10
    __a_canBeChanged__ = true; // Variables.Rotor Vars:11
    __b_canBeChanged__ = true; // Variables.Rotor Vars:12
    __c_canBeChanged__ = true; // Variables.Rotor Vars:13
    __I1_canBeChanged__ = true; // Variables.Rotor Vars:14
    __I2_canBeChanged__ = true; // Variables.Rotor Vars:15
    __I3_canBeChanged__ = true; // Variables.Rotor Vars:16
    __showElevationPlot_canBeChanged__ = true; // Variables.Vector Vars:1
    __axisElevation_canBeChanged__ = true; // Variables.Vector Vars:2
    __momentumElevation_canBeChanged__ = true; // Variables.Vector Vars:3
    __arrowScale_canBeChanged__ = true; // Variables.Vector Vars:4
    __tilt_canBeChanged__ = true; // Variables.Vector Vars:5
    __omegaOne_canBeChanged__ = true; // Variables.Vector Vars:6
    __omegaThree_canBeChanged__ = true; // Variables.Vector Vars:7
    __omega_canBeChanged__ = true; // Variables.Vector Vars:8
    __angularMomentum_canBeChanged__ = true; // Variables.Vector Vars:9
    __torque_canBeChanged__ = true; // Variables.Vector Vars:10
    __shaftTip_canBeChanged__ = true; // Variables.Vector Vars:11
    super.reset();
  }

} // End of class GyroscopeView

