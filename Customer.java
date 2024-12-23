package com.nit.exam;

public class Customer extends Reservation
{
	String name;
	long contactNumber;
	Reservation reservation;  
    public Customer(String reservationType, int nights, String name, long contactNumber, Reservation reservation) {
	super(reservationType, nights);
	this.name = name;
	this.contactNumber = contactNumber;
	this.reservation = reservation;
}
public void displayCustomerDetails()
{
	System.err.println("  =====================================");
	System.out.println("  The Customer Name is :"+name);
	System.out.println("  The Customer contactNumber is :"+contactNumber);
	if(reservation instanceof StandardReservation)
	{
    System.out.println("  The Customer reservationType is :"+reservation.getClass().getSimpleName());
	}
	if(reservation instanceof DeluxeReservation)
	{
    System.out.println("  The Customer reservationType is :"+reservation.getClass().getSimpleName());
	}
	
}
}
