package oop.oopComputersConstructors;

public class DemoComputers {

	public static void main(String[] args) {
		
		
		Computer lenovo = new Computer(2017, 2115.4, true, 1024, 560.7, "Windows 10");
		Computer acer = new Computer(2018, 1899, 1024, 128.7);
		System.out.println(lenovo.copmparePrice(acer));
		
		Computer asus = new Computer();
		System.out.println(asus.copmparePrice(acer));

	}

}
