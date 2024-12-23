package com.nit.exam;

public class Reservation 
{
	String reservationType;
	int nights;
	public Reservation(String reservationType, int nights) {
		super();
		this.reservationType = reservationType;
		this.nights = nights;
	}
	
	public double calculateCost()
	{
		return 0.0;
	} 
	public String displayReservationDetails()
	{
		return "Reservation [reservationType=" + reservationType + ", nights=" + nights + "]";
	}
	
}
