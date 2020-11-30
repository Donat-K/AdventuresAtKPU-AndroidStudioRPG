package com.example.projectapp.MyViews.RunningGameViews;

import android.app.Activity;
import android.view.View;

import com.example.projectapp.ActionControllers.ActionController;
import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.UserInput;
import com.example.projectapp.MyViews.MyView;
import com.example.projectapp.MyViews.SubViews.MySubView;
import com.example.projectapp.R;

public class HomeView extends MyView
{
	MySubView characterPanel;

	public HomeView()
	{
		super(R.layout.home_screen_view);
	}


	//constraint: input must be 0-6


	@Override
	public void UpdateUserView(ApplicationContext applicationContext) {

	}

	@Override
	public void buildView( ApplicationContext applicationContext)
	{

	}



}
