package Kasus1;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) {
		super();
		this.radius = r;
		this.height = h;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.sqrt(radius)*height;
	}
	
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height; 
	}
}
