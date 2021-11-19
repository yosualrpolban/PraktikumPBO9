package Kasus1;

public class Paint{
	private double coverage;
	
	public Paint(double c) {
		coverage = c;
	}
	
	public double amount (Shape s) {
		System.out.println("computing amount for " + s);
		return s.area() / coverage;
	}
	
}
