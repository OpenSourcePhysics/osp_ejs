/*
 * Class : ParticleMotionNearMagneticDipoleSimulation.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package motionneardipole;

class ParticleMotionNearMagneticDipoleSimulation extends org.colos.ejs.library.Simulation { 

  private ParticleMotionNearMagneticDipoleView mMainView;

  public ParticleMotionNearMagneticDipoleSimulation (ParticleMotionNearMagneticDipole _model, String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, boolean _allowAutoplay) {
    videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    setCodebase (_codebase);
    setModel (_model);
    _model._simulation = this;
    mMainView = _model._view = new ParticleMotionNearMagneticDipoleView(this,_replaceName, _replaceOwnerFrame);
    setView (_model._view);
    setFPS(20);
    setStepsPerDisplay(_model._getPreferredStepsPerDisplay()); 
    if (_allowAutoplay) { setAutoplay(false); reset(); }
    else { reset(); setAutoplay(false); }
  }

  @Override
public java.util.List<String> getWindowsList() {
    java.util.List<String> windowList = new java.util.ArrayList<String>();
    windowList.add("mainFrame");
    return windowList;
  }

  @Override
public String getMainWindow() {
    return "mainFrame";
  }

  @Override
protected void setViewLocale() { // Overwrite its parent's dummy method with real actions 
    mMainView.getConfigurableElement("mainFrame")
      .setProperty("title","Charged Particle Motion Near a Magnetic Dipole")
      .setProperty("size","579,685");
    mMainView.getConfigurableElement("drawingPanel3D");
    mMainView.getConfigurableElement("trail");
    mMainView.getConfigurableElement("dipoleArrow");
    mMainView.getConfigurableElement("controlPanel");
    mMainView.getConfigurableElement("energyPanel");
    mMainView.getConfigurableElement("energyLabel")
      .setProperty("text","    E = ");
    mMainView.getConfigurableElement("energyField")
      .setProperty("format","0.00000")
      .setProperty("size","70,20");
    mMainView.getConfigurableElement("radioPanel");
    mMainView.getConfigurableElement("radio3D")
      .setProperty("text","3D");
    mMainView.getConfigurableElement("radioXY")
      .setProperty("text","XY");
    mMainView.getConfigurableElement("radioYZ")
      .setProperty("text","YZ");
    mMainView.getConfigurableElement("radioXZ")
      .setProperty("text","XZ");
    mMainView.getConfigurableElement("buttonPanel")
      .setProperty("size","160,24");
    mMainView.getConfigurableElement("startStopButton")
      .setProperty("tooltip","Starts and stops the simulation.")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    mMainView.getConfigurableElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif")
      .setProperty("tooltip","Single steps the simulation.");
    mMainView.getConfigurableElement("resetTime")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif");
    mMainView.getConfigurableElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Resets the simulation.");
    mMainView.getConfigurableElement("upperPanel");
    mMainView.getConfigurableElement("vxPanel");
    mMainView.getConfigurableElement("vxLabel")
      .setProperty("text"," vx(0) = ");
    mMainView.getConfigurableElement("vxField")
      .setProperty("format","0.00");
    mMainView.getConfigurableElement("vyPanel");
    mMainView.getConfigurableElement("vyLabel")
      .setProperty("text"," vy(0) = ");
    mMainView.getConfigurableElement("vyField")
      .setProperty("format","0.00");
    mMainView.getConfigurableElement("vzPanel");
    mMainView.getConfigurableElement("vzLabel")
      .setProperty("text"," vz(0) = ");
    mMainView.getConfigurableElement("vzField")
      .setProperty("format","0.00");
    super.setViewLocale();
  }

} // End of class ParticleMotionNearMagneticDipoleSimulation

