package com.example.projectapp.MyViews;

import android.app.Activity;
import android.view.View;

import com.example.projectapp.ActionControllers.ActionController;
import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;


public abstract class MyView
{
	protected final int LAYOUT_ID;

	public MyView(int layout)
	{
		this.LAYOUT_ID = layout;
	}

	public int getLayout()
	{
		return LAYOUT_ID;
	}
	
	//public abstract UserInput getUserInput();
	public abstract void UpdateUserView(ApplicationContext applicationContext);
	public abstract void buildView(ApplicationContext applicationContext);
	
}
