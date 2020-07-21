/*
 * Class : ThreeStateNuclearDecayView.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package threestatedecay;

import static org.colos.ejs.library.control.swing.ControlSwingElement.SIMPLE_DOCUMENT;

import java.awt.Color;

import org.opensourcephysics.display.OSPRuntime;

class ThreeStateNuclearDecayView extends org.colos.ejs.library.control.EjsControl implements org.colos.ejs.library.View {
  private ThreeStateNuclearDecaySimulation _simulation=null;
  private ThreeStateNuclearDecay _model=null;

  // Public variables for wrapped view elements:
  public java.awt.Component mainFrame;
  public javax.swing.JPanel upperPanel;
  public javax.swing.JPanel n1Panel;
  public javax.swing.JLabel n1Label;
  public javax.swing.JTextField n1Field;
  public javax.swing.JPanel k1Panel;
  public javax.swing.JLabel k1Label;
  public javax.swing.JTextField k1Field;
  public javax.swing.JPanel n2Panel;
  public javax.swing.JLabel n2Label;
  public javax.swing.JTextField n2Field;
  public javax.swing.JPanel k2Panel;
  public javax.swing.JLabel k2Label;
  public javax.swing.JTextField k2Field;
  public javax.swing.JPanel n3Panel;
  public javax.swing.JLabel n3Label;
  public javax.swing.JTextField n3Field;
  public org.opensourcephysics.drawing2d.DrawingPanel2D sampleDrawingPanel;
  public org.opensourcephysics.drawing2d.Set sampleShapeSet;
  public javax.swing.JPanel controlPanel;
  public javax.swing.JPanel buttonPanel;
  public javax.swing.JButton startButton;
  public javax.swing.JButton stepButton;
  public javax.swing.JButton resetTime;
  public javax.swing.JButton resetButton;
  public javax.swing.JPanel paramPanel;
  public javax.swing.JPanel timePanel;
  public javax.swing.JLabel timeLabel;
  public javax.swing.JTextField timeField;
  public javax.swing.JPanel dtPanel;
  public javax.swing.JLabel dtLabel;
  public javax.swing.JTextField dtField;
  public javax.swing.JPanel checkPanel;
  public javax.swing.JCheckBox showSampleCheck;
  public javax.swing.JCheckBox tableCheckBox;
  public javax.swing.JDialog tableDialog;
  public org.opensourcephysics.display.DataPanel dataTable;
  public javax.swing.JPanel tableControlPanel;
  public javax.swing.JButton clearTabel;
  public javax.swing.JPanel stridePanel;
  public javax.swing.JLabel strideLabel;
  public javax.swing.JTextField strideField;
  public javax.swing.JDialog plotDialog;
  public org.opensourcephysics.drawing2d.PlottingPanel2D decayPlottingPanel;
  public org.opensourcephysics.drawing2d.ElementTrail n1Trail;
  public org.opensourcephysics.drawing2d.ElementTrail n2Trail;
  public org.opensourcephysics.drawing2d.ElementTrail n3Trail;
  public org.opensourcephysics.drawing2d.ElementTrail N1Trail;
  public org.opensourcephysics.drawing2d.ElementTrail N2Trail;
  public org.opensourcephysics.drawing2d.ElementTrail N3Trail;
  public org.opensourcephysics.displayejs.InteractiveTrace dN1Trace;
  public org.opensourcephysics.displayejs.InteractiveTrace dN2Trace;
  public org.opensourcephysics.drawing2d.ElementTrail dn1Trail;
  public org.opensourcephysics.drawing2d.ElementTrail dn2Trail;
  public javax.swing.JPanel plotControlPanel;
  public javax.swing.JRadioButton continuousRadioButton;
  public javax.swing.JRadioButton stochasticRadioButton;
  public javax.swing.JRadioButton bothRadioButton;
  public javax.swing.JCheckBox deltaCheckBox;

  // private variables to block changes in the view variables:
  private boolean __N10_canBeChanged__ = true; // Variables.Stochastic Vars:1
  private boolean __N20_canBeChanged__ = true; // Variables.Stochastic Vars:2
  private boolean __N_canBeChanged__ = true; // Variables.Stochastic Vars:3
  private boolean __N1_canBeChanged__ = true; // Variables.Stochastic Vars:4
  private boolean __N2_canBeChanged__ = true; // Variables.Stochastic Vars:5
  private boolean __N3_canBeChanged__ = true; // Variables.Stochastic Vars:6
  private boolean __p1_canBeChanged__ = true; // Variables.Stochastic Vars:7
  private boolean __p2_canBeChanged__ = true; // Variables.Stochastic Vars:8
  private boolean __p12_canBeChanged__ = true; // Variables.Stochastic Vars:9
  private boolean __p13_canBeChanged__ = true; // Variables.Stochastic Vars:10
  private boolean __dN1_canBeChanged__ = true; // Variables.Stochastic Vars:11
  private boolean __dN2_canBeChanged__ = true; // Variables.Stochastic Vars:12
  private boolean __n1_canBeChanged__ = true; // Variables.Dynamical Vars:1
  private boolean __n2_canBeChanged__ = true; // Variables.Dynamical Vars:2
  private boolean __n3_canBeChanged__ = true; // Variables.Dynamical Vars:3
  private boolean __t_canBeChanged__ = true; // Variables.Dynamical Vars:4
  private boolean __dt_canBeChanged__ = true; // Variables.Dynamical Vars:5
  private boolean __tol_canBeChanged__ = true; // Variables.Dynamical Vars:6
  private boolean __plotChange_canBeChanged__ = true; // Variables.Aux Vars:1
  private boolean __showTable_canBeChanged__ = true; // Variables.Aux Vars:2
  private boolean __showPlot_canBeChanged__ = true; // Variables.Aux Vars:3
  private boolean __plotMode_canBeChanged__ = true; // Variables.Aux Vars:4
  private boolean __stride_canBeChanged__ = true; // Variables.Aux Vars:5
  private boolean __k1_canBeChanged__ = true; // Variables.Aux Vars:6
  private boolean __k2_canBeChanged__ = true; // Variables.Aux Vars:7
  private boolean __x_canBeChanged__ = true; // Variables.Aux Vars:8
  private boolean __y_canBeChanged__ = true; // Variables.Aux Vars:9
  private boolean __yTitle_canBeChanged__ = true; // Variables.Aux Vars:10
  private boolean __colors_canBeChanged__ = true; // Variables.Aux Vars:11
  private boolean __sampleSize_canBeChanged__ = true; // Variables.Aux Vars:12
  private boolean __particleDiameter_canBeChanged__ = true; // Variables.Aux Vars:13

// ---------- Class constructor -------------------

	public ThreeStateNuclearDecayView(ThreeStateNuclearDecaySimulation _sim, String _replaceName,
			java.awt.Frame _replaceOwnerFrame) {
		super(_sim, _replaceName, _replaceOwnerFrame);
		_simulation = _sim;
		_model = (ThreeStateNuclearDecay) _sim.getModel();
		_model._view = this;
		addTarget("_simulation", _simulation);
		addTarget("_model", _model);
		_model._resetModel();
		initialize();
		setUpdateSimulation(false);
		// The following is used by the JNLP file for the simulation to help find
		// resources
		try {
			String jnlp = System.getProperty("jnlp.codebase");
			if (jnlp != null)
				setUserCodebase(new java.net.URL(jnlp));
		} catch (Exception exc) {
		} // Do nothing and keep quiet if it fails
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
		addListener("N10"); // Variables.Stochastic Vars:1
		addListener("N20"); // Variables.Stochastic Vars:2
		addListener("N"); // Variables.Stochastic Vars:3
		addListener("N1"); // Variables.Stochastic Vars:4
		addListener("N2"); // Variables.Stochastic Vars:5
		addListener("N3"); // Variables.Stochastic Vars:6
		addListener("p1"); // Variables.Stochastic Vars:7
		addListener("p2"); // Variables.Stochastic Vars:8
		addListener("p12"); // Variables.Stochastic Vars:9
		addListener("p13"); // Variables.Stochastic Vars:10
		addListener("dN1"); // Variables.Stochastic Vars:11
		addListener("dN2"); // Variables.Stochastic Vars:12
		addListener("n1"); // Variables.Dynamical Vars:1
		addListener("n2"); // Variables.Dynamical Vars:2
		addListener("n3"); // Variables.Dynamical Vars:3
		addListener("t"); // Variables.Dynamical Vars:4
		addListener("dt"); // Variables.Dynamical Vars:5
		addListener("tol"); // Variables.Dynamical Vars:6
		addListener("plotChange"); // Variables.Aux Vars:1
		addListener("showTable"); // Variables.Aux Vars:2
		addListener("showPlot"); // Variables.Aux Vars:3
		addListener("plotMode"); // Variables.Aux Vars:4
		addListener("stride"); // Variables.Aux Vars:5
		addListener("k1"); // Variables.Aux Vars:6
		addListener("k2"); // Variables.Aux Vars:7
		addListener("x"); // Variables.Aux Vars:8
		addListener("y"); // Variables.Aux Vars:9
		addListener("yTitle"); // Variables.Aux Vars:10
		addListener("colors"); // Variables.Aux Vars:11
		addListener("sampleSize"); // Variables.Aux Vars:12
		addListener("particleDiameter"); // Variables.Aux Vars:13
	}

// ---------- Implementation of View -------------------

  @Override
public void read() {
    // Ejs requires no read(). Actually, having it might cause problems!
  }

  @Override
  public void read(String _variable) {
    if ("N10".equals(_variable)) {
      _model.N10 = getInt("N10"); // Variables.Stochastic Vars:1
      __N10_canBeChanged__ = true;
    }
    if ("N20".equals(_variable)) {
      _model.N20 = getInt("N20"); // Variables.Stochastic Vars:2
      __N20_canBeChanged__ = true;
    }
    if ("N".equals(_variable)) {
      _model.N = getInt("N"); // Variables.Stochastic Vars:3
      __N_canBeChanged__ = true;
    }
    if ("N1".equals(_variable)) {
      _model.N1 = getInt("N1"); // Variables.Stochastic Vars:4
      __N1_canBeChanged__ = true;
    }
    if ("N2".equals(_variable)) {
      _model.N2 = getInt("N2"); // Variables.Stochastic Vars:5
      __N2_canBeChanged__ = true;
    }
    if ("N3".equals(_variable)) {
      _model.N3 = getInt("N3"); // Variables.Stochastic Vars:6
      __N3_canBeChanged__ = true;
    }
    if ("p1".equals(_variable)) {
      _model.p1 = getDouble("p1"); // Variables.Stochastic Vars:7
      __p1_canBeChanged__ = true;
    }
    if ("p2".equals(_variable)) {
      _model.p2 = getDouble("p2"); // Variables.Stochastic Vars:8
      __p2_canBeChanged__ = true;
    }
    if ("p12".equals(_variable)) {
      _model.p12 = getDouble("p12"); // Variables.Stochastic Vars:9
      __p12_canBeChanged__ = true;
    }
    if ("p13".equals(_variable)) {
      _model.p13 = getDouble("p13"); // Variables.Stochastic Vars:10
      __p13_canBeChanged__ = true;
    }
    if ("dN1".equals(_variable)) {
      _model.dN1 = getDouble("dN1"); // Variables.Stochastic Vars:11
      __dN1_canBeChanged__ = true;
    }
    if ("dN2".equals(_variable)) {
      _model.dN2 = getDouble("dN2"); // Variables.Stochastic Vars:12
      __dN2_canBeChanged__ = true;
    }
    if ("n1".equals(_variable)) {
      _model.n1 = getDouble("n1"); // Variables.Dynamical Vars:1
      __n1_canBeChanged__ = true;
    }
    if ("n2".equals(_variable)) {
      _model.n2 = getDouble("n2"); // Variables.Dynamical Vars:2
      __n2_canBeChanged__ = true;
    }
    if ("n3".equals(_variable)) {
      _model.n3 = getDouble("n3"); // Variables.Dynamical Vars:3
      __n3_canBeChanged__ = true;
    }
    if ("t".equals(_variable)) {
      _model.t = getDouble("t"); // Variables.Dynamical Vars:4
      __t_canBeChanged__ = true;
    }
    if ("dt".equals(_variable)) {
      _model.dt = getDouble("dt"); // Variables.Dynamical Vars:5
      __dt_canBeChanged__ = true;
    }
    if ("tol".equals(_variable)) {
      _model.tol = getDouble("tol"); // Variables.Dynamical Vars:6
      __tol_canBeChanged__ = true;
    }
    if ("plotChange".equals(_variable)) {
      _model.plotChange = getBoolean("plotChange"); // Variables.Aux Vars:1
      __plotChange_canBeChanged__ = true;
    }
    if ("showTable".equals(_variable)) {
      _model.showTable = getBoolean("showTable"); // Variables.Aux Vars:2
      __showTable_canBeChanged__ = true;
    }
    if ("showPlot".equals(_variable)) {
      _model.showPlot = getBoolean("showPlot"); // Variables.Aux Vars:3
      __showPlot_canBeChanged__ = true;
    }
    if ("plotMode".equals(_variable)) {
      _model.plotMode = getInt("plotMode"); // Variables.Aux Vars:4
      __plotMode_canBeChanged__ = true;
    }
    if ("stride".equals(_variable)) {
      _model.stride = getInt("stride"); // Variables.Aux Vars:5
      __stride_canBeChanged__ = true;
    }
    if ("k1".equals(_variable)) {
      _model.k1 = getDouble("k1"); // Variables.Aux Vars:6
      __k1_canBeChanged__ = true;
    }
    if ("k2".equals(_variable)) {
      _model.k2 = getDouble("k2"); // Variables.Aux Vars:7
      __k2_canBeChanged__ = true;
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
    if ("y".equals(_variable)) {
      double[] _data = (double[]) getValue("y").getObject();
      int _n0 = _data.length;
      if (_n0>_model.y.length) _n0 = _model.y.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.y[_i0] = _data[_i0];
      }
      __y_canBeChanged__ = true;
    }
    if ("yTitle".equals(_variable)) {
      _model.yTitle = getString("yTitle"); // Variables.Aux Vars:10
      __yTitle_canBeChanged__ = true;
    }
    if ("colors".equals(_variable)) {
      Color[] _data = (Color[]) getValue("colors").getObject();
      int _n0 = _data.length;
      if (_n0>_model.colors.length) _n0 = _model.colors.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.colors[_i0] = _data[_i0];
      }
      __colors_canBeChanged__ = true;
    }
    if ("sampleSize".equals(_variable)) {
      _model.sampleSize = getDouble("sampleSize"); // Variables.Aux Vars:12
      __sampleSize_canBeChanged__ = true;
    }
    if ("particleDiameter".equals(_variable)) {
      _model.particleDiameter = getDouble("particleDiameter"); // Variables.Aux Vars:13
      __particleDiameter_canBeChanged__ = true;
    }
  }

  @Override
public void propagateValues () {
    setValue ("_isPlaying",_simulation.isPlaying());
    setValue ("_isPaused", _simulation.isPaused());
    if(__N10_canBeChanged__) setValue("N10",_model.N10); // Variables.Stochastic Vars:1
    if(__N20_canBeChanged__) setValue("N20",_model.N20); // Variables.Stochastic Vars:2
    if(__N_canBeChanged__) setValue("N",_model.N); // Variables.Stochastic Vars:3
    if(__N1_canBeChanged__) setValue("N1",_model.N1); // Variables.Stochastic Vars:4
    if(__N2_canBeChanged__) setValue("N2",_model.N2); // Variables.Stochastic Vars:5
    if(__N3_canBeChanged__) setValue("N3",_model.N3); // Variables.Stochastic Vars:6
    if(__p1_canBeChanged__) setValue("p1",_model.p1); // Variables.Stochastic Vars:7
    if(__p2_canBeChanged__) setValue("p2",_model.p2); // Variables.Stochastic Vars:8
    if(__p12_canBeChanged__) setValue("p12",_model.p12); // Variables.Stochastic Vars:9
    if(__p13_canBeChanged__) setValue("p13",_model.p13); // Variables.Stochastic Vars:10
    if(__dN1_canBeChanged__) setValue("dN1",_model.dN1); // Variables.Stochastic Vars:11
    if(__dN2_canBeChanged__) setValue("dN2",_model.dN2); // Variables.Stochastic Vars:12
    if(__n1_canBeChanged__) setValue("n1",_model.n1); // Variables.Dynamical Vars:1
    if(__n2_canBeChanged__) setValue("n2",_model.n2); // Variables.Dynamical Vars:2
    if(__n3_canBeChanged__) setValue("n3",_model.n3); // Variables.Dynamical Vars:3
    if(__t_canBeChanged__) setValue("t",_model.t); // Variables.Dynamical Vars:4
    if(__dt_canBeChanged__) setValue("dt",_model.dt); // Variables.Dynamical Vars:5
    if(__tol_canBeChanged__) setValue("tol",_model.tol); // Variables.Dynamical Vars:6
    if(__plotChange_canBeChanged__) setValue("plotChange",_model.plotChange); // Variables.Aux Vars:1
    if(__showTable_canBeChanged__) setValue("showTable",_model.showTable); // Variables.Aux Vars:2
    if(__showPlot_canBeChanged__) setValue("showPlot",_model.showPlot); // Variables.Aux Vars:3
    if(__plotMode_canBeChanged__) setValue("plotMode",_model.plotMode); // Variables.Aux Vars:4
    if(__stride_canBeChanged__) setValue("stride",_model.stride); // Variables.Aux Vars:5
    if(__k1_canBeChanged__) setValue("k1",_model.k1); // Variables.Aux Vars:6
    if(__k2_canBeChanged__) setValue("k2",_model.k2); // Variables.Aux Vars:7
    if(__x_canBeChanged__) setValue("x",_model.x); // Variables.Aux Vars:8
    if(__y_canBeChanged__) setValue("y",_model.y); // Variables.Aux Vars:9
    if(__yTitle_canBeChanged__) setValue("yTitle",_model.yTitle); // Variables.Aux Vars:10
    if(__colors_canBeChanged__) setValue("colors",_model.colors); // Variables.Aux Vars:11
    if(__sampleSize_canBeChanged__) setValue("sampleSize",_model.sampleSize); // Variables.Aux Vars:12
    if(__particleDiameter_canBeChanged__) setValue("particleDiameter",_model.particleDiameter); // Variables.Aux Vars:13
  }

  @Override
  public void blockVariable(String _variable) {
    if ("N10".equals(_variable)) __N10_canBeChanged__ = false; // Variables.Stochastic Vars:1
    if ("N20".equals(_variable)) __N20_canBeChanged__ = false; // Variables.Stochastic Vars:2
    if ("N".equals(_variable)) __N_canBeChanged__ = false; // Variables.Stochastic Vars:3
    if ("N1".equals(_variable)) __N1_canBeChanged__ = false; // Variables.Stochastic Vars:4
    if ("N2".equals(_variable)) __N2_canBeChanged__ = false; // Variables.Stochastic Vars:5
    if ("N3".equals(_variable)) __N3_canBeChanged__ = false; // Variables.Stochastic Vars:6
    if ("p1".equals(_variable)) __p1_canBeChanged__ = false; // Variables.Stochastic Vars:7
    if ("p2".equals(_variable)) __p2_canBeChanged__ = false; // Variables.Stochastic Vars:8
    if ("p12".equals(_variable)) __p12_canBeChanged__ = false; // Variables.Stochastic Vars:9
    if ("p13".equals(_variable)) __p13_canBeChanged__ = false; // Variables.Stochastic Vars:10
    if ("dN1".equals(_variable)) __dN1_canBeChanged__ = false; // Variables.Stochastic Vars:11
    if ("dN2".equals(_variable)) __dN2_canBeChanged__ = false; // Variables.Stochastic Vars:12
    if ("n1".equals(_variable)) __n1_canBeChanged__ = false; // Variables.Dynamical Vars:1
    if ("n2".equals(_variable)) __n2_canBeChanged__ = false; // Variables.Dynamical Vars:2
    if ("n3".equals(_variable)) __n3_canBeChanged__ = false; // Variables.Dynamical Vars:3
    if ("t".equals(_variable)) __t_canBeChanged__ = false; // Variables.Dynamical Vars:4
    if ("dt".equals(_variable)) __dt_canBeChanged__ = false; // Variables.Dynamical Vars:5
    if ("tol".equals(_variable)) __tol_canBeChanged__ = false; // Variables.Dynamical Vars:6
    if ("plotChange".equals(_variable)) __plotChange_canBeChanged__ = false; // Variables.Aux Vars:1
    if ("showTable".equals(_variable)) __showTable_canBeChanged__ = false; // Variables.Aux Vars:2
    if ("showPlot".equals(_variable)) __showPlot_canBeChanged__ = false; // Variables.Aux Vars:3
    if ("plotMode".equals(_variable)) __plotMode_canBeChanged__ = false; // Variables.Aux Vars:4
    if ("stride".equals(_variable)) __stride_canBeChanged__ = false; // Variables.Aux Vars:5
    if ("k1".equals(_variable)) __k1_canBeChanged__ = false; // Variables.Aux Vars:6
    if ("k2".equals(_variable)) __k2_canBeChanged__ = false; // Variables.Aux Vars:7
    if ("x".equals(_variable)) __x_canBeChanged__ = false; // Variables.Aux Vars:8
    if ("y".equals(_variable)) __y_canBeChanged__ = false; // Variables.Aux Vars:9
    if ("yTitle".equals(_variable)) __yTitle_canBeChanged__ = false; // Variables.Aux Vars:10
    if ("colors".equals(_variable)) __colors_canBeChanged__ = false; // Variables.Aux Vars:11
    if ("sampleSize".equals(_variable)) __sampleSize_canBeChanged__ = false; // Variables.Aux Vars:12
    if ("particleDiameter".equals(_variable)) __particleDiameter_canBeChanged__ = false; // Variables.Aux Vars:13
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
      .setProperty("title","Three-State Radioactive Decay")
      .setProperty("layout","border")
      .setProperty("visible","true")
      .setProperty("location","76,87")
      .setProperty("size","619,474")
      .getObject();
    upperPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"upperPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","mainFrame")
      .setProperty("layout","FLOW:center,6,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    n1Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"n1Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    n1Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"n1Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","n1Panel")
      .setProperty("text"," N1 = ")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","RED")
      .getObject();
    n1Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"n1Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","n1Panel")
      .setProperty("variable","N1")
      .setProperty("format","0")
      .setProperty("editable","%_model._method_for_n1Field_editable()%" )
      .setProperty("action","_model._method_for_n1Field_action()" )
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Upper state particle number.")
      .getObject();
    k1Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"k1Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    k1Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"k1Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","k1Panel")
      .setProperty("text"," k1 = ")
      .setProperty("alignment","RIGHT")
      .getObject();
    k1Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"k1Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","k1Panel")
      .setProperty("variable","k1")
      .setProperty("format","0.000#")
      .setProperty("editable","%_model._method_for_k1Field_editable()%" )
      .setProperty("action","_model._method_for_k1Field_action()" )
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Level 1 decay rate.")
      .getObject();
    n2Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"n2Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    n2Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"n2Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","n2Panel")
      .setProperty("text"," N2 = ")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","0,128,0,255")
      .getObject();
    n2Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"n2Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","n2Panel")
      .setProperty("variable","N2")
      .setProperty("format","0")
      .setProperty("editable","%_model._method_for_n2Field_editable()%" )
      .setProperty("action","_model._method_for_n2Field_action()" )
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Middle state particle number.")
      .getObject();
    k2Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"k2Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    k2Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"k2Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","k2Panel")
      .setProperty("text"," k2 = ")
      .setProperty("alignment","RIGHT")
      .getObject();
    k2Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"k2Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","k2Panel")
      .setProperty("variable","k2")
      .setProperty("format","0.000#")
      .setProperty("editable","%_model._method_for_k2Field_editable()%" )
      .setProperty("action","_model._method_for_k2Field_action()" )
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Level 2 decay rate.")
      .getObject();
    n3Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"n3Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","upperPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    n3Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"n3Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","n3Panel")
      .setProperty("text"," N3 = ")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","BLUE")
      .getObject();
    n3Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"n3Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","n3Panel")
      .setProperty("variable","N3")
      .setProperty("format","0")
      .setProperty("editable","false")
      .setProperty("action","_model._method_for_n3Field_action()" )
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Lower state particle number.")
      .getObject();
    sampleDrawingPanel = (org.opensourcephysics.drawing2d.DrawingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlDrawingPanel(),"sampleDrawingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","mainFrame")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("minimumX","0")
      .setProperty("maximumX","sampleSize")
      .setProperty("minimumY","0")
      .setProperty("maximumY","sampleSize")
      .setProperty("square","true")
      .getObject();
    sampleShapeSet = (org.opensourcephysics.drawing2d.Set)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShapeSet2D(),"sampleShapeSet")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","sampleDrawingPanel")
      .setProperty("x","x")
      .setProperty("y","y")
      .setProperty("sizeX","particleDiameter")
      .setProperty("sizeY","particleDiameter")
      .setProperty("fillColor","colors")
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
      .setProperty("layout","GRID:0,7,0,0")
      .setProperty("size","240,23")
      .getObject();
    startButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"startButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","buttonPanel")
      .setProperty("variable","_isPaused")
      .setProperty("tooltip","Starts and stops the simulation.")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("actionOn","_model._method_for_startButton_actionOn()" )
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif")
      .setProperty("actionOff","_model._method_for_startButton_actionOff()" )
      .getObject();
    stepButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"stepButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/step.gif")
      .setProperty("action","_model._method_for_stepButton_action()" )
      .setProperty("tooltip","Setp the simulation")
      .getObject();
    resetTime = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetTime")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("action","_model._method_for_resetTime_action()" )
      .setProperty("tooltip","Resets the time.")
      .getObject();
    resetButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("action","_model._method_for_resetButton_action()" )
      .setProperty("tooltip","Reset the simulation")
      .getObject();
    paramPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"paramPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","controlPanel")
      .setProperty("layout","FLOW:right,0,0")
      .getObject();
    timePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"timePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","paramPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    timeLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"timeLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","timePanel")
      .setProperty("text"," t = ")
      .setProperty("alignment","RIGHT")
      .getObject();
    timeField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"timeField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","timePanel")
      .setProperty("variable","t")
      .setProperty("format","0.00##")
      .setProperty("editable","false")
      .setProperty("action","_model._method_for_timeField_action()" )
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Time.")
      .getObject();
    dtPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"dtPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","paramPanel")
      .setProperty("layout","BORDER:0,0")
      .getObject();
    dtLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"dtLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","dtPanel")
      .setProperty("text"," $\\Delta$t = ")
      .setProperty("alignment","RIGHT")
      .getObject();
    dtField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"dtField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","dtPanel")
      .setProperty("variable","dt")
      .setProperty("format","0.00##")
      .setProperty("editable","%_model._method_for_dtField_editable()%" )
      .setProperty("action","_model._method_for_dtField_action()" )
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Time.")
      .getObject();
    checkPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"checkPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","controlPanel")
      .setProperty("layout","HBOX")
      .getObject();
    showSampleCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showSampleCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","checkPanel")
      .setProperty("variable","showPlot")
      .setProperty("text","plot")
      .setProperty("tooltip","Show the polulation as a function of time.")
      .getObject();
    tableCheckBox = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"tableCheckBox")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","checkPanel")
      .setProperty("variable","showTable")
      .setProperty("text","table")
      .getObject();
    tableDialog = (javax.swing.JDialog)
      addElement(new org.colos.ejs.library.control.swing.ControlDialog(),"tableDialog")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Three-State Decay Table")
      .setProperty("layout","border")
      .setProperty("visible","showTable")
      .setProperty("location","646,23")
      .setProperty("size","300,300")
      .getObject();
    dataTable = (org.opensourcephysics.display.DataPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlDataTable(),"dataTable")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","tableDialog")
      .setProperty("input","%_model._method_for_dataTable_input()%" )
      .setProperty("maxPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("stride","stride")
      .setProperty("showRowNumber","true")
      .setProperty("columnNames","row#,t,N1,N2,N3,$\\Delta$N1,$\\Delta$N2")
      .setProperty("columnFormat","0,0.0##,0,0,0,0,0")
      .setProperty("background","WHITE")
      .getObject();
    tableControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"tableControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","tableDialog")
      .setProperty("layout","border")
      .getObject();
    clearTabel = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"clearTabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","tableControlPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("action","_model._method_for_clearTabel_action()" )
      .setProperty("tooltip","Clears the table data.")
      .getObject();
    stridePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"stridePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","tableControlPanel")
      .setProperty("layout","border")
      .getObject();
    strideLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"strideLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","stridePanel")
      .setProperty("text","stride = ")
      .setProperty("tooltip","The stride between data points.")
      .getObject();
    strideField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(SIMPLE_DOCUMENT),"strideField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","stridePanel")
      .setProperty("variable","stride")
      .setProperty("format","0")
      .setProperty("action","_model._method_for_strideField_action()" )
      .setProperty("size","50,24")
      .getObject();
    plotDialog = (javax.swing.JDialog)
      addElement(new org.colos.ejs.library.control.swing.ControlDialog(),"plotDialog")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Three-State Populations")
      .setProperty("layout","border")
      .setProperty("visible","showPlot")
      .setProperty("location","7,520")
      .setProperty("size","616,288")
      .getObject();
    decayPlottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"decayPlottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","plotDialog")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("titleX","t")
      .setProperty("titleY","%yTitle%")
      .getObject();
    n1Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"n1Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","n1")
      .setProperty("visible","%_model._method_for_n1Trail_visible()%" )
      .setProperty("measured","%_model._method_for_n1Trail_measured()%" )
      .setProperty("norepeat","true")
      .setProperty("lineColor","255,128,128,255")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n1")
      .getObject();
    n2Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"n2Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","n2")
      .setProperty("visible","%_model._method_for_n2Trail_visible()%" )
      .setProperty("measured","%_model._method_for_n2Trail_measured()%" )
      .setProperty("norepeat","true")
      .setProperty("lineColor","128,255,128,255")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n2")
      .getObject();
    n3Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"n3Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","n3")
      .setProperty("visible","%_model._method_for_n3Trail_visible()%" )
      .setProperty("measured","%_model._method_for_n3Trail_measured()%" )
      .setProperty("norepeat","true")
      .setProperty("lineColor","128,128,255,255")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n3")
      .getObject();
    N1Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"N1Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","N1")
      .setProperty("visible","%_model._method_for_N1Trail_visible()%" )
      .setProperty("measured","%_model._method_for_N1Trail_measured()%" )
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N1")
      .getObject();
    createControl50();
  }

  private void createControl50() {
    N2Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"N2Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","N2")
      .setProperty("visible","%_model._method_for_N2Trail_visible()%" )
      .setProperty("measured","%_model._method_for_N2Trail_measured()%" )
      .setProperty("norepeat","true")
      .setProperty("lineColor","GREEN")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N2")
      .getObject();
    N3Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"N3Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","N3")
      .setProperty("visible","%_model._method_for_N3Trail_visible()%" )
      .setProperty("measured","%_model._method_for_N3Trail_measured()%" )
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N3")
      .getObject();
    dN1Trace = (org.opensourcephysics.displayejs.InteractiveTrace)
      addElement(new org.colos.ejs.library.control.displayejs.ControlTrace(),"dN1Trace")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("x","t")
      .setProperty("y","dN1")
      .setProperty("visible","%_model._method_for_dN1Trace_visible()%" )
      .setProperty("measured","plotChange")
      .setProperty("norepeat","true")
      .setProperty("connected","false")
      .setProperty("style","BAR")
      .setProperty("markersize","6")
      .setProperty("secondaryColor","RED")
      .getObject();
    dN2Trace = (org.opensourcephysics.displayejs.InteractiveTrace)
      addElement(new org.colos.ejs.library.control.displayejs.ControlTrace(),"dN2Trace")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("x","t")
      .setProperty("y","dN2")
      .setProperty("visible","%_model._method_for_dN2Trace_visible()%" )
      .setProperty("measured","plotChange")
      .setProperty("norepeat","true")
      .setProperty("connected","false")
      .setProperty("style","BAR")
      .setProperty("markersize","6")
      .setProperty("secondaryColor","0,255,0,182")
      .getObject();
    dn1Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"dn1Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","%_model._method_for_dn1Trail_inputX()%" )
      .setProperty("inputY","%_model._method_for_dn1Trail_inputY()%" )
      .setProperty("visible","%_model._method_for_dn1Trail_visible()%" )
      .setProperty("measured","plotChange")
      .setProperty("norepeat","true")
      .setProperty("lineColor","PINK")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","$\\Delta$n1")
      .getObject();
    dn2Trail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"dn2Trail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decayPlottingPanel")
      .setProperty("inputX","%_model._method_for_dn2Trail_inputX()%" )
      .setProperty("inputY","%_model._method_for_dn2Trail_inputY()%" )
      .setProperty("visible","%_model._method_for_dn2Trail_visible()%" )
      .setProperty("measured","plotChange")
      .setProperty("norepeat","true")
      .setProperty("lineColor","192,255,0")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","$\\Delta$n1")
      .getObject();
    plotControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"plotControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","plotDialog")
      .setProperty("layout","FLOW:center,6,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    continuousRadioButton = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"continuousRadioButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","plotControlPanel")
      .setProperty("text","continuous")
      .setProperty("noUnselect","true")
      .setProperty("action","_model._method_for_continuousRadioButton_action()" )
      .getObject();
    stochasticRadioButton = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"stochasticRadioButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","plotControlPanel")
      .setProperty("text","discrete")
      .setProperty("noUnselect","true")
      .setProperty("action","_model._method_for_stochasticRadioButton_action()" )
      .getObject();
    bothRadioButton = (javax.swing.JRadioButton)
      addElement(new org.colos.ejs.library.control.swing.ControlRadioButton(),"bothRadioButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","plotControlPanel")
      .setProperty("text","both")
      .setProperty("noUnselect","true")
      .setProperty("action","_model._method_for_bothRadioButton_action()" )
      .getObject();
    deltaCheckBox = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"deltaCheckBox")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","plotControlPanel")
      .setProperty("variable","plotChange")
      .setProperty("text","$\\Delta$N")
      .setProperty("actionon","_model._method_for_deltaCheckBox_actionon()" )
      .setProperty("actionoff","_model._method_for_deltaCheckBox_actionoff()" )
      .getObject();
  }

// ---------- Resetting the interface  -------------------

  @Override
public void reset() {
    getElement("mainFrame")
      .setProperty("title","Three-State Radioactive Decay")
      .setProperty("visible","true");
    getElement("upperPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("n1Panel");
    getElement("n1Label")
      .setProperty("text"," N1 = ")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","RED");
    getElement("n1Field")
      .setProperty("format","0")
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Upper state particle number.");
    getElement("k1Panel");
    getElement("k1Label")
      .setProperty("text"," k1 = ")
      .setProperty("alignment","RIGHT");
    getElement("k1Field")
      .setProperty("format","0.000#")
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Level 1 decay rate.");
    getElement("n2Panel");
    getElement("n2Label")
      .setProperty("text"," N2 = ")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","0,128,0,255");
    getElement("n2Field")
      .setProperty("format","0")
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Middle state particle number.");
    getElement("k2Panel");
    getElement("k2Label")
      .setProperty("text"," k2 = ")
      .setProperty("alignment","RIGHT");
    getElement("k2Field")
      .setProperty("format","0.000#")
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Level 2 decay rate.");
    getElement("n3Panel");
    getElement("n3Label")
      .setProperty("text"," N3 = ")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","BLUE");
    getElement("n3Field")
      .setProperty("format","0")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Lower state particle number.");
    getElement("sampleDrawingPanel")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("minimumX","0")
      .setProperty("minimumY","0")
      .setProperty("square","true");
    getElement("sampleShapeSet");
    getElement("controlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("buttonPanel")
      .setProperty("size","240,23");
    getElement("startButton")
      .setProperty("tooltip","Starts and stops the simulation.")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    getElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/step.gif")
      .setProperty("tooltip","Setp the simulation");
    getElement("resetTime")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Resets the time.");
    getElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Reset the simulation");
    getElement("paramPanel");
    getElement("timePanel");
    getElement("timeLabel")
      .setProperty("text"," t = ")
      .setProperty("alignment","RIGHT");
    getElement("timeField")
      .setProperty("format","0.00##")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Time.");
    getElement("dtPanel");
    getElement("dtLabel")
      .setProperty("text"," $\\Delta$t = ")
      .setProperty("alignment","RIGHT");
    getElement("dtField")
      .setProperty("format","0.00##")
      .setProperty("columns","4")
      .setProperty("size","40,24")
      .setProperty("tooltip","Time.");
    getElement("checkPanel");
    getElement("showSampleCheck")
      .setProperty("text","plot")
      .setProperty("tooltip","Show the polulation as a function of time.");
    getElement("tableCheckBox")
      .setProperty("text","table");
    getElement("tableDialog")
      .setProperty("title","Three-State Decay Table");
    getElement("dataTable")
      .setProperty("maxPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("showRowNumber","true")
      .setProperty("columnNames","row#,t,N1,N2,N3,$\\Delta$N1,$\\Delta$N2")
      .setProperty("columnFormat","0,0.0##,0,0,0,0,0")
      .setProperty("background","WHITE");
    getElement("tableControlPanel");
    getElement("clearTabel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("tooltip","Clears the table data.");
    getElement("stridePanel");
    getElement("strideLabel")
      .setProperty("text","stride = ")
      .setProperty("tooltip","The stride between data points.");
    getElement("strideField")
      .setProperty("format","0")
      .setProperty("size","50,24");
    getElement("plotDialog")
      .setProperty("title","Three-State Populations");
    getElement("decayPlottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("titleX","t");
    getElement("n1Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","255,128,128,255")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n1");
    getElement("n2Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","128,255,128,255")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n2");
    getElement("n3Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","128,128,255,255")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n3");
    getElement("N1Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N1");
    getElement("N2Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","GREEN")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N2");
    getElement("N3Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N3");
    getElement("dN1Trace")
      .setProperty("norepeat","true")
      .setProperty("connected","false")
      .setProperty("style","BAR")
      .setProperty("markersize","6")
      .setProperty("secondaryColor","RED");
    getElement("dN2Trace")
      .setProperty("norepeat","true")
      .setProperty("connected","false")
      .setProperty("style","BAR")
      .setProperty("markersize","6")
      .setProperty("secondaryColor","0,255,0,182");
    getElement("dn1Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","PINK")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","$\\Delta$n1");
    getElement("dn2Trail")
      .setProperty("norepeat","true")
      .setProperty("lineColor","192,255,0")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","$\\Delta$n1");
    getElement("plotControlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("continuousRadioButton")
      .setProperty("text","continuous")
      .setProperty("noUnselect","true");
    getElement("stochasticRadioButton")
      .setProperty("text","discrete")
      .setProperty("noUnselect","true");
    getElement("bothRadioButton")
      .setProperty("text","both")
      .setProperty("noUnselect","true");
    getElement("deltaCheckBox")
      .setProperty("text","$\\Delta$N");
    __N10_canBeChanged__ = true; // Variables.Stochastic Vars:1
    __N20_canBeChanged__ = true; // Variables.Stochastic Vars:2
    __N_canBeChanged__ = true; // Variables.Stochastic Vars:3
    __N1_canBeChanged__ = true; // Variables.Stochastic Vars:4
    __N2_canBeChanged__ = true; // Variables.Stochastic Vars:5
    __N3_canBeChanged__ = true; // Variables.Stochastic Vars:6
    __p1_canBeChanged__ = true; // Variables.Stochastic Vars:7
    __p2_canBeChanged__ = true; // Variables.Stochastic Vars:8
    __p12_canBeChanged__ = true; // Variables.Stochastic Vars:9
    __p13_canBeChanged__ = true; // Variables.Stochastic Vars:10
    __dN1_canBeChanged__ = true; // Variables.Stochastic Vars:11
    __dN2_canBeChanged__ = true; // Variables.Stochastic Vars:12
    __n1_canBeChanged__ = true; // Variables.Dynamical Vars:1
    __n2_canBeChanged__ = true; // Variables.Dynamical Vars:2
    __n3_canBeChanged__ = true; // Variables.Dynamical Vars:3
    __t_canBeChanged__ = true; // Variables.Dynamical Vars:4
    __dt_canBeChanged__ = true; // Variables.Dynamical Vars:5
    __tol_canBeChanged__ = true; // Variables.Dynamical Vars:6
    __plotChange_canBeChanged__ = true; // Variables.Aux Vars:1
    __showTable_canBeChanged__ = true; // Variables.Aux Vars:2
    __showPlot_canBeChanged__ = true; // Variables.Aux Vars:3
    __plotMode_canBeChanged__ = true; // Variables.Aux Vars:4
    __stride_canBeChanged__ = true; // Variables.Aux Vars:5
    __k1_canBeChanged__ = true; // Variables.Aux Vars:6
    __k2_canBeChanged__ = true; // Variables.Aux Vars:7
    __x_canBeChanged__ = true; // Variables.Aux Vars:8
    __y_canBeChanged__ = true; // Variables.Aux Vars:9
    __yTitle_canBeChanged__ = true; // Variables.Aux Vars:10
    __colors_canBeChanged__ = true; // Variables.Aux Vars:11
    __sampleSize_canBeChanged__ = true; // Variables.Aux Vars:12
    __particleDiameter_canBeChanged__ = true; // Variables.Aux Vars:13
    super.reset();
  }

} // End of class ThreeStateNuclearDecayView

