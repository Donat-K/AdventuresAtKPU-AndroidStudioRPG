package com.example.projectapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.projectapp.ActionControllers.ActionController;
import com.example.projectapp.ActionControllers.StartGameControllers.StartGameController;
import com.example.projectapp.Models.PlayerCharacter;
import com.example.projectapp.MyViews.MyView;


public class ApplicationContext extends AppCompatActivity
{
    ActionController currentController;
    final PlayerCharacter PC = new PlayerCharacter();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

       // playerName = (EditText) findViewById(R.id.textPlayername);
        //setContentView(R.layout.start_screen_view);
        changeContext(new StartGameController(PC, this));
        //currentState.init();
    }

    public void changeContext(ActionController actionController)
    {

        this.currentController = actionController;
        //currentController.appContext = this;
        setContentView(currentController.getViewLayout());
        currentController.initView();


    }

    public void onClick(View view)
    {
       // currentController.initView();
        currentController.processPlayerAction(view);
    }





}

/*

package com.example.projectapp;



import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText playerName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        playerName = (EditText) findViewById(R.id.textPlayername);
        setContentView(R.layout.start_screen_view);
    }

    public void sendMessage(View view)
    {
        //String s =  playerName.getText().toString();
        Log.i("MY", "inside of button. viewID: " + view.getId());
        //Log.i("MY_INFO", "player name is: " + s);

    }

    public void runCommand(int i)
    {

    }
}
 */
