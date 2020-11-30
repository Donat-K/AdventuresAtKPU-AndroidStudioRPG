package com.example.projectapp.ActionControllers.StartGameControllers;

import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.projectapp.ActionControllers.ActionController;
import com.example.projectapp.ActionControllers.GameAction;
import com.example.projectapp.ActionControllers.RunningGameControllers.HomeActionController;
import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;
import com.example.projectapp.MyViews.MyView;
import com.example.projectapp.MyViews.StartGameView.StartGameView;
import com.example.projectapp.R;

public class StartGameController extends ActionController
{
	StartGameView startGameView;

	public StartGameController(PlayerCharacter PC, ApplicationContext applicationContext)
	{
		super(PC, applicationContext, new StartGameView());
		startGameView = (StartGameView)controllerView;
	}

	@Override
	public GameAction processPlayerAction(View v)
	{
		startGameView.buildView(appContext);
		GameAction playerAction = null;

		Log.i("MY", "inside of start game controller. viewID: " + v.getId());

		//Log.i("MY", "inside of start game controller. editText: " + startGameView.edittext.getText());

		String name = startGameView.getPlayerName();

		if(name.length() < 4)
		{
			Log.i("MY", " too short" + startGameView.edittext.getText());
			//startGameView.ShowPopupWindowClick(v, appContext);
		}
		else
		{
			Log.i("MY", "inside of start game controller. editText: " + startGameView.edittext.getText());
			PC.name = name;
			Log.i("MY", "PC name. " + PC.name);
			appContext.changeContext(new HomeActionController(PC,appContext));
		}




		//if(startGameView.edittext == null)
			//Log.i("MY", "editText: NULL");

		//startGameView.edittext
		
		//if(userInput.action == -1) playerAction = new NamePC_Action(userInput.data);
			
		//assert(playerAction != null);
		
		return playerAction;
	}




	@Override
	public MyView getControllerView()
	{

		return controllerView;
	}

	@Override
	public void initView() {

	}

	/*
	public class NamePC_Action implements GameAction
	{
		NamePC_Action(String name)
		{
			PC.setName(name);
		}

		@Override
		public void executeAction(State currentState) 
		{
			currentState.changeState(new RunningGameState(PC, currentState.getApplicationContext()));
			System.out.println("entered name! welcome " + PC.name);
			
			
		}


		
	}

	 */


	

}
