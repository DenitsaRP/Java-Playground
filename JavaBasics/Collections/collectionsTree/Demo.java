package collectionsTree;

import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		TreeSet<Board> duskiPoShirina = new TreeSet<>();
		duskiPoShirina.add(new Board(80,20,1));
		duskiPoShirina.add(new Board(30,30,8));
		duskiPoShirina.add(new Board(40,30,2));
		
		System.out.println(duskiPoShirina);
		
		TreeSet<Board> duskiPoDebelina = new TreeSet<>(new DuskiCmparatorPoDebelina());
		duskiPoDebelina.add(new Board(40,30,20));
		duskiPoDebelina.add(new Board(80,20,1));
		duskiPoDebelina.add(new Board(30,40,8));
		
		System.out.println(duskiPoDebelina);
		
		TreeSet<Board> duskiPoDuljina = new TreeSet<>(new DuskiComparatorPodDuljina());
		duskiPoDuljina.add(new Board(40,30,20));
		duskiPoDuljina.add(new Board(80,20,1));
		duskiPoDuljina.add(new Board(30,40,8));
		System.out.println(duskiPoDuljina);
		
	}

}
