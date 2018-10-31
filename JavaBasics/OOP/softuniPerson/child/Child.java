package oop.softuniPerson.child;

public class Child extends Person {

	public Child(String name, int age) throws Exception {
		super(name, age);
	}

	@Override
	protected void setAge(int age) throws Exception {
		if(age > 15) {
			throw new Exception("Child's age must be lesser than 15!");
		} else {
		super.setAge(age);
		}
	}
	
	

}
