/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: CST8284 Section 320
 * Professor: Sandra Iroakazi
 */
package foodItemsPkg;

import servicesPkg.Deliverable;

/**
 * This class represents a Pizza order and implements the Interface called Deliverable.
 * This class will be used to store information about a pizza order that can be printed out to the console later.
 */
public class Pizza implements Deliverable {
	
	/**
	 * This line of code creates a variable called size_in_inches.
	 * This variable will hold the size of the pizza in inches.
	 */
	private int size_in_inches;
	
	/**
	 * This line of code creates a variable called sauce.
	 * This variable will hold the type of sauce on the pizza.
	 */
	private String sauce;
	
	/**
	 * This line of code creates a variable called thin_crust.
	 * This variable will hold a boolean value of true or false.
	 * True will mean the pizza is thin crust, false will mean regular crust
	 */
	private boolean thin_crust;
	
	/**
	 * This line of code creates a variable called ham.
	 * This variable will hold a boolean value of true or false.
	 * True will mean ham is added, false will mean ham is not added
	 */
	private boolean ham;
	
	/**
	 * This line of code creates a variable called pepperoni.
	 * This variable will hold a boolean value of true or false.
	 * True will mean pepperoni is added, false will mean pepperoni is not added
	 */
	private boolean pepperoni;
	
	/**
	 * This line of code creates a variable called extra_cheese.
	 * This variable will hold a boolean value of true or false.
	 * True will mean extra cheese is added, false will mean extra cheese is not added
	 */
	private boolean extra_cheese;

	/**
	 * This line of code creates a variable called olives.
	 * This variable will hold a boolean value of true or false.
	 * True will mean olives is added, false will mean olives is not added
	 */
	private boolean olives;
	
	/**
	 * This line of code creates a variable called mushrooms.
	 * This variable will hold a boolean value of true or false.
	 * True will mean mushrooms is added, false will mean mushrooms is not added
	 */
	private boolean mushrooms;
	
	/**
	 * This line of code creates a variable called green_pepper.
	 * This variable will hold a boolean value of true or false.
	 * True will mean green pepper is added, false will mean green pepper is not added
	 */
	private boolean green_pepper;
	
	/**
	 * This line of code creates a variable called tomatoes.
	 * This variable will hold a boolean value of true or false.
	 * True will mean tomatoes is added, false will mean tomatoes is not added
	 */
	private boolean tomatoes;
	
	/**
	 * This line of code creates a variable called onion.
	 * This variable will hold a boolean value of true or false.
	 * True will mean onion is added, false will mean onion is not added
	 */
	private boolean onion;
	
	/**
	 * This line of code creates a constructor for a Pizza by chaining the other Pizza constructor
	 * and adding the thin_crust parameter.
	 * 
	 * This constructor will take the size of the pizza in inches, and the sauce of the pizza
	 * @param size_in_inches the size of the pizza in inches.
	 * @param sauce the sauce on the pizza.
	 * @param thin_crust the crust type of the pizza. (true for thin, false for regular)
	 */
	public Pizza(int size_in_inches, String sauce, boolean thin_crust) {
		this(size_in_inches, sauce);
		this.thin_crust = thin_crust;
	}
	
	/**
	 * This line if code creates a constructor for a Pizza.
	 * This constructor will take the size of the pizza in inches, and the sauce of the pizza
	 * @param size_in_inches the size of the pizza in inches.
	 * @param sauce the sauce on the pizza.
	 */
	public Pizza(int size_in_inches, String sauce) {
		this.size_in_inches = size_in_inches;
		this.sauce = sauce;
	}
	
	/**
	 * This method is used to add extra cheese to a pizza.
	 * This is done by making the extra_cheese boolean variable true when called.
	 * 
	 */
	public void extraCheese() {
		this.extra_cheese = true;
	}
	
	/**
	 * This method is used to add green pepper to a pizza.
	 * This is done by making the green_pepper boolean variable true when called.
	 */
	public void addGreenPepper() {
		this.green_pepper = true;
	}
	
	/**
	 * This method is used to add green pepper to a pizza.
	 * This is done by making the green_pepper boolean variable true when called.
	 */
	public void addHam() {
		this.ham = true;
	}
	
	/**
	 * This method is used to add mushrooms to a pizza.
	 * This is done by making the mushrooms boolean variable true when called.
	 */
	public void addMushrooms() {
		this.mushrooms = true;
	}
	
	/**
	 * This method is used to add olives to a pizza.
	 * This is done by making the olives boolean variable true when called.
	 */
	public void addOlives() {
		this.olives = true;
	}
	
	/**
	 * This method is used to add onion to a pizza.
	 * This is done by making the onion boolean variable true when called.
	 */
	public void addOnion() {
		this.onion = true;
	}
	
	/**
	 * This method is used to add pepperoni to a pizza.
	 * This is done by making the pepperoni boolean variable true when called.
	 */
	public void addPepperoni() {
		this.pepperoni = true;
	}
	
	/**
	 * This method is used to add tomatoes to a pizza.
	 * This is done by making the tomatoes boolean variable true when called.
	 */
	public void addTomatoes() {
		this.tomatoes = true;
	}
	
	/**
	 * This method will be used to retrieve the size of the pizza in inches.
	 * @return size_in_inches 
	 */
	public int getSize() {
		return size_in_inches;
	}
	
	/**
	 * This method will be used to calculate the total delivery costs of the pizza.
	 * This is done by overriding the getDeliveryCost method from Deliverable interface.
	 * 
	 * 12 inch pizza: 3.50
	 * 14 inch pizza: 4.75
	 * 
	 * @return cost the cost of the pizza.
	 */
	@Override
	public double getDeliveryCost() {
		/**
		 * Create a double variable called cost to hold the cost of the pizza.
		 */
		double cost = 0.00;
		
		if (size_in_inches == 12) {
			cost = 3.50;
		}else if(size_in_inches == 14){
			cost = 4.75;
		}
		
		return cost;
	}
	
	/**
	 * This method is created to override the toString method.
	 * 
	 * This is done so that information about the Pizza can be printed to the console,
	 * instead of just the memory location.
	 * 
	 * The toString method s overridden by providing correct formatting, 
	 * then displaying the pizza name, getSize and getDeliveryCost methods.
	 */
	@Override
	public String toString() {
		String name = "Pizza";
		return String.format("%-25s%6d%8.2f",
				name, getSize(), getDeliveryCost());
	}
}
