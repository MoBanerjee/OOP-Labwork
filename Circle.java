package Lab4;

import java.util.Scanner;
public class Circle implements Shapes {
	private double radius;
	public Circle(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius=scan.nextDouble();
	}
	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	double getR() {
		return radius;
	}

}
