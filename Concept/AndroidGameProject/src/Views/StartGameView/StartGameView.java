package Views.StartGameView;

import Models.UserInput;
import Views.View;

public class StartGameView extends View
{


	@Override
	public void drawUserView() 
	{
		System.out.println("enter char name:");
		
	}

	@Override
	public UserInput getUserInput() 
	{
		
		return new UserInput(-1, keyboard.nextLine());
	}

}
