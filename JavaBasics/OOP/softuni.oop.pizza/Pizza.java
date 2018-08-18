package softuni.oop.pizza;

public class Pizza {
	
	private String name;
	private Dough dough;
	private Toppings[] topings;
	
	
	public Pizza(String name, int NumTopings) {
		this.name = name;
		this.topings = new Toppings[NumTopings];
	}


	public void setDough(Dough dough) {
		this.dough = dough;
	}
	
	public void addToppingsToPizza(Toppings[] toppings) {
		if(toppings.length == this.topings.length) {
			this.topings = toppings;
		}
	}
	
	private double calculateToppingsCalories() {
		double calculateToppings = 0.0;
		for (int i = 0; i < topings.length; i++) {
			calculateToppings += topings[i].calculaateCalories();
		}
		
		return calculateToppings;
	}
	
	public void printPizzaCalories() {
		double totalCalories = this.dough.calculaateCalories() + calculateToppingsCalories();
		System.out.println(this.name + " - " + totalCalories );
	}
	

}
