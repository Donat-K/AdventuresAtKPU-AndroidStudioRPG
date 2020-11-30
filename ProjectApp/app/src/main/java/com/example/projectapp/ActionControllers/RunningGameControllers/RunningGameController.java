package com.example.projectapp.ActionControllers.RunningGameControllers;

import com.example.projectapp.ActionControllers.ActionController;
import com.example.projectapp.ActionControllers.GameAction;
import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;
import com.example.projectapp.MyViews.MyView;
import com.example.projectapp.MyViews.StartGameView.StartGameView;
import com.example.projectapp.MyViews.SubViews.CharacterPanel;

public abstract class RunningGameController extends ActionController
{
	protected CharacterPanel characterPanel;

	public RunningGameController(PlayerCharacter PC, ApplicationContext applicationContext, MyView myView)
	{
		super(PC, applicationContext, myView);
		characterPanel = new CharacterPanel(PC);
	}



	@Override
	public void initView()
	{
		characterPanel.buildSubView(appContext);
	}
	
	
	
	public void processTurn(int actionCost)
	{
		System.out.println("processing end of a player action");
		
		PC.remainingActions = PC.remainingActions - actionCost;
		
		if(PC.remainingActions == 0)
		{
			PC.currentDay++;
			PC.remainingActions = PC.STARTING_ACTIONS;
		}
	}
	
	public void processSleep()
	{
		System.out.println("processing sleep");
		
		if(PC.sleepCounter >= 2)
		{
			PC.efficiency = PC.efficiency + .25;
			System.out.println("PC is well rested!");
		}
		else if(PC.sleepCounter == 1)
		{
			System.out.println("PC is rested!");
		}
		else if(PC.sleepCounter <= 0)
		{
			System.out.println("PC is tired and sleep deprived!");
			PC.efficiency = PC.efficiency - .25;
			
			PC.intelligence = PC.intelligence + (PC.sleepCounter*10);	
		}
		
	}
	
	public void processHunger()
	{
		
			System.out.println("processing PC hunger");
			
				if(PC.food < 500) 
				{
					System.out.println("malnourished!");
					PC.currentDaysMalnourished++;
				}
				else
				{
					PC.currentDaysMalnourished = 0;
					
					if(PC.food >= 500 && PC.food < 600)
					{
						System.out.println("hungry!");
						PC.sleepCounter++;
					}
					else if(PC.food >= 600 && PC.food < 800)
					{
						System.out.println("hungry!");
						PC.sleepCounter++;
					}
					else if(PC.food >= 800 && PC.food <= 1000)
					{
						System.out.println("well fed!");
						PC.efficiency = PC.efficiency + .1;
					}
					else
					{
						System.out.println("overate fatarse! 25% chance to miss a day!");
					//add a random chance to currentDay++
					}	
				}
		}

		/*
	
	//----------------------------game actions and methods shared among all the running game controllers-------------------------------

	public class Quit implements GameAction
	{

		
			@Override
			public void executeAction(State currentState) 
			{
				System.out.println("school_quit");
				currentState.changeState(null);
				currentState.exitStateLoop = true;
				
				
			}
			
	}
	
	*/
}
