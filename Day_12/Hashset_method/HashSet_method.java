package Hashset_method;
import java.util.HashSet;

public class HashSet_method {
public static void main(String args[])
		{
	        HashSet<String> set = new HashSet<>();

	        // Add elements
	        set.add("Red");
	        set.add("Yellow");
	        set.add("Green");

	        // Display the set
	        System.out.println("Set: " + set);

	        // Check if an element is in the set
	        System.out.println("Contains 'Red': " + set.contains("Red"));

	        // Remove an element
	        set.remove("Yellow");
	        System.out.println("Set after removing 'Yellow': " + set);

	        // Get the size of the set
	        System.out.println("Size: " + set.size());

	        // Check if the set is empty
	        System.out.println("Is set empty: " + set.isEmpty());

	        // Convert to array
	        String[] array = set.toArray(new String[0]);
	        System.out.println("Array: " + java.util.Arrays.toString(array));

	        // Clear the set
	        set.clear();
	        System.out.println("Set after clearing: " + set);
	    }
	

		}

