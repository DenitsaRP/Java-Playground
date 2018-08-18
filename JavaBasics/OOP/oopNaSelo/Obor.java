package oopNaSelo;

public class Obor {
	
	private Animal[] jivotni;
	private int addedAnimals = 0;
	
	Obor(){
		jivotni = new Animal[5];
	}
	
	public void addAnimal(Animal a) {
		if(addedAnimals < jivotni.length) {
			jivotni[addedAnimals++] = a;	//const slojnost
			
		}
	}
	
	public void printAnials() {
		for (int i = 0; i < jivotni.length; i++) { //for (int i = 0; i < jivotni.length - addedAimals; i++)
			if(jivotni[i] != null) {				//without if()
				System.out.println(jivotni[i]); 
			}
		}
	}
	
	public void disturbAnimal() {
		for (int i = 0; i < jivotni.length; i++) { 
			if(jivotni[i] != null) {				
			jivotni[i].makeNoice(); 
			}
		}
	}
}
