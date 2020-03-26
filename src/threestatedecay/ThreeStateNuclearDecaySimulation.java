/*
 * Class : ThreeStateNuclearDecaySimulation.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package threestatedecay;

import org.opensourcephysics.display.OSPRuntime;

// Imports suggested by Model Elements:
// End of imports from Model Elements

class ThreeStateNuclearDecaySimulation extends org.colos.ejs.library.Simulation { 

  private ThreeStateNuclearDecayView mMainView;

  public ThreeStateNuclearDecaySimulation (ThreeStateNuclearDecay _model, String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, boolean _allowAutoplay) {
    videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    try { setUnderEjs("true".equals(System.getProperty("osp_ejs"))); }
    catch (Exception exc) { setUnderEjs(false); } // in case of applet security
    setCodebase (_codebase);
    setModel (_model);
    _model._simulation = this;
    mMainView = _model._view = new ThreeStateNuclearDecayView(this,_replaceName, _replaceOwnerFrame);
    setView (_model._view);
    if (_model._isApplet()) _model._getApplet().captureWindow (_model,"mainFrame");
    if (OSPRuntime.isJS)
    	setDelay(5);
    else
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
    windowList.add("tableDialog");
    windowList.add("plotDialog");
    return windowList;
  }

  public String getMainWindow() {
    return "mainFrame";
  }

  protected void setViewLocale() { // Overwrite its parent's dummy method with real actions 
    mMainView.getConfigurableElement("mainFrame")
      .setProperty("title","Three-State Radioactive Decay")
      .setProperty("size","619,474");
    mMainView.getConfigurableElement("upperPanel");
    mMainView.getConfigurableElement("n1Panel");
    mMainView.getConfigurableElement("n1Label")
      .setProperty("text"," N1 = ");
    mMainView.getConfigurableElement("n1Field")
      .setProperty("format","0")
      .setProperty("size","40,24")
      .setProperty("tooltip","Upper state particle number.");
    mMainView.getConfigurableElement("k1Panel");
    mMainView.getConfigurableElement("k1Label")
      .setProperty("text"," k1 = ");
    mMainView.getConfigurableElement("k1Field")
      .setProperty("format","0.000#")
      .setProperty("size","40,24")
      .setProperty("tooltip","Level 1 decay rate.");
    mMainView.getConfigurableElement("n2Panel");
    mMainView.getConfigurableElement("n2Label")
      .setProperty("text"," N2 = ");
    mMainView.getConfigurableElement("n2Field")
      .setProperty("format","0")
      .setProperty("size","40,24")
      .setProperty("tooltip","Middle state particle number.");
    mMainView.getConfigurableElement("k2Panel");
    mMainView.getConfigurableElement("k2Label")
      .setProperty("text"," k2 = ");
    mMainView.getConfigurableElement("k2Field")
      .setProperty("format","0.000#")
      .setProperty("size","40,24")
      .setProperty("tooltip","Level 2 decay rate.");
    mMainView.getConfigurableElement("n3Panel");
    mMainView.getConfigurableElement("n3Label")
      .setProperty("text"," N3 = ");
    mMainView.getConfigurableElement("n3Field")
      .setProperty("format","0")
      .setProperty("size","40,24")
      .setProperty("tooltip","Lower state particle number.");
    mMainView.getConfigurableElement("sampleDraingPanel");
    mMainView.getConfigurableElement("sampleShapeSet");
    mMainView.getConfigurableElement("controlPanel");
    mMainView.getConfigurableElement("buttonPanel")
      .setProperty("size","240,23");
    mMainView.getConfigurableElement("startButton")
      .setProperty("tooltip","Starts and stops the simulation.")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    mMainView.getConfigurableElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/step.gif")
      .setProperty("tooltip","Setp the simulation");
    mMainView.getConfigurableElement("resetTime")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Resets the time.");
    mMainView.getConfigurableElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Reset the simulation");
    mMainView.getConfigurableElement("paramPanel");
    mMainView.getConfigurableElement("timePanel");
    mMainView.getConfigurableElement("timeLabel")
      .setProperty("text"," t = ");
    mMainView.getConfigurableElement("timeField")
      .setProperty("format","0.00##")
      .setProperty("size","40,24")
      .setProperty("tooltip","Time.");
    mMainView.getConfigurableElement("dtPanel");
    mMainView.getConfigurableElement("dtLabel")
      .setProperty("text"," $\\Delta$t = ");
    mMainView.getConfigurableElement("dtField")
      .setProperty("format","0.00##")
      .setProperty("size","40,24")
      .setProperty("tooltip","Time.");
    mMainView.getConfigurableElement("checkPanel");
    mMainView.getConfigurableElement("showSampleCheck")
      .setProperty("text","plot")
      .setProperty("tooltip","Show the polulation as a function of time.");
    mMainView.getConfigurableElement("tableCheckBox")
      .setProperty("text","table");
    mMainView.getConfigurableElement("tableDialog")
      .setProperty("title","Three-State Decay Table")
      .setProperty("size","300,300");
    if(ThreeStateNuclearDecay.debugging) {
    mMainView.getConfigurableElement("dataTable")
      .setProperty("columnNames","row#,t,N1,N2,N3,$\\Delta$N1,$\\Delta$N2")
      .setProperty("columnFormat","0,0.0##,0,0,0,0,0");
    }
    mMainView.getConfigurableElement("tableControlPanel");
    mMainView.getConfigurableElement("clearTabel")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/erase.gif")
      .setProperty("tooltip","Clears the table data.");
    mMainView.getConfigurableElement("stridePanel");
    mMainView.getConfigurableElement("strideLabel")
      .setProperty("text","stride = ")
      .setProperty("tooltip","The stride between data points.");
    mMainView.getConfigurableElement("strideField")
      .setProperty("format","0")
      .setProperty("size","50,24");
    mMainView.getConfigurableElement("plotDialog")
      .setProperty("title","Three-State Populations")
      .setProperty("size","616,288");
    mMainView.getConfigurableElement("decayPlottingPanel")
      .setProperty("titleX","t");
    mMainView.getConfigurableElement("n1Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n1");
    mMainView.getConfigurableElement("n2Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n2");
    mMainView.getConfigurableElement("n3Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","n3");
    mMainView.getConfigurableElement("N1Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N1");
    mMainView.getConfigurableElement("N2Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N2");
    mMainView.getConfigurableElement("N3Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","N3");
    mMainView.getConfigurableElement("dN1Trace");
    mMainView.getConfigurableElement("dN2Trace");
    mMainView.getConfigurableElement("dn1Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","$\\Delta$n1");
    mMainView.getConfigurableElement("dn2Trail")
      .setProperty("xLabel","t")
      .setProperty("yLabel","$\\Delta$n1");
    mMainView.getConfigurableElement("plotControlPanel");
    mMainView.getConfigurableElement("continuousRadioButton")
      .setProperty("text","continuous");
    mMainView.getConfigurableElement("stochasticRadioButton")
      .setProperty("text","discrete");
    mMainView.getConfigurableElement("bothRadioButton")
      .setProperty("text","both");
    mMainView.getConfigurableElement("deltaCheckBox")
      .setProperty("text","$\\Delta$N");
    super.setViewLocale();
  }
} // End of class ThreeStateNuclearDecaySimulation

