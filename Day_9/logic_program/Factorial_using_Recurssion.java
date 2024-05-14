package logic_program;

public class Factorial_using_Recurssion {
	static int fact =1;
	public static void main(String[] args) {

int num =4;
Factorial_using_Recurssion ob =new Factorial_using_Recurssion();
ob.callFact(num);
System.out.println(fact);

	}
	void callFact(int num)
	{
		if(num>=1)
		{
			fact=fact*num;
			num=num-1;
			callFact(num);
		}
	}

}

