package Kasus1;

public class Sphere extends Shape{
	private double radius;
	
	public Sphere(double r) {
		super();
		radius = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 4*Math.PI*radius*radius;
	}
	
	public String toString() {
		return super.toString() + " of radius " + radius;
	}
}
