package bai3;

public class SamSung extends DigitalCamera {
	private boolean autoFocus;
	private boolean panorama;
	public SamSung(String make, String model, float megapixels, float price, boolean autoFocus, boolean panorama) {
		super(make, model, megapixels, price);
		this.autoFocus = autoFocus;
		this.panorama = panorama;
	}
	@Override
	public void capture() {
		System.out.println("Chup anh");	
	}

	public void showDetails(){
		super.showDetails();
		System.out.println("Tu dong lay net:" +(this.autoFocus ? "co" : "khong"));
		System.out.println("CHup toan canh:" + (this.panorama ? "co" : "khong"));
	}
}
