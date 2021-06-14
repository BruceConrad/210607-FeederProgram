package com.revature.model;

public class HardCandy extends Candy
{
	/*TODO:
	 * Add hardcandy specific fields
	 * 
	 * Add hardcandy specific methods
	 * 
	 * Set up constructor to establish the state of the hardcandy
	 * 
	 * Override toString
	 */
	
	String flavor;
	
	public HardCandy()
	{
		this.name = "Some kind of hard candy";
		this.numberOfCalories = 50.0;
		this.setMySecretCandyNumber(2);
	}
	
	public void breakApart()
	{
		System.out.println("The candy broke apart!");
	}
	
	public String toString()
	{
		return "Name: "+this.getName()+
				" Calories: "+this.getNumberOfCalories()+
				" SecretNumber: "+this.getMySecretCandyNumber();
	}
}
