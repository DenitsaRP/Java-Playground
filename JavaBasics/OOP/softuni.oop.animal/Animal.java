package softuni.oop.animal;

public abstract class Animal {
	
	private String name;
	private int age;
	private boolean isMale;
	
	
	public Animal(String name, int age, boolean isMale) throws Exception {
		this.setName(name);
		this.setAge(age);
		this.isMale = isMale;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) throws Exception {
		if(name.length() < 3) {
			throw new Exception("Expected length more than 3 symbols!Argument: name!");
		} else {
			this.name = name;
		}
		
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) throws Exception {
		if(age < 0) {
			throw new Exception("Age must be positive number!");
		} else {
			this.age = age;
		}
		
	}
	protected boolean isMale() {
		return isMale;
	}
	protected void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	protected abstract String produceSound();


}
