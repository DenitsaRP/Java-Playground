package strings;

import java.util.Arrays;

public class StringAnagrams {
	//Write a java program to check whether two given strings are anagram of each other or not

	public static void main(String[] args) {
		
		isAnagram("Keep", "peek"); 
			
	}
	
	static void isAnagram(String str1, String str2) {
		boolean anagram = true;
		if(str1.length() != str2.length()) {
			anagram = false;
		} else {
			char[] arrayS1 = str1.toLowerCase().toCharArray();
			char[] arrayS2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			anagram = Arrays.equals(arrayS1, arrayS2);
		}
		
		if(anagram) {
			System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  

	}

}
