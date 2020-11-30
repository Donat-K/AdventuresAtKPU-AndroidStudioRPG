package com.example.projectapp.ActionControllers.RunningGameControllers;
import android.util.Log;
import android.view.View;

import com.example.projectapp.ActionControllers.GameAction;
import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;
import com.example.projectapp.MyViews.MyView;
import com.example.projectapp.MyViews.RunningGameViews.SchoolView;


public class SchoolActionController extends RunningGameController
{
	String clas = "class";
	String study = "study";
	String talk = "talk";
	String club = "club";
	String home = "home";
	String menu = "menu";
	String quit = "quit";

	public SchoolActionController(PlayerCharacter PC, ApplicationContext applicationContext)
	{
		super(PC, applicationContext, new SchoolView());
	}
	
	public GameAction processPlayerAction(View v)
	{
		GameAction playerAction = null;


		String tag = (String)v.getTag();
		//Button btn = appContext.findViewById(v.getId());
		Log.i("MY", "inside of school game controller. viewID: " + v.getId() + " tag: " + tag);

		if(tag.equals(study)) Log.i("MY", "study");
		else if(tag.equals(clas)) Log.i("MY", "clas");
		else if(tag.equals(talk)) Log.i("MY", "talk");
		else if(tag.equals(club)) Log.i("MY", "club");
		else if(tag.equals(home))
		{
			Log.i("MY", "home");
			appContext.changeContext(new HomeActionController(PC, appContext));
		}
		else if(tag.equals(menu)) Log.i("MY", "menu");
		else if(tag.equals(quit))
		{
			Log.i("MY", "quit");
			quitGame();
		}

		;
		
		return playerAction;
	}

	@Override
	public MyView getControllerView() {
		return new SchoolView();
	}

	public String toString()
	{
		return "player is at school!";
	}
	
	public void processSchoolStudy()
	{
		
	}
	
	//--------------------------------------------------------------------------------
	
/*
	
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

	*/

	
}


