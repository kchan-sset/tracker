package com.example.p90xtracker;


public class Exercise {

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
}
