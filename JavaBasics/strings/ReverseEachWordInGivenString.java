package strings;
// reverse each word in given string:
public class ReverseEachWordInGivenString {

	public static void main(String[] args) {
		
		String input = "reverse each word in given string";
		String[] inputArray = input.split("\\s+");
		for (String inputWord : inputArray) {
			for (int i = inputWord.length() - 1; i >= 0; i--) {
				System.out.print(inputWord.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
