package bai3;

public abstract class DigitalCamera {
	private String make;
	private String model;
	private float megapixels;
	private float price;
	
	public DigitalCamera(String make, String model, float megapixels, float price) {
		super();
		this.make = make;
		this.model = model;
		this.megapixels = megapixels;
		this.price = price;
	}
	
	public void showDetails() {
		System.out.println("Chuc nang cua may anh la:" + this.make);
		System.out.println("Mau ma cua may anh la:" + this.model);
		System.out.println("Do phan giai cua may anh la:" + this.megapixels);
		System.out.println("Gia cua may anh la:" + this.price);
	}
	public abstract void capture();
	
}
