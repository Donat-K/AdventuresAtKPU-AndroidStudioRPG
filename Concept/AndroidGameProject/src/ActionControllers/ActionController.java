package ActionControllers;

import Models.PlayerCharacter;
import Models.UserInput;
import Views.View;

public abstract class ActionController
{
	public PlayerCharacter PC;
	View controllerView;
	
	
	public ActionController(PlayerCharacter PC, View controllerView)
	{
		this.PC = PC;
		this.controllerView = controllerView;
	}
	
	public void setView(View newView)
	{
		this.controllerView = newView;
	}
	
	public View getPlayerView()
	{
		return controllerView;
	}
	
	public abstract GameAction processPlayerAction(UserInput userInput);
	
}
