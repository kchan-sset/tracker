package com.example.p90xtracker;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class chestBack extends ListActivity{

	String exercies[] = {"Standard Push-Ups",
		"Wide Front Pull-Ups",
		"Military Push-Ups",
		"Reverse Grip Chin-Ups",
		"Wide Fly Pull-Ups",
		"Closed Grip Overhand Pull-Ups",
		"Decline Push-Ups",
		"Heavy Pants",
		"Diamond Push-Ups",
		"Lawnmowers",
		"Dive Bome Push-Ups",
		"Back Flys"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, exercies));
	}

	
}
