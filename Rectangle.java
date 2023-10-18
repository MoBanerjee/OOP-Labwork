package Lab4;

import java.util.Scanner;

public class Rectangle implements Shapes {
	private double length;
	private double breadth;
	public Rectangle(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		length=scan.nextDouble();
		System.out.println("Enter breadth: ");
		breadth=scan.nextDouble();
	}

	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		return length*breadth;
	}
	public double getL() {
		return length;
	}
	public double getB() {
		return breadth;
	}
}
