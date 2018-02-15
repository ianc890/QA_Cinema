package com.consulting.qa.QA_Cinemas;

import org.junit.Test;

import junit.framework.Assert;

public class TicketTypeTest {

	@Test
	public void getTicketTypeTest() {
		int typePrice = TicketType.STUDENT.getTicketType();
		Assert.assertEquals("Wrong price for ticket type", 6, typePrice);
	}
	
	@Test
	public void getTicketTypeFailTest() {
		int typePrice = TicketType.STUDENT.getTicketType();
		Assert.assertNotSame("Correct price match with type", 2, typePrice);
	}
}
