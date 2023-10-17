package Lab3;

import java.util.*;

public class Plane {
private PlaneSeat[] seat=new PlaneSeat[12];
private int numEmptySeat;
Plane() {
	numEmptySeat=12;
	for(int u=0;u<12;u++) {
		seat[u]=new PlaneSeat(u+1);
	}
	
	
}
private PlaneSeat[] sortSeats() {

	HashMap<Integer,Integer> customer1=new HashMap<>();
	ArrayList<Integer>custid=new ArrayList<>();
	for(PlaneSeat seats:seat) {
		if(!seats.isOccupied())continue;
		customer1.put(seats.getCustomerID(),seats.getSeatID());
		custid.add(seats.getCustomerID());
	}
	Collections.sort(custid);
	PlaneSeat[] sortedcopy=new PlaneSeat[custid.size()];
	for(int i=0;i<custid.size();i++) {
		PlaneSeat temp=new PlaneSeat(customer1.get(custid.get(i)));
		temp.assign(custid.get(i));
		sortedcopy[i]=temp;
	}
	return sortedcopy;
	
}
public void showNumEmptySeats() {
	System.out.println("There are "+numEmptySeat+" empty seats.");
}
public void showEmptySeats() {
	for(PlaneSeat seats:seat) {
		if(seats.isOccupied())continue;
		System.out.println("SeatID "+seats.getSeatID());
	}
}
public void showAssignedSeats(boolean bySeatId) {
	if(numEmptySeat==12) {System.out.println("There are no seats assigned yet. All seats are empty.");
	return;
	}
	if(bySeatId) {
	for(PlaneSeat seats:seat) {
		if(!seats.isOccupied())continue;
		System.out.println("SeatID "+seats.getSeatID()+" assigned to CustomerID "+seats.getCustomerID());
		
	}}
	else {
		PlaneSeat[] planeseatcopysorted=sortSeats();
		for(PlaneSeat seats:planeseatcopysorted) {
			
			System.out.println("SeatID "+seats.getSeatID()+" assigned to CustomerID "+seats.getCustomerID());
			
		}
		
		
		
	}
}
public void assignSeat(int seatId,int cust_id) {
	if(seat[seatId-1].isOccupied()) {
		System.out.println("Seat already assigned to a customer.");
		return;
	}
	seat[seatId-1].assign(cust_id);
	numEmptySeat--;
	System.out.println("Seat Assigned!");
}

public void unAssignSeat(int seatId) {
	if(!seat[seatId-1].isOccupied()) {
		System.out.println("Seat already empty.");
		return;
	}
	seat[seatId-1].unAssign();
	numEmptySeat++;
	System.out.println("Seat Unassigned!");
	
}

// just do a check runthrough and see the doubt sent to mom
		
}
