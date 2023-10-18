package Lab4;

public class Sphere implements Shapes{
private Circle c;
public Sphere() {
	c=new Circle();
	
}
	@Override
	public double CalcArea() {
		// TODO Auto-generated method stub
		return 4*c.CalcArea();
	}

}
