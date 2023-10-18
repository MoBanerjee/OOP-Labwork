package Lab4;

import java.util.Scanner;

public class SquareBasedPyramid implements Shapes {
private double height;
private Square base;
public SquareBasedPyramid() {
	base=new Square();
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter height: ");
	height=scan.nextDouble();

}
@Override
public double CalcArea() {
	// TODO Auto-generated method stub
	double slant=Math.pow(height, 2)+Math.pow(0.5*base.getside(), 2);
	return base.CalcArea()+2*base.getside()*Math.pow(slant, 0.5);
}


}
