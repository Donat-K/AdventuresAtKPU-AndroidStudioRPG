package com.example.projectapp.ActionControllers;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;
import com.example.projectapp.Models.UserInput;
import com.example.projectapp.MyViews.MyView;

public abstract class ActionController
{
	public PlayerCharacter PC;
	protected MyView controllerView;
	public ApplicationContext appContext;

	View.OnClickListener clickListener;
	
	
	public ActionController(PlayerCharacter PC, ApplicationContext appContext, MyView controllerView)
	{
		this.PC = PC;
		this.appContext = appContext;
		this.controllerView = controllerView;

		//clickListener = new ButtonListener();
		//Log.i("MY", "inside of button. viewID:" + clickListener );
		//controllerView.buildView(clickListener,appContext);

	}

	public void quitGame()
	{
		appContext.finish();
		System.exit(0);
	}

	public int getViewLayout()
	{
		return controllerView.getLayout();
	}

	public abstract GameAction processPlayerAction(View v);
	public abstract MyView getControllerView();
	abstract public void initView();


	
}
