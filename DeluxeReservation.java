package com.nit.exam;

public class DeluxeReservation extends Reservation
{

	public DeluxeReservation(String reservationType, int nights) {
		super(reservationType, nights);
	
	}
	@Override
	public double calculateCost()
	{
		double cost= nights*3000;
		return cost;
	}
 
}
class TentativeReservation  extends Reservation
{

	public TentativeReservation(String reservationType, int nights)
	{
		super(reservationType, nights);
	}

	@Override
	public double calculateCost()
	{
		double cost= nights*4000;
		return cost;
	}
	
}
class WaitlistedReservations extends Reservation
{

	public WaitlistedReservations(String reservationType, int nights)
	{
		super(reservationType, nights);
	}

	@Override
	public double calculateCost()
	{
		double cost= nights*5000;
		return cost;
	}
	
}

