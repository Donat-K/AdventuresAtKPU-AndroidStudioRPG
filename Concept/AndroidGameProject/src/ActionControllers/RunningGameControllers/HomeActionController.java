package ActionControllers.RunningGameControllers;
import ActionControllers.GameAction;

import Models.PlayerCharacter;
import Models.UserInput;
import States.State;
import Views.RunningGameViews.HomeView;

//controllers take and parse input, perform logic on data from model, and return the appropriate view
//this class will just take inputs, instantiate the correct object, and perform the required logic
//or i can delegate the logic to another class in the loop. whatever.

public class HomeActionController extends RunningGameController
{
	
	
	public HomeActionController(PlayerCharacter PC)
	{
		super(PC, new HomeView());
	}
	
	public GameAction processPlayerAction(UserInput userInput)
	{
		
		
		GameAction playerAction = null;
		
		if(userInput.action == 0) playerAction = new School();
		else if(userInput.action == 1) playerAction =  new Sleep();
		else if(userInput.action == 2) playerAction =  new Exercise();
		else if(userInput.action == 3) playerAction =  new Eat();
		else if(userInput.action == 4) playerAction =  new Social_Event();
		else if(userInput.action == 5) playerAction =  new Study();
		else if(userInput.action == 6) playerAction =  new Quit();
		
		
		assert(playerAction != null);
		
		return playerAction;
	}
	
	public String toString()
	{
		return "player is at home!";
	}
	
	
	


	
	//--------------------------------------------------------------------------------
	
	public class School implements GameAction
	{

		@Override
		public void executeAction(State currentState) 
		{
			System.out.println("home_school");
			currentState.changeController(new SchoolActionController(PC));
		}
		
	}
	
	public class Sleep implements GameAction
	{

	
		@Override
		public void executeAction(State currentState) 
		{
			System.out.println("home_sleep");
			
			PC.sleepCounter = PC.sleepCounter -(PC.remainingActions - PC.STARTING_ACTIONS);
			
			PC.remainingActions = PC.STARTING_ACTIONS;
			PC.currentDay++;
			
			processTurn(1);
		}
		
	}
	
	public class Exercise implements GameAction
	{

		@Override
		public void executeAction(State currentState) 
		{
			System.out.println("home_exercise");
			System.out.println("increasing player stats");
			
			PC.physicalHealth = PC.physicalHealth + 10;
			
			
			processTurn(1);
		
			
		}
		
	}
	
	public class Eat implements GameAction
	{

		@Override
		public void executeAction(State currentState)
		{
			PC.food = (int) (PC.food + 200*(PC.efficiency));
			
			
			
			System.out.println("home_eat");
		
			processHunger();
			processTurn(1);
		}
		
	}
	
	public class Social_Event implements GameAction
	{

		@Override
		public void executeAction(State currentState) 
		{
			System.out.println("home_socialevent");
			
			PC.socialHealth = PC.socialHealth + 10;
			
			
			processTurn(1);
		
			
		}
		
	}
	
	public class Study implements GameAction
	{

		@Override
		public void executeAction(State currentState) {
			System.out.println("home_study");
			
			PC.intelligence = PC.intelligence + 10;
			
			processTurn(1);
			
		}
		
	}
	
	
	
	

}

