/*
 * Class : TrajectoriesInEBSimulation.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package trajectoriesEB;

import org.colos.ejs.library._EjsConstants;

// Imports suggested by Model Elements:
// End of imports from Model Elements

class TrajectoriesInEBSimulation extends org.opensourcephysics.ejs.EjsSimulation { 

  private TrajectoriesInEBView mMainView;

  public TrajectoriesInEBSimulation (TrajectoriesInEB _model, String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, boolean _allowAutoplay) {
  	videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    try { setUnderEjs("true".equals(System.getProperty("osp_ejs"))); }
    catch (Exception exc) { setUnderEjs(false); } // in case of applet security
    setCodebase (_codebase);
    setModel (_model);
    _model._simulation = this;
    mMainView = _model._view = new TrajectoriesInEBView(this,_replaceName, _replaceOwnerFrame);
    setView (_model._view);
    if (_model._isApplet()) _model._getApplet().captureWindow (_model,"mainFrame");
    setFPS(10);
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
    return windowList;
  }

  public String getMainWindow() {
    return "mainFrame";
  }

  protected void setViewLocale() { // Overwrite its parent's dummy method with real actions 
    mMainView.getConfigurableElement("mainFrame")
      .setProperty("title","Parallel E&B Caustics in 2D")
      .setProperty("size","586,308");
    mMainView.getConfigurableElement("upperPanel");
    mMainView.getConfigurableElement("BPanel");
    mMainView.getConfigurableElement("BLabel");
    mMainView.getConfigurableElement("BField")
      .setProperty("format","0.0#")
      .setProperty("tooltip","Magnetic field");
    mMainView.getConfigurableElement("EPanel");
    mMainView.getConfigurableElement("ELabel");
    mMainView.getConfigurableElement("EField")
      .setProperty("format","0.0#")
      .setProperty("tooltip","Electric field");
    mMainView.getConfigurableElement("scalePanel");
    mMainView.getConfigurableElement("scaleLabel")
      .setProperty("text"," Scale = ");
    mMainView.getConfigurableElement("scaleField")
      .setProperty("format","0.0#")
      .setProperty("tooltip","Scale of drawing");
    mMainView.getConfigurableElement("ballDrawingPanel");
    mMainView.getConfigurableElement("group");
    mMainView.getConfigurableElement("trailSet");
    mMainView.getConfigurableElement("particles");
    mMainView.getConfigurableElement("source");
    mMainView.getConfigurableElement("controlPanel");
    mMainView.getConfigurableElement("buttonPanel")
      .setProperty("size","140,23");
    mMainView.getConfigurableElement("startStopButton")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    mMainView.getConfigurableElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif");
    mMainView.getConfigurableElement("resetTimeButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Reset the time");
    mMainView.getConfigurableElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif");
    mMainView.getConfigurableElement("inputPanel");
    mMainView.getConfigurableElement("nPanel");
    mMainView.getConfigurableElement("nLabel")
      .setProperty("text"," n = ")
      .setProperty("tooltip","number of trajectories");
    mMainView.getConfigurableElement("nField")
      .setProperty("format","0");
    mMainView.getConfigurableElement("vPanel");
    mMainView.getConfigurableElement("vLabel")
      .setProperty("text"," v0 = ")
      .setProperty("tooltip","initial speed");
    mMainView.getConfigurableElement("vField")
      .setProperty("format","0.0#");
    mMainView.getConfigurableElement("tPanel");
    mMainView.getConfigurableElement("tLabel")
      .setProperty("text"," t = ");
    mMainView.getConfigurableElement("tField")
      .setProperty("format","0.0#");
    mMainView.getConfigurableElement("directionPanel");
    mMainView.getConfigurableElement("crossButton")
      .setProperty("text","ExB");
    mMainView.getConfigurableElement("parallelButton")
      .setProperty("text","E||B");
    super.setViewLocale();
  }

} // End of class TrajectoriesInEBSimulation

