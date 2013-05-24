package com.example.p90xtracker;

import android.os.Parcel;
import android.os.Parcelable;


public class Exercise implements Parcelable{

	protected String name;
	protected String category;

	
	//CONSTRUCTOR
	public Exercise(String name, String category)
	{
		this.setName(name);
		this.setCatetory(category);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String strName)
	{
		this.name = strName;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public void setCatetory(String strCategory)
	{
		this.category = strCategory;
	}

	// Parcelling part - example taken from http://prasanta-paul.blogspot.com/2010/06/android-parcelable-example.html
	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(name);
		dest.writeString(category);
	}
	
    public Exercise(Parcel source){
        this.name = source.readString();
        this.category = source.readString();
    }
    
	public static final Parcelable.Creator<Exercise> CREATOR
    	= new Parcelable.Creator<Exercise>() {
		public Exercise createFromParcel(Parcel source) {
			return new Exercise (source);
		}

		public Exercise[] newArray(int size) {
			return new Exercise[size];
		}
	};	
	
}
