package bai5;

public class Square extends Rectangle {
	private double side;
	public Square() {
		
	}
	public Square(double side) {
		this.side = side;
	}
	public Square(String color, boolean filled, double side) {
		super(color,filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth() {
		setWidth(this.side);
	}
	public void setLength() {
		setLength(this.side);
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
