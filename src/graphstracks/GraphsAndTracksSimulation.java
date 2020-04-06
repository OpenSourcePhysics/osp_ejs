/*
 * Class : GraphsAndTracksSimulation.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package graphstracks;

import org.colos.ejs.library._EjsConstants;

import org.opensourcephysics.display.OSPRuntime;
// Imports suggested by Model Elements:
// End of imports from Model Elements

class GraphsAndTracksSimulation extends org.colos.ejs.library.EjsSimulation { 

  private GraphsAndTracksView mMainView;

  public GraphsAndTracksSimulation (GraphsAndTracks _model, String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, boolean _allowAutoplay) {
    videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    try { setUnderEjs("true".equals(System.getProperty("osp_ejs"))); }
    catch (Exception exc) { setUnderEjs(false); } // in case of applet security
    setCodebase (_codebase);
    setModel (_model);
    _model._simulation = this;
    mMainView = _model._view = new GraphsAndTracksView(this,_replaceName, _replaceOwnerFrame);
    setView (_model._view);
    if (_model._isApplet()) _model._getApplet().captureWindow (_model,"mainFrame");
    setFPS(20);
    setStepsPerDisplay(_model._getPreferredStepsPerDisplay()); 
    if (_allowAutoplay) { setAutoplay(false); reset(); }
    else { reset(); setAutoplay(false); }
    recreateDescriptionPanel();
    if (_model._getApplet()!=null && _model._getApplet().getParameter("locale")!=null) {
      setLocaleItem(org.colos.ejs.library.utils.LocaleItem.getLocaleItem(_model._getApplet().getParameter("locale")),false);
    }
    else setLocaleItem(getLocaleItem(),false); // false so that not to reset the model twice at start-up
  }

  public java.util.List<String> getWindowsList() {
    java.util.List<String> windowList = new java.util.ArrayList<String>();
    windowList.add("mainFrame");
    windowList.add("dataFrame");
    windowList.add("positionFrame");
    windowList.add("velocityFrame");
    windowList.add("accelerationFrame");
    windowList.add("energyFrame");
    windowList.add("jointsFrame");
    windowList.add("customizationFrame");
    return windowList;
  }

  public String getMainWindow() {
    return "mainFrame";
  }

  protected void setViewLocale() { // Overwrite its parent's dummy method with real actions 
    mMainView.getConfigurableElement("mainFrame")
      .setProperty("size","789,393");
    mMainView.getConfigurableElement("tracksPlottingPanel")
      .setProperty("titleX","x")
      .setProperty("titleY","");
    mMainView.getConfigurableElement("groundShape");
    mMainView.getConfigurableElement("postSet");
    mMainView.getConfigurableElement("trackSet");
    mMainView.getConfigurableElement("ghostSet");
    mMainView.getConfigurableElement("ballGroup");
    mMainView.getConfigurableElement("ballShape");
    mMainView.getConfigurableElement("vArrow");
    mMainView.getConfigurableElement("vText")
      .setProperty("text","V");
    mMainView.getConfigurableElement("gArrow");
    mMainView.getConfigurableElement("gText")
      .setProperty("text","g");
    mMainView.getConfigurableElement("textSet");
    mMainView.getConfigurableElement("controlPanel");
    mMainView.getConfigurableElement("buttonPanel")
      .setProperty("size","200,23");
    mMainView.getConfigurableElement("startButton")
      .setProperty("tooltip","Starts and stops the simulation.")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    mMainView.getConfigurableElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/step.gif")
      .setProperty("tooltip","Setp the simulation");
    mMainView.getConfigurableElement("resetTimeButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Reset the time");
    mMainView.getConfigurableElement("docButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/value.gif")
      .setProperty("tooltip","Load documentation file");
    mMainView.getConfigurableElement("toolButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/wrench_monkey.gif");
    mMainView.getConfigurableElement("initialConditions");
    mMainView.getConfigurableElement("x0Panel");
    mMainView.getConfigurableElement("x0Label")
      .setProperty("text"," x0 =");
    mMainView.getConfigurableElement("x0Field")
      .setProperty("format","0.###")
      .setProperty("size","0,24");
    mMainView.getConfigurableElement("v0Panel");
    mMainView.getConfigurableElement("v0Label")
      .setProperty("text"," v0 =");
    mMainView.getConfigurableElement("v0Field")
      .setProperty("format","0.###")
      .setProperty("size","0,24");
    mMainView.getConfigurableElement("tPanel");
    mMainView.getConfigurableElement("tLabel")
      .setProperty("text"," t =");
    mMainView.getConfigurableElement("tField")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("checkPanel");
    mMainView.getConfigurableElement("tableCheckPanel");
    mMainView.getConfigurableElement("tableLabel")
      .setProperty("text"," Table:");
    mMainView.getConfigurableElement("showTableCheck")
      .setProperty("text","data");
    mMainView.getConfigurableElement("showJointsTableCheck")
      .setProperty("text","joints");
    mMainView.getConfigurableElement("graphCheckPanel");
    mMainView.getConfigurableElement("graphLabel")
      .setProperty("text"," Graph:");
    mMainView.getConfigurableElement("showXGraphCheck")
      .setProperty("text","x(t)");
    mMainView.getConfigurableElement("showVGraphCheck")
      .setProperty("text","v(t)");
    mMainView.getConfigurableElement("showAGraphCheck")
      .setProperty("text","a(t)");
    mMainView.getConfigurableElement("showEnergyGraphCheck")
      .setProperty("text","E(t)");
    mMainView.getConfigurableElement("dataFrame")
      .setProperty("title","Track data")
      .setProperty("size","299,300");
    mMainView.getConfigurableElement("optionPanel");
    mMainView.getConfigurableElement("hidelLabel")
      .setProperty("text","Hide columns: ");
    mMainView.getConfigurableElement("hideXCheck")
      .setProperty("text","x");
    mMainView.getConfigurableElement("hideVCheck")
      .setProperty("text","v");
    mMainView.getConfigurableElement("hideACheck")
      .setProperty("text","a");
    mMainView.getConfigurableElement("xyDataTable");
    mMainView.getConfigurableElement("tableControlPanel");
    mMainView.getConfigurableElement("eraseTableButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("tooltip","Clear the data table");
    mMainView.getConfigurableElement("stridePanel");
    mMainView.getConfigurableElement("strideLabel")
      .setProperty("text"," stride = ");
    mMainView.getConfigurableElement("strideField")
      .setProperty("format","0");
    mMainView.getConfigurableElement("positionFrame")
      .setProperty("title","Distance Plot")
      .setProperty("size","355,299");
    mMainView.getConfigurableElement("positionPlottingPanel")
      .setProperty("titleX","t");
    mMainView.getConfigurableElement("xtrackTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","x track");
    mMainView.getConfigurableElement("xMarker");
    mMainView.getConfigurableElement("xTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","x Ball");
    mMainView.getConfigurableElement("yBallTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","y Ball");
    mMainView.getConfigurableElement("positionControlPanel");
    mMainView.getConfigurableElement("erasePositionButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the x-graph");
    mMainView.getConfigurableElement("positionVarsPanel");
    mMainView.getConfigurableElement("xtrackPanel");
    mMainView.getConfigurableElement("xtrackLabel")
      .setProperty("text"," x track =");
    mMainView.getConfigurableElement("xtrackField")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("xcompoentPanel");
    mMainView.getConfigurableElement("xcomponentLabel")
      .setProperty("text"," x =");
    mMainView.getConfigurableElement("xcomponentField")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("ycompoentPanel");
    mMainView.getConfigurableElement("ycomponentLabel")
      .setProperty("text"," y =");
    mMainView.getConfigurableElement("ycomponentField")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("timePanel");
    mMainView.getConfigurableElement("tpLabel")
      .setProperty("text"," t =");
    mMainView.getConfigurableElement("tpField")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("velocityFrame")
      .setProperty("title","Velocity Plot")
      .setProperty("size","300,300");
    mMainView.getConfigurableElement("velocityPlottingPanel")
      .setProperty("titleX","t");
    mMainView.getConfigurableElement("vTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","v");
    mMainView.getConfigurableElement("yMarker");
    mMainView.getConfigurableElement("vxTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","vx");
    mMainView.getConfigurableElement("vyTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","vy");
    mMainView.getConfigurableElement("vControlPanel");
    mMainView.getConfigurableElement("eraseVelocityButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the v-graph");
    mMainView.getConfigurableElement("velocityVarsPanel");
    mMainView.getConfigurableElement("vPanel");
    mMainView.getConfigurableElement("vLabel")
      .setProperty("text"," v =");
    mMainView.getConfigurableElement("vField")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("vxPanel");
    mMainView.getConfigurableElement("vxLabel")
      .setProperty("text"," vx =");
    mMainView.getConfigurableElement("vxField")
      .setProperty("format","0.0#")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("vyPanel");
    mMainView.getConfigurableElement("vyLabel")
      .setProperty("text"," vy =");
    mMainView.getConfigurableElement("vyField")
      .setProperty("format","0.0#")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("timePanel2");
    mMainView.getConfigurableElement("tpLabel2")
      .setProperty("text"," t =");
    mMainView.getConfigurableElement("tpField2")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("accelerationFrame")
      .setProperty("title","Acceleration Plot")
      .setProperty("size","300,300");
    mMainView.getConfigurableElement("accelerationPlottingPanel")
      .setProperty("titleX","t");
    mMainView.getConfigurableElement("aTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","v");
    mMainView.getConfigurableElement("aMarker");
    mMainView.getConfigurableElement("axTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ax");
    mMainView.getConfigurableElement("ayTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ay");
    mMainView.getConfigurableElement("aControlPanel");
    mMainView.getConfigurableElement("eraseAccelerationButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the v-graph");
    mMainView.getConfigurableElement("accelerationVarsPanel");
    mMainView.getConfigurableElement("aPanel");
    mMainView.getConfigurableElement("aLabel")
      .setProperty("text"," a =");
    mMainView.getConfigurableElement("aField")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("axPanel");
    mMainView.getConfigurableElement("axLabel")
      .setProperty("text"," ax =");
    mMainView.getConfigurableElement("axField")
      .setProperty("format","0.0#")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("ayPanel");
    mMainView.getConfigurableElement("ayLabel")
      .setProperty("text"," ay =");
    mMainView.getConfigurableElement("ayField")
      .setProperty("format","0.0#")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("timePanel22");
    mMainView.getConfigurableElement("tpLabel22")
      .setProperty("text"," t =");
    mMainView.getConfigurableElement("tpField22")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("energyFrame")
      .setProperty("title","Energy Plot")
      .setProperty("size","430,299");
    mMainView.getConfigurableElement("energyPlottingPanel")
      .setProperty("titleX","t")
      .setProperty("titleY","energy/mass");
    mMainView.getConfigurableElement("energyTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","energy");
    mMainView.getConfigurableElement("keTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","ke");
    mMainView.getConfigurableElement("peTrail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","pe");
    mMainView.getConfigurableElement("energyControlPanel");
    mMainView.getConfigurableElement("eraseEnergyButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("size","40,23")
      .setProperty("tooltip","Clear the energy-graph");
    mMainView.getConfigurableElement("energyVarsPanel");
    mMainView.getConfigurableElement("kePanel");
    mMainView.getConfigurableElement("keLabel")
      .setProperty("text"," KE =");
    mMainView.getConfigurableElement("keField")
      .setProperty("format","0.0#")
      .setProperty("size","0,23")
      .setProperty("tooltip","Kinetic energy per unit mass");
    mMainView.getConfigurableElement("pePanel");
    mMainView.getConfigurableElement("peLabel")
      .setProperty("text"," PE =");
    mMainView.getConfigurableElement("peField")
      .setProperty("format","0.0#")
      .setProperty("size","0,23")
      .setProperty("tooltip","Potential energy per unit mass");
    mMainView.getConfigurableElement("energyPanel");
    mMainView.getConfigurableElement("energyLabel")
      .setProperty("text"," E =");
    mMainView.getConfigurableElement("energyField")
      .setProperty("format","0.0#")
      .setProperty("size","0,23")
      .setProperty("tooltip","Total energy per unit mass");
    mMainView.getConfigurableElement("timePanel3");
    mMainView.getConfigurableElement("tpLabel3")
      .setProperty("text"," t =");
    mMainView.getConfigurableElement("tpField3")
      .setProperty("format","0.###")
      .setProperty("size","0,23");
    mMainView.getConfigurableElement("jointsFrame")
      .setProperty("title","Joints Data")
      .setProperty("size","401,300");
    mMainView.getConfigurableElement("jointsArrayPanel")
      .setProperty("format","0.00#")
      .setProperty("columnNames","new String[ ]{\"#\",\"x\",\"h\"}");
    mMainView.getConfigurableElement("customizationFrame")
      .setProperty("title","Customization")
      .setProperty("size","950,108");
    mMainView.getConfigurableElement("teacherControlPanel");
    mMainView.getConfigurableElement("displayPanel");
    mMainView.getConfigurableElement("dataPanel")
      .setProperty("borderTitle","Data");
    mMainView.getConfigurableElement("tableCheck")
      .setProperty("text","table")
      .setProperty("tooltip","Show the data table");
    mMainView.getConfigurableElement("toolCheck")
      .setProperty("text","tool")
      .setProperty("tooltip","Show the data tool");
    mMainView.getConfigurableElement("jointsTableCheck")
      .setProperty("text","joints")
      .setProperty("tooltip","Show the data table");
    mMainView.getConfigurableElement("dragPanel")
      .setProperty("borderTitle","Drag");
    mMainView.getConfigurableElement("dragJointsCheck")
      .setProperty("text","joints")
      .setProperty("tooltip","Drag the joints to change height");
    mMainView.getConfigurableElement("dragBallCheck")
      .setProperty("text","ball");
    mMainView.getConfigurableElement("decorationPanel")
      .setProperty("borderTitle","Decoration & Interaction");
    mMainView.getConfigurableElement("velocityCheck")
      .setProperty("text","v scale:")
      .setProperty("tooltip","Show velocity vector");
    mMainView.getConfigurableElement("vScaleField")
      .setProperty("format","0.#")
      .setProperty("tooltip","Velocity vector scale");
    mMainView.getConfigurableElement("gCheck")
      .setProperty("text","g scale:")
      .setProperty("tooltip","Show velocity vector");
    mMainView.getConfigurableElement("gScaleField")
      .setProperty("format","0.#")
      .setProperty("tooltip","Velocity vector scale");
    mMainView.getConfigurableElement("ngLabel")
      .setProperty("text"," ghost:");
    mMainView.getConfigurableElement("ngFieldField")
      .setProperty("format","0")
      .setProperty("tooltip","Number of ghosts");
    mMainView.getConfigurableElement("graphPanel")
      .setProperty("borderTitle","Graphs");
    mMainView.getConfigurableElement("xCheck")
      .setProperty("text","x(t)")
      .setProperty("tooltip","Show position graph");
    mMainView.getConfigurableElement("vCheck")
      .setProperty("text","v(t)")
      .setProperty("tooltip","Show velocity graph");
    mMainView.getConfigurableElement("aCheck")
      .setProperty("text","a(t)")
      .setProperty("tooltip","Show acceleration graph graph");
    mMainView.getConfigurableElement("xyComponentsCheck")
      .setProperty("text","xy-components")
      .setProperty("tooltip","Plot position and velocity spatial components");
    mMainView.getConfigurableElement("energyCheck")
      .setProperty("text","E(t)")
      .setProperty("tooltip","Show energy graph");
    mMainView.getConfigurableElement("varsPanel")
      .setProperty("borderTitle","Variables");
    mMainView.getConfigurableElement("x0Check")
      .setProperty("text","x0")
      .setProperty("tooltip","Show initial position field");
    mMainView.getConfigurableElement("v0Check")
      .setProperty("text","v0")
      .setProperty("tooltip","Show  initial velocity field");
    mMainView.getConfigurableElement("timeCheck")
      .setProperty("text","t")
      .setProperty("tooltip","Show time field");
    mMainView.getConfigurableElement("scalePanel");
    mMainView.getConfigurableElement("xscalePanel");
    mMainView.getConfigurableElement("xminPanel");
    mMainView.getConfigurableElement("xminLabel")
      .setProperty("text","x min=");
    mMainView.getConfigurableElement("xminField")
      .setProperty("format","0.0##");
    mMainView.getConfigurableElement("xmaxPanel");
    mMainView.getConfigurableElement("xmaxLabel")
      .setProperty("text","x max=");
    mMainView.getConfigurableElement("xmaxField")
      .setProperty("format","0.0##");
    mMainView.getConfigurableElement("yscalePanel");
    mMainView.getConfigurableElement("yminPanel");
    mMainView.getConfigurableElement("yminLabel")
      .setProperty("text"," y min=");
    mMainView.getConfigurableElement("yminField")
      .setProperty("format","0.0##");
    mMainView.getConfigurableElement("ymaxPanel");
    mMainView.getConfigurableElement("ymaxLabel")
      .setProperty("text"," y max=");
    mMainView.getConfigurableElement("ymaxField")
      .setProperty("format","0.0##");
    mMainView.getConfigurableElement("nPanel");
    mMainView.getConfigurableElement("nLabel")
      .setProperty("text"," N =");
    mMainView.getConfigurableElement("nField")
      .setProperty("format","0")
      .setProperty("tooltip","Number of posts");
    mMainView.getConfigurableElement("gPanel");
    mMainView.getConfigurableElement("gLabel")
      .setProperty("text"," g =");
    mMainView.getConfigurableElement("gField")
      .setProperty("format","0.0#")
      .setProperty("size","0,24");
    mMainView.getConfigurableElement("dtPanel");
    mMainView.getConfigurableElement("dtLabel")
      .setProperty("text"," $\\Delta$t =");
    mMainView.getConfigurableElement("dtField")
      .setProperty("format","0.##")
      .setProperty("tooltip","Time step");
    mMainView.getConfigurableElement("maxTimePanel");
    mMainView.getConfigurableElement("maxTimeLabel")
      .setProperty("text"," max t =");
    mMainView.getConfigurableElement("maxTimeField")
      .setProperty("format","0.0#")
      .setProperty("size","0,24")
      .setProperty("tooltip","Maximum simulation time");
    mMainView.getConfigurableElement("bounceCheck")
      .setProperty("text","bounce")
      .setProperty("tooltip","Bounce at enhd of track");
    mMainView.getConfigurableElement("parametersPanel");
    mMainView.getConfigurableElement("savePanel");
    mMainView.getConfigurableElement("saveButton")
      .setProperty("text","Save")
      .setProperty("tooltip","Saves the state.");
    mMainView.getConfigurableElement("studentCheck")
      .setProperty("text","student")
      .setProperty("tooltip","Save student mode state without customization option");
    mMainView.getConfigurableElement("filePanel");
    mMainView.getConfigurableElement("fileLabel")
      .setProperty("text"," doc: ");
    mMainView.getConfigurableElement("fileField")
      .setProperty("tooltip","Documentation file or URL");
    mMainView.getConfigurableElement("msgPanel");
    mMainView.getConfigurableElement("msgLabel")
      .setProperty("text"," msg:");
    mMainView.getConfigurableElement("msgField")
      .setProperty("tooltip","Startup message");
    mMainView.getConfigurableElement("titlePanel");
    mMainView.getConfigurableElement("titleLabel")
      .setProperty("text"," title:");
    mMainView.getConfigurableElement("titleField")
      .setProperty("size","0,24")
      .setProperty("tooltip","Frame title");
    mMainView.getConfigurableElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Reset all parameters");
    super.setViewLocale();
  }


} // End of class GraphsAndTracksSimulation

