
/*
 * The org.colos.ejs.library package defines foundation classes for
 * Ejs simulations.
 */

package org.colos.ejs.library;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.*;

import javax.swing.JOptionPane;
import org.colos.ejs.library.utils.TranslatorUtil;

public abstract class Model { //implements ExternalClient {
  static protected TranslatorUtil __translatorUtil;
  static private GraphicsConfiguration __graphicConfiguration=null; 

  protected String[] __theArguments = null;
  public org.opensourcephysics.tools.ToolForData _tools = org.opensourcephysics.tools.ToolForData.getTool(); // Table, Data, and Fourier tool
  // List of possible external applications
//  protected ExternalAppsHandler _external = new ExternalAppsHandler(this);
//  private boolean hasBeenReset = false;

  // Lists of variables for experiments
  public Memory _memory = new Memory();
  protected Input _input = new Input();
  protected List<?> _scheduledConditionsList = new ArrayList<Object>();
  protected Hashtable<?,?> _scheduledEventsList = new Hashtable<Object,Object>();
  
  // Break one of the parts
  protected boolean __shouldBreak = false;
  
  // -----------------------------
  // Static methods
  // -----------------------------

  static public final TranslatorUtil _getTranslatorUtil() { return __translatorUtil; }
  
  static public final GraphicsConfiguration getGraphicsConfiguration() { return __graphicConfiguration; }
  
  static public final org.opensourcephysics.numerics.Function _ZERO_FUNCTION = new org.opensourcephysics.numerics.Function() {
    @Override
	public double evaluate(double x) {
      return 0;
    }
  };
  
  /*
  static protected PrintUtil printUtil;

  /**
   * Prints a string on any of the printers attached to this computer
   *
  static public void _printerJob (String title, String output, int fontSize) {
    printUtil.printerJob (title, output, fontSize, 0.5, 0.5, 0.5, 0.5); 
  }
  
  /**
   * Prints a string on any of the printers attached to this computer.
   * Allows to specify the margins
   *
  static public void _printerJob (String title, String output, int fontSize, double top, double left, double bottom, double right)  { 
    printUtil.printerJob (title, output, fontSize, top, left, bottom, right);
  }
  */
  
  // -----------------------------
  // Methods for translation
  // -----------------------------

  /**
   * Returns a String property (as defined in the Translation tool) in the current Locale.
   * If not found, the property is returned
   * @return
   */
  public String _getStringProperty(String _property) { return __translatorUtil.translateString(_property); }
  
//  /**
//   * Returns a String property (as defined in the Translation tool) in the current Locale.
//   * If not found, the default value is returned
//   * @return
//   */
//  public String _getStringProperty(String _property, String _default) { return __translatorUtil.translateString(_property,_default); }

  
  //--------------------------------------------------------
  // Implement OSP JavaScript embedding API
  //--------------------------------------------------------
  
	/**
	 * Gets the OSPFrame that contains the control. The main frame will usually exit
	 * program when it is closed.
	 *
	 * @j2sAlias getMainFrame
	 *
	 * @return
	 */
  
  public javax.swing.JFrame  getMainFrame() {
  	return (javax.swing.JFrame)this._getView().getComponent("mainFrame");
  }
  
  /**
   * Gets the Main Frame size. 
   * 
   * @j2sAlias getMainFrameSize
   * 
   */
  public int[] getMainFrameSize(){
 	 Dimension d= getMainFrame().getSize();
 	 return new int[] {d.width,d.height};
  }
  
	protected String action=null;
	protected ComponentAdapter adapter=null;
  
  /**
   * Sets the window resize action for JavaScript implementation. 
   * 
   * @j2sAlias setResizeAction
   * 
   */
		public void setResizeAction(String o) {
			javax.swing.JFrame myFrame= getMainFrame();
			if(myFrame==null) return;
			if( o==null && adapter!=null){ // remove existing adapter if o=null
				myFrame.removeComponentListener(adapter);
				action = o;
				return;
			}
			if(o.equals(action)) return;  // no change in action
			myFrame.removeComponentListener(adapter); //action changed so remove old adapter
			action =o;
			myFrame.addComponentListener(adapter=new ComponentAdapter() {
				@Override
				public void componentResized(ComponentEvent e) {
					// This is called when the user resized the main frame
					/**
					* @j2sNative
					*
					* // find object
					* var fn = window[o];
					* // is object a function?
					* if (typeof fn === "function") fn();
					*/
					//System.out.println("componentResized action="+action);  // for debugging
				}
			});
		}
  
  //--------------------------------------------------------
  // Abstract methods
  //--------------------------------------------------------

  abstract public View _getView();

  public View getView() { return _getView(); } // backwards compatibility
  
  abstract public Simulation _getSimulation();

  public Simulation getSimulation() { return _getSimulation(); } // backwards compatibility

  abstract public int _getPreferredStepsPerDisplay();
  
  abstract public void _resetModel();

//  abstract public void _initializeSolvers();

  abstract public void _initializeModel();

  abstract public void _automaticResetSolvers(); // reset solver autommatically called by EJS

  abstract public void _resetSolvers(); // rest solver when called by the user

  abstract public void _stepModel();

  abstract public void _updateModel();

  abstract public void _freeMemory ();
  
  /**
   * Actions that the model may want to do after the view is updated.
   * For instance, a Tracker model element will read the (x,y) position of a view element
   */
  public void _readFromViewAfterUpdate() { };
  
  public void _addToHTMLOutputData(Map<String, Object> dataMap) {};

  //---- Control of the Thread ----

  private _ControlSimulationExperimentClass _cSE = new _ControlSimulationExperimentClass();
  private class _ControlSimulationExperimentClass {
    public synchronized void _controlForSimulation() {
      try { wait(); }
      catch (Exception _exc) {}
    }
    public synchronized void _controlForExperiment(){
      notify();
    }
  }
  
  // ---- Trivial thread indexes
  
  public int _firstThreadIndex(int _rawFirstIndex, int _rawLastIndex) {
    return _rawFirstIndex;
  }
  
  public int _lastThreadIndex(int _rawFirstIndex, int _rawLastIndex) {
    return _rawLastIndex;
  }

  //---- End of Control of the Thread ----

  // --- Utilities ---

  public void _play() { _getSimulation().play(); }

  public void _playAndWait(){ _play(); _cSE._controlForSimulation(); }

  public void _pause() { 
    _getSimulation().pause(); 
    _cSE._controlForExperiment(); 
  }
  
  public void _breakAfterThisPage() { __shouldBreak = true; }

  public void _step() { _pause(); _getSimulation().step(); }

  public void _setFPS(int _fps) { _getSimulation().setFPS(_fps); }
  
  public void _setFPS(Integer _fps) { _getSimulation().setFPS(_fps); }

  public void _setDelay(int _delay) { _getSimulation().setDelay(_delay); }

  public int _getDelay () {
    if (_getSimulation()!=null) return _getSimulation().getDelay();
    return 0;
  }

  public void _resetRealTime() {  _getSimulation().resetRealTime(); }

  protected double _getRealTime () { return Double.NaN; }
  
//  public boolean _hasBeenReset() { return this.hasBeenReset; }
  
  public void _reset() {
//    _external.reset();
    _getSimulation().reset();
  }

  public void _initialize() { 
//    _external.reset(); 
    _getSimulation().initialize(); 
  }
  
  public boolean _isPlaying() { return _getSimulation().isPlaying(); }

  public boolean _isPaused()  { return _getSimulation().isPaused(); }


  
  public void _resetView() {
    if (_getView()!=null) {
      _getView().reset();
      _getView().initialize();
    }
  }
  
  public void _clearView() { if (_getView()!=null) _getView().initialize(); }

  public void _setStepsPerDisplay(int _steps) { _setSPD(_steps); }

  public void _setSPD(int _steps) { _getSimulation().setStepsPerDisplay(_steps); }

  public void _setUpdateView(boolean _update) { _getSimulation().setUpdateView(_update); }

  public void _showDescriptionAtStartUp(boolean _show) { _getSimulation().showDescriptionAtStartUp(_show); }
  
  public void _showDescription(boolean _show) { _getSimulation().showDescription(_show); }

  public java.net.URL _getDescriptionPageURL (String pageName) { return _getSimulation().getDescriptionPageURL (pageName); }

  public void _setParentComponent (String _parent) { _getSimulation().setParentComponent (_parent); }

  abstract public org.colos.ejs.library.utils.HtmlPageInfo _getHtmlPageInfo (String _pageName, org.colos.ejs.library.utils.LocaleItem _localeItem);

  /**
   * Calls the class _getEjsResources() method.
   * This returns a set of all resource files required by the model to run (and included in the jar file)
   * @return
   */
  public java.util.Set<String> _getClassEjsResources() { return new HashSet<String>(); }
  
  /**
   * Calls the class _getEjsModel() method
   * @return The XML file that contains the model.
   */
  public String _getClassEjsModel() { return null; }

  /**
   * Calls the class _getModelDirectory() method
   * @return The base directory from which the model was compiled. May not start with a leading "/".
   */
  public String _getClassModelDirectory() { return ""; }

  public String[] _getArguments() { return __theArguments; }
  
  public boolean _hasDefaultState() { return _getSimulation().hasDefaultState(); }

  public boolean _readDefaultState() { return _getSimulation().readDefaultState(); }

  
  public boolean _saveState (String _filename) { return _getSimulation().saveState (_filename); }

  public boolean _readState (String _filename) { return _getSimulation().readState (_filename); }

  public boolean _saveVariables (String _filename, String _varList) {
    return _getSimulation().saveVariables (_filename,_varList);
  }

  public boolean _saveVariables (String _filename, java.util.List<String> _varList) {
    return _getSimulation().saveVariables (_filename,_varList);
  }

  public boolean _readVariables (String _filename,String _varList) {
    return _getSimulation().readVariables (_filename,(java.net.URL) null,_varList);
  }

  public boolean _readVariables (String _filename,java.util.List<String> _varList) {
    java.net.URL codebase = null;
    return _getSimulation().readVariables (_filename,codebase,_varList);
  }

  public boolean _saveText (String _filename, String _text) {
    return _getSimulation().saveText (_filename, _text);
  }

  public boolean _saveText (String _filename, String _annotation, String _text) {
    return _getSimulation().saveText (_filename, _annotation, _text);
  }

  public boolean _saveText (String _filename, StringBuffer _text) {
    return _getSimulation().saveText (_filename, _text);
  }

  public String  _readText (String _filename) {
    return _getSimulation().readText (_filename);
  }

  public String  _readText (String _filename, String _type) {
    return _getSimulation().readText (_filename, _type);
  }

  public boolean _saveImage (String _filename, String _element) { return _getSimulation().saveImage (_filename, _element); }

  
  public void _alert(String _panel, String _title, String _message) {
    if (_getView()!=null) JOptionPane.showMessageDialog(_getView().getComponent(_panel), _message, _title, JOptionPane.INFORMATION_MESSAGE);
    else                  JOptionPane.showMessageDialog(_getSimulation().getParentComponent(),_message, _title, JOptionPane.INFORMATION_MESSAGE);
  }

  public String _format(double _value, String _pattern) {
    return new java.text.DecimalFormat (_pattern).format(_value);
  }
  
  public void _print(String _txt)   {
    if (_getView()!=null) _getView().print(_txt);
    else System.out.print (_txt);
  }

  public void _println(String _txt) {
    if (_getView()!=null) _getView().println(_txt);
    else System.out.print (_txt);
  }

  public void _println() {
    if (_getView()!=null) _getView().println();
    else System.out.println ();
  }

  public void _clearMessages() { if (_getView()!=null) _getView().clearMessages(); }

  private Map<String, Object> userData = new HashMap<String,Object>();

  public void setUserData(String name, Object element) {
    userData.put(name, element);
  }

  public Object getUserData(String name) {
    return userData.get(name);
  }


  public String _getParameter(String _name) {
    if (__theArguments==null) return null;
    for (int i=0; i<__theArguments.length;i++) {
      if (__theArguments[i].equals("-"+_name) && (i+1)<__theArguments.length) return __theArguments[i+1];
    }
    return null;
  }
  
  public boolean _setVariables (String _command, String _delim, String _arrayDelim) {
    return _getSimulation().setVariables (_command,_delim,_arrayDelim);
  }

  public boolean _setVariables (String _command) {
    return _getSimulation().setVariables (_command);
  }

  public String _getVariable (String _varName) {
    return _getSimulation().getVariable (_varName);
  }

  // BH 2020.03.28 from xxxx.java subclasses  -- I want to fix this ONCE!
  
	static protected boolean _common_model_initialization() {
		boolean pathsSet = false, underEjs = false;
		try { // in case of security problems
			if ("true".equals(System.getProperty("org.osp.launcher"))) {
				// Running under Launcher
				org.opensourcephysics.display.OSPRuntime.setLauncherMode(true);
			}
		} catch (Exception _exception) {
		} // do not complain
		try { // in case of security problems
			if (System.getProperty("osp_ejs") != null) { // Running under EJS
				underEjs = true;
				org.colos.ejs.library.Simulation.setPathToLibrary("/Users/wochristian/Desktop/EjsS_5.3/bin/config/");
				// This is for classes (such as EjsMatlab) which needs to know where the library
				// is
				pathsSet = true;
			}
		} catch (Exception _exception) {
			pathsSet = false;
		}
		// maybe an unsigned Web start?
		try {
			String screen = System.getProperty("screen");
			if (screen != null) {
				org.colos.ejs.library.control.EjsControl.setDefaultScreen(Integer.parseInt(screen));
			}
		} catch (Exception _exception) {
		} // Ignore any error here
		if (!pathsSet) {
			org.colos.ejs.library.Simulation.setPathToLibrary("/Users/wochristian/Desktop/EjsS_5.3/bin/config/");
			// This is for classes (such as EjsMatlab) which needs to know where the library
			// is
		}
		if (!underEjs) {
		}
		return true; // Everything went ok
	}


  
  // -------------------------------- FKH 20060903 for javascript and java connection
  /*
  public void _ejsPopup (String _url) { _getSimulation().ejsPopup (_url); }

  public void _ejsEval (String _cmd) { _getSimulation().ejsEval (_cmd); }

  public void _ejsCommand (String[] _args) { _getSimulation().ejsCommand (_args); }

  public void _ejsCommand (String _function_name,String[] _args) { _getSimulation().ejsCommand (_function_name,_args); }

  */  
  // -------------------------------------------------- END FKH

//  public void _onExit() {
//    System.out.println ("Calling model onExit");
//    _getSimulation().onExit();
//  }

  public void _resetIC() { _resetSolvers(); }

  // --- Implementation of ExternalClient ---

  //abstract public String _externalInitCommand(String _applicationFile); //Gonzalo 090610

//  /**
//   * Set the value of all the variables in the external application.
//   * If _any is true, then set the values of all sessions.
//   */
  //abstract public void _externalSetValues(boolean _any, ExternalApp _application); //Gonzalo 090610

//  /**
//   * Get the value of all the variables in the external application.
//   * If _any is true, then get the values of all sessions.
//   */
  //abstract public void _externalGetValues(boolean _any, ExternalApp _application); //Gonzalo 090610

//  public synchronized void _externalGetValuesAndUpdate(boolean _any, ExternalApp _application) { 
//    _getSimulation().update();
//  }

  // --- End of implementation of ExternalClient ---

} // End of class UnnamedModel

