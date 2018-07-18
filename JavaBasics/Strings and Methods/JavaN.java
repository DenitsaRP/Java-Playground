package stringsMethods;

public class JavaN {

	public static void main(String[] args) {

		String listOfBeers = "Steela, Zagorka, Pirinsko, Shumensko.";
		String[] beersArray = listOfBeers.split("[ ,.]+");
		for (String beer: beersArray) {
			System.out.println(beer);
		}
		
	}

}
