package com.example.projectapp.MyViews.StartGameView;

import android.app.Activity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.projectapp.ActionControllers.ActionController;
import com.example.projectapp.ApplicationContext;
import com.example.projectapp.MyViews.MyView;
import com.example.projectapp.R;

public class StartGameView extends MyView
{
	public EditText edittext;

	public StartGameView()
	{
		super(R.layout.start_screen_view);
	}





	public void ShowPopupWindowClick(View view, ApplicationContext appContext)
	{

		// inflate the layout of the popup window
		LayoutInflater inflater = (LayoutInflater)appContext.getSystemService(appContext.LAYOUT_INFLATER_SERVICE);
		View popupView = inflater.inflate(R.layout.popup_window, null );

		// create the popup window
		int width = LinearLayout.LayoutParams.WRAP_CONTENT;
		int height = LinearLayout.LayoutParams.WRAP_CONTENT;
		boolean focusable = true; // lets taps outside the popup also dismiss it
		final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

		// show the popup window
		// which view you pass in doesn't matter, it is only used for the window tolken
		popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

		// dismiss the popup window when touched
		popupView.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				popupWindow.dismiss();
				return true;
			}
		});
	}


	@Override
	public void UpdateUserView(ApplicationContext applicationContext) { }

	// 2131230792
	@Override
	public void buildView(ApplicationContext applicationContext)
	{
		edittext = (EditText) applicationContext.findViewById(R.id.textPlayername);
	}

	public String getPlayerName()
	{
		return edittext.getText().toString();
	}


}
