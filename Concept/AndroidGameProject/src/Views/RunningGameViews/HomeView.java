package Views.RunningGameViews;

import Models.UserInput;
import Views.View;

public class HomeView extends View 
{

	
	@Override
	public UserInput getUserInput()
	{
		int userInput;
		
		do
		{
			System.out.println("enter an action for home: 0-6");
			userInput = keyboard.nextInt();
			//System.out.println("input: " + userInput);	
		}
		while(userInput < 0 || userInput > 6);
		
		return new UserInput(userInput, null);
	}

	//constraint: input must be 0-6
		
		
		@Override
		public void drawUserView() 
		{
			System.out.println("User is at home!");
			System.out.println("0: go school!");
			System.out.println("1: go sleep");
			System.out.println("2: exercise");
			System.out.println("3: eat");
			System.out.println("4: social event");
			System.out.println("5: study");
			System.out.println("6: eat");
		
			
		}

}
