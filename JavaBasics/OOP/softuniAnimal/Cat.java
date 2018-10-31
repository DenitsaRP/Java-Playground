package oop.softuniAnimal;

public abstract  class Cat extends Animal {

	public Cat(String name, int age, boolean isMale) throws Exception {
		super(name, age, isMale);
	}

	@Override
	protected String produceSound() {
		return "Purr purr";
		
	}
	
}
