package ActionControllers.RunningGameControllers;
import ActionControllers.GameAction;
import Models.PlayerCharacter;
import Models.UserInput;
import States.State;
import Views.RunningGameViews.SchoolView;


public class SchoolActionController extends RunningGameController
{
	public SchoolActionController(PlayerCharacter PC) 
	{
		super(PC, new SchoolView());
	}
	
	public GameAction processPlayerAction(UserInput userInput)
	{
		GameAction playerAction = null;
		
		if(userInput.action == 0) playerAction = new Study();
		else if(userInput.action == 1) playerAction =  new Club();
		else if(userInput.action == 2) playerAction =  new Councillor();
		else if(userInput.action == 3) playerAction =  new Home();
		else if(userInput.action == 4) playerAction =  new Quit();
		
		assert(playerAction != null);
		
		return playerAction;
	}
	
	public String toString()
	{
		return "player is at school!";
	}
	
	public void processSchoolStudy()
	{
		
	}
	
	//--------------------------------------------------------------------------------
	

	
	public class Study implements GameAction
	{

		@Override
		public void executeAction(State currentState) {
			// TODO Auto-generated method stub
			System.out.println("school_study");
			
			processSchoolStudy();
			processTurn(1);
			
			
		}
		
	}
	
	public class Club implements GameAction
	{

		@Override
		public void executeAction(State currentState) {
			// TODO Auto-generated method stub
			PC.socialHealth = PC.socialHealth + 10;
			
			System.out.println("school_club");
			
			processTurn(1);
			
		}
		
	}
	
	public class Councillor implements GameAction
	{

		@Override
		public void executeAction(State currentState) {
			// TODO Auto-generated method stub
			System.out.println("school_councillor");
			
			PC.mentalHealth = PC.mentalHealth + 10;
			processTurn(1);
			
		}
		
	}
	
	public class Home implements GameAction
	{

		@Override
		public void executeAction(State currentState) {
			// TODO Auto-generated method stub
			System.out.println("school_gohome");
			currentState.changeController(new HomeActionController(PC));
			
		}
		
	}
	
}


