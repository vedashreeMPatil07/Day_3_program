package a1_interface;
public class Main {

	public static void main(String[] args) {

Student s=new Student(01, "vedashree");
s.Display_name();
s.Display_rollNo();

//another war using getter method
System.out.println("Name: "+s.getName());
System.out.println("Roll number: "+s.getRollNo());

	}

}
