/*
 * Class : MassAndSpringApplet.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 180211. Visit http://www.um.es/fem/Ejs
 */ 

package massandspring;

import org.colos.ejs.library._EjsConstants;

// Imports suggested by Model Elements:
// End of imports from Model Elements

public class MassAndSpringApplet extends org.colos.ejs.library.LauncherApplet {

  static {
    org.opensourcephysics.display.OSPRuntime.loadTranslatorTool = false;
    org.opensourcephysics.display.OSPRuntime.loadVideoTool = false;
    org.opensourcephysics.display.OSPRuntime.loadExportTool = false;
  }

  public void init () {
    super.init();
    org.opensourcephysics.tools.ResourceLoader.addAppletSearchPath("/testing/");
    org.opensourcephysics.tools.ResourceLoader.addSearchPath(getCodeBase()+"testing/"); // This is for relative files
    org.opensourcephysics.tools.ResourceLoader.addSearchPath("testing/"); // This is for relative files, too
    //org.colos.ejs.library.Simulation.setPathToLibrary(getCodeBase()); // This is for classes (such as EjsMatlab) which needs to know where the library is
    if (getParentFrame()!=null) {
      _model = new MassAndSpring ("frame",getParentFrame(),getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    else {
      _model = new MassAndSpring (null,null,getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    _simulation.initMoodle();
  }
  public void _reset() { ((MassAndSpring)_model)._reset(); }
  public void _initialize() { ((MassAndSpring)_model)._initialize(); }
  public void stop() { _model.getSimulation().onExit(); }
} // End of class MassAndSpringApplet

