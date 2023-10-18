package Lab4;

import java.util.Scanner;

public class Cone implements Shapes {
private double height;
private Circle basecircle;
public Cone(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter height: ");
	height=scan.nextDouble();
	basecircle=new Circle();
}
@Override
public double CalcArea() {
	// TODO Auto-generated method stub
	double r=basecircle.getR();
	double slant=Math.pow(height, 2)+Math.pow(r, 2);
	return basecircle.CalcArea()+Math.PI*r*(Math.pow(slant, 0.5));
}

}
