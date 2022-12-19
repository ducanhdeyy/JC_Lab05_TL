package bai5;

public class Circle extends Shape {
	private double radius;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	public double getPerimeter() {
		return this.radius * 2*Math.PI;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
