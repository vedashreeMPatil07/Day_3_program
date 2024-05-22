package logic_program;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Anagram {
	
	
	public static void main(String args[])
	{
		String s1 ="brag";
		String s2 ="grab";
		
		if(s1.length() !=s2.length())
		{
			System.out.println("Strings are not Anagram");
		}
		else
		{
			char[] string1 = s1.toCharArray();  
	        char[] string2 = s2.toCharArray();  
	        
	        //without method
	        Arrays.sort(string1);
	        Arrays.sort(string2);
	        
	        if(Arrays.equals(string1 , string2 ) ==true)
	        {
	        	System.out.println("string is anagram");
	        }
	        else
	        {
	        	System.out.println("not anagram");
	        }
		}
}
}
