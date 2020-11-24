package ActionControllers.StartGameControllers;

import ActionControllers.ActionController;
import ActionControllers.GameAction;
import Models.PlayerCharacter;
import Models.UserInput;
import States.RunningGameState;
import States.State;
import Views.StartGameView.StartGameView;

public class StartGameActionController extends ActionController
{

	public StartGameActionController(PlayerCharacter PC) 
	{
		super(PC, new StartGameView());
		// TODO Auto-generated constructor stub
	}

	@Override
	public GameAction processPlayerAction(UserInput userInput)
	{
		GameAction playerAction = null;
		
		if(userInput.action == -1) playerAction = new NamePC_Action(userInput.data);
			
		assert(playerAction != null);
		
		return playerAction;
	}
	
	public class NamePC_Action implements GameAction
	{
		NamePC_Action(String name)
		{
			PC.setName(name);
		}

		@Override
		public void executeAction(State currentState) 
		{
			currentState.changeState(new RunningGameState(PC, currentState.getAppContext()));
			System.out.println("entered name! welcome " + PC.name);
			
			
		}
		
	}


	

}
