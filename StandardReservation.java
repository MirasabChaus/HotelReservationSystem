package com.nit.exam;

public class StandardReservation extends Reservation
{

	public Reservation reservation;
	public StandardReservation(String reservationType, int nights) {
		super(reservationType, nights);
	
	}
	@Override
	public double calculateCost()
	{
		double cost= nights*2000;
		return cost;
	}

}
