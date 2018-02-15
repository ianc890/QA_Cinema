package com.consulting.qa.QA_Cinemas;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class BookingTest {
	
	@Test
	public void getPriceTest() {
		ArrayList<Customer> cList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setType("Standard");
		cList.add(customer);
		
		Booking booking = new Booking(cList);
		int price = booking.getPrice();
		Assert.assertEquals("Booking not created", 8, price);
	}
	
	@Test
	public void getPriceFailTest() {
		ArrayList<Customer> cList = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setType("Standard");
		cList.add(customer);
		
		Booking booking = new Booking(cList);
		int price = booking.getPrice();
		Assert.assertNotEquals("Booking created", 6, price);
	}

}
