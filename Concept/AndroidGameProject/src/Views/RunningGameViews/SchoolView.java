package Views.RunningGameViews;

import Models.UserInput;
import Views.View;

public class SchoolView extends View
{
	
	
	@Override
	public UserInput getUserInput()
	{
		
		int userInput;
		
		do
		{
			System.out.println("enter an action for school: 0-4");
			userInput = keyboard.nextInt();
			//System.out.println("input: " + userInput);	
		}
		while(userInput < 0 || userInput > 4);
		
		return new UserInput(userInput, null);
		
	}
	
	
	@Override
	public void drawUserView() 
	{
		System.out.println("User is at School!");
		System.out.println("0: study!");
		System.out.println("1: club");
		System.out.println("2: councillor");
		System.out.println("3: home");
		System.out.println("4: quit");
		
	}
	
	
	
	
	
}
