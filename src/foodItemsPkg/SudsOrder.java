/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: CST8284 Section 320
 * Professor: Sandra Iroakazi
 */
package foodItemsPkg;

import servicesPkg.Deliverable;

/**
 * This class represents a drink order. 
 * This will be used to display information such as a name of drink, number of drinks, and the size of the drink in ml.
 */
public class SudsOrder implements Deliverable{

	/**
	 * This line of code creates a variable called 'name'
	 * This variable will hold the name of a specific drink.
	 */
	private String name;
	/**
	 * This line of code creates a variable called 'number'.
	 * This variable will hold the number of drinks in an order.
	 */
	private int number;
	/**
	 * This line of code creates a variable called 'size_in_ml'.
	 * This variable will hold the size in ml of drinks in an order.
	 */
	private int size_in_ml;
	
	/**
	 * Create SudsOrder constructor that passes name, number and size as parameters.
	 * 
	 * @param name the name of the drink
	 * @param number the number of drinks
	 * @param size_in_ml the size of the drink in ml
	 */
	public SudsOrder(String name, int number, int size_in_ml) {
		this.name = name;
		this.number = number;
		this.size_in_ml = size_in_ml;
	}
	
	/**
	 * This method will be used to retrieve the name of the drink
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method will be used to retrieve the number of drinks
	 * @return number
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * This method will be used to retrieve the size of the drink
	 * @return size
	 */
	public int getSize() {
		return size_in_ml;
	}
	
	/**
	 * This method is created to override the toString method.
	 * 
	 * This is done so that information about the SudsOrder can be printed to the console,
	 * instead of just the memory location.
	 * 
	 * The toString method s overridden by providing correct formatting, 
	 * then displaying the getName, getNumber and getDeliveryCost methods.
	 */
	@Override
	public String toString() {
		return String.format("%-25s%6d%8.2f",
				getName(), getNumber(), getDeliveryCost());
	}
	
	/**
	 * This method will be used to calculate the total delivery costs of the pizza.
	 * This is done by overriding the getDeliveryCost method from Deliverable interface.
	 * 
	 * @return cost the cost of the delivery/order
	 */
	@Override
	public double getDeliveryCost() {
		
		double cost = number * 0.75;
		return cost;
	}
}
