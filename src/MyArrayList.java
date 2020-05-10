import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		System.out.println(stringBuilder.toString() + "\n");

		// 2. ArrayList
		
		List<String> lNames = Arrays.asList("Alex", "Charles", "Brian", "David", "Susan");
		
		ArrayList<String> alNames = new ArrayList<String>();
		
		alNames.addAll(lNames);
		
		for (String item : alNames) {
			System.out.println(item);
		}
		
		System.out.println(alNames);
		
		Collections.sort(alNames);
		System.out.println(alNames);
		
		Collections.shuffle(alNames);
		System.out.println(alNames);
		
		int inxSusan = alNames.indexOf("Susan");
		System.out.println(inxSusan);
		
		int inxUnknown = alNames.indexOf("Unknown");
		System.out.println(inxUnknown);
		
		Object[] arrNames = alNames.toArray();
		System.out.println(arrNames);
		for (Object obj : arrNames) {
            System.out.print(obj + " ");
		}
		System.out.println();
		
		List<Object> newListNames = Arrays.asList(arrNames);
		System.out.println(newListNames);
		
		
		System.out.println("\n\nMyArrayList class is done.");
	}

}
