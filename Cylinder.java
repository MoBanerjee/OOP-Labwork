package Lab4;

import java.util.Scanner;

public class Cylinder implements Shapes {
	private double height;
	private Circle basecircle;
	public Cylinder(){
		basecircle=new Circle();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height: ");
		height=scan.nextDouble();
	
	}
	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		double r=basecircle.getR();
		return 2*Math.PI*r*height+2*basecircle.CalcArea();
	}

}
