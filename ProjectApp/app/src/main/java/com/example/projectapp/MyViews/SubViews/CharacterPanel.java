package com.example.projectapp.MyViews.SubViews;

import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;
import com.example.projectapp.R;

public class CharacterPanel extends MySubView
{
    TextView playerName;
    TextView playerHunger;
    TextView playerSocialHealth;
    TextView playerMentalHealth;
    TextView playerPhysicalHealth;
    TextView playerActions;


    public CharacterPanel(PlayerCharacter PC)
    {
        super(PC);
    }


    @Override
    public boolean buildSubView(ApplicationContext applicationContext)
    {


        playerName = (TextView)applicationContext.findViewById(R.id.playerName);
        playerName.setText(PC.name);

       // Log.i("MY", " get hungerview " + R.id.playerHunger + "obj: " +  (TextView)applicationContext.findViewById(R.id.playerHunger));
       playerHunger=  (TextView)applicationContext.findViewById(R.id.playerHunger);
       playerHunger.setText(Integer.toString(PC.hunger));

       playerSocialHealth = (TextView)applicationContext.findViewById(R.id.playerSH);
       playerSocialHealth.setText(Integer.toString(PC.socialHealth));

       // if(playerSocialHealth == null) return false;
       // else playerSocialHealth.setText(PC.socialHealth);
      //
       // Log.i("MY", " get sh view " + R.id.playerSH);

        playerMentalHealth = (TextView)applicationContext.findViewById(R.id.playerMH);
        playerMentalHealth.setText(Integer.toString(PC.mentalHealth));

       // if(playerMentalHealth == null) return false;
       // else  playerMentalHealth.setText(PC.mentalHealth);

       // Log.i("MY", " get mh view " + R.id.playerMH);
       //
        //playerName = (TextView)applicationContext.findViewById(R.id.playerName);
        //playerName = (TextView)applicationContext.findViewById(R.id.playerName);
        return true;
    }
}
