/*
 * Class : MassAndSpringView.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 180211. Visit http://www.um.es/fem/Ejs
 */ 

package massandspring;

import org.colos.ejs.library._EjsConstants;
import org.opensourcephysics.media.core.NumberField;

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

import org.colos.ejs.library.View;

class MassAndSpringView extends org.colos.ejs.library.control.EjsControl implements org.colos.ejs.library.View {
  private MassAndSpringSimulation _simulation=null;
  private MassAndSpring _model=null;

  // Public variables for wrapped view elements:
  public java.awt.Component frame;
  public org.opensourcephysics.drawing2d.DrawingPanel2D drawingPanel;
  public org.opensourcephysics.drawing2d.ElementShape wallShape2D;
  public org.opensourcephysics.drawing2d.ElementSpring spring2D;
  public org.opensourcephysics.drawing2d.ElementShape massShape2D;
  public javax.swing.JPanel controlPanel;
  public javax.swing.JPanel buttonsPanel;
  public javax.swing.JButton playPauseButton;
  public javax.swing.JButton resetButton;
  public javax.swing.JPanel parametersPanel;
  public javax.swing.JLabel kLabel;
  public javax.swing.JTextField kField;
  public javax.swing.JLabel energyLabel;
  public javax.swing.JTextField energyField;
  public javax.swing.JCheckBox showPlotCheckbox;
  public javax.swing.JDialog dialog;
  public org.opensourcephysics.drawing2d.PlottingPanel2D plottingPanel;
  public org.opensourcephysics.drawing2d.ElementTrail displacementTrail2D;
  public org.opensourcephysics.drawing2d.ElementTrail velocityTrail2D;

  // private variables to block changes in the view variables:
  private boolean __x_canBeChanged__ = true; // Variables.Dynamical Vars:1
  private boolean __vx_canBeChanged__ = true; // Variables.Dynamical Vars:2
  private boolean __t_canBeChanged__ = true; // Variables.Dynamical Vars:3
  private boolean __dt_canBeChanged__ = true; // Variables.Dynamical Vars:4
  private boolean __showPlot_canBeChanged__ = true; // Variables.Constants:1
  private boolean __y_canBeChanged__ = true; // Variables.Constants:2
  private boolean __m_canBeChanged__ = true; // Variables.Constants:3
  private boolean __k_canBeChanged__ = true; // Variables.Constants:4
  private boolean __L_canBeChanged__ = true; // Variables.Constants:5
  private boolean __T_canBeChanged__ = true; // Variables.Constrained Vars:1
  private boolean __V_canBeChanged__ = true; // Variables.Constrained Vars:2
  private boolean __E_canBeChanged__ = true; // Variables.Constrained Vars:3

// ---------- Class constructor -------------------

  public MassAndSpringView (MassAndSpringSimulation _sim, String _replaceName, java.awt.Frame _replaceOwnerFrame) {
    super(_sim,_replaceName,_replaceOwnerFrame);
    _simulation = _sim;
    _model = (MassAndSpring) _sim.getModel();
    _model._view = this;
    addTarget("_simulation",_simulation);
    addTarget("_model",_model);
    _model._resetModel();
    initialize();
    setUpdateSimulation(false);
    // The following is used by the JNLP file for the simulation to help find resources
    try { 
    	String base = System.getProperty("jnlp.codebase");
    	if (base != null)
    		setUserCodebase(new java.net.URL(base)); }
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
    addListener("x"); // Variables.Dynamical Vars:1
    addListener("vx"); // Variables.Dynamical Vars:2
    addListener("t"); // Variables.Dynamical Vars:3
    addListener("dt"); // Variables.Dynamical Vars:4
    addListener("showPlot"); // Variables.Constants:1
    addListener("y"); // Variables.Constants:2
    addListener("m"); // Variables.Constants:3
    addListener("k"); // Variables.Constants:4
    addListener("L"); // Variables.Constants:5
    addListener("T"); // Variables.Constrained Vars:1
    addListener("V"); // Variables.Constrained Vars:2
    addListener("E"); // Variables.Constrained Vars:3
  }

// ---------- Implementation of View -------------------

  public void read() {
    // Ejs requires no read(). Actually, having it might cause problems!
  }

  @SuppressWarnings("unchecked")
  public void read(String _variable) {
    if ("x".equals(_variable)) {
      _model.x = getDouble("x"); // Variables.Dynamical Vars:1
      __x_canBeChanged__ = true;
    }
    if ("vx".equals(_variable)) {
      _model.vx = getDouble("vx"); // Variables.Dynamical Vars:2
      __vx_canBeChanged__ = true;
    }
    if ("t".equals(_variable)) {
      _model.t = getDouble("t"); // Variables.Dynamical Vars:3
      __t_canBeChanged__ = true;
    }
    if ("dt".equals(_variable)) {
      _model.dt = getDouble("dt"); // Variables.Dynamical Vars:4
      __dt_canBeChanged__ = true;
    }
    if ("showPlot".equals(_variable)) {
      _model.showPlot = getBoolean("showPlot"); // Variables.Constants:1
      __showPlot_canBeChanged__ = true;
    }
    if ("y".equals(_variable)) {
      _model.y = getDouble("y"); // Variables.Constants:2
      __y_canBeChanged__ = true;
    }
    if ("m".equals(_variable)) {
      _model.m = getDouble("m"); // Variables.Constants:3
      __m_canBeChanged__ = true;
    }
    if ("k".equals(_variable)) {
      _model.k = getDouble("k"); // Variables.Constants:4
      __k_canBeChanged__ = true;
    }
    if ("L".equals(_variable)) {
      _model.L = getDouble("L"); // Variables.Constants:5
      __L_canBeChanged__ = true;
    }
    if ("T".equals(_variable)) {
      _model.T = getDouble("T"); // Variables.Constrained Vars:1
      __T_canBeChanged__ = true;
    }
    if ("V".equals(_variable)) {
      _model.V = getDouble("V"); // Variables.Constrained Vars:2
      __V_canBeChanged__ = true;
    }
    if ("E".equals(_variable)) {
      _model.E = getDouble("E"); // Variables.Constrained Vars:3
      __E_canBeChanged__ = true;
    }
  }

  public void propagateValues () {
    setValue ("_isPlaying",_simulation.isPlaying());
    setValue ("_isPaused", _simulation.isPaused());
    if(__x_canBeChanged__) setValue("x",_model.x); // Variables.Dynamical Vars:1
    if(__vx_canBeChanged__) setValue("vx",_model.vx); // Variables.Dynamical Vars:2
    if(__t_canBeChanged__) setValue("t",_model.t); // Variables.Dynamical Vars:3
    if(__dt_canBeChanged__) setValue("dt",_model.dt); // Variables.Dynamical Vars:4
    if(__showPlot_canBeChanged__) setValue("showPlot",_model.showPlot); // Variables.Constants:1
    if(__y_canBeChanged__) setValue("y",_model.y); // Variables.Constants:2
    if(__m_canBeChanged__) setValue("m",_model.m); // Variables.Constants:3
    if(__k_canBeChanged__) setValue("k",_model.k); // Variables.Constants:4
    if(__L_canBeChanged__) setValue("L",_model.L); // Variables.Constants:5
    if(__T_canBeChanged__) setValue("T",_model.T); // Variables.Constrained Vars:1
    if(__V_canBeChanged__) setValue("V",_model.V); // Variables.Constrained Vars:2
    if(__E_canBeChanged__) setValue("E",_model.E); // Variables.Constrained Vars:3
  }

  @SuppressWarnings("unchecked")
  public void blockVariable(String _variable) {
    if ("x".equals(_variable)) __x_canBeChanged__ = false; // Variables.Dynamical Vars:1
    if ("vx".equals(_variable)) __vx_canBeChanged__ = false; // Variables.Dynamical Vars:2
    if ("t".equals(_variable)) __t_canBeChanged__ = false; // Variables.Dynamical Vars:3
    if ("dt".equals(_variable)) __dt_canBeChanged__ = false; // Variables.Dynamical Vars:4
    if ("showPlot".equals(_variable)) __showPlot_canBeChanged__ = false; // Variables.Constants:1
    if ("y".equals(_variable)) __y_canBeChanged__ = false; // Variables.Constants:2
    if ("m".equals(_variable)) __m_canBeChanged__ = false; // Variables.Constants:3
    if ("k".equals(_variable)) __k_canBeChanged__ = false; // Variables.Constants:4
    if ("L".equals(_variable)) __L_canBeChanged__ = false; // Variables.Constants:5
    if ("T".equals(_variable)) __T_canBeChanged__ = false; // Variables.Constrained Vars:1
    if ("V".equals(_variable)) __V_canBeChanged__ = false; // Variables.Constrained Vars:2
    if ("E".equals(_variable)) __E_canBeChanged__ = false; // Variables.Constrained Vars:3
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
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"frame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("exit","true")
      .setProperty("waitForReset","true")
      .setProperty("title","Mass and Spring")
      .setProperty("layout","border")
      .setProperty("visible","true")
      .setProperty("location","0,23")
      .setProperty("size","383,330")
      .getObject();
    drawingPanel = (org.opensourcephysics.drawing2d.DrawingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlDrawingPanel(),"drawingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","frame")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("minimumX","0")
      .setProperty("maximumX","2")
      .setProperty("minimumY","-1.0")
      .setProperty("maximumY","1.0")
      .setProperty("square","true")
      .setProperty("BRmessage","%_model._method_for_drawingPanel_BRmessage()%" )
      .getObject();
    wallShape2D = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"wallShape2D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","drawingPanel")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("sizeX","0.2")
      .setProperty("sizeY","0.6")
      .setProperty("enabledPosition","false")
      .setProperty("style","RECTANGLE")
      .setProperty("fillColor","DARKGRAY")
      .getObject();
    spring2D = (org.opensourcephysics.drawing2d.ElementSpring)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlSpring2D(),"spring2D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","drawingPanel")
      .setProperty("x","0.1")
      .setProperty("y","0")
      .setProperty("sizeX","%_model._method_for_spring2D_sizeX()%" )
      .setProperty("sizeY","y")
      .setProperty("enabledSize","false")
      .setProperty("radius","0.05")
      .getObject();
    massShape2D = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"massShape2D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","drawingPanel")
      .setProperty("x","x")
      .setProperty("y","y")
      .setProperty("sizeX","0.2")
      .setProperty("sizeY","0.2")
      .setProperty("enabledPosition","%_model._method_for_massShape2D_enabledPosition()%" )
      .setProperty("dragAction","_model._method_for_massShape2D_dragAction()" )
      .setProperty("releaseAction","_model._method_for_massShape2D_releaseAction()" )
      .setProperty("style","ELLIPSE")
      .setProperty("fillColor","MAGENTA")
      .getObject();
    controlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"controlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","frame")
      .setProperty("layout","border:0,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    buttonsPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"buttonsPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","controlPanel")
      .setProperty("layout","grid:1,2,0,0")
      .getObject();
    playPauseButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"playPauseButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonsPanel")
      .setProperty("variable","_isPaused")
      .setProperty("tooltip","Play/Pause the simulation")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("actionOn","_model._method_for_playPauseButton_actionOn()" )
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif")
      .setProperty("actionOff","_model._method_for_playPauseButton_actionOff()" )
      .getObject();
    resetButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonsPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("action","_model._method_for_resetButton_action()" )
      .setProperty("tooltip","Reset the simulation")
      .getObject();
    parametersPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"parametersPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","controlPanel")
      .setProperty("layout","hbox")
      .getObject();
    kLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"kLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("text"," k = ")
      .getObject();
    kField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(
    		  org.colos.ejs.library.control.swing.ControlParsedNumberField.SIMPLE_DOCUMENT),"kField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("variable","k")
      .setProperty("format","0.###")
      .setProperty("editable","_isPaused")
      .getObject();
    energyLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"energyLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("text"," E = ")
      .getObject();
    energyField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(
    		  org.colos.ejs.library.control.swing.ControlParsedNumberField.SIMPLE_DOCUMENT),"energyField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("variable","E")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .getObject();
    showPlotCheckbox = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showPlotCheckbox")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","controlPanel")
      .setProperty("variable","showPlot")
      .setProperty("selected","true")
      .setProperty("text","Show Plot ")
      .getObject();
    dialog = (javax.swing.JDialog)
      addElement(new org.colos.ejs.library.control.swing.ControlDialog(),"dialog")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Time Evolution")
      .setProperty("layout","GRID:0,1")
      .setProperty("visible","showPlot")
      .setProperty("location","422,23")
      .setProperty("size","385,262")
      .getObject();
    plottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"plottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","dialog")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("minimumY","-1")
      .setProperty("maximumY","1")
      .setProperty("titleX","Time")
      .setProperty("titleY","Displacement and Velocity")
      .getObject();
    displacementTrail2D = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"displacementTrail2D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","plottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","%_model._method_for_displacementTrail2D_inputY()%" )
      .setProperty("maximumPoints","300")
      .setProperty("norepeat","true")
      .setProperty("connected","true")
      .setProperty("lineColor","BLUE")
      .getObject();
    velocityTrail2D = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"velocityTrail2D")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","plottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","vx")
      .setProperty("maximumPoints","300")
      .setProperty("norepeat","true")
      .setProperty("connected","true")
      .setProperty("lineColor","RED")
      .getObject();
  }

// ---------- Resetting the interface  -------------------

  public void reset() {
    getElement("frame")
      .setProperty("title","Mass and Spring")
      .setProperty("visible","true");
    getElement("drawingPanel")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("minimumX","0")
      .setProperty("maximumX","2")
      .setProperty("minimumY","-1.0")
      .setProperty("maximumY","1.0")
      .setProperty("square","true");
    getElement("wallShape2D")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("sizeX","0.2")
      .setProperty("sizeY","0.6")
      .setProperty("enabledPosition","false")
      .setProperty("style","RECTANGLE")
      .setProperty("fillColor","DARKGRAY");
    getElement("spring2D")
      .setProperty("x","0.1")
      .setProperty("y","0")
      .setProperty("enabledSize","false")
      .setProperty("radius","0.05");
    getElement("massShape2D")
      .setProperty("sizeX","0.2")
      .setProperty("sizeY","0.2")
      .setProperty("style","ELLIPSE")
      .setProperty("fillColor","MAGENTA");
    getElement("controlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("buttonsPanel");
    getElement("playPauseButton")
      .setProperty("tooltip","Play/Pause the simulation")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    getElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Reset the simulation");
    getElement("parametersPanel");
    getElement("kLabel")
      .setProperty("text"," k = ");
    getElement("kField")
      .setProperty("format","0.###");
    getElement("energyLabel")
      .setProperty("text"," E = ");
    getElement("energyField")
      .setProperty("format","0.###")
      .setProperty("editable","false");
    getElement("showPlotCheckbox")
      .setProperty("selected","true")
      .setProperty("text","Show Plot ");
    getElement("dialog")
      .setProperty("title","Time Evolution");
    getElement("plottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("minimumY","-1")
      .setProperty("maximumY","1")
      .setProperty("titleX","Time")
      .setProperty("titleY","Displacement and Velocity");
    getElement("displacementTrail2D")
      .setProperty("maximumPoints","300")
      .setProperty("norepeat","true")
      .setProperty("connected","true")
      .setProperty("lineColor","BLUE");
    getElement("velocityTrail2D")
      .setProperty("maximumPoints","300")
      .setProperty("norepeat","true")
      .setProperty("connected","true")
      .setProperty("lineColor","RED");
    __x_canBeChanged__ = true; // Variables.Dynamical Vars:1
    __vx_canBeChanged__ = true; // Variables.Dynamical Vars:2
    __t_canBeChanged__ = true; // Variables.Dynamical Vars:3
    __dt_canBeChanged__ = true; // Variables.Dynamical Vars:4
    __showPlot_canBeChanged__ = true; // Variables.Constants:1
    __y_canBeChanged__ = true; // Variables.Constants:2
    __m_canBeChanged__ = true; // Variables.Constants:3
    __k_canBeChanged__ = true; // Variables.Constants:4
    __L_canBeChanged__ = true; // Variables.Constants:5
    __T_canBeChanged__ = true; // Variables.Constrained Vars:1
    __V_canBeChanged__ = true; // Variables.Constrained Vars:2
    __E_canBeChanged__ = true; // Variables.Constrained Vars:3
    super.reset();
  }

} // End of class MassAndSpringView

