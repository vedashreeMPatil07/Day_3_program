package arrayList_Methods;

import java.util.ArrayList;

public class ArrayList_Methods {
public static void main(String args[])
{
	ArrayList<String> al =new ArrayList<>();
	al.add("Red");
	al.add("Yellow");
	al.add(null);
	al.add("Green");
	al.add("Yellow");
	
	System.out.println("Before= "+al);

	 String s=al.get(2);
	 System.out.println("Element at index 2: " +s);
	 
	  al.remove("Red"); //one element delete
	  
	  System.out.println("After removing= "+al);
	  
	 System.out.println("Is Brown present in our al? "+al.contains("Brown"));
		
		System.out.println("No. of members present in al= "+al.size()); 
		
		System.out.println("Index of Yellow= "+al.indexOf("Yellow"));
		al.clear(); //all delete
		
		System.out.println("After clearing: "+al+"\nis al empty? "+al.isEmpty());
	 

}
}
