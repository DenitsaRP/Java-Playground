package oop.oopMankind;

public class MankindDemo {

	public static void main(String[] args) throws Exception {
		
		Student student = new Student("Sasho", "Ivanov", 123456);
		System.out.println(student);
		
		Worker simo = new Worker("Simeon", "Ivanov", 1569, 8);
		System.out.println(simo);
	}

}
