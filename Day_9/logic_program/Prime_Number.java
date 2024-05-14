package logic_program;

public class Prime_Number {

	public static void main(String[] args) {
int n=7;
boolean b = false ;
for (int i=2 ;i<=n-1 ;i++)
{
	if (n%i ==0)
	{
		 b =false;
	}
	
}
if(b==false)
{
	System.out.println("Number is Prime Number");
}
else
{
	System.out.println("Number is no prime number");
}
	}

}
