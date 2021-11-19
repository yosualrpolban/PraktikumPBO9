package Kasus1;

public class Rectangle extends Shape {
	private double length, width;
	
	public Rectangle(double l, double w) {
		super();
		this.length= l;
		this.width = w;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
	public String toString() {
		return super.toString() + " of length " + length + " and width " + width;
	}
}
