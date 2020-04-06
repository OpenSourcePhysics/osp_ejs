/*
 * Class : MassAndSpringSimulation.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 180211. Visit http://www.um.es/fem/Ejs
 */ 
package massandspring;

import org.colos.ejs.library._EjsConstants;

// Imports suggested by Model Elements:
// End of imports from Model Elements

class MassAndSpringSimulation extends org.opensourcephysics.ejs.EjsSimulation { 

  private MassAndSpringView mMainView;

  public MassAndSpringSimulation (MassAndSpring _model, String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, boolean _allowAutoplay) {
    videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    try { setUnderEjs("true".equals(System.getProperty("osp_ejs"))); }
    catch (Exception exc) { setUnderEjs(false); } // in case of applet security
    setCodebase (_codebase);
    setModel (_model);
    _model._simulation = this;
    mMainView = _model._view = new MassAndSpringView(this,_replaceName, _replaceOwnerFrame);
    setView (_model._view);
    if (_model._isApplet()) _model._getApplet().captureWindow (_model,"frame");
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
    windowList.add("frame");
    windowList.add("dialog");
    return windowList;
  }

  public String getMainWindow() {
    return "frame";
  }

  protected void setViewLocale() { // Overwrite its parent's dummy method with real actions 
    mMainView.getConfigurableElement("frame")
      .setProperty("title","Mass and Spring")
      .setProperty("size","383,330");
    mMainView.getConfigurableElement("drawingPanel");
    mMainView.getConfigurableElement("wallShape2D");
    mMainView.getConfigurableElement("spring2D");
    mMainView.getConfigurableElement("massShape2D");
    mMainView.getConfigurableElement("controlPanel");
    mMainView.getConfigurableElement("buttonsPanel");
    mMainView.getConfigurableElement("playPauseButton")
      .setProperty("tooltip","Play/Pause the simulation")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    mMainView.getConfigurableElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Reset the simulation");
    mMainView.getConfigurableElement("parametersPanel");
    mMainView.getConfigurableElement("kLabel")
      .setProperty("text"," k = ");
    mMainView.getConfigurableElement("kField")
      .setProperty("format","0.###");
    mMainView.getConfigurableElement("energyLabel")
      .setProperty("text"," E = ");
    mMainView.getConfigurableElement("energyField")
      .setProperty("format","0.###");
    mMainView.getConfigurableElement("showPlotCheckbox")
      .setProperty("text","Show Plot ");
    mMainView.getConfigurableElement("dialog")
      .setProperty("title","Time Evolution")
      .setProperty("size","385,262");
    mMainView.getConfigurableElement("plottingPanel")
      .setProperty("titleX","Time")
      .setProperty("titleY","Displacement and Velocity");
    mMainView.getConfigurableElement("displacementTrail2D");
    mMainView.getConfigurableElement("velocityTrail2D");
    super.setViewLocale();
  }

} // End of class MassAndSpringSimulation

