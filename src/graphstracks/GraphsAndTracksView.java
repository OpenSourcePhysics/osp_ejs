/*
 * Class : GraphsAndTracksView.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package graphstracks;

import java.awt.Color;

class GraphsAndTracksView extends org.colos.ejs.library.control.EjsControl implements org.colos.ejs.library.View {
  private GraphsAndTracksSimulation _simulation=null;
  private GraphsAndTracks _model=null;

  // Public variables for wrapped view elements:
  public java.awt.Component mainFrame;
  public org.opensourcephysics.drawing2d.PlottingPanel2D tracksPlottingPanel;
  public org.opensourcephysics.drawing2d.ElementShape groundShape;
  public org.opensourcephysics.drawing2d.Set postSet;
  public org.opensourcephysics.drawing2d.Set trackSet;
  public org.opensourcephysics.drawing2d.Set ghostSet;
  public org.opensourcephysics.drawing2d.Group ballGroup;
  public org.opensourcephysics.drawing2d.ElementShape ballShape;
  public org.opensourcephysics.drawing2d.ElementArrow vArrow;
  public org.opensourcephysics.drawing2d.ElementText vText;
  public org.opensourcephysics.drawing2d.ElementArrow gArrow;
  public org.opensourcephysics.drawing2d.ElementText gText;
  public org.opensourcephysics.drawing2d.Set textSet;
  public javax.swing.JPanel controlPanel;
  public javax.swing.JPanel buttonPanel;
  public javax.swing.JButton startButton;
  public javax.swing.JButton stepButton;
  public javax.swing.JButton resetTimeButton;
  public javax.swing.JButton docButton;
  public javax.swing.JButton toolButton;
  public javax.swing.JPanel initialConditions;
  public javax.swing.JPanel x0Panel;
  public javax.swing.JLabel x0Label;
  public javax.swing.JTextField x0Field;
  public javax.swing.JPanel v0Panel;
  public javax.swing.JLabel v0Label;
  public javax.swing.JTextField v0Field;
  public javax.swing.JPanel tPanel;
  public javax.swing.JLabel tLabel;
  public javax.swing.JTextField tField;
  public javax.swing.JPanel checkPanel;
  public javax.swing.JPanel tableCheckPanel;
  public javax.swing.JLabel tableLabel;
  public javax.swing.JCheckBox showTableCheck;
  public javax.swing.JCheckBox showJointsTableCheck;
  public javax.swing.JPanel graphCheckPanel;
  public javax.swing.JLabel graphLabel;
  public javax.swing.JCheckBox showXGraphCheck;
  public javax.swing.JCheckBox showVGraphCheck;
  public javax.swing.JCheckBox showAGraphCheck;
  public javax.swing.JCheckBox showEnergyGraphCheck;
  public java.awt.Component dataFrame;
  public javax.swing.JPanel optionPanel;
  public javax.swing.JLabel hidelLabel;
  public javax.swing.JCheckBox hideXCheck;
  public javax.swing.JCheckBox hideVCheck;
  public javax.swing.JCheckBox hideACheck;
  public org.opensourcephysics.display.DataPanel xyDataTable;
  public javax.swing.JPanel tableControlPanel;
  public javax.swing.JButton eraseTableButton;
  public javax.swing.JPanel stridePanel;
  public javax.swing.JLabel strideLabel;
  public javax.swing.JTextField strideField;
  public java.awt.Component positionFrame;
  public org.opensourcephysics.drawing2d.PlottingPanel2D positionPlottingPanel;
  public org.opensourcephysics.drawing2d.ElementTrail xtrackTrail;
  public org.opensourcephysics.drawing2d.ElementShape xMarker;
  public org.opensourcephysics.drawing2d.ElementTrail xTrail;
  public org.opensourcephysics.drawing2d.ElementTrail yBallTrail;
  public javax.swing.JPanel positionControlPanel;
  public javax.swing.JButton erasePositionButton;
  public javax.swing.JPanel positionVarsPanel;
  public javax.swing.JPanel xtrackPanel;
  public javax.swing.JLabel xtrackLabel;
  public javax.swing.JTextField xtrackField;
  public javax.swing.JPanel xcompoentPanel;
  public javax.swing.JLabel xcomponentLabel;
  public javax.swing.JTextField xcomponentField;
  public javax.swing.JPanel ycompoentPanel;
  public javax.swing.JLabel ycomponentLabel;
  public javax.swing.JTextField ycomponentField;
  public javax.swing.JPanel timePanel;
  public javax.swing.JLabel tpLabel;
  public javax.swing.JTextField tpField;
  public java.awt.Component velocityFrame;
  public org.opensourcephysics.drawing2d.PlottingPanel2D velocityPlottingPanel;
  public org.opensourcephysics.drawing2d.ElementTrail vTrail;
  public org.opensourcephysics.drawing2d.ElementShape yMarker;
  public org.opensourcephysics.drawing2d.ElementTrail vxTrail;
  public org.opensourcephysics.drawing2d.ElementTrail vyTrail;
  public javax.swing.JPanel vControlPanel;
  public javax.swing.JButton eraseVelocityButton;
  public javax.swing.JPanel velocityVarsPanel;
  public javax.swing.JPanel vPanel;
  public javax.swing.JLabel vLabel;
  public javax.swing.JTextField vField;
  public javax.swing.JPanel vxPanel;
  public javax.swing.JLabel vxLabel;
  public javax.swing.JTextField vxField;
  public javax.swing.JPanel vyPanel;
  public javax.swing.JLabel vyLabel;
  public javax.swing.JTextField vyField;
  public javax.swing.JPanel timePanel2;
  public javax.swing.JLabel tpLabel2;
  public javax.swing.JTextField tpField2;
  public java.awt.Component accelerationFrame;
  public org.opensourcephysics.drawing2d.PlottingPanel2D accelerationPlottingPanel;
  public org.opensourcephysics.drawing2d.ElementTrail aTrail;
  public org.opensourcephysics.drawing2d.ElementShape aMarker;
  public org.opensourcephysics.drawing2d.ElementTrail axTrail;
  public org.opensourcephysics.drawing2d.ElementTrail ayTrail;
  public javax.swing.JPanel aControlPanel;
  public javax.swing.JButton eraseAccelerationButton;
  public javax.swing.JPanel accelerationVarsPanel;
  public javax.swing.JPanel aPanel;
  public javax.swing.JLabel aLabel;
  public javax.swing.JTextField aField;
  public javax.swing.JPanel axPanel;
  public javax.swing.JLabel axLabel;
  public javax.swing.JTextField axField;
  public javax.swing.JPanel ayPanel;
  public javax.swing.JLabel ayLabel;
  public javax.swing.JTextField ayField;
  public javax.swing.JPanel timePanel22;
  public javax.swing.JLabel tpLabel22;
  public javax.swing.JTextField tpField22;
  public java.awt.Component energyFrame;
  public org.opensourcephysics.drawing2d.PlottingPanel2D energyPlottingPanel;
  public org.opensourcephysics.drawing2d.ElementTrail energyTrail;
  public org.opensourcephysics.drawing2d.ElementTrail keTrail;
  public org.opensourcephysics.drawing2d.ElementTrail peTrail;
  public javax.swing.JPanel energyControlPanel;
  public javax.swing.JButton eraseEnergyButton;
  public javax.swing.JPanel energyVarsPanel;
  public javax.swing.JPanel kePanel;
  public javax.swing.JLabel keLabel;
  public javax.swing.JTextField keField;
  public javax.swing.JPanel pePanel;
  public javax.swing.JLabel peLabel;
  public javax.swing.JTextField peField;
  public javax.swing.JPanel energyPanel;
  public javax.swing.JLabel energyLabel;
  public javax.swing.JTextField energyField;
  public javax.swing.JPanel timePanel3;
  public javax.swing.JLabel tpLabel3;
  public javax.swing.JTextField tpField3;
  public java.awt.Component jointsFrame;
  public org.opensourcephysics.display.EjsArrayPanel jointsArrayPanel;
  public java.awt.Component customizationFrame;
  public javax.swing.JPanel teacherControlPanel;
  public javax.swing.JPanel displayPanel;
  public javax.swing.JPanel dataPanel;
  public javax.swing.JCheckBox tableCheck;
  public javax.swing.JCheckBox toolCheck;
  public javax.swing.JCheckBox jointsTableCheck;
  public javax.swing.JPanel dragPanel;
  public javax.swing.JCheckBox dragJointsCheck;
  public javax.swing.JCheckBox dragBallCheck;
  public javax.swing.JPanel decorationPanel;
  public javax.swing.JCheckBox velocityCheck;
  public javax.swing.JTextField vScaleField;
  public javax.swing.JCheckBox gCheck;
  public javax.swing.JTextField gScaleField;
  public javax.swing.JLabel ngLabel;
  public javax.swing.JTextField ngFieldField;
  public javax.swing.JPanel graphPanel;
  public javax.swing.JCheckBox xCheck;
  public javax.swing.JCheckBox vCheck;
  public javax.swing.JCheckBox aCheck;
  public javax.swing.JCheckBox xyComponentsCheck;
  public javax.swing.JCheckBox energyCheck;
  public javax.swing.JPanel varsPanel;
  public javax.swing.JCheckBox x0Check;
  public javax.swing.JCheckBox v0Check;
  public javax.swing.JCheckBox timeCheck;
  public javax.swing.JPanel scalePanel;
  public javax.swing.JPanel xscalePanel;
  public javax.swing.JPanel xminPanel;
  public javax.swing.JLabel xminLabel;
  public javax.swing.JTextField xminField;
  public javax.swing.JPanel xmaxPanel;
  public javax.swing.JLabel xmaxLabel;
  public javax.swing.JTextField xmaxField;
  public javax.swing.JPanel yscalePanel;
  public javax.swing.JPanel yminPanel;
  public javax.swing.JLabel yminLabel;
  public javax.swing.JTextField yminField;
  public javax.swing.JPanel ymaxPanel;
  public javax.swing.JLabel ymaxLabel;
  public javax.swing.JTextField ymaxField;
  public javax.swing.JPanel nPanel;
  public javax.swing.JLabel nLabel;
  public javax.swing.JTextField nField;
  public javax.swing.JPanel gPanel;
  public javax.swing.JLabel gLabel;
  public javax.swing.JTextField gField;
  public javax.swing.JPanel dtPanel;
  public javax.swing.JLabel dtLabel;
  public javax.swing.JTextField dtField;
  public javax.swing.JPanel maxTimePanel;
  public javax.swing.JLabel maxTimeLabel;
  public javax.swing.JTextField maxTimeField;
  public javax.swing.JCheckBox bounceCheck;
  public javax.swing.JPanel parametersPanel;
  public javax.swing.JPanel savePanel;
  public javax.swing.JButton saveButton;
  public javax.swing.JCheckBox studentCheck;
  public javax.swing.JPanel filePanel;
  public javax.swing.JLabel fileLabel;
  public javax.swing.JTextField fileField;
  public javax.swing.JPanel msgPanel;
  public javax.swing.JLabel msgLabel;
  public javax.swing.JTextField msgField;
  public javax.swing.JPanel titlePanel;
  public javax.swing.JLabel titleLabel;
  public javax.swing.JTextField titleField;
  public javax.swing.JButton resetButton;

  // private variables to block changes in the view variables:
  private boolean __x0_canBeChanged__ = true; // Variables.Constants:1
  private boolean __v0_canBeChanged__ = true; // Variables.Constants:2
  private boolean __xmin_canBeChanged__ = true; // Variables.Constants:3
  private boolean __xmax_canBeChanged__ = true; // Variables.Constants:4
  private boolean __ymin_canBeChanged__ = true; // Variables.Constants:5
  private boolean __ymax_canBeChanged__ = true; // Variables.Constants:6
  private boolean __vScale_canBeChanged__ = true; // Variables.Constants:7
  private boolean __g_canBeChanged__ = true; // Variables.Constants:8
  private boolean __gScale_canBeChanged__ = true; // Variables.Constants:9
  private boolean __xyComponents_canBeChanged__ = true; // Variables.Constants:10
  private boolean __xAxisTitle_canBeChanged__ = true; // Variables.Constants:11
  private boolean __vAxisTitle_canBeChanged__ = true; // Variables.Constants:12
  private boolean __aAxisTitle_canBeChanged__ = true; // Variables.Constants:13
  private boolean __maxTime_canBeChanged__ = true; // Variables.Constants:14
  private boolean __bounce_canBeChanged__ = true; // Variables.Constants:15
  private boolean __E_canBeChanged__ = true; // Variables.Constants:16
  private boolean __KE_canBeChanged__ = true; // Variables.Constants:17
  private boolean __PE_canBeChanged__ = true; // Variables.Constants:18
  private boolean __ng_canBeChanged__ = true; // Variables.Ghost Vars:1
  private boolean __gCounter_canBeChanged__ = true; // Variables.Ghost Vars:2
  private boolean __gStride_canBeChanged__ = true; // Variables.Ghost Vars:3
  private boolean __xghost_canBeChanged__ = true; // Variables.Ghost Vars:4
  private boolean __yghost_canBeChanged__ = true; // Variables.Ghost Vars:5
  private boolean __ghostColors_canBeChanged__ = true; // Variables.Ghost Vars:6
  private boolean __xtrack_canBeChanged__ = true; // Variables.Dynamical Vars:1
  private boolean __x_canBeChanged__ = true; // Variables.Dynamical Vars:2
  private boolean __vx_canBeChanged__ = true; // Variables.Dynamical Vars:3
  private boolean __t_canBeChanged__ = true; // Variables.Dynamical Vars:4
  private boolean __dt_canBeChanged__ = true; // Variables.Dynamical Vars:5
  private boolean __tol_canBeChanged__ = true; // Variables.Dynamical Vars:6
  private boolean __stationary_canBeChanged__ = true; // Variables.Dynamical Vars:7
  private boolean __nt_canBeChanged__ = true; // Variables.Track Vars:1
  private boolean __xt_canBeChanged__ = true; // Variables.Track Vars:2
  private boolean __jointsData_canBeChanged__ = true; // Variables.Track Vars:3
  private boolean __ht_canBeChanged__ = true; // Variables.Track Vars:4
  private boolean __dx_canBeChanged__ = true; // Variables.Track Vars:5
  private boolean __st_canBeChanged__ = true; // Variables.Track Vars:6
  private boolean __dy_canBeChanged__ = true; // Variables.Track Vars:7
  private boolean __theta_canBeChanged__ = true; // Variables.Track Vars:8
  private boolean __postWidth_canBeChanged__ = true; // Variables.Track Vars:9
  private boolean __index_canBeChanged__ = true; // Variables.Track Vars:10
  private boolean __segment_canBeChanged__ = true; // Variables.Track Vars:11
  private boolean __yBall_canBeChanged__ = true; // Variables.Track Vars:12
  private boolean __vBall_canBeChanged__ = true; // Variables.Track Vars:13
  private boolean __vy_canBeChanged__ = true; // Variables.Track Vars:14
  private boolean __aBall_canBeChanged__ = true; // Variables.Track Vars:15
  private boolean __axBall_canBeChanged__ = true; // Variables.Track Vars:16
  private boolean __ayBall_canBeChanged__ = true; // Variables.Track Vars:17
  private boolean __labels_canBeChanged__ = true; // Variables.Track Vars:18
  private boolean __dragMode_canBeChanged__ = true; // Variables.Track Vars:19
  private boolean __dragBall_canBeChanged__ = true; // Variables.Track Vars:20
  private boolean __saveInStudentMode_canBeChanged__ = true; // Variables.Customization Vars:1
  private boolean __studentMode_canBeChanged__ = true; // Variables.Customization Vars:2
  private boolean __fileName_canBeChanged__ = true; // Variables.Customization Vars:3
  private boolean __frameTitle_canBeChanged__ = true; // Variables.Customization Vars:4
  private boolean __showToolButton_canBeChanged__ = true; // Variables.Customization Vars:5
  private boolean __startMsg_canBeChanged__ = true; // Variables.Customization Vars:6
  private boolean __msg_canBeChanged__ = true; // Variables.Customization Vars:7
  private boolean __showX_canBeChanged__ = true; // Variables.Customization Vars:8
  private boolean __showV_canBeChanged__ = true; // Variables.Customization Vars:9
  private boolean __showA_canBeChanged__ = true; // Variables.Customization Vars:10
  private boolean __showTime_canBeChanged__ = true; // Variables.Customization Vars:11
  private boolean __showX0_canBeChanged__ = true; // Variables.Customization Vars:12
  private boolean __showV0_canBeChanged__ = true; // Variables.Customization Vars:13
  private boolean __showVArrow_canBeChanged__ = true; // Variables.Customization Vars:14
  private boolean __showGArrow_canBeChanged__ = true; // Variables.Customization Vars:15
  private boolean __hideD_canBeChanged__ = true; // Variables.Customization Vars:16
  private boolean __hideV_canBeChanged__ = true; // Variables.Customization Vars:17
  private boolean __hideA_canBeChanged__ = true; // Variables.Customization Vars:18
  private boolean __showJointsTable_canBeChanged__ = true; // Variables.Customization Vars:19
  private boolean __showTable_canBeChanged__ = true; // Variables.Customization Vars:20
  private boolean __stride_canBeChanged__ = true; // Variables.Customization Vars:21
  private boolean __tableColNames_canBeChanged__ = true; // Variables.Customization Vars:22
  private boolean __tableRow_canBeChanged__ = true; // Variables.Customization Vars:23
  private boolean __visTable_canBeChanged__ = true; // Variables.Customization Vars:24
  private boolean __visXGraph_canBeChanged__ = true; // Variables.Customization Vars:25
  private boolean __visVGraph_canBeChanged__ = true; // Variables.Customization Vars:26
  private boolean __visAGraph_canBeChanged__ = true; // Variables.Customization Vars:27
  private boolean __visEGraph_canBeChanged__ = true; // Variables.Customization Vars:28
  private boolean __showE_canBeChanged__ = true; // Variables.Customization Vars:29
  private boolean __visJointsTable_canBeChanged__ = true; // Variables.Customization Vars:30

// ---------- Class constructor -------------------

  public GraphsAndTracksView (GraphsAndTracksSimulation _sim, String _replaceName, java.awt.Frame _replaceOwnerFrame) {
    super(_sim,_replaceName,_replaceOwnerFrame);
    _simulation = _sim;
    _model = (GraphsAndTracks) _sim.getModel();
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
    addListener("x0"); // Variables.Constants:1
    addListener("v0"); // Variables.Constants:2
    addListener("xmin"); // Variables.Constants:3
    addListener("xmax"); // Variables.Constants:4
    addListener("ymin"); // Variables.Constants:5
    addListener("ymax"); // Variables.Constants:6
    addListener("vScale"); // Variables.Constants:7
    addListener("g"); // Variables.Constants:8
    addListener("gScale"); // Variables.Constants:9
    addListener("xyComponents"); // Variables.Constants:10
    addListener("xAxisTitle"); // Variables.Constants:11
    addListener("vAxisTitle"); // Variables.Constants:12
    addListener("aAxisTitle"); // Variables.Constants:13
    addListener("maxTime"); // Variables.Constants:14
    addListener("bounce"); // Variables.Constants:15
    addListener("E"); // Variables.Constants:16
    addListener("KE"); // Variables.Constants:17
    addListener("PE"); // Variables.Constants:18
    addListener("ng"); // Variables.Ghost Vars:1
    addListener("gCounter"); // Variables.Ghost Vars:2
    addListener("gStride"); // Variables.Ghost Vars:3
    addListener("xghost"); // Variables.Ghost Vars:4
    addListener("yghost"); // Variables.Ghost Vars:5
    addListener("ghostColors"); // Variables.Ghost Vars:6
    addListener("xtrack"); // Variables.Dynamical Vars:1
    addListener("x"); // Variables.Dynamical Vars:2
    addListener("vx"); // Variables.Dynamical Vars:3
    addListener("t"); // Variables.Dynamical Vars:4
    addListener("dt"); // Variables.Dynamical Vars:5
    addListener("tol"); // Variables.Dynamical Vars:6
    addListener("stationary"); // Variables.Dynamical Vars:7
    addListener("nt"); // Variables.Track Vars:1
    addListener("xt"); // Variables.Track Vars:2
    addListener("jointsData"); // Variables.Track Vars:3
    addListener("ht"); // Variables.Track Vars:4
    addListener("dx"); // Variables.Track Vars:5
    addListener("st"); // Variables.Track Vars:6
    addListener("dy"); // Variables.Track Vars:7
    addListener("theta"); // Variables.Track Vars:8
    addListener("postWidth"); // Variables.Track Vars:9
    addListener("index"); // Variables.Track Vars:10
    addListener("segment"); // Variables.Track Vars:11
    addListener("yBall"); // Variables.Track Vars:12
    addListener("vBall"); // Variables.Track Vars:13
    addListener("vy"); // Variables.Track Vars:14
    addListener("aBall"); // Variables.Track Vars:15
    addListener("axBall"); // Variables.Track Vars:16
    addListener("ayBall"); // Variables.Track Vars:17
    addListener("labels"); // Variables.Track Vars:18
    addListener("dragMode"); // Variables.Track Vars:19
    addListener("dragBall"); // Variables.Track Vars:20
    addListener("saveInStudentMode"); // Variables.Customization Vars:1
    addListener("studentMode"); // Variables.Customization Vars:2
    addListener("fileName"); // Variables.Customization Vars:3
    addListener("frameTitle"); // Variables.Customization Vars:4
    addListener("showToolButton"); // Variables.Customization Vars:5
    addListener("startMsg"); // Variables.Customization Vars:6
    addListener("msg"); // Variables.Customization Vars:7
    addListener("showX"); // Variables.Customization Vars:8
    addListener("showV"); // Variables.Customization Vars:9
    addListener("showA"); // Variables.Customization Vars:10
    addListener("showTime"); // Variables.Customization Vars:11
    addListener("showX0"); // Variables.Customization Vars:12
    addListener("showV0"); // Variables.Customization Vars:13
    addListener("showVArrow"); // Variables.Customization Vars:14
    addListener("showGArrow"); // Variables.Customization Vars:15
    addListener("hideD"); // Variables.Customization Vars:16
    addListener("hideV"); // Variables.Customization Vars:17
    addListener("hideA"); // Variables.Customization Vars:18
    addListener("showJointsTable"); // Variables.Customization Vars:19
    addListener("showTable"); // Variables.Customization Vars:20
    addListener("stride"); // Variables.Customization Vars:21
    addListener("tableColNames"); // Variables.Customization Vars:22
    addListener("tableRow"); // Variables.Customization Vars:23
    addListener("visTable"); // Variables.Customization Vars:24
    addListener("visXGraph"); // Variables.Customization Vars:25
    addListener("visVGraph"); // Variables.Customization Vars:26
    addListener("visAGraph"); // Variables.Customization Vars:27
    addListener("visEGraph"); // Variables.Customization Vars:28
    addListener("showE"); // Variables.Customization Vars:29
    addListener("visJointsTable"); // Variables.Customization Vars:30
  }

// ---------- Implementation of View -------------------

  public void read() {
    // Ejs requires no read(). Actually, having it might cause problems!
  }

  @SuppressWarnings("unchecked")
  public void read(String _variable) {
    if ("x0".equals(_variable)) {
      _model.x0 = getDouble("x0"); // Variables.Constants:1
      __x0_canBeChanged__ = true;
    }
    if ("v0".equals(_variable)) {
      _model.v0 = getDouble("v0"); // Variables.Constants:2
      __v0_canBeChanged__ = true;
    }
    if ("xmin".equals(_variable)) {
      _model.xmin = getDouble("xmin"); // Variables.Constants:3
      __xmin_canBeChanged__ = true;
    }
    if ("xmax".equals(_variable)) {
      _model.xmax = getDouble("xmax"); // Variables.Constants:4
      __xmax_canBeChanged__ = true;
    }
    if ("ymin".equals(_variable)) {
      _model.ymin = getDouble("ymin"); // Variables.Constants:5
      __ymin_canBeChanged__ = true;
    }
    if ("ymax".equals(_variable)) {
      _model.ymax = getDouble("ymax"); // Variables.Constants:6
      __ymax_canBeChanged__ = true;
    }
    if ("vScale".equals(_variable)) {
      _model.vScale = getDouble("vScale"); // Variables.Constants:7
      __vScale_canBeChanged__ = true;
    }
    if ("g".equals(_variable)) {
      _model.g = getDouble("g"); // Variables.Constants:8
      __g_canBeChanged__ = true;
    }
    if ("gScale".equals(_variable)) {
      _model.gScale = getDouble("gScale"); // Variables.Constants:9
      __gScale_canBeChanged__ = true;
    }
    if ("xyComponents".equals(_variable)) {
      _model.xyComponents = getBoolean("xyComponents"); // Variables.Constants:10
      __xyComponents_canBeChanged__ = true;
    }
    if ("xAxisTitle".equals(_variable)) {
      _model.xAxisTitle = getString("xAxisTitle"); // Variables.Constants:11
      __xAxisTitle_canBeChanged__ = true;
    }
    if ("vAxisTitle".equals(_variable)) {
      _model.vAxisTitle = getString("vAxisTitle"); // Variables.Constants:12
      __vAxisTitle_canBeChanged__ = true;
    }
    if ("aAxisTitle".equals(_variable)) {
      _model.aAxisTitle = getString("aAxisTitle"); // Variables.Constants:13
      __aAxisTitle_canBeChanged__ = true;
    }
    if ("maxTime".equals(_variable)) {
      _model.maxTime = getDouble("maxTime"); // Variables.Constants:14
      __maxTime_canBeChanged__ = true;
    }
    if ("bounce".equals(_variable)) {
      _model.bounce = getBoolean("bounce"); // Variables.Constants:15
      __bounce_canBeChanged__ = true;
    }
    if ("E".equals(_variable)) {
      _model.E = getDouble("E"); // Variables.Constants:16
      __E_canBeChanged__ = true;
    }
    if ("KE".equals(_variable)) {
      _model.KE = getDouble("KE"); // Variables.Constants:17
      __KE_canBeChanged__ = true;
    }
    if ("PE".equals(_variable)) {
      _model.PE = getDouble("PE"); // Variables.Constants:18
      __PE_canBeChanged__ = true;
    }
    if ("ng".equals(_variable)) {
      _model.ng = getInt("ng"); // Variables.Ghost Vars:1
      __ng_canBeChanged__ = true;
    }
    if ("gCounter".equals(_variable)) {
      _model.gCounter = getInt("gCounter"); // Variables.Ghost Vars:2
      __gCounter_canBeChanged__ = true;
    }
    if ("gStride".equals(_variable)) {
      _model.gStride = getInt("gStride"); // Variables.Ghost Vars:3
      __gStride_canBeChanged__ = true;
    }
    if ("xghost".equals(_variable)) {
      double[] _data = (double[]) getValue("xghost").getObject();
      int _n0 = _data.length;
      if (_n0>_model.xghost.length) _n0 = _model.xghost.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.xghost[_i0] = _data[_i0];
      }
      __xghost_canBeChanged__ = true;
    }
    if ("yghost".equals(_variable)) {
      double[] _data = (double[]) getValue("yghost").getObject();
      int _n0 = _data.length;
      if (_n0>_model.yghost.length) _n0 = _model.yghost.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.yghost[_i0] = _data[_i0];
      }
      __yghost_canBeChanged__ = true;
    }
    if ("ghostColors".equals(_variable)) {
      Color[] _data = (Color[]) getValue("ghostColors").getObject();
      int _n0 = _data.length;
      if (_n0>_model.ghostColors.length) _n0 = _model.ghostColors.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.ghostColors[_i0] = _data[_i0];
      }
      __ghostColors_canBeChanged__ = true;
    }
    if ("xtrack".equals(_variable)) {
      _model.xtrack = getDouble("xtrack"); // Variables.Dynamical Vars:1
      __xtrack_canBeChanged__ = true;
    }
    if ("x".equals(_variable)) {
      _model.x = getDouble("x"); // Variables.Dynamical Vars:2
      __x_canBeChanged__ = true;
    }
    if ("vx".equals(_variable)) {
      _model.vx = getDouble("vx"); // Variables.Dynamical Vars:3
      __vx_canBeChanged__ = true;
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
    if ("stationary".equals(_variable)) {
      _model.stationary = getBoolean("stationary"); // Variables.Dynamical Vars:7
      __stationary_canBeChanged__ = true;
    }
    if ("nt".equals(_variable)) {
      _model.nt = getInt("nt"); // Variables.Track Vars:1
      __nt_canBeChanged__ = true;
    }
    if ("xt".equals(_variable)) {
      double[] _data = (double[]) getValue("xt").getObject();
      int _n0 = _data.length;
      if (_n0>_model.xt.length) _n0 = _model.xt.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.xt[_i0] = _data[_i0];
      }
      __xt_canBeChanged__ = true;
    }
    if ("jointsData".equals(_variable)) {
      double[][] _data = (double[][]) getValue("jointsData").getObject();
      int _n0 = _data.length;
      if (_n0>_model.jointsData.length) _n0 = _model.jointsData.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        int _n1 = _data[_i0].length;
        if (_n1>_model.jointsData[_i0].length) _n1 = _model.jointsData[_i0].length;
        for (int _i1=0; _i1<_n1; _i1++) {
          _model.jointsData[_i0][_i1] = _data[_i0][_i1];
        }
      }
      __jointsData_canBeChanged__ = true;
    }
    if ("ht".equals(_variable)) {
      double[] _data = (double[]) getValue("ht").getObject();
      int _n0 = _data.length;
      if (_n0>_model.ht.length) _n0 = _model.ht.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.ht[_i0] = _data[_i0];
      }
      __ht_canBeChanged__ = true;
    }
    if ("dx".equals(_variable)) {
      _model.dx = getDouble("dx"); // Variables.Track Vars:5
      __dx_canBeChanged__ = true;
    }
    if ("st".equals(_variable)) {
      double[] _data = (double[]) getValue("st").getObject();
      int _n0 = _data.length;
      if (_n0>_model.st.length) _n0 = _model.st.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.st[_i0] = _data[_i0];
      }
      __st_canBeChanged__ = true;
    }
    if ("dy".equals(_variable)) {
      double[] _data = (double[]) getValue("dy").getObject();
      int _n0 = _data.length;
      if (_n0>_model.dy.length) _n0 = _model.dy.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.dy[_i0] = _data[_i0];
      }
      __dy_canBeChanged__ = true;
    }
    if ("theta".equals(_variable)) {
      double[] _data = (double[]) getValue("theta").getObject();
      int _n0 = _data.length;
      if (_n0>_model.theta.length) _n0 = _model.theta.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.theta[_i0] = _data[_i0];
      }
      __theta_canBeChanged__ = true;
    }
    if ("postWidth".equals(_variable)) {
      _model.postWidth = getDouble("postWidth"); // Variables.Track Vars:9
      __postWidth_canBeChanged__ = true;
    }
    if ("index".equals(_variable)) {
      _model.index = getInt("index"); // Variables.Track Vars:10
      __index_canBeChanged__ = true;
    }
    if ("segment".equals(_variable)) {
      _model.segment = getInt("segment"); // Variables.Track Vars:11
      __segment_canBeChanged__ = true;
    }
    if ("yBall".equals(_variable)) {
      _model.yBall = getDouble("yBall"); // Variables.Track Vars:12
      __yBall_canBeChanged__ = true;
    }
    if ("vBall".equals(_variable)) {
      _model.vBall = getDouble("vBall"); // Variables.Track Vars:13
      __vBall_canBeChanged__ = true;
    }
    if ("vy".equals(_variable)) {
      _model.vy = getDouble("vy"); // Variables.Track Vars:14
      __vy_canBeChanged__ = true;
    }
    if ("aBall".equals(_variable)) {
      _model.aBall = getDouble("aBall"); // Variables.Track Vars:15
      __aBall_canBeChanged__ = true;
    }
    if ("axBall".equals(_variable)) {
      _model.axBall = getDouble("axBall"); // Variables.Track Vars:16
      __axBall_canBeChanged__ = true;
    }
    if ("ayBall".equals(_variable)) {
      _model.ayBall = getDouble("ayBall"); // Variables.Track Vars:17
      __ayBall_canBeChanged__ = true;
    }
    if ("labels".equals(_variable)) {
      String[] _data = (String[]) getValue("labels").getObject();
      int _n0 = _data.length;
      if (_n0>_model.labels.length) _n0 = _model.labels.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.labels[_i0] = _data[_i0];
      }
      __labels_canBeChanged__ = true;
    }
    if ("dragMode".equals(_variable)) {
      _model.dragMode = getInt("dragMode"); // Variables.Track Vars:19
      __dragMode_canBeChanged__ = true;
    }
    if ("dragBall".equals(_variable)) {
      _model.dragBall = getBoolean("dragBall"); // Variables.Track Vars:20
      __dragBall_canBeChanged__ = true;
    }
    if ("saveInStudentMode".equals(_variable)) {
      _model.saveInStudentMode = getBoolean("saveInStudentMode"); // Variables.Customization Vars:1
      __saveInStudentMode_canBeChanged__ = true;
    }
    if ("studentMode".equals(_variable)) {
      _model.studentMode = getBoolean("studentMode"); // Variables.Customization Vars:2
      __studentMode_canBeChanged__ = true;
    }
    if ("fileName".equals(_variable)) {
      _model.fileName = getString("fileName"); // Variables.Customization Vars:3
      __fileName_canBeChanged__ = true;
    }
    if ("frameTitle".equals(_variable)) {
      _model.frameTitle = getString("frameTitle"); // Variables.Customization Vars:4
      __frameTitle_canBeChanged__ = true;
    }
    if ("showToolButton".equals(_variable)) {
      _model.showToolButton = getBoolean("showToolButton"); // Variables.Customization Vars:5
      __showToolButton_canBeChanged__ = true;
    }
    if ("startMsg".equals(_variable)) {
      _model.startMsg = getString("startMsg"); // Variables.Customization Vars:6
      __startMsg_canBeChanged__ = true;
    }
    if ("msg".equals(_variable)) {
      _model.msg = getString("msg"); // Variables.Customization Vars:7
      __msg_canBeChanged__ = true;
    }
    if ("showX".equals(_variable)) {
      _model.showX = getBoolean("showX"); // Variables.Customization Vars:8
      __showX_canBeChanged__ = true;
    }
    if ("showV".equals(_variable)) {
      _model.showV = getBoolean("showV"); // Variables.Customization Vars:9
      __showV_canBeChanged__ = true;
    }
    if ("showA".equals(_variable)) {
      _model.showA = getBoolean("showA"); // Variables.Customization Vars:10
      __showA_canBeChanged__ = true;
    }
    if ("showTime".equals(_variable)) {
      _model.showTime = getBoolean("showTime"); // Variables.Customization Vars:11
      __showTime_canBeChanged__ = true;
    }
    if ("showX0".equals(_variable)) {
      _model.showX0 = getBoolean("showX0"); // Variables.Customization Vars:12
      __showX0_canBeChanged__ = true;
    }
    if ("showV0".equals(_variable)) {
      _model.showV0 = getBoolean("showV0"); // Variables.Customization Vars:13
      __showV0_canBeChanged__ = true;
    }
    if ("showVArrow".equals(_variable)) {
      _model.showVArrow = getBoolean("showVArrow"); // Variables.Customization Vars:14
      __showVArrow_canBeChanged__ = true;
    }
    if ("showGArrow".equals(_variable)) {
      _model.showGArrow = getBoolean("showGArrow"); // Variables.Customization Vars:15
      __showGArrow_canBeChanged__ = true;
    }
    if ("hideD".equals(_variable)) {
      _model.hideD = getBoolean("hideD"); // Variables.Customization Vars:16
      __hideD_canBeChanged__ = true;
    }
    if ("hideV".equals(_variable)) {
      _model.hideV = getBoolean("hideV"); // Variables.Customization Vars:17
      __hideV_canBeChanged__ = true;
    }
    if ("hideA".equals(_variable)) {
      _model.hideA = getBoolean("hideA"); // Variables.Customization Vars:18
      __hideA_canBeChanged__ = true;
    }
    if ("showJointsTable".equals(_variable)) {
      _model.showJointsTable = getBoolean("showJointsTable"); // Variables.Customization Vars:19
      __showJointsTable_canBeChanged__ = true;
    }
    if ("showTable".equals(_variable)) {
      _model.showTable = getBoolean("showTable"); // Variables.Customization Vars:20
      __showTable_canBeChanged__ = true;
    }
    if ("stride".equals(_variable)) {
      _model.stride = getInt("stride"); // Variables.Customization Vars:21
      __stride_canBeChanged__ = true;
    }
    if ("tableColNames".equals(_variable)) {
      String[] _data = (String[]) getValue("tableColNames").getObject();
      int _n0 = _data.length;
      if (_n0>_model.tableColNames.length) _n0 = _model.tableColNames.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.tableColNames[_i0] = _data[_i0];
      }
      __tableColNames_canBeChanged__ = true;
    }
    if ("tableRow".equals(_variable)) {
      double[] _data = (double[]) getValue("tableRow").getObject();
      int _n0 = _data.length;
      if (_n0>_model.tableRow.length) _n0 = _model.tableRow.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.tableRow[_i0] = _data[_i0];
      }
      __tableRow_canBeChanged__ = true;
    }
    if ("visTable".equals(_variable)) {
      _model.visTable = getBoolean("visTable"); // Variables.Customization Vars:24
      __visTable_canBeChanged__ = true;
    }
    if ("visXGraph".equals(_variable)) {
      _model.visXGraph = getBoolean("visXGraph"); // Variables.Customization Vars:25
      __visXGraph_canBeChanged__ = true;
    }
    if ("visVGraph".equals(_variable)) {
      _model.visVGraph = getBoolean("visVGraph"); // Variables.Customization Vars:26
      __visVGraph_canBeChanged__ = true;
    }
    if ("visAGraph".equals(_variable)) {
      _model.visAGraph = getBoolean("visAGraph"); // Variables.Customization Vars:27
      __visAGraph_canBeChanged__ = true;
    }
    if ("visEGraph".equals(_variable)) {
      _model.visEGraph = getBoolean("visEGraph"); // Variables.Customization Vars:28
      __visEGraph_canBeChanged__ = true;
    }
    if ("showE".equals(_variable)) {
      _model.showE = getBoolean("showE"); // Variables.Customization Vars:29
      __showE_canBeChanged__ = true;
    }
    if ("visJointsTable".equals(_variable)) {
      _model.visJointsTable = getBoolean("visJointsTable"); // Variables.Customization Vars:30
      __visJointsTable_canBeChanged__ = true;
    }
  }

  public void propagateValues () {
    setValue ("_isPlaying",_simulation.isPlaying());
    setValue ("_isPaused", _simulation.isPaused());
    if(__x0_canBeChanged__) setValue("x0",_model.x0); // Variables.Constants:1
    if(__v0_canBeChanged__) setValue("v0",_model.v0); // Variables.Constants:2
    if(__xmin_canBeChanged__) setValue("xmin",_model.xmin); // Variables.Constants:3
    if(__xmax_canBeChanged__) setValue("xmax",_model.xmax); // Variables.Constants:4
    if(__ymin_canBeChanged__) setValue("ymin",_model.ymin); // Variables.Constants:5
    if(__ymax_canBeChanged__) setValue("ymax",_model.ymax); // Variables.Constants:6
    if(__vScale_canBeChanged__) setValue("vScale",_model.vScale); // Variables.Constants:7
    if(__g_canBeChanged__) setValue("g",_model.g); // Variables.Constants:8
    if(__gScale_canBeChanged__) setValue("gScale",_model.gScale); // Variables.Constants:9
    if(__xyComponents_canBeChanged__) setValue("xyComponents",_model.xyComponents); // Variables.Constants:10
    if(__xAxisTitle_canBeChanged__) setValue("xAxisTitle",_model.xAxisTitle); // Variables.Constants:11
    if(__vAxisTitle_canBeChanged__) setValue("vAxisTitle",_model.vAxisTitle); // Variables.Constants:12
    if(__aAxisTitle_canBeChanged__) setValue("aAxisTitle",_model.aAxisTitle); // Variables.Constants:13
    if(__maxTime_canBeChanged__) setValue("maxTime",_model.maxTime); // Variables.Constants:14
    if(__bounce_canBeChanged__) setValue("bounce",_model.bounce); // Variables.Constants:15
    if(__E_canBeChanged__) setValue("E",_model.E); // Variables.Constants:16
    if(__KE_canBeChanged__) setValue("KE",_model.KE); // Variables.Constants:17
    if(__PE_canBeChanged__) setValue("PE",_model.PE); // Variables.Constants:18
    if(__ng_canBeChanged__) setValue("ng",_model.ng); // Variables.Ghost Vars:1
    if(__gCounter_canBeChanged__) setValue("gCounter",_model.gCounter); // Variables.Ghost Vars:2
    if(__gStride_canBeChanged__) setValue("gStride",_model.gStride); // Variables.Ghost Vars:3
    if(__xghost_canBeChanged__) setValue("xghost",_model.xghost); // Variables.Ghost Vars:4
    if(__yghost_canBeChanged__) setValue("yghost",_model.yghost); // Variables.Ghost Vars:5
    if(__ghostColors_canBeChanged__) setValue("ghostColors",_model.ghostColors); // Variables.Ghost Vars:6
    if(__xtrack_canBeChanged__) setValue("xtrack",_model.xtrack); // Variables.Dynamical Vars:1
    if(__x_canBeChanged__) setValue("x",_model.x); // Variables.Dynamical Vars:2
    if(__vx_canBeChanged__) setValue("vx",_model.vx); // Variables.Dynamical Vars:3
    if(__t_canBeChanged__) setValue("t",_model.t); // Variables.Dynamical Vars:4
    if(__dt_canBeChanged__) setValue("dt",_model.dt); // Variables.Dynamical Vars:5
    if(__tol_canBeChanged__) setValue("tol",_model.tol); // Variables.Dynamical Vars:6
    if(__stationary_canBeChanged__) setValue("stationary",_model.stationary); // Variables.Dynamical Vars:7
    if(__nt_canBeChanged__) setValue("nt",_model.nt); // Variables.Track Vars:1
    if(__xt_canBeChanged__) setValue("xt",_model.xt); // Variables.Track Vars:2
    if(__jointsData_canBeChanged__) setValue("jointsData",_model.jointsData); // Variables.Track Vars:3
    if(__ht_canBeChanged__) setValue("ht",_model.ht); // Variables.Track Vars:4
    if(__dx_canBeChanged__) setValue("dx",_model.dx); // Variables.Track Vars:5
    if(__st_canBeChanged__) setValue("st",_model.st); // Variables.Track Vars:6
    if(__dy_canBeChanged__) setValue("dy",_model.dy); // Variables.Track Vars:7
    if(__theta_canBeChanged__) setValue("theta",_model.theta); // Variables.Track Vars:8
    if(__postWidth_canBeChanged__) setValue("postWidth",_model.postWidth); // Variables.Track Vars:9
    if(__index_canBeChanged__) setValue("index",_model.index); // Variables.Track Vars:10
    if(__segment_canBeChanged__) setValue("segment",_model.segment); // Variables.Track Vars:11
    if(__yBall_canBeChanged__) setValue("yBall",_model.yBall); // Variables.Track Vars:12
    if(__vBall_canBeChanged__) setValue("vBall",_model.vBall); // Variables.Track Vars:13
    if(__vy_canBeChanged__) setValue("vy",_model.vy); // Variables.Track Vars:14
    if(__aBall_canBeChanged__) setValue("aBall",_model.aBall); // Variables.Track Vars:15
    if(__axBall_canBeChanged__) setValue("axBall",_model.axBall); // Variables.Track Vars:16
    if(__ayBall_canBeChanged__) setValue("ayBall",_model.ayBall); // Variables.Track Vars:17
    if(__labels_canBeChanged__) setValue("labels",_model.labels); // Variables.Track Vars:18
    if(__dragMode_canBeChanged__) setValue("dragMode",_model.dragMode); // Variables.Track Vars:19
    if(__dragBall_canBeChanged__) setValue("dragBall",_model.dragBall); // Variables.Track Vars:20
    if(__saveInStudentMode_canBeChanged__) setValue("saveInStudentMode",_model.saveInStudentMode); // Variables.Customization Vars:1
    if(__studentMode_canBeChanged__) setValue("studentMode",_model.studentMode); // Variables.Customization Vars:2
    if(__fileName_canBeChanged__) setValue("fileName",_model.fileName); // Variables.Customization Vars:3
    if(__frameTitle_canBeChanged__) setValue("frameTitle",_model.frameTitle); // Variables.Customization Vars:4
    if(__showToolButton_canBeChanged__) setValue("showToolButton",_model.showToolButton); // Variables.Customization Vars:5
    if(__startMsg_canBeChanged__) setValue("startMsg",_model.startMsg); // Variables.Customization Vars:6
    if(__msg_canBeChanged__) setValue("msg",_model.msg); // Variables.Customization Vars:7
    if(__showX_canBeChanged__) setValue("showX",_model.showX); // Variables.Customization Vars:8
    if(__showV_canBeChanged__) setValue("showV",_model.showV); // Variables.Customization Vars:9
    if(__showA_canBeChanged__) setValue("showA",_model.showA); // Variables.Customization Vars:10
    if(__showTime_canBeChanged__) setValue("showTime",_model.showTime); // Variables.Customization Vars:11
    if(__showX0_canBeChanged__) setValue("showX0",_model.showX0); // Variables.Customization Vars:12
    if(__showV0_canBeChanged__) setValue("showV0",_model.showV0); // Variables.Customization Vars:13
    if(__showVArrow_canBeChanged__) setValue("showVArrow",_model.showVArrow); // Variables.Customization Vars:14
    if(__showGArrow_canBeChanged__) setValue("showGArrow",_model.showGArrow); // Variables.Customization Vars:15
    if(__hideD_canBeChanged__) setValue("hideD",_model.hideD); // Variables.Customization Vars:16
    if(__hideV_canBeChanged__) setValue("hideV",_model.hideV); // Variables.Customization Vars:17
    if(__hideA_canBeChanged__) setValue("hideA",_model.hideA); // Variables.Customization Vars:18
    if(__showJointsTable_canBeChanged__) setValue("showJointsTable",_model.showJointsTable); // Variables.Customization Vars:19
    if(__showTable_canBeChanged__) setValue("showTable",_model.showTable); // Variables.Customization Vars:20
    if(__stride_canBeChanged__) setValue("stride",_model.stride); // Variables.Customization Vars:21
    if(__tableColNames_canBeChanged__) setValue("tableColNames",_model.tableColNames); // Variables.Customization Vars:22
    if(__tableRow_canBeChanged__) setValue("tableRow",_model.tableRow); // Variables.Customization Vars:23
    if(__visTable_canBeChanged__) setValue("visTable",_model.visTable); // Variables.Customization Vars:24
    if(__visXGraph_canBeChanged__) setValue("visXGraph",_model.visXGraph); // Variables.Customization Vars:25
    if(__visVGraph_canBeChanged__) setValue("visVGraph",_model.visVGraph); // Variables.Customization Vars:26
    if(__visAGraph_canBeChanged__) setValue("visAGraph",_model.visAGraph); // Variables.Customization Vars:27
    if(__visEGraph_canBeChanged__) setValue("visEGraph",_model.visEGraph); // Variables.Customization Vars:28
    if(__showE_canBeChanged__) setValue("showE",_model.showE); // Variables.Customization Vars:29
    if(__visJointsTable_canBeChanged__) setValue("visJointsTable",_model.visJointsTable); // Variables.Customization Vars:30
  }

  @SuppressWarnings("unchecked")
  public void blockVariable(String _variable) {
    if ("x0".equals(_variable)) __x0_canBeChanged__ = false; // Variables.Constants:1
    if ("v0".equals(_variable)) __v0_canBeChanged__ = false; // Variables.Constants:2
    if ("xmin".equals(_variable)) __xmin_canBeChanged__ = false; // Variables.Constants:3
    if ("xmax".equals(_variable)) __xmax_canBeChanged__ = false; // Variables.Constants:4
    if ("ymin".equals(_variable)) __ymin_canBeChanged__ = false; // Variables.Constants:5
    if ("ymax".equals(_variable)) __ymax_canBeChanged__ = false; // Variables.Constants:6
    if ("vScale".equals(_variable)) __vScale_canBeChanged__ = false; // Variables.Constants:7
    if ("g".equals(_variable)) __g_canBeChanged__ = false; // Variables.Constants:8
    if ("gScale".equals(_variable)) __gScale_canBeChanged__ = false; // Variables.Constants:9
    if ("xyComponents".equals(_variable)) __xyComponents_canBeChanged__ = false; // Variables.Constants:10
    if ("xAxisTitle".equals(_variable)) __xAxisTitle_canBeChanged__ = false; // Variables.Constants:11
    if ("vAxisTitle".equals(_variable)) __vAxisTitle_canBeChanged__ = false; // Variables.Constants:12
    if ("aAxisTitle".equals(_variable)) __aAxisTitle_canBeChanged__ = false; // Variables.Constants:13
    if ("maxTime".equals(_variable)) __maxTime_canBeChanged__ = false; // Variables.Constants:14
    if ("bounce".equals(_variable)) __bounce_canBeChanged__ = false; // Variables.Constants:15
    if ("E".equals(_variable)) __E_canBeChanged__ = false; // Variables.Constants:16
    if ("KE".equals(_variable)) __KE_canBeChanged__ = false; // Variables.Constants:17
    if ("PE".equals(_variable)) __PE_canBeChanged__ = false; // Variables.Constants:18
    if ("ng".equals(_variable)) __ng_canBeChanged__ = false; // Variables.Ghost Vars:1
    if ("gCounter".equals(_variable)) __gCounter_canBeChanged__ = false; // Variables.Ghost Vars:2
    if ("gStride".equals(_variable)) __gStride_canBeChanged__ = false; // Variables.Ghost Vars:3
    if ("xghost".equals(_variable)) __xghost_canBeChanged__ = false; // Variables.Ghost Vars:4
    if ("yghost".equals(_variable)) __yghost_canBeChanged__ = false; // Variables.Ghost Vars:5
    if ("ghostColors".equals(_variable)) __ghostColors_canBeChanged__ = false; // Variables.Ghost Vars:6
    if ("xtrack".equals(_variable)) __xtrack_canBeChanged__ = false; // Variables.Dynamical Vars:1
    if ("x".equals(_variable)) __x_canBeChanged__ = false; // Variables.Dynamical Vars:2
    if ("vx".equals(_variable)) __vx_canBeChanged__ = false; // Variables.Dynamical Vars:3
    if ("t".equals(_variable)) __t_canBeChanged__ = false; // Variables.Dynamical Vars:4
    if ("dt".equals(_variable)) __dt_canBeChanged__ = false; // Variables.Dynamical Vars:5
    if ("tol".equals(_variable)) __tol_canBeChanged__ = false; // Variables.Dynamical Vars:6
    if ("stationary".equals(_variable)) __stationary_canBeChanged__ = false; // Variables.Dynamical Vars:7
    if ("nt".equals(_variable)) __nt_canBeChanged__ = false; // Variables.Track Vars:1
    if ("xt".equals(_variable)) __xt_canBeChanged__ = false; // Variables.Track Vars:2
    if ("jointsData".equals(_variable)) __jointsData_canBeChanged__ = false; // Variables.Track Vars:3
    if ("ht".equals(_variable)) __ht_canBeChanged__ = false; // Variables.Track Vars:4
    if ("dx".equals(_variable)) __dx_canBeChanged__ = false; // Variables.Track Vars:5
    if ("st".equals(_variable)) __st_canBeChanged__ = false; // Variables.Track Vars:6
    if ("dy".equals(_variable)) __dy_canBeChanged__ = false; // Variables.Track Vars:7
    if ("theta".equals(_variable)) __theta_canBeChanged__ = false; // Variables.Track Vars:8
    if ("postWidth".equals(_variable)) __postWidth_canBeChanged__ = false; // Variables.Track Vars:9
    if ("index".equals(_variable)) __index_canBeChanged__ = false; // Variables.Track Vars:10
    if ("segment".equals(_variable)) __segment_canBeChanged__ = false; // Variables.Track Vars:11
    if ("yBall".equals(_variable)) __yBall_canBeChanged__ = false; // Variables.Track Vars:12
    if ("vBall".equals(_variable)) __vBall_canBeChanged__ = false; // Variables.Track Vars:13
    if ("vy".equals(_variable)) __vy_canBeChanged__ = false; // Variables.Track Vars:14
    if ("aBall".equals(_variable)) __aBall_canBeChanged__ = false; // Variables.Track Vars:15
    if ("axBall".equals(_variable)) __axBall_canBeChanged__ = false; // Variables.Track Vars:16
    if ("ayBall".equals(_variable)) __ayBall_canBeChanged__ = false; // Variables.Track Vars:17
    if ("labels".equals(_variable)) __labels_canBeChanged__ = false; // Variables.Track Vars:18
    if ("dragMode".equals(_variable)) __dragMode_canBeChanged__ = false; // Variables.Track Vars:19
    if ("dragBall".equals(_variable)) __dragBall_canBeChanged__ = false; // Variables.Track Vars:20
    if ("saveInStudentMode".equals(_variable)) __saveInStudentMode_canBeChanged__ = false; // Variables.Customization Vars:1
    if ("studentMode".equals(_variable)) __studentMode_canBeChanged__ = false; // Variables.Customization Vars:2
    if ("fileName".equals(_variable)) __fileName_canBeChanged__ = false; // Variables.Customization Vars:3
    if ("frameTitle".equals(_variable)) __frameTitle_canBeChanged__ = false; // Variables.Customization Vars:4
    if ("showToolButton".equals(_variable)) __showToolButton_canBeChanged__ = false; // Variables.Customization Vars:5
    if ("startMsg".equals(_variable)) __startMsg_canBeChanged__ = false; // Variables.Customization Vars:6
    if ("msg".equals(_variable)) __msg_canBeChanged__ = false; // Variables.Customization Vars:7
    if ("showX".equals(_variable)) __showX_canBeChanged__ = false; // Variables.Customization Vars:8
    if ("showV".equals(_variable)) __showV_canBeChanged__ = false; // Variables.Customization Vars:9
    if ("showA".equals(_variable)) __showA_canBeChanged__ = false; // Variables.Customization Vars:10
    if ("showTime".equals(_variable)) __showTime_canBeChanged__ = false; // Variables.Customization Vars:11
    if ("showX0".equals(_variable)) __showX0_canBeChanged__ = false; // Variables.Customization Vars:12
    if ("showV0".equals(_variable)) __showV0_canBeChanged__ = false; // Variables.Customization Vars:13
    if ("showVArrow".equals(_variable)) __showVArrow_canBeChanged__ = false; // Variables.Customization Vars:14
    if ("showGArrow".equals(_variable)) __showGArrow_canBeChanged__ = false; // Variables.Customization Vars:15
    if ("hideD".equals(_variable)) __hideD_canBeChanged__ = false; // Variables.Customization Vars:16
    if ("hideV".equals(_variable)) __hideV_canBeChanged__ = false; // Variables.Customization Vars:17
    if ("hideA".equals(_variable)) __hideA_canBeChanged__ = false; // Variables.Customization Vars:18
    if ("showJointsTable".equals(_variable)) __showJointsTable_canBeChanged__ = false; // Variables.Customization Vars:19
    if ("showTable".equals(_variable)) __showTable_canBeChanged__ = false; // Variables.Customization Vars:20
    if ("stride".equals(_variable)) __stride_canBeChanged__ = false; // Variables.Customization Vars:21
    if ("tableColNames".equals(_variable)) __tableColNames_canBeChanged__ = false; // Variables.Customization Vars:22
    if ("tableRow".equals(_variable)) __tableRow_canBeChanged__ = false; // Variables.Customization Vars:23
    if ("visTable".equals(_variable)) __visTable_canBeChanged__ = false; // Variables.Customization Vars:24
    if ("visXGraph".equals(_variable)) __visXGraph_canBeChanged__ = false; // Variables.Customization Vars:25
    if ("visVGraph".equals(_variable)) __visVGraph_canBeChanged__ = false; // Variables.Customization Vars:26
    if ("visAGraph".equals(_variable)) __visAGraph_canBeChanged__ = false; // Variables.Customization Vars:27
    if ("visEGraph".equals(_variable)) __visEGraph_canBeChanged__ = false; // Variables.Customization Vars:28
    if ("showE".equals(_variable)) __showE_canBeChanged__ = false; // Variables.Customization Vars:29
    if ("visJointsTable".equals(_variable)) __visJointsTable_canBeChanged__ = false; // Variables.Customization Vars:30
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
      .setProperty("title","%frameTitle%")
      .setProperty("layout","border")
      .setProperty("visible","true")
      .setProperty("location","11,23")
      .setProperty("size","789,393")
      .getObject();
    tracksPlottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"tracksPlottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","mainFrame")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("minimumX","xmin")
      .setProperty("maximumX","xmax")
      .setProperty("minimumY","ymin")
      .setProperty("maximumY","ymax")
      .setProperty("square","true")
      .setProperty("menu","%_model._method_for_tracksPlottingPanel_menu()%" )
      .setProperty("titleX","x")
      .setProperty("titleY","")
      .setProperty("TLmessage","%msg%")
      .getObject();
    groundShape = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"groundShape")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("sizeX","%_model._method_for_groundShape_sizeX()%" )
      .setProperty("sizeY","%_model._method_for_groundShape_sizeY()%" )
      .setProperty("measured","false")
      .setProperty("style","RECTANGLE")
      .setProperty("elementposition","NORTH")
      .setProperty("fillColor","GREEN")
      .getObject();
    postSet = (org.opensourcephysics.drawing2d.Set)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShapeSet2D(),"postSet")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("x","xt")
      .setProperty("y","ht")
      .setProperty("sizeX","postWidth")
      .setProperty("sizeY","ht")
      .setProperty("enabledPosition","dragMode")
      .setProperty("sensitivity","15")
      .setProperty("elementSelected","index")
      .setProperty("dragAction","_model._method_for_postSet_dragAction()" )
      .setProperty("style","RECTANGLE")
      .setProperty("elementposition","NORTH")
      .setProperty("fillColor","GRAY")
      .getObject();
    trackSet = (org.opensourcephysics.drawing2d.Set)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShapeSet2D(),"trackSet")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("numberOfElements","%_model._method_for_trackSet_numberOfElements()%" )
      .setProperty("x","xt")
      .setProperty("y","ht")
      .setProperty("sizeX","st")
      .setProperty("sizeY","postWidth")
      .setProperty("transformation","theta")
      .setProperty("measured","false")
      .setProperty("enabledPosition","ENABLED_NONE")
      .setProperty("sensitivity","0")
      .setProperty("elementSelected","index")
      .setProperty("dragAction","_model._method_for_trackSet_dragAction()" )
      .setProperty("style","RECTANGLE")
      .setProperty("elementposition","WEST")
      .setProperty("fillColor","BLUE")
      .getObject();
    ghostSet = (org.opensourcephysics.drawing2d.Set)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShapeSet2D(),"ghostSet")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("numberOfElements","ng")
      .setProperty("x","xghost")
      .setProperty("y","yghost")
      .setProperty("sizeX","%_model._method_for_ghostSet_sizeX()%" )
      .setProperty("sizeY","%_model._method_for_ghostSet_sizeY()%" )
      .setProperty("visible","%_model._method_for_ghostSet_visible()%" )
      .setProperty("measured","false")
      .setProperty("enabledPosition","false")
      .setProperty("elementposition","CENTERED")
      .setProperty("fillColor","ghostColors")
      .setProperty("drawingLines","false")
      .getObject();
    ballGroup = (org.opensourcephysics.drawing2d.Group)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlGroup2D(),"ballGroup")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("x","x")
      .setProperty("y","yBall")
      .setProperty("sizeX","1")
      .setProperty("sizeY","1")
      .setProperty("transformation","%_model._method_for_ballGroup_transformation()%" )
      .setProperty("measured","false")
      .getObject();
    ballShape = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"ballShape")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","ballGroup")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("sizeX","%_model._method_for_ballShape_sizeX()%" )
      .setProperty("sizeY","%_model._method_for_ballShape_sizeY()%" )
      .setProperty("measured","false")
      .setProperty("enabledPosition","dragBall")
      .setProperty("movesGroup","true")
      .setProperty("sensitivity","0")
      .setProperty("dragAction","_model._method_for_ballShape_dragAction()" )
      .setProperty("releaseAction","_model._method_for_ballShape_releaseAction()" )
      .setProperty("elementposition","CENTERED")
      .setProperty("fillColor","RED")
      .getObject();
    vArrow = (org.opensourcephysics.drawing2d.ElementArrow)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlArrow2D(),"vArrow")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","ballGroup")
      .setProperty("x","0")
      .setProperty("y","%_model._method_for_vArrow_y()%" )
      .setProperty("sizeX","vBall")
      .setProperty("sizeY","0")
      .setProperty("scalex","vScale")
      .setProperty("scaley","vScale")
      .setProperty("visible","showVArrow")
      .setProperty("measured","false")
      .setProperty("fillColor","RED")
      .setProperty("lineWidth","2")
      .getObject();
    vText = (org.opensourcephysics.drawing2d.ElementText)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlText2D(),"vText")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","ballGroup")
      .setProperty("x","%_model._method_for_vText_x()%" )
      .setProperty("y","postWidth")
      .setProperty("pixelSize","true")
      .setProperty("visible","showVArrow")
      .setProperty("measured","false")
      .setProperty("text","V")
      .setProperty("font","Monospaced,BOLD,14")
      .getObject();
    gArrow = (org.opensourcephysics.drawing2d.ElementArrow)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlArrow2D(),"gArrow")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("x","x")
      .setProperty("y","yBall")
      .setProperty("sizeX","0")
      .setProperty("sizeY","%_model._method_for_gArrow_sizeY()%" )
      .setProperty("scalex","gScale")
      .setProperty("scaley","gScale")
      .setProperty("visible","showGArrow")
      .setProperty("measured","false")
      .setProperty("fillColor","GREEN")
      .setProperty("lineWidth","2")
      .getObject();
    gText = (org.opensourcephysics.drawing2d.ElementText)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlText2D(),"gText")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("x","%_model._method_for_gText_x()%" )
      .setProperty("y","%_model._method_for_gText_y()%" )
      .setProperty("pixelSize","true")
      .setProperty("visible","showGArrow")
      .setProperty("measured","false")
      .setProperty("text","g")
      .setProperty("font","Monospaced,BOLD,14")
      .getObject();
    textSet = (org.opensourcephysics.drawing2d.Set)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTextSet2D(),"textSet")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tracksPlottingPanel")
      .setProperty("numberOfElements","nt")
      .setProperty("x","xt")
      .setProperty("y","-0.6")
      .setProperty("text","%labels%")
      .setProperty("font","Monospaced,BOLD,16")
      .getObject();
    controlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"controlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","mainFrame")
      .setProperty("layout","BORDER:0,0")
      .setProperty("borderType","LOWERED_ETCHED")
      .setProperty("menu","%_model._method_for_controlPanel_menu()%" )
      .getObject();
    buttonPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"buttonPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","controlPanel")
      .setProperty("layout","GRID:1,0,0,0")
      .setProperty("size","200,23")
      .setProperty("menu","%_model._method_for_buttonPanel_menu()%" )
      .getObject();
    startButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"startButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","buttonPanel")
      .setProperty("variable","_isPaused")
      .setProperty("immediateAction","true")
      .setProperty("enabled","%_model._method_for_startButton_enabled()%" )
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
      .setProperty("enabled","%_model._method_for_stepButton_enabled()%" )
      .setProperty("action","_model._method_for_stepButton_action()" )
      .setProperty("tooltip","Setp the simulation")
      .getObject();
    resetTimeButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetTimeButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("action","_model._method_for_resetTimeButton_action()" )
      .setProperty("tooltip","Reset the time")
      .getObject();
    docButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"docButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/value.gif")
      .setProperty("action","_model._method_for_docButton_action()" )
      .setProperty("visible","%_model._method_for_docButton_visible()%" )
      .setProperty("tooltip","Load documentation file")
      .getObject();
    toolButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"toolButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","buttonPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/wrench_monkey.gif")
      .setProperty("action","_model._method_for_toolButton_action()" )
      .setProperty("visible","showToolButton")
      .getObject();
    initialConditions = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"initialConditions")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","controlPanel")
      .setProperty("layout","FLOW:right,0,0")
      .setProperty("menu","%_model._method_for_initialConditions_menu()%" )
      .getObject();
    x0Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"x0Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","initialConditions")
      .setProperty("layout","border")
      .setProperty("visible","showX0")
      .getObject();
    x0Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"x0Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","x0Panel")
      .setProperty("text"," x0 =")
      .setProperty("alignment","RIGHT")
      .getObject();
    x0Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"x0Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","x0Panel")
      .setProperty("variable","x0")
      .setProperty("format","0.###")
      .setProperty("editable","%_model._method_for_x0Field_editable()%" )
      .setProperty("action","_model._method_for_x0Field_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,24")
      .getObject();
    v0Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"v0Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","initialConditions")
      .setProperty("layout","border")
      .setProperty("visible","showV0")
      .getObject();
    v0Label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"v0Label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","v0Panel")
      .setProperty("text"," v0 =")
      .setProperty("alignment","RIGHT")
      .getObject();
    v0Field = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"v0Field")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","v0Panel")
      .setProperty("variable","v0")
      .setProperty("format","0.###")
      .setProperty("editable","%_model._method_for_v0Field_editable()%" )
      .setProperty("action","_model._method_for_v0Field_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,24")
      .getObject();
    tPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"tPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","initialConditions")
      .setProperty("layout","border")
      .setProperty("visible","showTime")
      .getObject();
    tLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","tPanel")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT")
      .getObject();
    tField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"tField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","tPanel")
      .setProperty("variable","t")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    checkPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"checkPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","controlPanel")
      .setProperty("layout","HBOX")
      .setProperty("visible","%_model._method_for_checkPanel_visible()%" )
      .getObject();
    tableCheckPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"tableCheckPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","checkPanel")
      .setProperty("layout","HBOX")
      .setProperty("visible","%_model._method_for_tableCheckPanel_visible()%" )
      .getObject();
    tableLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tableLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tableCheckPanel")
      .setProperty("text"," Table:")
      .getObject();
    showTableCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showTableCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tableCheckPanel")
      .setProperty("variable","visTable")
      .setProperty("text","data")
      .setProperty("visible","showTable")
      .getObject();
    showJointsTableCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showJointsTableCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","tableCheckPanel")
      .setProperty("variable","visJointsTable")
      .setProperty("text","joints")
      .setProperty("visible","showJointsTable")
      .getObject();
    graphCheckPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"graphCheckPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","checkPanel")
      .setProperty("layout","HBOX")
      .setProperty("visible","%_model._method_for_graphCheckPanel_visible()%" )
      .getObject();
    graphLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"graphLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphCheckPanel")
      .setProperty("text"," Graph:")
      .getObject();
    showXGraphCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showXGraphCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphCheckPanel")
      .setProperty("variable","visXGraph")
      .setProperty("text","x(t)")
      .setProperty("visible","showX")
      .getObject();
    showVGraphCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showVGraphCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphCheckPanel")
      .setProperty("variable","visVGraph")
      .setProperty("text","v(t)")
      .setProperty("visible","showV")
      .getObject();
    showAGraphCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showAGraphCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphCheckPanel")
      .setProperty("variable","visAGraph")
      .setProperty("text","a(t)")
      .setProperty("visible","showA")
      .getObject();
    showEnergyGraphCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"showEnergyGraphCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphCheckPanel")
      .setProperty("variable","visEGraph")
      .setProperty("text","E(t)")
      .setProperty("visible","showE")
      .getObject();
    dataFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"dataFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Track data")
      .setProperty("layout","border")
      .setProperty("visible","visTable")
      .setProperty("location","689,448")
      .setProperty("size","299,300")
      .setProperty("menu","%_model._method_for_dataFrame_menu()%" )
      .getObject();
    optionPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"optionPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","dataFrame")
      .setProperty("layout","FLOW:center,0,0")
      .setProperty("visible","%_model._method_for_optionPanel_visible()%" )
      .getObject();
    hidelLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"hidelLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","optionPanel")
      .setProperty("text","Hide columns: ")
      .getObject();
    hideXCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"hideXCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","optionPanel")
      .setProperty("variable","hideD")
      .setProperty("text","x")
      .setProperty("action","_model._method_for_hideXCheck_action()" )
      .getObject();
    hideVCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"hideVCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","optionPanel")
      .setProperty("variable","hideV")
      .setProperty("text","v")
      .setProperty("action","_model._method_for_hideVCheck_action()" )
      .getObject();
    hideACheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"hideACheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","optionPanel")
      .setProperty("variable","hideA")
      .setProperty("text","a")
      .setProperty("action","_model._method_for_hideACheck_action()" )
      .getObject();
    xyDataTable = (org.opensourcephysics.display.DataPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlDataTable(),"xyDataTable")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","dataFrame")
      .setProperty("input","tableRow")
      .setProperty("maxPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("stride","stride")
      .setProperty("showRowNumber","false")
      .setProperty("columnNames","%tableColNames%")
      .getObject();
    createControl50();
  }

  private void createControl50() {
    tableControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"tableControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","dataFrame")
      .setProperty("layout","border")
      .setProperty("borderType","LOWERED_ETCHED")
      .setProperty("menu","%_model._method_for_tableControlPanel_menu()%" )
      .getObject();
    eraseTableButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"eraseTableButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","tableControlPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("action","_model._method_for_eraseTableButton_action()" )
      .setProperty("tooltip","Clear the data table")
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
      .setProperty("text"," stride = ")
      .getObject();
    strideField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"strideField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","stridePanel")
      .setProperty("variable","stride")
      .setProperty("format","0")
      .setProperty("columns","3")
      .getObject();
    positionFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"positionFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Distance Plot")
      .setProperty("layout","border")
      .setProperty("visible","visXGraph")
      .setProperty("location","3,442")
      .setProperty("size","355,299")
      .getObject();
    positionPlottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"positionPlottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","positionFrame")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("maximumX","%_model._method_for_positionPlottingPanel_maximumX()%" )
      .setProperty("yMarginPercentage","5")
      .setProperty("menu","%_model._method_for_positionPlottingPanel_menu()%" )
      .setProperty("titleX","t")
      .setProperty("titleY","%xAxisTitle%")
      .getObject();
    xtrackTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"xtrackTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","positionPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","xtrack")
      .setProperty("visible","%_model._method_for_xtrackTrail_visible()%" )
      .setProperty("measured","%_model._method_for_xtrackTrail_measured()%" )
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","x track")
      .getObject();
    xMarker = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"xMarker")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","positionPlottingPanel")
      .setProperty("x","t")
      .setProperty("y","xtrack")
      .setProperty("sizeX","6")
      .setProperty("sizeY","6")
      .setProperty("pixelSize","true")
      .setProperty("visible","%_model._method_for_xMarker_visible()%" )
      .setProperty("measured","false")
      .setProperty("fillColor","PINK")
      .getObject();
    xTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"xTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","positionPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","x")
      .setProperty("visible","xyComponents")
      .setProperty("measured","xyComponents")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","x Ball")
      .getObject();
    yBallTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"yBallTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","positionPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","yBall")
      .setProperty("visible","xyComponents")
      .setProperty("measured","xyComponents")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","y Ball")
      .getObject();
    positionControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"positionControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","positionFrame")
      .setProperty("layout","border")
      .setProperty("borderType","LOWERED_ETCHED")
      .setProperty("menu","%_model._method_for_positionControlPanel_menu()%" )
      .getObject();
    erasePositionButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"erasePositionButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","positionControlPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("action","_model._method_for_erasePositionButton_action()" )
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the x-graph")
      .getObject();
    positionVarsPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"positionVarsPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","positionControlPanel")
      .setProperty("layout","HBOX")
      .setProperty("menu","%_model._method_for_positionVarsPanel_menu()%" )
      .getObject();
    xtrackPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"xtrackPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","positionVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","%_model._method_for_xtrackPanel_visible()%" )
      .getObject();
    xtrackLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"xtrackLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","xtrackPanel")
      .setProperty("text"," x track =")
      .setProperty("alignment","RIGHT")
      .getObject();
    xtrackField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"xtrackField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","xtrackPanel")
      .setProperty("variable","xtrack")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    xcompoentPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"xcompoentPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","positionVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","xyComponents")
      .getObject();
    xcomponentLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"xcomponentLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","xcompoentPanel")
      .setProperty("text"," x =")
      .setProperty("alignment","RIGHT")
      .getObject();
    xcomponentField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"xcomponentField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","xcompoentPanel")
      .setProperty("variable","x")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    ycompoentPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"ycompoentPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","positionVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","xyComponents")
      .getObject();
    ycomponentLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"ycomponentLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","ycompoentPanel")
      .setProperty("text"," y =")
      .setProperty("alignment","RIGHT")
      .getObject();
    ycomponentField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"ycomponentField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","ycompoentPanel")
      .setProperty("variable","yBall")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    timePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"timePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","positionVarsPanel")
      .setProperty("layout","border")
      .getObject();
    tpLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tpLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","timePanel")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT")
      .getObject();
    tpField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"tpField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","timePanel")
      .setProperty("variable","t")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    velocityFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"velocityFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Velocity Plot")
      .setProperty("layout","border")
      .setProperty("visible","visVGraph")
      .setProperty("location","373,445")
      .setProperty("size","300,300")
      .getObject();
    velocityPlottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"velocityPlottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","velocityFrame")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("maximumX","%_model._method_for_velocityPlottingPanel_maximumX()%" )
      .setProperty("yMarginPercentage","5")
      .setProperty("menu","%_model._method_for_velocityPlottingPanel_menu()%" )
      .setProperty("titleX","t")
      .setProperty("titleY","%vAxisTitle%")
      .getObject();
    vTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"vTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","velocityPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","vBall")
      .setProperty("visible","%_model._method_for_vTrail_visible()%" )
      .setProperty("measured","%_model._method_for_vTrail_measured()%" )
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","v")
      .getObject();
    yMarker = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"yMarker")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","velocityPlottingPanel")
      .setProperty("x","t")
      .setProperty("y","vBall")
      .setProperty("sizeX","6")
      .setProperty("sizeY","6")
      .setProperty("pixelSize","true")
      .setProperty("visible","%_model._method_for_yMarker_visible()%" )
      .setProperty("measured","false")
      .setProperty("fillColor","PINK")
      .getObject();
    vxTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"vxTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","velocityPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","vx")
      .setProperty("visible","xyComponents")
      .setProperty("measured","xyComponents")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","vx")
      .getObject();
    vyTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"vyTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","velocityPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","vy")
      .setProperty("visible","xyComponents")
      .setProperty("measured","xyComponents")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","vy")
      .getObject();
    vControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","velocityFrame")
      .setProperty("layout","border")
      .setProperty("borderType","LOWERED_ETCHED")
      .setProperty("menu","%_model._method_for_vControlPanel_menu()%" )
      .getObject();
    eraseVelocityButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"eraseVelocityButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vControlPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("action","_model._method_for_eraseVelocityButton_action()" )
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the v-graph")
      .getObject();
    velocityVarsPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"velocityVarsPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","vControlPanel")
      .setProperty("layout","HBOX")
      .setProperty("menu","%_model._method_for_velocityVarsPanel_menu()%" )
      .getObject();
    vPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","velocityVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","%_model._method_for_vPanel_visible()%" )
      .getObject();
    vLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"vLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vPanel")
      .setProperty("text"," v =")
      .setProperty("alignment","RIGHT")
      .getObject();
    vField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","vPanel")
      .setProperty("variable","vBall")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    vxPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vxPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","velocityVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","xyComponents")
      .getObject();
    vxLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"vxLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vxPanel")
      .setProperty("text"," vx =")
      .setProperty("alignment","RIGHT")
      .getObject();
    vxField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vxField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","vxPanel")
      .setProperty("variable","vx")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    vyPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"vyPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","velocityVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","xyComponents")
      .getObject();
    vyLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"vyLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","vyPanel")
      .setProperty("text"," vy =")
      .setProperty("alignment","RIGHT")
      .getObject();
    vyField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vyField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","vyPanel")
      .setProperty("variable","vy")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    timePanel2 = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"timePanel2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","velocityVarsPanel")
      .setProperty("layout","border")
      .getObject();
    tpLabel2 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tpLabel2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","timePanel2")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT")
      .getObject();
    tpField2 = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"tpField2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","timePanel2")
      .setProperty("variable","t")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    accelerationFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"accelerationFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Acceleration Plot")
      .setProperty("layout","border")
      .setProperty("visible","visAGraph")
      .setProperty("location","78,585")
      .setProperty("size","300,300")
      .getObject();
    accelerationPlottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"accelerationPlottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","accelerationFrame")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("maximumX","%_model._method_for_accelerationPlottingPanel_maximumX()%" )
      .setProperty("yMarginPercentage","5")
      .setProperty("menu","%_model._method_for_accelerationPlottingPanel_menu()%" )
      .setProperty("titleX","t")
      .setProperty("titleY","%aAxisTitle%")
      .getObject();
    aTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"aTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","accelerationPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","aBall")
      .setProperty("visible","%_model._method_for_aTrail_visible()%" )
      .setProperty("measured","%_model._method_for_aTrail_measured()%" )
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","v")
      .getObject();
    createControl100();
  }

  private void createControl100() {
    aMarker = (org.opensourcephysics.drawing2d.ElementShape)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlShape2D(),"aMarker")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","accelerationPlottingPanel")
      .setProperty("x","t")
      .setProperty("y","aBall")
      .setProperty("sizeX","6")
      .setProperty("sizeY","6")
      .setProperty("pixelSize","true")
      .setProperty("visible","%_model._method_for_aMarker_visible()%" )
      .setProperty("measured","false")
      .setProperty("fillColor","PINK")
      .getObject();
    axTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"axTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","accelerationPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","axBall")
      .setProperty("visible","xyComponents")
      .setProperty("measured","xyComponents")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ax")
      .getObject();
    ayTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"ayTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","accelerationPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","axBall")
      .setProperty("visible","xyComponents")
      .setProperty("measured","xyComponents")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ay")
      .getObject();
    aControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"aControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","accelerationFrame")
      .setProperty("layout","border")
      .setProperty("borderType","LOWERED_ETCHED")
      .setProperty("menu","%_model._method_for_aControlPanel_menu()%" )
      .getObject();
    eraseAccelerationButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"eraseAccelerationButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","aControlPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("action","_model._method_for_eraseAccelerationButton_action()" )
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the v-graph")
      .getObject();
    accelerationVarsPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"accelerationVarsPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","aControlPanel")
      .setProperty("layout","HBOX")
      .setProperty("menu","%_model._method_for_accelerationVarsPanel_menu()%" )
      .getObject();
    aPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"aPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","accelerationVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","%_model._method_for_aPanel_visible()%" )
      .getObject();
    aLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"aLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","aPanel")
      .setProperty("text"," a =")
      .setProperty("alignment","RIGHT")
      .getObject();
    aField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"aField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","aPanel")
      .setProperty("variable","aBall")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    axPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"axPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","accelerationVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","xyComponents")
      .getObject();
    axLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"axLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","axPanel")
      .setProperty("text"," ax =")
      .setProperty("alignment","RIGHT")
      .getObject();
    axField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"axField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","axPanel")
      .setProperty("variable","axBall")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    ayPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"ayPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","accelerationVarsPanel")
      .setProperty("layout","border")
      .setProperty("visible","xyComponents")
      .getObject();
    ayLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"ayLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","ayPanel")
      .setProperty("text"," ay =")
      .setProperty("alignment","RIGHT")
      .getObject();
    ayField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"ayField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","ayPanel")
      .setProperty("variable","ayBall")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    timePanel22 = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"timePanel22")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","accelerationVarsPanel")
      .setProperty("layout","border")
      .getObject();
    tpLabel22 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tpLabel22")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","timePanel22")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT")
      .getObject();
    tpField22 = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"tpField22")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","timePanel22")
      .setProperty("variable","t")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    energyFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"energyFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Energy Plot")
      .setProperty("layout","border")
      .setProperty("visible","visEGraph")
      .setProperty("location","811,166")
      .setProperty("size","430,299")
      .getObject();
    energyPlottingPanel = (org.opensourcephysics.drawing2d.PlottingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlPlottingPanel(),"energyPlottingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","energyFrame")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("maximumX","%_model._method_for_energyPlottingPanel_maximumX()%" )
      .setProperty("yMarginPercentage","5")
      .setProperty("menu","%_model._method_for_energyPlottingPanel_menu()%" )
      .setProperty("titleX","t")
      .setProperty("titleY","energy/mass")
      .getObject();
    energyTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"energyTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","energyPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","E")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","energy")
      .getObject();
    keTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"keTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","energyPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","KE")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ke")
      .getObject();
    peTrail = (org.opensourcephysics.drawing2d.ElementTrail)
      addElement(new org.colos.ejs.library.control.drawing2d.ControlTrail2D(),"peTrail")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","energyPlottingPanel")
      .setProperty("inputX","t")
      .setProperty("inputY","PE")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","pe")
      .getObject();
    energyControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"energyControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","energyFrame")
      .setProperty("layout","border")
      .setProperty("borderType","LOWERED_ETCHED")
      .setProperty("menu","%_model._method_for_energyControlPanel_menu()%" )
      .getObject();
    eraseEnergyButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"eraseEnergyButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","energyControlPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("action","_model._method_for_eraseEnergyButton_action()" )
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the energy-graph")
      .getObject();
    energyVarsPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"energyVarsPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","energyControlPanel")
      .setProperty("layout","HBOX")
      .setProperty("menu","%_model._method_for_energyVarsPanel_menu()%" )
      .getObject();
    kePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"kePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","energyVarsPanel")
      .setProperty("layout","border")
      .getObject();
    keLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"keLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","kePanel")
      .setProperty("text"," KE =")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","RED")
      .getObject();
    keField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"keField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","kePanel")
      .setProperty("variable","KE")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","3")
      .setProperty("size","0,23")
      .setProperty("tooltip","Kinetic energy per unit mass")
      .getObject();
    pePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"pePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","energyVarsPanel")
      .setProperty("layout","border")
      .getObject();
    peLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"peLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","pePanel")
      .setProperty("text"," PE =")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","BLUE")
      .getObject();
    peField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"peField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","pePanel")
      .setProperty("variable","PE")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .setProperty("tooltip","Potential energy per unit mass")
      .getObject();
    energyPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"energyPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","energyVarsPanel")
      .setProperty("layout","border")
      .getObject();
    energyLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"energyLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","energyPanel")
      .setProperty("text"," E =")
      .setProperty("alignment","RIGHT")
      .getObject();
    energyField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"energyField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","energyPanel")
      .setProperty("variable","E")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","3")
      .setProperty("size","0,23")
      .setProperty("tooltip","Total energy per unit mass")
      .getObject();
    timePanel3 = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"timePanel3")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","energyVarsPanel")
      .setProperty("layout","border")
      .getObject();
    tpLabel3 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"tpLabel3")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","timePanel3")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT")
      .getObject();
    tpField3 = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"tpField3")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","timePanel3")
      .setProperty("variable","t")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .getObject();
    jointsFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"jointsFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Joints Data")
      .setProperty("layout","border")
      .setProperty("visible","visJointsTable")
      .setProperty("location","135,379")
      .setProperty("size","401,300")
      .setProperty("menu","%_model._method_for_jointsFrame_menu()%" )
      .getObject();
    jointsArrayPanel = (org.opensourcephysics.display.EjsArrayPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlArrayPanel(),"jointsArrayPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","jointsFrame")
      .setProperty("data","jointsData")
      .setProperty("static","false")
      .setProperty("transposed","true")
      .setProperty("format","0.00#")
      .setProperty("editable","true")
      .setProperty("columnsLocked","new boolean[]{true,false,false}")
      .setProperty("action","_model._method_for_jointsArrayPanel_action()" )
      .setProperty("columnNames","new String[ ]{\"#\",\"x\",\"h\"}")
      .getObject();
    customizationFrame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"customizationFrame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("waitForReset","true")
      .setProperty("title","Customization")
      .setProperty("layout","border")
      .setProperty("visible","%_model._method_for_customizationFrame_visible()%" )
      .setProperty("location","646,23")
      .setProperty("size","950,108")
      .getObject();
    teacherControlPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"teacherControlPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","customizationFrame")
      .setProperty("layout","VBOX")
      .setProperty("visible","%_model._method_for_teacherControlPanel_visible()%" )
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    displayPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"displayPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","teacherControlPanel")
      .setProperty("layout","HBOX")
      .setProperty("visible","%_model._method_for_displayPanel_visible()%" )
      .setProperty("borderType","LOWERED_ETCHED")
      .getObject();
    dataPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"dataPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","displayPanel")
      .setProperty("layout","FLOW:center,0,0")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Data")
      .getObject();
    tableCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"tableCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","dataPanel")
      .setProperty("variable","showTable")
      .setProperty("text","table")
      .setProperty("tooltip","Show the data table")
      .getObject();
    toolCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"toolCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","dataPanel")
      .setProperty("variable","showToolButton")
      .setProperty("text","tool")
      .setProperty("tooltip","Show the data tool")
      .getObject();
    jointsTableCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"jointsTableCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","dataPanel")
      .setProperty("variable","showJointsTable")
      .setProperty("text","joints")
      .setProperty("tooltip","Show the data table")
      .getObject();
    dragPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"dragPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","displayPanel")
      .setProperty("layout","HBOX")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Drag")
      .getObject();
    dragJointsCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"dragJointsCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","dragPanel")
      .setProperty("text","joints")
      .setProperty("actionon","_model._method_for_dragJointsCheck_actionon()" )
      .setProperty("actionoff","_model._method_for_dragJointsCheck_actionoff()" )
      .setProperty("tooltip","Drag the joints to change height")
      .getObject();
    dragBallCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"dragBallCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","dragPanel")
      .setProperty("variable","dragBall")
      .setProperty("text","ball")
      .getObject();
    createControl150();
  }

  private void createControl150() {
    decorationPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"decorationPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","displayPanel")
      .setProperty("layout","HBOX")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Decoration & Interaction")
      .getObject();
    velocityCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"velocityCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","decorationPanel")
      .setProperty("variable","showVArrow")
      .setProperty("text","v scale:")
      .setProperty("tooltip","Show velocity vector")
      .getObject();
    vScaleField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"vScaleField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decorationPanel")
      .setProperty("variable","vScale")
      .setProperty("format","0.#")
      .setProperty("editable","showVArrow")
      .setProperty("columns","2")
      .setProperty("tooltip","Velocity vector scale")
      .getObject();
    gCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"gCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decorationPanel")
      .setProperty("variable","showGArrow")
      .setProperty("text","g scale:")
      .setProperty("tooltip","Show velocity vector")
      .getObject();
    gScaleField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"gScaleField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decorationPanel")
      .setProperty("variable","gScale")
      .setProperty("format","0.#")
      .setProperty("editable","showGArrow")
      .setProperty("columns","2")
      .setProperty("tooltip","Velocity vector scale")
      .getObject();
    ngLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"ngLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decorationPanel")
      .setProperty("text"," ghost:")
      .getObject();
    ngFieldField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"ngFieldField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","decorationPanel")
      .setProperty("variable","ng")
      .setProperty("format","0")
      .setProperty("action","_model._method_for_ngFieldField_action()" )
      .setProperty("columns","2")
      .setProperty("tooltip","Number of ghosts")
      .getObject();
    graphPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"graphPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","displayPanel")
      .setProperty("layout","HBOX")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Graphs")
      .getObject();
    xCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"xCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","graphPanel")
      .setProperty("variable","showX")
      .setProperty("text","x(t)")
      .setProperty("tooltip","Show position graph")
      .getObject();
    vCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"vCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphPanel")
      .setProperty("variable","showV")
      .setProperty("text","v(t)")
      .setProperty("tooltip","Show velocity graph")
      .getObject();
    aCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"aCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphPanel")
      .setProperty("variable","showA")
      .setProperty("text","a(t)")
      .setProperty("tooltip","Show acceleration graph graph")
      .getObject();
    xyComponentsCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"xyComponentsCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphPanel")
      .setProperty("variable","xyComponents")
      .setProperty("text","xy-components")
      .setProperty("tooltip","Plot position and velocity spatial components")
      .getObject();
    energyCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"energyCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","graphPanel")
      .setProperty("variable","showE")
      .setProperty("text","E(t)")
      .setProperty("tooltip","Show energy graph")
      .getObject();
    varsPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"varsPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","displayPanel")
      .setProperty("layout","HBOX")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Variables")
      .getObject();
    x0Check = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"x0Check")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","varsPanel")
      .setProperty("variable","showX0")
      .setProperty("text","x0")
      .setProperty("tooltip","Show initial position field")
      .getObject();
    v0Check = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"v0Check")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","varsPanel")
      .setProperty("variable","showV0")
      .setProperty("text","v0")
      .setProperty("tooltip","Show  initial velocity field")
      .getObject();
    timeCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"timeCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","varsPanel")
      .setProperty("variable","showTime")
      .setProperty("text","t")
      .setProperty("tooltip","Show time field")
      .getObject();
    scalePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"scalePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","teacherControlPanel")
      .setProperty("layout","HBOX")
      .setProperty("visible","%_model._method_for_scalePanel_visible()%" )
      .getObject();
    xscalePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"xscalePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","scalePanel")
      .setProperty("layout","HBOX")
      .getObject();
    xminPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"xminPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","xscalePanel")
      .setProperty("layout","border")
      .getObject();
    xminLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"xminLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","xminPanel")
      .setProperty("text","x min=")
      .setProperty("alignment","RIGHT")
      .getObject();
    xminField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"xminField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","xminPanel")
      .setProperty("variable","xmin")
      .setProperty("format","0.0##")
      .setProperty("action","_model._method_for_xminField_action()" )
      .getObject();
    xmaxPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"xmaxPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","xscalePanel")
      .setProperty("layout","border")
      .getObject();
    xmaxLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"xmaxLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","xmaxPanel")
      .setProperty("text","x max=")
      .setProperty("alignment","RIGHT")
      .getObject();
    xmaxField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"xmaxField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","xmaxPanel")
      .setProperty("variable","xmax")
      .setProperty("format","0.0##")
      .setProperty("action","_model._method_for_xmaxField_action()" )
      .getObject();
    yscalePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"yscalePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","scalePanel")
      .setProperty("layout","HBOX")
      .getObject();
    yminPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"yminPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","yscalePanel")
      .setProperty("layout","border")
      .getObject();
    yminLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"yminLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","yminPanel")
      .setProperty("text"," y min=")
      .setProperty("alignment","RIGHT")
      .getObject();
    yminField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"yminField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","yminPanel")
      .setProperty("variable","ymin")
      .setProperty("format","0.0##")
      .setProperty("action","_model._method_for_yminField_action()" )
      .getObject();
    ymaxPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"ymaxPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","yscalePanel")
      .setProperty("layout","border")
      .getObject();
    ymaxLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"ymaxLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","ymaxPanel")
      .setProperty("text"," y max=")
      .setProperty("alignment","RIGHT")
      .getObject();
    ymaxField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"ymaxField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","ymaxPanel")
      .setProperty("variable","ymax")
      .setProperty("format","0.0##")
      .setProperty("action","_model._method_for_ymaxField_action()" )
      .getObject();
    nPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"nPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","scalePanel")
      .setProperty("layout","border")
      .getObject();
    nLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"nLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","nPanel")
      .setProperty("text"," N =")
      .setProperty("alignment","RIGHT")
      .getObject();
    nField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"nField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","nPanel")
      .setProperty("variable","nt")
      .setProperty("format","0")
      .setProperty("action","_model._method_for_nField_action()" )
      .setProperty("tooltip","Number of posts")
      .getObject();
    gPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"gPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","scalePanel")
      .setProperty("layout","border")
      .getObject();
    gLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"gLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","gPanel")
      .setProperty("text"," g =")
      .setProperty("alignment","RIGHT")
      .getObject();
    gField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"gField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","gPanel")
      .setProperty("variable","g")
      .setProperty("format","0.0#")
      .setProperty("editable","%_model._method_for_gField_editable()%" )
      .setProperty("action","_model._method_for_gField_action()" )
      .setProperty("columns","3")
      .setProperty("size","0,24")
      .getObject();
    dtPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"dtPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","scalePanel")
      .setProperty("layout","border")
      .getObject();
    dtLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"dtLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","dtPanel")
      .setProperty("text"," $\\Delta$t =")
      .setProperty("alignment","RIGHT")
      .getObject();
    dtField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"dtField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","dtPanel")
      .setProperty("variable","dt")
      .setProperty("format","0.##")
      .setProperty("action","_model._method_for_dtField_action()" )
      .setProperty("tooltip","Time step")
      .getObject();
    maxTimePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"maxTimePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","scalePanel")
      .setProperty("layout","border")
      .getObject();
    maxTimeLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"maxTimeLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","maxTimePanel")
      .setProperty("text"," max t =")
      .setProperty("alignment","RIGHT")
      .getObject();
    maxTimeField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlParsedNumberField(),"maxTimeField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","maxTimePanel")
      .setProperty("variable","maxTime")
      .setProperty("format","0.0#")
      .setProperty("editable","%_model._method_for_maxTimeField_editable()%" )
      .setProperty("columns","3")
      .setProperty("size","0,24")
      .setProperty("tooltip","Maximum simulation time")
      .getObject();
    bounceCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"bounceCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","scalePanel")
      .setProperty("variable","bounce")
      .setProperty("text","bounce")
      .setProperty("tooltip","Bounce at enhd of track")
      .getObject();
    parametersPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"parametersPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","teacherControlPanel")
      .setProperty("layout","HBOX")
      .setProperty("visible","%_model._method_for_parametersPanel_visible()%" )
      .getObject();
    savePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"savePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("layout","HBOX")
      .getObject();
    saveButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"saveButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","savePanel")
      .setProperty("text","Save")
      .setProperty("action","_model._method_for_saveButton_action()" )
      .setProperty("foreground","RED")
      .setProperty("tooltip","Saves the state.")
      .getObject();
    studentCheck = (javax.swing.JCheckBox)
      addElement(new org.colos.ejs.library.control.swing.ControlCheckBox(),"studentCheck")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","savePanel")
      .setProperty("variable","saveInStudentMode")
      .setProperty("text","student")
      .setProperty("foreground","RED")
      .setProperty("tooltip","Save student mode state without customization option")
      .getObject();
    filePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"filePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("layout","border")
      .getObject();
    createControl200();
  }

  private void createControl200() {
    fileLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"fileLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","filePanel")
      .setProperty("text"," doc: ")
      .setProperty("alignment","RIGHT")
      .getObject();
    fileField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlTextField(),"fileField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","filePanel")
      .setProperty("variable","%fileName%")
      .setProperty("columns","10")
      .setProperty("tooltip","Documentation file or URL")
      .getObject();
    msgPanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"msgPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("layout","border")
      .setProperty("visible","%_model._method_for_msgPanel_visible()%" )
      .getObject();
    msgLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"msgLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","msgPanel")
      .setProperty("text"," msg:")
      .getObject();
    msgField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlTextField(),"msgField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","msgPanel")
      .setProperty("variable","%startMsg%")
      .setProperty("action","_model._method_for_msgField_action()" )
      .setProperty("tooltip","Startup message")
      .getObject();
    titlePanel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"titlePanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("layout","border")
      .getObject();
    titleLabel = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"titleLabel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","titlePanel")
      .setProperty("text"," title:")
      .getObject();
    titleField = (javax.swing.JTextField)
      addElement(new org.colos.ejs.library.control.swing.ControlTextField(),"titleField")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","titlePanel")
      .setProperty("variable","%frameTitle%")
      .setProperty("columns","6")
      .setProperty("size","0,24")
      .setProperty("tooltip","Frame title")
      .getObject();
    resetButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"resetButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","parametersPanel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("action","_model._method_for_resetButton_action()" )
      .setProperty("tooltip","Reset all parameters")
      .getObject();
  }

// ---------- Resetting the interface  -------------------

  public void reset() {
    getElement("mainFrame")
      .setProperty("visible","true");
    getElement("tracksPlottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("square","true")
      .setProperty("titleX","x")
      .setProperty("titleY","");
    getElement("groundShape")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("measured","false")
      .setProperty("style","RECTANGLE")
      .setProperty("elementposition","NORTH")
      .setProperty("fillColor","GREEN");
    getElement("postSet")
      .setProperty("sensitivity","15")
      .setProperty("style","RECTANGLE")
      .setProperty("elementposition","NORTH")
      .setProperty("fillColor","GRAY");
    getElement("trackSet")
      .setProperty("measured","false")
      .setProperty("enabledPosition","ENABLED_NONE")
      .setProperty("sensitivity","0")
      .setProperty("style","RECTANGLE")
      .setProperty("elementposition","WEST")
      .setProperty("fillColor","BLUE");
    getElement("ghostSet")
      .setProperty("measured","false")
      .setProperty("enabledPosition","false")
      .setProperty("elementposition","CENTERED")
      .setProperty("drawingLines","false");
    getElement("ballGroup")
      .setProperty("sizeX","1")
      .setProperty("sizeY","1")
      .setProperty("measured","false");
    getElement("ballShape")
      .setProperty("x","0")
      .setProperty("y","0")
      .setProperty("measured","false")
      .setProperty("movesGroup","true")
      .setProperty("sensitivity","0")
      .setProperty("elementposition","CENTERED")
      .setProperty("fillColor","RED");
    getElement("vArrow")
      .setProperty("x","0")
      .setProperty("sizeY","0")
      .setProperty("measured","false")
      .setProperty("fillColor","RED")
      .setProperty("lineWidth","2");
    getElement("vText")
      .setProperty("pixelSize","true")
      .setProperty("measured","false")
      .setProperty("text","V")
      .setProperty("font","Monospaced,BOLD,14");
    getElement("gArrow")
      .setProperty("sizeX","0")
      .setProperty("measured","false")
      .setProperty("fillColor","GREEN")
      .setProperty("lineWidth","2");
    getElement("gText")
      .setProperty("pixelSize","true")
      .setProperty("measured","false")
      .setProperty("text","g")
      .setProperty("font","Monospaced,BOLD,14");
    getElement("textSet")
      .setProperty("y","-0.6")
      .setProperty("font","Monospaced,PLAIN,16");
    getElement("controlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("buttonPanel")
      .setProperty("size","200,23");
    getElement("startButton")
      .setProperty("immediateAction","true")
      .setProperty("tooltip","Starts and stops the simulation.")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    getElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/step.gif")
      .setProperty("tooltip","Setp the simulation");
    getElement("resetTimeButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Reset the time");
    getElement("docButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/value.gif")
      .setProperty("tooltip","Load documentation file");
    getElement("toolButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/wrench_monkey.gif");
    getElement("initialConditions");
    getElement("x0Panel");
    getElement("x0Label")
      .setProperty("text"," x0 =")
      .setProperty("alignment","RIGHT");
    getElement("x0Field")
      .setProperty("format","0.###")
      .setProperty("columns","3")
      .setProperty("size","0,24");
    getElement("v0Panel");
    getElement("v0Label")
      .setProperty("text"," v0 =")
      .setProperty("alignment","RIGHT");
    getElement("v0Field")
      .setProperty("format","0.###")
      .setProperty("columns","3")
      .setProperty("size","0,24");
    getElement("tPanel");
    getElement("tLabel")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT");
    getElement("tField")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("checkPanel");
    getElement("tableCheckPanel");
    getElement("tableLabel")
      .setProperty("text"," Table:");
    getElement("showTableCheck")
      .setProperty("text","data");
    getElement("showJointsTableCheck")
      .setProperty("text","joints");
    getElement("graphCheckPanel");
    getElement("graphLabel")
      .setProperty("text"," Graph:");
    getElement("showXGraphCheck")
      .setProperty("text","x(t)");
    getElement("showVGraphCheck")
      .setProperty("text","v(t)");
    getElement("showAGraphCheck")
      .setProperty("text","a(t)");
    getElement("showEnergyGraphCheck")
      .setProperty("text","E(t)");
    getElement("dataFrame")
      .setProperty("title","Track data");
    getElement("optionPanel");
    getElement("hidelLabel")
      .setProperty("text","Hide columns: ");
    getElement("hideXCheck")
      .setProperty("text","x");
    getElement("hideVCheck")
      .setProperty("text","v");
    getElement("hideACheck")
      .setProperty("text","a");
    getElement("xyDataTable")
      .setProperty("maxPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("showRowNumber","false");
    getElement("tableControlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("eraseTableButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("tooltip","Clear the data table");
    getElement("stridePanel");
    getElement("strideLabel")
      .setProperty("text"," stride = ");
    getElement("strideField")
      .setProperty("format","0")
      .setProperty("columns","3");
    getElement("positionFrame")
      .setProperty("title","Distance Plot");
    getElement("positionPlottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("yMarginPercentage","5")
      .setProperty("titleX","t");
    getElement("xtrackTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","x track");
    getElement("xMarker")
      .setProperty("sizeX","6")
      .setProperty("sizeY","6")
      .setProperty("pixelSize","true")
      .setProperty("measured","false")
      .setProperty("fillColor","PINK");
    getElement("xTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","x Ball");
    getElement("yBallTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","y Ball");
    getElement("positionControlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("erasePositionButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the x-graph");
    getElement("positionVarsPanel");
    getElement("xtrackPanel");
    getElement("xtrackLabel")
      .setProperty("text"," x track =")
      .setProperty("alignment","RIGHT");
    getElement("xtrackField")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("xcompoentPanel");
    getElement("xcomponentLabel")
      .setProperty("text"," x =")
      .setProperty("alignment","RIGHT");
    getElement("xcomponentField")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("ycompoentPanel");
    getElement("ycomponentLabel")
      .setProperty("text"," y =")
      .setProperty("alignment","RIGHT");
    getElement("ycomponentField")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("timePanel");
    getElement("tpLabel")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT");
    getElement("tpField")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("velocityFrame")
      .setProperty("title","Velocity Plot");
    getElement("velocityPlottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("yMarginPercentage","5")
      .setProperty("titleX","t");
    getElement("vTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","v");
    getElement("yMarker")
      .setProperty("sizeX","6")
      .setProperty("sizeY","6")
      .setProperty("pixelSize","true")
      .setProperty("measured","false")
      .setProperty("fillColor","PINK");
    getElement("vxTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","vx");
    getElement("vyTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","vy");
    getElement("vControlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("eraseVelocityButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the v-graph");
    getElement("velocityVarsPanel");
    getElement("vPanel");
    getElement("vLabel")
      .setProperty("text"," v =")
      .setProperty("alignment","RIGHT");
    getElement("vField")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("vxPanel");
    getElement("vxLabel")
      .setProperty("text"," vx =")
      .setProperty("alignment","RIGHT");
    getElement("vxField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("vyPanel");
    getElement("vyLabel")
      .setProperty("text"," vy =")
      .setProperty("alignment","RIGHT");
    getElement("vyField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("timePanel2");
    getElement("tpLabel2")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT");
    getElement("tpField2")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("accelerationFrame")
      .setProperty("title","Acceleration Plot");
    getElement("accelerationPlottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("yMarginPercentage","5")
      .setProperty("titleX","t");
    getElement("aTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","v");
    getElement("aMarker")
      .setProperty("sizeX","6")
      .setProperty("sizeY","6")
      .setProperty("pixelSize","true")
      .setProperty("measured","false")
      .setProperty("fillColor","PINK");
    getElement("axTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ax");
    getElement("ayTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ay");
    getElement("aControlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("eraseAccelerationButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the v-graph");
    getElement("accelerationVarsPanel");
    getElement("aPanel");
    getElement("aLabel")
      .setProperty("text"," a =")
      .setProperty("alignment","RIGHT");
    getElement("aField")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("axPanel");
    getElement("axLabel")
      .setProperty("text"," ax =")
      .setProperty("alignment","RIGHT");
    getElement("axField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("ayPanel");
    getElement("ayLabel")
      .setProperty("text"," ay =")
      .setProperty("alignment","RIGHT");
    getElement("ayField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("timePanel22");
    getElement("tpLabel22")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT");
    getElement("tpField22")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("energyFrame")
      .setProperty("title","Energy Plot");
    getElement("energyPlottingPanel")
      .setProperty("autoscaleX","true")
      .setProperty("autoscaleY","true")
      .setProperty("yMarginPercentage","5")
      .setProperty("titleX","t")
      .setProperty("titleY","energy/mass");
    getElement("energyTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","DARKGRAY")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","energy");
    getElement("keTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","RED")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ke");
    getElement("peTrail")
      .setProperty("maximumPoints","1000")
      .setProperty("norepeat","true")
      .setProperty("lineColor","BLUE")
      .setProperty("lineWidth","2")
      .setProperty("xLabel","t")
      .setProperty("yLabel","pe");
    getElement("energyControlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("eraseEnergyButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the energy-graph");
    getElement("energyVarsPanel");
    getElement("kePanel");
    getElement("keLabel")
      .setProperty("text"," KE =")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","RED");
    getElement("keField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","3")
      .setProperty("size","0,23")
      .setProperty("tooltip","Kinetic energy per unit mass");
    getElement("pePanel");
    getElement("peLabel")
      .setProperty("text"," PE =")
      .setProperty("alignment","RIGHT")
      .setProperty("foreground","BLUE");
    getElement("peField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23")
      .setProperty("tooltip","Potential energy per unit mass");
    getElement("energyPanel");
    getElement("energyLabel")
      .setProperty("text"," E =")
      .setProperty("alignment","RIGHT");
    getElement("energyField")
      .setProperty("format","0.0#")
      .setProperty("editable","false")
      .setProperty("columns","3")
      .setProperty("size","0,23")
      .setProperty("tooltip","Total energy per unit mass");
    getElement("timePanel3");
    getElement("tpLabel3")
      .setProperty("text"," t =")
      .setProperty("alignment","RIGHT");
    getElement("tpField3")
      .setProperty("format","0.###")
      .setProperty("editable","false")
      .setProperty("columns","4")
      .setProperty("size","0,23");
    getElement("jointsFrame")
      .setProperty("title","Joints Data");
    getElement("jointsArrayPanel")
      .setProperty("static","false")
      .setProperty("transposed","true")
      .setProperty("format","0.00#")
      .setProperty("editable","true")
      .setProperty("columnsLocked","new boolean[]{true,false,false}")
      .setProperty("columnNames","new String[ ]{\"#\",\"x\",\"h\"}");
    getElement("customizationFrame")
      .setProperty("title","Customization");
    getElement("teacherControlPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("displayPanel")
      .setProperty("borderType","LOWERED_ETCHED");
    getElement("dataPanel")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Data");
    getElement("tableCheck")
      .setProperty("text","table")
      .setProperty("tooltip","Show the data table");
    getElement("toolCheck")
      .setProperty("text","tool")
      .setProperty("tooltip","Show the data tool");
    getElement("jointsTableCheck")
      .setProperty("text","joints")
      .setProperty("tooltip","Show the data table");
    getElement("dragPanel")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Drag");
    getElement("dragJointsCheck")
      .setProperty("text","joints")
      .setProperty("tooltip","Drag the joints to change height");
    getElement("dragBallCheck")
      .setProperty("text","ball");
    getElement("decorationPanel")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Decoration & Interaction");
    getElement("velocityCheck")
      .setProperty("text","v scale:")
      .setProperty("tooltip","Show velocity vector");
    getElement("vScaleField")
      .setProperty("format","0.#")
      .setProperty("columns","2")
      .setProperty("tooltip","Velocity vector scale");
    getElement("gCheck")
      .setProperty("text","g scale:")
      .setProperty("tooltip","Show velocity vector");
    getElement("gScaleField")
      .setProperty("format","0.#")
      .setProperty("columns","2")
      .setProperty("tooltip","Velocity vector scale");
    getElement("ngLabel")
      .setProperty("text"," ghost:");
    getElement("ngFieldField")
      .setProperty("format","0")
      .setProperty("columns","2")
      .setProperty("tooltip","Number of ghosts");
    getElement("graphPanel")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Graphs");
    getElement("xCheck")
      .setProperty("text","x(t)")
      .setProperty("tooltip","Show position graph");
    getElement("vCheck")
      .setProperty("text","v(t)")
      .setProperty("tooltip","Show velocity graph");
    getElement("aCheck")
      .setProperty("text","a(t)")
      .setProperty("tooltip","Show acceleration graph graph");
    getElement("xyComponentsCheck")
      .setProperty("text","xy-components")
      .setProperty("tooltip","Plot position and velocity spatial components");
    getElement("energyCheck")
      .setProperty("text","E(t)")
      .setProperty("tooltip","Show energy graph");
    getElement("varsPanel")
      .setProperty("borderType","TITLED")
      .setProperty("borderTitle","Variables");
    getElement("x0Check")
      .setProperty("text","x0")
      .setProperty("tooltip","Show initial position field");
    getElement("v0Check")
      .setProperty("text","v0")
      .setProperty("tooltip","Show  initial velocity field");
    getElement("timeCheck")
      .setProperty("text","t")
      .setProperty("tooltip","Show time field");
    getElement("scalePanel");
    getElement("xscalePanel");
    getElement("xminPanel");
    getElement("xminLabel")
      .setProperty("text","x min=")
      .setProperty("alignment","RIGHT");
    getElement("xminField")
      .setProperty("format","0.0##");
    getElement("xmaxPanel");
    getElement("xmaxLabel")
      .setProperty("text","x max=")
      .setProperty("alignment","RIGHT");
    getElement("xmaxField")
      .setProperty("format","0.0##");
    getElement("yscalePanel");
    getElement("yminPanel");
    getElement("yminLabel")
      .setProperty("text"," y min=")
      .setProperty("alignment","RIGHT");
    getElement("yminField")
      .setProperty("format","0.0##");
    getElement("ymaxPanel");
    getElement("ymaxLabel")
      .setProperty("text"," y max=")
      .setProperty("alignment","RIGHT");
    getElement("ymaxField")
      .setProperty("format","0.0##");
    getElement("nPanel");
    getElement("nLabel")
      .setProperty("text"," N =")
      .setProperty("alignment","RIGHT");
    getElement("nField")
      .setProperty("format","0")
      .setProperty("tooltip","Number of posts");
    getElement("gPanel");
    getElement("gLabel")
      .setProperty("text"," g =")
      .setProperty("alignment","RIGHT");
    getElement("gField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("size","0,24");
    getElement("dtPanel");
    getElement("dtLabel")
      .setProperty("text"," $\\Delta$t =")
      .setProperty("alignment","RIGHT");
    getElement("dtField")
      .setProperty("format","0.##")
      .setProperty("tooltip","Time step");
    getElement("maxTimePanel");
    getElement("maxTimeLabel")
      .setProperty("text"," max t =")
      .setProperty("alignment","RIGHT");
    getElement("maxTimeField")
      .setProperty("format","0.0#")
      .setProperty("columns","3")
      .setProperty("size","0,24")
      .setProperty("tooltip","Maximum simulation time");
    getElement("bounceCheck")
      .setProperty("text","bounce")
      .setProperty("tooltip","Bounce at enhd of track");
    getElement("parametersPanel");
    getElement("savePanel");
    getElement("saveButton")
      .setProperty("text","Save")
      .setProperty("foreground","RED")
      .setProperty("tooltip","Saves the state.");
    getElement("studentCheck")
      .setProperty("text","student")
      .setProperty("foreground","RED")
      .setProperty("tooltip","Save student mode state without customization option");
    getElement("filePanel");
    getElement("fileLabel")
      .setProperty("text"," doc: ")
      .setProperty("alignment","RIGHT");
    getElement("fileField")
      .setProperty("columns","10")
      .setProperty("tooltip","Documentation file or URL");
    getElement("msgPanel");
    getElement("msgLabel")
      .setProperty("text"," msg:");
    getElement("msgField")
      .setProperty("tooltip","Startup message");
    getElement("titlePanel");
    getElement("titleLabel")
      .setProperty("text"," title:");
    getElement("titleField")
      .setProperty("columns","6")
      .setProperty("size","0,24")
      .setProperty("tooltip","Frame title");
    getElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Reset all parameters");
    __x0_canBeChanged__ = true; // Variables.Constants:1
    __v0_canBeChanged__ = true; // Variables.Constants:2
    __xmin_canBeChanged__ = true; // Variables.Constants:3
    __xmax_canBeChanged__ = true; // Variables.Constants:4
    __ymin_canBeChanged__ = true; // Variables.Constants:5
    __ymax_canBeChanged__ = true; // Variables.Constants:6
    __vScale_canBeChanged__ = true; // Variables.Constants:7
    __g_canBeChanged__ = true; // Variables.Constants:8
    __gScale_canBeChanged__ = true; // Variables.Constants:9
    __xyComponents_canBeChanged__ = true; // Variables.Constants:10
    __xAxisTitle_canBeChanged__ = true; // Variables.Constants:11
    __vAxisTitle_canBeChanged__ = true; // Variables.Constants:12
    __aAxisTitle_canBeChanged__ = true; // Variables.Constants:13
    __maxTime_canBeChanged__ = true; // Variables.Constants:14
    __bounce_canBeChanged__ = true; // Variables.Constants:15
    __E_canBeChanged__ = true; // Variables.Constants:16
    __KE_canBeChanged__ = true; // Variables.Constants:17
    __PE_canBeChanged__ = true; // Variables.Constants:18
    __ng_canBeChanged__ = true; // Variables.Ghost Vars:1
    __gCounter_canBeChanged__ = true; // Variables.Ghost Vars:2
    __gStride_canBeChanged__ = true; // Variables.Ghost Vars:3
    __xghost_canBeChanged__ = true; // Variables.Ghost Vars:4
    __yghost_canBeChanged__ = true; // Variables.Ghost Vars:5
    __ghostColors_canBeChanged__ = true; // Variables.Ghost Vars:6
    __xtrack_canBeChanged__ = true; // Variables.Dynamical Vars:1
    __x_canBeChanged__ = true; // Variables.Dynamical Vars:2
    __vx_canBeChanged__ = true; // Variables.Dynamical Vars:3
    __t_canBeChanged__ = true; // Variables.Dynamical Vars:4
    __dt_canBeChanged__ = true; // Variables.Dynamical Vars:5
    __tol_canBeChanged__ = true; // Variables.Dynamical Vars:6
    __stationary_canBeChanged__ = true; // Variables.Dynamical Vars:7
    __nt_canBeChanged__ = true; // Variables.Track Vars:1
    __xt_canBeChanged__ = true; // Variables.Track Vars:2
    __jointsData_canBeChanged__ = true; // Variables.Track Vars:3
    __ht_canBeChanged__ = true; // Variables.Track Vars:4
    __dx_canBeChanged__ = true; // Variables.Track Vars:5
    __st_canBeChanged__ = true; // Variables.Track Vars:6
    __dy_canBeChanged__ = true; // Variables.Track Vars:7
    __theta_canBeChanged__ = true; // Variables.Track Vars:8
    __postWidth_canBeChanged__ = true; // Variables.Track Vars:9
    __index_canBeChanged__ = true; // Variables.Track Vars:10
    __segment_canBeChanged__ = true; // Variables.Track Vars:11
    __yBall_canBeChanged__ = true; // Variables.Track Vars:12
    __vBall_canBeChanged__ = true; // Variables.Track Vars:13
    __vy_canBeChanged__ = true; // Variables.Track Vars:14
    __aBall_canBeChanged__ = true; // Variables.Track Vars:15
    __axBall_canBeChanged__ = true; // Variables.Track Vars:16
    __ayBall_canBeChanged__ = true; // Variables.Track Vars:17
    __labels_canBeChanged__ = true; // Variables.Track Vars:18
    __dragMode_canBeChanged__ = true; // Variables.Track Vars:19
    __dragBall_canBeChanged__ = true; // Variables.Track Vars:20
    __saveInStudentMode_canBeChanged__ = true; // Variables.Customization Vars:1
    __studentMode_canBeChanged__ = true; // Variables.Customization Vars:2
    __fileName_canBeChanged__ = true; // Variables.Customization Vars:3
    __frameTitle_canBeChanged__ = true; // Variables.Customization Vars:4
    __showToolButton_canBeChanged__ = true; // Variables.Customization Vars:5
    __startMsg_canBeChanged__ = true; // Variables.Customization Vars:6
    __msg_canBeChanged__ = true; // Variables.Customization Vars:7
    __showX_canBeChanged__ = true; // Variables.Customization Vars:8
    __showV_canBeChanged__ = true; // Variables.Customization Vars:9
    __showA_canBeChanged__ = true; // Variables.Customization Vars:10
    __showTime_canBeChanged__ = true; // Variables.Customization Vars:11
    __showX0_canBeChanged__ = true; // Variables.Customization Vars:12
    __showV0_canBeChanged__ = true; // Variables.Customization Vars:13
    __showVArrow_canBeChanged__ = true; // Variables.Customization Vars:14
    __showGArrow_canBeChanged__ = true; // Variables.Customization Vars:15
    __hideD_canBeChanged__ = true; // Variables.Customization Vars:16
    __hideV_canBeChanged__ = true; // Variables.Customization Vars:17
    __hideA_canBeChanged__ = true; // Variables.Customization Vars:18
    __showJointsTable_canBeChanged__ = true; // Variables.Customization Vars:19
    __showTable_canBeChanged__ = true; // Variables.Customization Vars:20
    __stride_canBeChanged__ = true; // Variables.Customization Vars:21
    __tableColNames_canBeChanged__ = true; // Variables.Customization Vars:22
    __tableRow_canBeChanged__ = true; // Variables.Customization Vars:23
    __visTable_canBeChanged__ = true; // Variables.Customization Vars:24
    __visXGraph_canBeChanged__ = true; // Variables.Customization Vars:25
    __visVGraph_canBeChanged__ = true; // Variables.Customization Vars:26
    __visAGraph_canBeChanged__ = true; // Variables.Customization Vars:27
    __visEGraph_canBeChanged__ = true; // Variables.Customization Vars:28
    __showE_canBeChanged__ = true; // Variables.Customization Vars:29
    __visJointsTable_canBeChanged__ = true; // Variables.Customization Vars:30
    super.reset();
  }

} // End of class GraphsAndTracksView

