package com.example.projectapp.MyViews.SubViews;

import com.example.projectapp.ApplicationContext;
import com.example.projectapp.Models.PlayerCharacter;

abstract public class MySubView
{
    protected final PlayerCharacter PC;

    MySubView(PlayerCharacter PC)
    {
        this.PC = PC;
    }

    public abstract boolean buildSubView(ApplicationContext applicationContext);
}
