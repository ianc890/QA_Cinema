package com.consulting.qa.QA_Cinemas;

public enum TicketType {
	
	STANDARD,
	OAP,
	STUDENT,
	CHILD;
	
	public int getTicketType() {
		switch(this) {
			case STANDARD:
				return 8;
			case OAP:
				return 6;
			case STUDENT:
				return 6;
			case CHILD:
				return 4;
			default:
				throw new AssertionError("Unknown ticket type. Please try again.");
		}		
	}

}
