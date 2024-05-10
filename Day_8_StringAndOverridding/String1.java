import java.util.Arrays;
//import java.util.Scanner;
import java.lang.StringBuilder;
public class String1 {
    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
   
   String s="hello"; //stored in SCP
   String s1 =new String("hello"); // strore in object,if varible and object value same so its refer to same in scp 
   System.out.println(s==s1); //false -->campare to object and varible = false
   System.out.println(s.equals(s1)); //true
   System.out.println(s.intern()==s1); //true
   String s2=s.replace('e' , 'o');   
System.out.println("after replace:  " +s2);  
s2+="Employee";
System.out.println(s2);
System.out.println(s2.charAt(6));

String a="hello employees";
System.out.println("trim: " +a.trim()); // trim remove white spaces

String str = "Hello*World*!";
String str1 = str.replace("*", "");
 System.out.println("original :" +str);
 System.out.println("after replace : " +str1);

 String str2 ="hello my name is Vedashree";
 String str3[] =str2.split(" "); //String convert into Arrys
 System.out.println(Arrays.toString(str3));


 String m ="    hello     world        ";
 System.out.println(m.isBlank());
 System.out.println(m.isEmpty()); //if space is present then give false
 System.out.println("strip:" +m.strip()); // strip remove start and end space

 //string builer
 StringBuilder sb=new StringBuilder();
 sb.append("wolrd"); //concate
 System.out.println("sb:" +sb);

System.out.println("delete:" +sb.delete(2,7));
System.out.println("insert:" +sb.insert( 1 , "**"));
System.out.println("reverse:" +sb.reverse());

}

}