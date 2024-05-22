package single_inheritance;

public class Main {

	public static void main(String[] args) {

		//upcasting
		System.out.println("upcasting");
		Employee emp =new Employee();
		Address add=(Employee)emp;
		
		System.out.println("doncasting");
		//downcasting
		Address add1 =new Employee();
		add1.showAddress();
		
		Employee emp1=new Employee();//object of child class because it inherit the parent class
		emp1.showAddress();  //show override outpute
		
		
	}

}
