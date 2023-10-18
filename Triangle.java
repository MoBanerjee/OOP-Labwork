package Lab4;

import java.util.Scanner;

public class Triangle implements Shapes {
	private double base;
	private double height;
	public Triangle(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base of triangle: ");
		base=scan.nextDouble();
		System.out.println("Enter height of triangle: ");
		height=scan.nextDouble();
	}
	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}
	public double getH() {
		return height;
	}
	public double getB() {
		return base;
	}
}
