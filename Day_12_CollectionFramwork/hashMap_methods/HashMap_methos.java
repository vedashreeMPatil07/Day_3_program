package hashMap_methods;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
public class HashMap_methos {
	

	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();

	       
	        map.put("Pune", 1);    // Add elements
	        map.put("Mumbai", 2);
	        map.put("Raipur", 3);

	        int appleValue = map.get("Pune");
	        System.out.println("Value for 'Pune': " + appleValue);

	        boolean hasBanana = map.containsKey("Mumbai"); //check key
	        System.out.println("Contains 'Mumbai': " + hasBanana);

	        boolean hasValue3 = map.containsValue(3); //check value
	        System.out.println("Contains value 3: " + hasValue3);

	        int size = map.size();
	        System.out.println("Size: " + size);

	        map.remove("Apple");
	        System.out.println("Map after removing 'Mumbai': " + map);

	        Set<String> keys = map.keySet(); //Iterate through keys
	        System.out.println("Keys: " + keys);

	        // Iterate through values
	        Collection<Integer> values = map.values();// Iterate through values

	        System.out.println("Values: " + values);

	        // Iterate through key-value pairs
	        Set<Map.Entry<String, Integer>> entries = map.entrySet();
	        for (Map.Entry<String, Integer> entry : entries) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Clear the map
	        map.clear();
	        System.out.println("Map after clearing: " + map);
	    }
	}


