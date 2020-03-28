/*
 * Class : GyroscopeApplet.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 
package gyroscope;


import org.colos.ejs.library._EjsConstants;

import org.opensourcephysics.numerics.*;
// Imports suggested by Model Elements:
// End of imports from Model Elements

public class GyroscopeApplet extends org.colos.ejs.library.LauncherApplet {

  static {
    org.opensourcephysics.display.OSPRuntime.loadTranslatorTool = false;
    org.opensourcephysics.display.OSPRuntime.loadVideoTool = false;
    org.opensourcephysics.display.OSPRuntime.loadDataTool = false;
    org.opensourcephysics.display.OSPRuntime.loadExportTool = false;
  }

  public void init () {
    super.init();
    org.opensourcephysics.tools.ResourceLoader.addAppletSearchPath("/testing/");
    org.opensourcephysics.tools.ResourceLoader.addSearchPath(getCodeBase()+"testing/"); // This is for relative files
    org.opensourcephysics.tools.ResourceLoader.addSearchPath("testing/"); // This is for relative files, too
    //org.colos.ejs.library.Simulation.setPathToLibrary(getCodeBase()); // This is for classes (such as EjsMatlab) which needs to know where the library is
    if (getParentFrame()!=null) {
      _model = new Gyroscope ("mainFrame",getParentFrame(),getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    else {
      _model = new Gyroscope (null,null,getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    _simulation.initMoodle();
  }
  public void _reset() { ((Gyroscope)_model)._reset(); }
  public void _initialize() { ((Gyroscope)_model)._initialize(); }
  public void stop() { _model.getSimulation().onExit(); }
} // End of class GyroscopeApplet

