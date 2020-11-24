package ApplicationContext;

import Models.PlayerCharacter;

import States.StartGameState;
import Views.View;
import States.State;

/*
 * vars that need to be factored into seperate files:
 * actions/day = 7
 * starting hope = 4
 * 
 */


public class AppContext
{
	
	//ActionController currentController;
	//View currentView;
	final PlayerCharacter PC;
	public State currentState;
	
	
	AppContext()
	{
		this.PC = new PlayerCharacter();
		this.currentState = new StartGameState(PC, this);
		
	}
	

	
	public void playGame()
	{
		
		
		System.out.println("***************GAME START**************");
		
		while(currentState != null)
		{
			System.out.println("***************state start**************");
			//View currentView = currentState.getCurrentView();
			//currentView.drawUserView();
			currentState.runStateLoop();
			System.out.println("***************state end**************");
		}
		
		System.out.println("***************GAME END**************");
		
		
		
	}
	
	public void changeContext(State newState)
	{
		this.currentState = newState;
	}
	
	

}


