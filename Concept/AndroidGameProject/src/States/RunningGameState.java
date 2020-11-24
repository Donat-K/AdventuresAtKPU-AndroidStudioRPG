package States;

import ActionControllers.GameAction;
import ActionControllers.RunningGameControllers.HomeActionController;
import ApplicationContext.AppContext;
import Models.PlayerCharacter;
import Models.UserInput;


public class RunningGameState extends State
{
	
	PlayerCharacter PC;
	
	public RunningGameState(PlayerCharacter PC, AppContext appContext)
	{
		super(appContext, new HomeActionController(PC));
		this.PC = PC;
	}
	
	@Override
	
	//main game loop
	//all logic should be handled in the controllers
	//the main data object (PC) has only a single instance that is shared among all the states/controllers
	public void runStateLoop() 
	{
		GameAction gameAction = null;
		
		do
		{
			currentController.getPlayerView().drawUserView();
			UserInput userInput = currentController.getPlayerView().getUserInput();
			gameAction = currentController.processPlayerAction(userInput);
			gameAction.executeAction(this);
			
			System.out.println("----------player stats post action:----------------");
			System.out.println(PC);
			System.out.println("---------------------------------------------------");
		
		}
		while(!PC.didPlayerLose() && !exitStateLoop);
	}
}
		
		
			
			
			
		
		
		
		
		
		
/*
	@Override
	public void processUserInput(UserInput input) 
	{
		////////System.out.println("start running game state");
		GameAction gameAction = null;
		gameAction = currentController.processPlayerAction(input);
		//System.out.println(gameAction);
		actionQueue.offer(gameAction);
		
		//System.out.println(actionQueue.size());
		
		while(!actionQueue.isEmpty())
		{
			System.out.println("in queue");
			actionQueue.poll().executeAction(this);
			System.out.println("printing player stats: " + PC);
			
			
			
			//if > 1 action may trigger view changes
			//can change controller views in the actions
			//this will be useful to show a real-time GUI of player stats
			//View currentView = getCurrentView();
			//currentView.drawUserView();
		}
		
		//////System.out.println("end running game state");
	}
	*/


