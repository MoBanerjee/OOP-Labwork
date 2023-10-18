package Lab4;

import java.util.Scanner;

public class Shape3DApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total number of shapes: ");
		int count =scan.nextInt();
		Shapes shapelist[]=new Shapes[count];
		double total=0;
		scan.nextLine();
		for(int i=0;i<count;i++) {
			System.out.println("Enter name of shape (Cone/Cylinder/Square Pyramid/Sphere/Cuboid) "+(i+1)+" : ");
			String shape=scan.nextLine();
			switch(shape) {
			case "Cone":
				shapelist[i]=new Cone();
				break;
			case "Cuboid":
				shapelist[i]=new Cuboid();
				break;
			case "Sphere":
				shapelist[i]=new Sphere();
				break;
			case "Square Pyramid":
				shapelist[i]=new SquareBasedPyramid();
				break;
			case "Cylinder":
				shapelist[i]=new Cylinder();
				break;
			default:
				
				
				System.out.println("Shape name is wrong! Please retry! ");
				
			}
			if(shapelist[i]==null) {i--; continue;}}
		
			double ansperfig=-1;
			
			
			do {
			System.out.println("Choose the type of calculation: ");
		
			String calc=scan.nextLine();
			if(calc.equalsIgnoreCase("Area")) {
				for(int j=0;j<count;j++) {
				ansperfig=shapelist[j].CalcArea();
				total+=ansperfig;
				}}
			else if(calc.equalsIgnoreCase("Volume")) {ansperfig=0;}
			else {
				
				System.out.println("Please choose either Area/Volume!");
				
			}}while(ansperfig==-1);
			
				
		
		System.out.printf("The total surface area of the 3D figure is %.2f square units. ",total);
	}

}
