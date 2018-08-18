package softuni.oop.box;

import java.util.Scanner;

public class DemoBox {

	public static void main(String[] args) {
		 
		System.out.println("Enter positive number for length of the box: ");
		Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();
		while(length < 0) {
			System.out.println("Please enter positive number for length");
			length = sc.nextDouble();
		}
		
		System.out.println("Enter positive number for width of the box: ");
		double width = sc.nextDouble();
		while(width < 0) {
			System.out.println("Please enter positive number for width");
			width = sc.nextDouble();
		}
		
		System.out.println("Enter positive number for height of the box: ");
		double height = sc.nextDouble();
		while(height < 0) {
			System.out.println("Please enter positive number for height");
			height = sc.nextDouble();
		}
		
		
		Box box = new Box(length, width, height);
		System.out.println("Surfice area - " + box.surfaceArea());
		System.out.println("Lateral Surface Area " + box.lateralSurfaceArea());
		System.out.println("Volume - " + box.volume());
		
		System.out.println();
		
		Box box2 = new Box();
		box2.setLength(length);
		box2.setHeight(height);
		box2.setWidth(width);
		System.out.println("Surfice area - " + box2.surfaceArea());
		System.out.println("Lateral Surface Area " + box2.lateralSurfaceArea());
		System.out.println("Volume - " + box2.volume());
		
		Box box1 = new Box(1.3, 1, 6);
		System.out.println("Surfice area - " + box1.surfaceArea());
		System.out.println("Lateral Surface Area " + box1.lateralSurfaceArea());
		System.out.println("Volume - " + box1.volume());
	}

}
