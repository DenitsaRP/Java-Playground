package oopFood;

public class Person {
	
	private String name;
	private double weight;
	private double energy;
	
	
	public Person(String name, double weight, double energy) {
		super();
		this.name = name;
		this.weight = weight;
		this.energy = energy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	void eat(Food food) {
		this.energy += food.giveEnergy();
		this.weight += food.getQuantity()/1000;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", energy=" + energy + "]";
	}
	
	

}
