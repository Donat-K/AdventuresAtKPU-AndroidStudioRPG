package Views;

import java.util.Scanner;
import Models.UserInput;


public abstract class View 
{
	protected static Scanner keyboard;
	
	String data;
	int action;
	
	
	protected View()
	{
		View.keyboard = new Scanner(System.in);
		
	}
	
	public abstract UserInput getUserInput();
	public abstract void drawUserView();
	
}
