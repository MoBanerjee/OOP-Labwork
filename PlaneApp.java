package Lab3;

import java.util.Scanner;

public class PlaneApp {
	private static Plane boeing=new Plane();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Menu: ");
			System.out.println("(1) Show the number of empty seats");
			System.out.println("(2) Show the list of empty seats");
			System.out.println("(3) Show the list of customers together with their seat numbers in the order of the seat numbers");
			System.out.println("(4) Show the list of customers together with their seat numbers in the order of the customer ID");
			System.out.println("(5) Assign a customer to a seat");
			System.out.println("(6) Remove a seat assignment");
			System.out.println("(7) Exit");
			System.out.print("Enter the number of your choice: ");
		choice = sc.nextInt();
		switch (choice) {
		 case 1: boeing.showNumEmptySeats();
		 break;
		 case 2: System.out.println("The following seats are empty:");
		 boeing.showEmptySeats();
		 break;
		 case 3: System.out.println("The seat assignments are as follow:");
		 boeing.showAssignedSeats(true);
		 break;
		 case 4: System.out.println("The seat assignments are as follow:");
		 boeing.showAssignedSeats(false);
		 break;
		 case 5: Scanner sc2=new Scanner(System.in);
		 int seatid,customerid;
		 System.out.println("Assigning Seat .. ");
		 System.out.print("Please enter SeatID: ");
		 seatid=sc2.nextInt();
		 System.out.print("Please enter CustomerID: ");
		 customerid=sc2.nextInt();
		 boeing.assignSeat(seatid, customerid);
		 break;
		 case 6: Scanner sc3=new Scanner(System.in);
		 int seatidtbr;
		 System.out.print("Please enter SeatID: ");
		 seatidtbr=sc3.nextInt();
		 boeing.unAssignSeat(seatidtbr);;
		 break; 
		 case 7: System.out.println("Program terminating ….");
		}
		} while (choice !=7);
		 }
		
	}


