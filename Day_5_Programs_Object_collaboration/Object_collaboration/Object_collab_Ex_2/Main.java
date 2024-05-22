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

System.out.println("enter Address: ");
Address address=new Address();
address.setBuilding(sc.nextLine());
address.setCity(sc.nextLine());
address.setCity(sc.nextLine());
sc.next();
address.setPin(sc.nextInt());

System.out.println(e);
}



}