import java.util.Scanner;
public class Main{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
    Employee e=new Employee();
    System.out.println("Enter Name: ");
e.setName(sc.nextLine());
System.out.println("Enter age: " );
e.setAge(sc.nextInt());
System.out.println(e);
}



}