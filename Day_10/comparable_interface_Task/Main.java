package comparable_interface_Task;

public class Main {

	public static void main(String[] args) {
Student s1=new Student(50);
Student s2=new Student(80);

int result=s1.compareTo(s2);

if(result > 0)
{
	System.out.println("high");
}
else if (result <0)
{
	System.out.println("less");
}
else
{
	System.out.println("equal");
}
	}

}
