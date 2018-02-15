package com.consulting.qa.QA_Cinemas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String day = null;
    	boolean validated = true;
    	ArrayList<Customer> customerList = new ArrayList<Customer>();
    	String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    	String genres[] = {"Horror", "Action", "Comedy", "Family"};
    	String ticketTypes[] = {"Standard", "OAP", "Student", "Child"};
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter today's day");
    	String enteredDay = scanner.next();
    	
    	System.out.println("Please select a movie genre: "+genres[0].toString()+", "+genres[1].toString()+", "+genres[2].toString()+", "+genres[3].toString());
    	String genre = scanner.next();
    	
    	System.out.println("How many tickets would like?");
    	int numOfTickets = scanner.nextInt();
    		
    	for(int i = 0; i < days.length; i++) {
    		if(enteredDay.equalsIgnoreCase(days[i])) {
    			day = days[i];
    		}
    	}
    	
    	for(int j = 0; j < numOfTickets; j++) {
    		System.out.println("Enter ticket type: "+ticketTypes[0].toString()+", "+ticketTypes[1].toString()+", "+ticketTypes[2].toString()+", "+ticketTypes[3].toString());
    		String type = scanner.next();
    		
    		Customer customer = new Customer();
        	customer.setType(type);
        	customerList.add(customer);
        	
        	if(!genre.equalsIgnoreCase(genres[3].toString()) && customerList.get(j).getType().equalsIgnoreCase(ticketTypes[3].toString())) {
        		System.out.println("Sorry, inappropriate film chose for ticket type child. Please try again");
        		validated = false;
        	} 
    	}
    	   	
    	if(validated == true) {
    	    	
    		Booking bookingOne = new Booking(customerList);
    		int totalPrice = bookingOne.getPrice();
    	
    		if(day.equals(days[3])) {
    			totalPrice -= (2 * numOfTickets);
    		}
    	
    		System.out.println("The total price of the ticket(s) for this movie is £"+totalPrice);
    	}
    }
}
