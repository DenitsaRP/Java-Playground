package stringsMethods;

public class UcKr3 {

	public static void main(String[] args) {
		
	/*	StringBuilder builder = new StringBuilder ("text in StringBuilder");
		builder.insert(0, "Look -  ");
		builder.insert(builder.length(), "!");
		System.out.println(builder);
*/
		
	/*	StringBuilder build = new StringBuilder("What will you delete here?");
		build.delete(0, 5);
		System.out.println(build);
		
		*/
		
		StringBuilder buildreplace = new StringBuilder( "Example in StringBuilder!");
		buildreplace.replace(0, 7, "Replace");
		System.out.println(buildreplace);
	}

}
