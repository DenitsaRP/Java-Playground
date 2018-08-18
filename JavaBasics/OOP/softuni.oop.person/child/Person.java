package softuni.oop.person.child;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) throws Exception {
		this.setName(name);
		this.setAge(age);
	}
	
	protected String getName() {
		return name;
	}
	
	protected void setName(String name) throws Exception {
		if(name.length() < 3) {
			throw new Exception("Name's length should not be less than 3 symbols!");
		} else {
		this.name = name;
		}
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) throws Exception {
		if( age < 0) {
			throw new Exception("Age must be positive!");
		}
		this.age = age;
	}

	@Override
	public String toString() {
		
		return String.format("Name: %s, Age %d", this.getName(), this.getAge());
		
	}
	
	
	

}
