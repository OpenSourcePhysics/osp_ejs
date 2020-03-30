/*
 * Class : TrajectoriesInEBApplet.java
 *  Generated using  *  Easy Java/Javascript Simulations Version 5.3, build 190423. Visit http://www.um.es/fem/Ejs
 */ 

package trajectoriesEB;


// Imports suggested by Model Elements:
// End of imports from Model Elements

public class TrajectoriesInEBApplet extends org.colos.ejs.library.LauncherApplet {

  static {
    org.opensourcephysics.display.OSPRuntime.loadTranslatorTool = false;
    org.opensourcephysics.display.OSPRuntime.loadExportTool = false;
  }

  public void init () {
    super.init();
    org.opensourcephysics.tools.ResourceLoader.addAppletSearchPath("/testing/");
    org.opensourcephysics.tools.ResourceLoader.addSearchPath(getCodeBase()+"testing/"); // This is for relative files
    org.opensourcephysics.tools.ResourceLoader.addSearchPath("testing/"); // This is for relative files, too
    //org.colos.ejs.library.Simulation.setPathToLibrary(getCodeBase()); // This is for classes (such as EjsMatlab) which needs to know where the library is
    if (getParentFrame()!=null) {
      _model = new TrajectoriesInEB ("mainFrame",getParentFrame(),getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    else {
      _model = new TrajectoriesInEB (null,null,getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    _simulation.initMoodle();
  }
  public void _reset() { ((TrajectoriesInEB)_model)._reset(); }
  public void _initialize() { ((TrajectoriesInEB)_model)._initialize(); }
  public void stop() { _model.getSimulation().onExit(); }
} // End of class TrajectoriesInEBApplet
