package softuni.oop.pizza;

public class PizzaDemo {

	public static void main(String[] args) throws Exception {
		
		Pizza piz = new Pizza("Proba", 2);
		
		Dough dough = new Dough("Wholegrain", "Crispy", 100);
		piz.setDough(dough);
		
		Toppings veg = new Toppings("Veggies", 50);
		Toppings cheese = new Toppings( "Cheese", 50);
			
		
		piz.addToppingsToPizza(new Toppings[]{veg, cheese});
		piz.printPizzaCalories();
	}

}
