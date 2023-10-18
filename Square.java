package Lab4;
import java.util.Scanner;
public class Square implements Shapes {
	private double side;
	public Square(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side: ");
		side=scan.nextDouble();
	}

	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	public double getside() {
		return side;
	}

}
