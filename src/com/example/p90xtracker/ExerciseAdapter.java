package com.example.p90xtracker;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ExerciseAdapter extends ArrayAdapter<Exercise>{
	
	Context context;
	int layoutResourceId;
	Exercise data[] = null;
	
	public ExerciseAdapter(Context context, int layoutResourceId, Exercise[] data)
	{
		super(context, layoutResourceId, data);
		this.context = context;
		this.layoutResourceId = layoutResourceId;
		this.data = data;
	}

}
