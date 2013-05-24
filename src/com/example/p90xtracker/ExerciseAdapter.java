package com.example.p90xtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ExerciseAdapter extends ArrayAdapter<Exercise>{
	
	private OnClickListener callback;
	
	Context context;
	int layoutResourceId;
	Exercise data[] = null;
	
	
	public ExerciseAdapter(Context context, int layoutResourceId, Exercise[] data, OnClickListener callback)
	{
		super(context, layoutResourceId, data);
		this.context = context;
		this.layoutResourceId = layoutResourceId;
		this.data = data;
		this.callback = callback;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		View row = convertView;
		ExerciseHolder holder = null;
		
		if(row == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
			row = inflater.inflate(layoutResourceId, parent, false);
			
			holder = new ExerciseHolder();
			holder.txtCategory = (TextView)row.findViewById(R.id.txtCategory);
			holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
			holder.position = position;
			row.setTag(holder);
		} else {
			holder = (ExerciseHolder)row.getTag();
		}
		
		row.setOnClickListener(callback);


		
		Exercise exercise = data[position];
		holder.txtCategory.setText(exercise.category);
		holder.txtTitle.setText(exercise.name);
		
		return row;
	}

	static class ExerciseHolder {
		TextView txtCategory;
		TextView txtTitle;
		int position;
	}
}


