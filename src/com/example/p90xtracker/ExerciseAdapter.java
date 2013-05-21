package com.example.p90xtracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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
			row.setTag(holder);
		} else {
			holder = (ExerciseHolder)row.getTag();
		}
		
		Exercise exercise = data[position];
		holder.txtCategory.setText(exercise.category);
		holder.txtTitle.setText(exercise.name);
		
		return row;
	}

	static class ExerciseHolder {
		TextView txtCategory;
		TextView txtTitle;
	}
}


