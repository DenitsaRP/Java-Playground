package oopFood;

public class CandyShop {

	public static void main(String[] args) {

		Person fifyCent = new Person("Curtis", 102, 0);
		
		//fifyCent.eat(new Toblerone()); 
		//fifyCent.eat(new Lollipop()); 
				
		Food zeli = new Cabbage(357);
		Food blizalka = new Lollipop();
		Toblerone heartAttackInPackage = new Toblerone();
		
		System.out.println(fifyCent);
		fifyCent.eat(zeli);
		System.out.println(fifyCent);
		
		fifyCent.eat(blizalka);
		System.out.println(fifyCent);
		
		fifyCent.eat(heartAttackInPackage);
		System.out.println(fifyCent);
		
		System.out.println();
				
		System.out.println(fifyCent);
		Food x = new Cabbage(357);
		fifyCent.eat(x);
		System.out.println(fifyCent);
		x = new Lollipop();
		fifyCent.eat(x);
		System.out.println(fifyCent);
		x = new Toblerone();
		fifyCent.eat(x);
		System.out.println(fifyCent);
		

	}

}
