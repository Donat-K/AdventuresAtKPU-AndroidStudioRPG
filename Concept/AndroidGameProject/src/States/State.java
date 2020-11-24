package States;


import ActionControllers.ActionController;
import ActionControllers.GameAction;
import ApplicationContext.AppContext;
import Views.View;


public abstract class State 
{
	protected final AppContext appContext;
	protected ActionController currentController;
	public boolean exitStateLoop = false;
	
	protected State(AppContext appContext, ActionController newController)
	{
		this.appContext = appContext;
		this.currentController = newController;
	}
	
	public void setController(ActionController newController)
	{
		this.currentController = newController; 
	}
	
	public View getCurrentView()
	{
		return currentController.getPlayerView();
	}
	
	public void changeController(ActionController newController)
	{
		this.currentController = newController;
	}
	
	public void changeState(State newState)
	{
		appContext.changeContext(newState);
	}
	
	public AppContext getAppContext()
	{
		return appContext;
	}
	

	abstract public void runStateLoop();
}
