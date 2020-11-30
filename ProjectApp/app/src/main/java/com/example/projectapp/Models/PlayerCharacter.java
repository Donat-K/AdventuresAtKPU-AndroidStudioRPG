package com.example.projectapp.Models;

public class PlayerCharacter 
{
	

	public final int STARTING_HOPE = 4;
	public final int STARTING_ACTIONS = 7;
	public final int DAYS_PER_SEMESTER = 10;
	public final int MIDTERM_DAY = DAYS_PER_SEMESTER/2;
	public final int MALNOURISHED_DEATH = 10;
	
	public String name;
	
	public int intelligence = 100;
	
	public int mentalHealth = 100;
	public double mentalEfficiency = 1.0;
	
	public int socialHealth = 100;
	
	public int physicalHealth = 100;
	
	public int food = 1000;//should be an enumerated type
	public int hunger = 10;
	public int currentDaysMalnourished = 0;
	
	public int sleepCounter = 4; //should be an enumerated type
	
	public double efficiency = 1.0;
	
	
	public int currentHope = 4;
	public int currentDay = 1;
	
	public int currentSemester = 1;
	public int currentYear = 1;
	public int fieldOfStudy;//should be enumerated type
	public int credits= 0;
	
	
	public int remainingActions = STARTING_ACTIONS;
	

	public void setName(String name)
	{
		this.name = name;
	}
	
	public boolean didPlayerLose()
	{
		return currentHope <= 0 || currentDaysMalnourished >= MALNOURISHED_DEATH;
	}
	
	
	@Override
	public String toString() 
	{
		return "intelligence=" + intelligence + 
				"\n mentalHealth=" + mentalHealth + 
				"\n mentalEfficiency=" + mentalEfficiency + 
				"\n socialHealth=" + socialHealth + 
				"\n physicalHealth=" + physicalHealth + 
				"\n food=" + food + 
				"\n hunger=" + hunger + 
				"\n sleepCounter=" + sleepCounter + 
				"\n efficiency=" + efficiency + 
				"\n currentDay=" + currentDay
				+ "\n remainingActions=" + remainingActions;
	}
}

