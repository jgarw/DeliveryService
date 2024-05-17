/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: CST8284 Section 320
 * Professor: Sandra Iroakazi
 */
package foodItemsPkg;

import servicesPkg.Deliverable;

/**
 * class to create some instances of Deliverable and process them polymorphically. 
 * Ensure that you clean up your code and add comments to show good coding practices.
 * 
 * @author Joseph Garwood
 */
public class DeliverableTest {
	
	/**
	 * This line creates a constant variable for thin crust to always being set to true.
	 */
	final static boolean ThinCrust=true;
	/**
	 * @param args command line arguments 
	 */
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(12, "pesto", ThinCrust);
		pizza1.addMushrooms();
		pizza1.addOnion();
		pizza1.addOlives();
		pizza1.addGreenPepper();
		
		Pizza pizza2 = new Pizza(14, "marinara");
		pizza2.addPepperoni();
		pizza2.addMushrooms();
		pizza2.addGreenPepper();
		pizza2.extraCheese();
		
		Deliverable[] deliverableItems = {
				pizza1,
				pizza2,
				new SudsOrder("Rollicking Root Beer", 6, 473),
				new SudsOrder("Super Citrus Fizz", 4, 473)
		}; 
		/**
		 * This line of code prints out the header above the item information table.
		 */
		System.out.println("Item:               Number/Size:   Cost:");
		
		/**
		 * This line of code uses a linear search to iterate throughout the deliverableItems array.
		 * This is done to print out information about the items stored in the array elements at the linear search index.
		 */
		for(int i = 0; i < deliverableItems.length; i++) {
			System.out.println(deliverableItems[i]);
		}
		
		
	}//main()

}//class
