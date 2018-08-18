package softuni.oop.chicken;

public class DemoChicken{

	public static void main(String[] args) throws Exception {
		
		Chicken mara = new Chicken();
		mara.setName("Mara");
		mara.setAge(10);
		mara.productPerDay();
		
		Chicken mara2 = new Chicken();
		mara.setAge(17);
		mara2.productPerDay();
		
		
		
	}

}
