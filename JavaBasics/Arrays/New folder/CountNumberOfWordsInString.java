package strings;
// Count number of words in String
public class CountNumberOfWordsInString {

	public static void main(String[] args) {
	
		String count = "Count number      of words in string";
		String[] countArray = count.split("\\s+");
		int counter = 0;
		for (String word : countArray) {
			if (word.trim().length() > 0) {
				counter++;
			}
		}
		System.out.println();
		System.out.println("Number of words in string: " + counter);
	}

}
