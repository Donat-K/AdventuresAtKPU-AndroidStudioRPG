package States;

import ActionControllers.GameAction;
import ActionControllers.StartGameControllers.StartGameActionController;
import ApplicationContext.AppContext;
import Models.PlayerCharacter;

public class StartGameState extends State
{
	
	PlayerCharacter PC;
	
	public StartGameState(PlayerCharacter PC, AppContext appContext)
	{
		super(appContext, new StartGameActionController(PC));
		this.PC = PC;
	}

	@Override
	public void runStateLoop() 
	{
		GameAction playerAction = null;
		
		getCurrentView().drawUserView();
		playerAction = currentController.processPlayerAction(currentController.getPlayerView().getUserInput());
		playerAction.executeAction(this);
		
	}

}
