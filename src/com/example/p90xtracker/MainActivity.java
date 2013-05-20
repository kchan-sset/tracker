package com.example.p90xtracker;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	String workouts[] = {"Chest & Back", "Shoulder & Arms"};
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);       
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, workouts));
    }	
	
    @Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		if("Chest & Back".equals(workouts[position])) {
			Intent myIntent = new Intent(this, chestBack.class);
			startActivity(myIntent);
		}else if("Shoulder & Arms".equals(workouts[position])) {
			Intent myIntent = new Intent(this, shoulderArms.class);
			startActivity(myIntent);
		}		
		
	}
    
}
