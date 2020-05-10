
public class MyArrayList {

	public static void main(String[] args) {
		System.out.println("MyArrayList class is running...\n");
		
		// 1. StringBuilder methods and how to chain them.
		
		System.out.println("01234567890123456789");
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Welcome");
		stringBuilder.append(' ');
		stringBuilder.append("to");
		stringBuilder.append(' ');
		stringBuilder.append("Java");
		System.out.println(stringBuilder.toString());
		
		stringBuilder.reverse();
		System.out.println(stringBuilder.toString());

		stringBuilder.delete(8, 11);
		System.out.println(stringBuilder.toString());

		stringBuilder.replace(11, 15, "HTML");
		System.out.println(stringBuilder.toString());
		
		stringBuilder.delete(0, stringBuilder.length());
		System.out.println(stringBuilder.toString());
		stringBuilder.append("Welcome");
		stringBuilder.append(' ');
		stringBuilder.append("to");
		stringBuilder.append(' ');
		stringBuilder.append("Java");
		System.out.println(stringBuilder.toString());
		
		// When you chain a series of StringBuilder methods, it applies them from left to right
		stringBuilder.reverse().delete(8, 11).replace(11, 15, "HTML");
		System.out.println(stringBuilder.toString());

		// 2. 
		
		System.out.println("\nMyArrayList class is done.");
	}

}
