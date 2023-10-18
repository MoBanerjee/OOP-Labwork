package Lab4;

public class SalePerson implements Comparable{
	private String firstName;
	private String lastName;
	private int totalSales;
	SalePerson(String fn,String ln, int sales){
		firstName=fn;
		lastName=ln;
		totalSales=sales;
		
	}
	public String toString() {
		return lastName+" ,"+firstName+" : "+totalSales;
	}
	public boolean equals(Object o) {
		if(o instanceof SalePerson) {
		SalePerson s=(SalePerson)o;
		if(firstName.equals(s.getFirstName()) && lastName.equals(s.getLastName()))return true;}
		return false;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof SalePerson) {
			SalePerson s=(SalePerson)o;
			if(s.getTotalSales()>totalSales)return -1;
			else if (s.getTotalSales()<totalSales)return 1;
			else {
				return -1*(lastName.compareTo(s.getLastName()));
			}
		}
		return 0;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getTotalSales() {
		return totalSales;
	}

}
