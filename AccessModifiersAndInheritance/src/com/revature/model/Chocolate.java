package com.revature.model;

public class Chocolate extends Candy
{
	/*TODO:
	 * Add chocolate specific fields
	 * 
	 * Add chocolate specific methods
	 * 
	 * Set up constructor to establish the state of the chocolate
	 */
	
	private String chocolateType;
	private boolean hasNuts;
	
	public Chocolate()
	{
		this.name = "Some kind of chocolate!";
		this.numberOfCalories = 100.0;
		this.setMySecretCandyNumber(5);
		this.chocolateType = "Milk Chocolate";
		this.hasNuts = false;
	}
	
	public Chocolate(String name, double numberOfCalories, int secretCandyNum,
			String chocolateType, boolean hasNuts)
	{
		this.name = name;
		this.numberOfCalories = numberOfCalories;
		this.setMySecretCandyNumber(secretCandyNum);
		this.chocolateType = chocolateType;
		this.hasNuts = hasNuts;
	}
	
	public void melt()
	{
		System.out.println("The chocolate has melted!");
	}
	
	public void addNuts()
	{
		System.out.println("Adding nuts!");
		this.hasNuts = true;
	}
	
	/*public void printChocolate()
	{
		System.out.println(this.getName());
		System.out.println(this.getNumberOfCalories());
		System.out.println(this.getMySecretCandyNumber());
	}*/
	
	/*
	 * Method Overriding:
	 * 1. Need an IS-A relationship
	 * 2. Define a method that is declared in the superclass in the subclass
	 * (THE METHODS MUST HAVE THE SAME NAME)
	 * 3. Make sure parameters match.
	 * 4. Make sure return type is compatible
	 * 5. Make it as visible as the inherited method
	 */
	
	public String toString()
	{
		return "Name: "+this.getName()+
				" Calories: "+this.getNumberOfCalories()+
				" SecretNumber: "+this.getMySecretCandyNumber()+
				" Type of Chocolate: "+this.chocolateType+
				" Has Nuts: "+this.hasNuts;
	}

	public String getChocolateType()
	{
		return chocolateType;
	}

	public void setChocolateType(String chocolateType)
	{
		this.chocolateType = chocolateType;
	}

	public boolean isHasNuts()
	{
		return hasNuts;
	}

	public void setHasNuts(boolean hasNuts)
	{
		this.hasNuts = hasNuts;
	}
}
