package oopZoo;

public class Dog {
	
	double weight;
	boolean spots;
	boolean isDangerouse;
	
	
	
	public Dog(double weight, boolean spots, boolean isDangerouse) {
		this.weight = weight;
		this.spots = spots;
		this.isDangerouse = isDangerouse;
	}



	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", spots=" + spots + ", isDangerouse=" + isDangerouse + "]";
	}
	

}
