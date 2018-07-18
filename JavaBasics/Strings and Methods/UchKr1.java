package stringsMethods;

public class UchKr1 {

	public static void main(String[] args) {
		String text = "Pesho, Gosho, Spiro, Stefka, Iva";
		
		String[] names = text.split(", ");
		for (String name: names ) {
			System.out.println(name);
		}

	}

}
