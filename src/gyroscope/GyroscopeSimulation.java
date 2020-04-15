/*
 * Class : GyroscopeSimulation.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package gyroscope;

import org.colos.ejs.library._EjsConstants;

import org.opensourcephysics.numerics.*;
// Imports suggested by Model Elements:
// End of imports from Model Elements

class GyroscopeSimulation extends org.colos.ejs.library.Simulation { 

  private GyroscopeView mMainView;

  public GyroscopeSimulation (Gyroscope _model, String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, boolean _allowAutoplay) {
    videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    setCodebase (_codebase);
    setModel (_model);
    _model._simulation = this;
    mMainView = _model._view = new GyroscopeView(this,_replaceName, _replaceOwnerFrame);
    setView (_model._view);
    setFPS(10);
    setStepsPerDisplay(_model._getPreferredStepsPerDisplay()); 
    if (_allowAutoplay) { setAutoplay(false); reset(); }
    else { reset(); setAutoplay(false); }
  }

  public java.util.List<String> getWindowsList() {
    java.util.List<String> windowList = new java.util.ArrayList<String>();
    windowList.add("mainFrame");
    windowList.add("elevationDialog");
    return windowList;
  }

  public String getMainWindow() {
    return "mainFrame";
  }

  protected void setViewLocale() { // Overwrite its parent's dummy method with real actions 
    mMainView.getConfigurableElement("mainFrame")
      .setProperty("title","Gyroscope")
      .setProperty("size","554,540");
    mMainView.getConfigurableElement("upperPanel");
    mMainView.getConfigurableElement("showPanel");
    mMainView.getConfigurableElement("showLabel")
      .setProperty("text","   Show: ");
    mMainView.getConfigurableElement("showRotorCheck")
      .setProperty("text","rotor");
    mMainView.getConfigurableElement("showSpaceCheck")
      .setProperty("text","space");
    mMainView.getConfigurableElement("showBodyTrailCheck")
      .setProperty("text","trail");
    mMainView.getConfigurableElement("showVectors")
      .setProperty("text","vectors");
    mMainView.getConfigurableElement("elevation")
      .setProperty("text","elevation")
      .setProperty("tooltip","Shows the elevation angle plot");
    mMainView.getConfigurableElement("rotorPanel");
    mMainView.getConfigurableElement("radiusPanel");
    mMainView.getConfigurableElement("radiusLabel")
      .setProperty("text"," R = ");
    mMainView.getConfigurableElement("radiusField")
      .setProperty("format","0.0#")
      .setProperty("size","0,25")
      .setProperty("tooltip","Rotor radius");
    mMainView.getConfigurableElement("z0Panel");
    mMainView.getConfigurableElement("z0Label")
      .setProperty("text"," z0 = ");
    mMainView.getConfigurableElement("z0Field")
      .setProperty("format","0.0#")
      .setProperty("size","0,25")
      .setProperty("tooltip","Rotor position on shaft");
    mMainView.getConfigurableElement("spaceViewDrawingPanel3D");
    mMainView.getConfigurableElement("rotorGroup");
    mMainView.getConfigurableElement("quaternion3D");
    mMainView.getConfigurableElement("shaftArrow");
    mMainView.getConfigurableElement("rotor");
    mMainView.getConfigurableElement("shaft");
    mMainView.getConfigurableElement("vectorGroup");
    mMainView.getConfigurableElement("angularMomentumVector");
    mMainView.getConfigurableElement("angularMomentumText")
      .setProperty("text","L");
    mMainView.getConfigurableElement("torqueVector");
    mMainView.getConfigurableElement("torqueText")
      .setProperty("text","N");
    mMainView.getConfigurableElement("omegaVector");
    mMainView.getConfigurableElement("omegaText")
      .setProperty("text","$\\omega$");
    mMainView.getConfigurableElement("baseCylinder");
    mMainView.getConfigurableElement("postCylinder");
    mMainView.getConfigurableElement("shaftTrail");
    mMainView.getConfigurableElement("spaceAxisGroup");
    mMainView.getConfigurableElement("xArrow3D2");
    mMainView.getConfigurableElement("yArrow3D2");
    mMainView.getConfigurableElement("zArrow3D2");
    mMainView.getConfigurableElement("xText2")
      .setProperty("text","X");
    mMainView.getConfigurableElement("yText2")
      .setProperty("text","Y");
    mMainView.getConfigurableElement("zText2")
      .setProperty("text","Z");
    mMainView.getConfigurableElement("controlPanel");
    mMainView.getConfigurableElement("buttonPanel")
      .setProperty("size","150,23");
    mMainView.getConfigurableElement("startButton")
      .setProperty("tooltip","Starts and stops the simulation")
      .setProperty("imageOn","/org/opensourcephysics/resources/controls/images/play.gif")
      .setProperty("imageOff","/org/opensourcephysics/resources/controls/images/pause.gif");
    mMainView.getConfigurableElement("stepButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/stepforward.gif")
      .setProperty("tooltip","Single steps the simulation");
    mMainView.getConfigurableElement("resetTimeButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset1.gif")
      .setProperty("tooltip","Resets the time without chagning the inputs");
    mMainView.getConfigurableElement("resetButton")
      .setProperty("image","/org/opensourcephysics/resources/controls/images/reset.gif")
      .setProperty("tooltip","Resets the simulation");
    mMainView.getConfigurableElement("inputPanel");
    mMainView.getConfigurableElement("tiltPanel");
    mMainView.getConfigurableElement("tiltLabel")
      .setProperty("text"," $\\theta$ = ");
    mMainView.getConfigurableElement("tiltField")
      .setProperty("format","0.0#")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial tilt angle");
    mMainView.getConfigurableElement("omegaOnePanel");
    mMainView.getConfigurableElement("omegaOneLabel")
      .setProperty("text"," $\\omega$1 = ");
    mMainView.getConfigurableElement("omegaOneField")
      .setProperty("format","0.0#")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial angular velocity perpendicular to shaft in radians/s");
    mMainView.getConfigurableElement("omegaThreePanel");
    mMainView.getConfigurableElement("omegaThreeLabel")
      .setProperty("text"," $\\omega$3 = ");
    mMainView.getConfigurableElement("omegaThreeField")
      .setProperty("format","0.0#")
      .setProperty("size","0,25")
      .setProperty("tooltip","Initial angular velocity parallel to shaft in radians/s");
    mMainView.getConfigurableElement("dtPanel");
    mMainView.getConfigurableElement("dtLabel")
      .setProperty("text"," $\\Delta$t = ");
    mMainView.getConfigurableElement("dtField")
      .setProperty("format","0.0#")
      .setProperty("size","0,25")
      .setProperty("tooltip","Time step");
    mMainView.getConfigurableElement("tPanel");
    mMainView.getConfigurableElement("tLabel")
      .setProperty("text"," t = ");
    mMainView.getConfigurableElement("tField")
      .setProperty("format","0.##")
      .setProperty("size","0,25")
      .setProperty("tooltip","Time");
    mMainView.getConfigurableElement("checkPanel");
    mMainView.getConfigurableElement("gravityCheck")
      .setProperty("text","gravity")
      .setProperty("tooltip","Turns gravity on and off");
    mMainView.getConfigurableElement("elevationDialog")
      .setProperty("title","Elevation Angle")
      .setProperty("size","660,358");
    mMainView.getConfigurableElement("elevationPlottingPanel")
      .setProperty("title","Axis and Angular Momentum Elevation")
      .setProperty("titleX","t")
      .setProperty("titleY","elevation angle");
    mMainView.getConfigurableElement("axisElevationTrail");
    mMainView.getConfigurableElement("momentumElevationTrail");
    super.setViewLocale();
  }

} // End of class GyroscopeSimulation

