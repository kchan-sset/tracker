package com.example.p90xtracker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class trackerInput extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tracker_input);
		TextView exerciseLabel = (TextView)findViewById(R.id.exercise_name);
		
		Bundle extras = getIntent().getExtras();
		if(extras != null) {
			Exercise currentExercise = extras.getParcelable("exercise");
			exerciseLabel.setText(currentExercise.getName().toString());
		}
	}

}
