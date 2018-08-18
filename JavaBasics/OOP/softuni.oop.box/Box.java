package softuni.oop.box;

public class Box {

	private double length;
	private double width;
	private double height;

	public Box() {
		
	}
	
	public Box(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		if (length < 0) {
			System.out.println("Please enter positive number for length");
		}
		this.length = length;
	}

	public double getWidth() {
		
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			System.out.println("Please enter positive number for width");
		}
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("Please enter positive number for height");
		}
		this.height = height;
	}
	
	public double surfaceArea() {
		return 2*this.getLength()*this.getWidth() + 2*this.getLength()*this.getHeight() + 2*this.getWidth()*this.getHeight();
		
	}
	
	public double lateralSurfaceArea() {
		return  2*this.getLength()*this.getHeight() + 2*this.getWidth()*this.getHeight();
		
	}
	
	public double volume() {
		return this.getLength()*this.getWidth()*this.getHeight();
	}
	

}
