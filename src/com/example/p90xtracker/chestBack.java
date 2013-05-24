package com.example.p90xtracker;

import com.example.p90xtracker.ExerciseAdapter.ExerciseHolder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;

public class chestBack extends Activity implements OnClickListener{

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
	
	private ListView chestBackView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chest_back);
						
		ExerciseAdapter exAdapter = new ExerciseAdapter(this, R.layout.listview_item_row, this.exerciseList, this);
		
		chestBackView = (ListView)findViewById(R.id.chestBackView);
		
		View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
		chestBackView.addHeaderView(header);
		chestBackView.setAdapter(exAdapter);

	}
	

	@Override
	public void onClick(View view) {
		Log.i("exName", "here");
		Intent myIntent = new Intent();
		Bundle myBundle = new Bundle();

		ExerciseHolder holder = (ExerciseHolder) view.getTag();
		
		Exercise currentExercise = this.exerciseList[holder.position];
		Log.i("exName", currentExercise.getName().toString());
		
		myBundle.putParcelable("exercise", currentExercise);
		myIntent.putExtras(myBundle);
		myIntent.setClass(this, trackerInput.class);
		startActivity(myIntent);
		
	}

	
}
