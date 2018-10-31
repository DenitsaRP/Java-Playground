package strings;

public class CapitalizeEachWordInString {
	
	//Write a java program to capitalize each word in string?

	public static void main(String[] args) {

		System.out.println(capitalizeWord("this is an example"));

	}
	
	public static String capitalizeWord(String str) {
		String[] words = str.split(" ");
		String capitalizedWord = "";
		for(String word: words) {
			String firstLetter = word.substring(0, 1);
			String restOfTheWord = word.substring(1);
			capitalizedWord += firstLetter.toUpperCase() + restOfTheWord + " ";
		}
		
		return capitalizedWord.trim();
	}

}
