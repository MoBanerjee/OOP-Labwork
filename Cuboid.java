package Lab4;

import java.util.Scanner;

public class Cuboid implements Shapes {
	private double height;
	private Rectangle base;
	public Cuboid(){
		Scanner scan = new Scanner(System.in);
		base=new Rectangle();
		System.out.println("Enter height: ");
		height=scan.nextDouble();
	}
	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		return height*base.CalcArea();
	}
}
