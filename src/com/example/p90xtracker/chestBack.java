package com.example.p90xtracker;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class chestBack extends Activity{

	ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();	
	private ListView chestBackView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chest_back);
		
		Exercise exerciseList[] = new Exercise[] {
			new Exercise("Standard Push-Ups", "chest"),
			new Exercise("Wide Front Pull-Ups", "back"),
			new Exercise("Military Push-Ups", "chest"),
			new Exercise("Reverse Grip Chin-Ups", "back"),
			new Exercise("Wide Fly Pull-Ups", "back"),
			new Exercise("Closed Grip Overhand Pull-Ups", "back"),
			new Exercise("Decline Push-Ups", "chest"),
			new Exercise("Heavy Pants", "back"),
			new Exercise("Diamond Push-Ups", "chest"),
			new Exercise("Lawnmowers", "back"),
			new Exercise("Dive Bome Push-Ups", "chest"),
			new Exercise("Back Flys", "back"),
		};
		
		ExerciseAdapter exAdapter = new ExerciseAdapter(this, R.layout.listview_item_row, exerciseList);
		
		chestBackView = (ListView)findViewById(R.id.chestBackView);
		
		View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
		chestBackView.addHeaderView(header);
		chestBackView.setAdapter(exAdapter);

	}

	
}
