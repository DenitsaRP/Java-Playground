package strings;

public class RemoveAllWhiteSpacesFromString {

//How do you remove all white spaces from a string in java?
	
	public static void main(String[] args) {
		
		System.out.println(removeWhiteSpaces("This   Is Another    Example. "));
		
	}
	
	public static String removeWhiteSpaces(String str) {
		String[] words = str.split(" ");
		String trimWors = "";
		for(String w: words) {
			w.trim();
			trimWors+=w;
		}
		
		return trimWors;
	}

}
