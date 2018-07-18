package stringsMethods;

public class UcKr2 {

	public static void main(String[] args) {


		String orginalText = "C# is great language for programing, and you can easaly type code on C#";
		String corectText = orginalText.replace("C#", "Java");
		//System.out.println("The new text is: " + corectText);
		//System.out.println("The original text was: " + orginalText);
		
		String text = "Text example.";
		boolean check = text.contains("Text");
		boolean check2 = text.contains("text");
		System.out.println(check);
		System.out.println(check2);
		
	}

}
