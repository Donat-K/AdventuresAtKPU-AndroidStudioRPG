package com.example.projectapp.ActionControllers.RunningGameControllers;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.projectapp.ActionControllers.GameAction;
import com.example.projectapp.ActionControllers.StartGameControllers.StartGameController;
import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;
import com.example.projectapp.MyViews.MyView;
import com.example.projectapp.MyViews.RunningGameViews.HomeView;
import com.example.projectapp.MyViews.SubViews.CharacterPanel;

//controllers take and parse input, perform logic on data from model, and return the appropriate view
//this class will just take inputs, instantiate the correct object, and perform the required logic
//or i can delegate the logic to another class in the loop. whatever.

public class HomeActionController extends RunningGameController
{
	String exercise = "exercise";
	String school = "school";
	String social = "social";
	String study = "study";
	String sleep = "sleep";
	String eat = "eat";
	String menu = "menu";
	String quit = "quit";

	HomeView homeView;

	public HomeActionController(PlayerCharacter PC, ApplicationContext appContext)
	{
		super(PC, appContext, new HomeView());
		this.homeView = (HomeView)controllerView;
	}

	@Override
	public GameAction processPlayerAction(View v)
	{
		String tag = (String)v.getTag();
		//Button btn = appContext.findViewById(v.getId());
		Log.i("MY", "inside of home game controller. viewID: " + v.getId() + " tag: " + tag);

		initView();

		if(tag.equals(exercise)) Log.i("MY", "exercise");
		else if(tag.equals(school))
		{
			Log.i("MY", "school");
			appContext.changeContext(new SchoolActionController(PC,appContext));

		}
		else if(tag.equals(social)) Log.i("MY", "social");
		else if (tag.equals(study)) Log.i("MY", "study");
		else if(tag.equals(sleep)) Log.i("MY", "sleep");
		else if(tag.equals(eat)) Log.i("MY", "eat");
		else if (tag.equals(menu)) Log.i("MY", "menu");
		else if(tag.equals(quit))
		{
			Log.i("MY", "quit");
			quitGame();
		}



		// 2131230795 exercise
		//  2131230798 school
		//  2131230800 social
		//  2131230801 study
		//  2131230799 sleep
		//  2131230794 eAT
		//  2131230796 menu
		//  2131230797 quit





		GameAction playerAction = null;

		/*
		if(userInput.action == 0) playerAction = new School();
		else if(userInput.action == 1) playerAction =  new Sleep();
		else if(userInput.action == 2) playerAction =  new Exercise();
		else if(userInput.action == 3) playerAction =  new Eat();
		else if(userInput.action == 4) playerAction =  new Social_Event();
		else if(userInput.action == 5) playerAction =  new Study();
		else if(userInput.action == 6) playerAction =  new Quit();
		*/
		
		//assert(playerAction != null);
		
		return playerAction;
	}

	@Override
	public MyView getControllerView() {
		return  new HomeView();
	}

	public String toString()
	{
		return "player is at home!";
	}
	
	
	
/*

	
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
	
	
	*/
	

}

