package com.consulting.qa.QA_Cinemas;

import java.util.ArrayList;

public class Booking {
	
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public Booking(ArrayList<Customer> c) {
		customerList = c;
	}
	
	public int getPrice() {
		int price = 0;
		for(int i = 0; i < customerList.size(); i++) {
			if(customerList.get(i).getType().equalsIgnoreCase("Standard")) {
				price += TicketType.STANDARD.getTicketType();
			}
			
			if(customerList.get(i).getType().equalsIgnoreCase("OAP")) {
				price += TicketType.OAP.getTicketType();
			}
			
			if(customerList.get(i).getType().equalsIgnoreCase("Student")) {
				price += TicketType.STUDENT.getTicketType();
			}
			
			if(customerList.get(i).getType().equalsIgnoreCase("Child")) {
				price += TicketType.CHILD.getTicketType();
			}
		}
		
		return price;
	}

}
