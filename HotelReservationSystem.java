package com.nit.exam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HotelReservationSystem {

	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("   WELCOME TO HotelReservationSystem.");
		
		
		System.err.println("   ===================================");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("  What Type Of Reservation You Want ? ");
		System.out.println("  1. For Standard");
		System.out.println("  2. For Deluxe");
		System.out.println("  3. For Tentative");
		System.out.println("  4. For Waitlisted");
		System.out.print("  Make Your Choise : ");
		int ch = sc.nextInt();
		if(ch!=1 && ch!=2 && ch!=3 && ch!=4 )
		{
			System.err.println("  Invalid...! 'Please Choose Valid Option.....'");
		}
		else
		{
		
		switch(ch)
		{
		case 1: System.err.println("  Your Choosed Standard Reservation........");
		break;
		case 2: System.err.println("  Your Choosed Deluxe Reservation........");
		break;
		case 3: System.err.println("  Your Choosed Tentative Reservation........");
		break;
		case 4: System.err.println("  Your Choosed Waitlisted Reservations........");
		break;
		default:System.err.println("  Enter The Valid Choise..........");
		}
		System.out.println();
		System.out.print("  Enter The Rental Days : ");
	     LocalDateTime now = LocalDateTime.now();
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	     String formattedDateTime = now.format(formatter);
		int days=sc.nextInt();
		if(ch==1)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.print("  Enter Customer Name : ");
			String n=s1.nextLine();
			System.out.print("  Enter Customer PhoneNumber : ");  
			long p=s1.nextLong();
			StandardReservation s = new StandardReservation("ch", days);
			Customer c1 = new Customer("ch", days,n,p,s );
			c1.displayCustomerDetails();
			System.out.println("  Your Total Bill Is :" +s.calculateCost()); 
			System.out.println("  Date and Time :"+formattedDateTime);
			
		}
		if(ch==2)
		{
			Scanner s2 = new Scanner(System.in);
			System.out.print("  Enter Customer Name : ");
			String n=s2.nextLine();
			System.out.print("  Enter Customer PhoneNumber : ");
			long p=s2.nextLong();
			
		    DeluxeReservation d = new DeluxeReservation("ch", days);
		    Customer c2 = new Customer("ch", days,n,p,d);
		    c2.displayCustomerDetails();
		    d.calculateCost();
		    System.out.println("  Date and Time :"+formattedDateTime);
		}
		if(ch==3)
		{
			Scanner s3 = new Scanner(System.in);
			System.out.print("  Enter Customer Name : ");
			String n=s3.nextLine();
			System.out.print("  Enter Customer PhoneNumber : ");  
			long p=s3.nextLong();
			TentativeReservation t = new TentativeReservation("ch", days);
			Customer c1 = new Customer("ch", days,n,p,t );
			c1.displayCustomerDetails();
			System.out.println("  Your Total Bill Is :" +t.calculateCost()); 
			System.out.println("  Date and Time :"+formattedDateTime);
		}
		if(ch==4)
		{
			Scanner s4 = new Scanner(System.in);
			System.out.print("  Enter Customer Name : ");
			String n=s4.nextLine();
			System.out.print("  Enter Customer PhoneNumber : ");  
			long p=s4.nextLong();
			WaitlistedReservations w = new WaitlistedReservations("ch", days);
			Customer c1 = new Customer("ch", days,n,p,w );
			c1.displayCustomerDetails();
			System.out.println("  Your Total Bill Is :" +w.calculateCost()); 
			System.out.println("  Date and Time :"+formattedDateTime);
		}
	}
}
}

