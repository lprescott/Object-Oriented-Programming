package edu.albany.budgettracker.budget.expenditure;

/*
* @author Luke R. Prescott 
* Student ID: 001252879
*
* Project Name: Final Project - Budget Tracker
* 
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
* 
* @file ExpenditureEnum.java is an enumeration that contains the recommended percetages of expenditures as of 2018.

* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*
*/
public enum ExpenditureEnum {
	HOUSING("housing", .35),
	TRANSPORTATION("transportation", .15),
	FOOD("food", .15),
	DEBT_PAYMENTS("debt payments", .10),
	PERSONAL("personal", .07),
	SAVINGS("savings", .06),
	UTILITIES("utilities", .05),
	CLOTHING("clothing", .04),
	MEDICAL("medical", .03);

	private double percentage;
	private String name;
	
	ExpenditureEnum(String name, double percentage){
		this.percentage = percentage;
		this.name = name;
	}

	/**
	 * @return the percentage
	 */
	public double getPercentage() {
		return percentage;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
