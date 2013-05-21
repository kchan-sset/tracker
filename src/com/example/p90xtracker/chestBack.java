package com.example.p90xtracker;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class chestBack extends ListActivity{

	ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		exerciseList.add(new Exercise("Standard Push-Ups", "chest"));
		exerciseList.add(new Exercise("Wide Front Pull-Ups", "back"));
		exerciseList.add(new Exercise("Military Push-Ups", "chest"));
		exerciseList.add(new Exercise("Reverse Grip Chin-Ups", "back"));
		exerciseList.add(new Exercise("Wide Fly Pull-Ups", "back"));
		exerciseList.add(new Exercise("Closed Grip Overhand Pull-Ups", "back"));
		exerciseList.add(new Exercise("Decline Push-Ups", "chest"));
		exerciseList.add(new Exercise("Heavy Pants", "back"));
		exerciseList.add(new Exercise("Diamond Push-Ups", "chest"));
		exerciseList.add(new Exercise("Lawnmowers", "back"));
		exerciseList.add(new Exercise("Dive Bome Push-Ups", "chest"));
		exerciseList.add(new Exercise("Back Flys", "back"));
		
		setListAdapter(new ArrayAdapter<Exercise>(this, android.R.layout.simple_list_item_1, exerciseList));
	}

	
}
