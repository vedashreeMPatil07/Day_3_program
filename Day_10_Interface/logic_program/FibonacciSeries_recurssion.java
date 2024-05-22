package logic_program;

public class FibonacciSeries_recurssion {

	public static void main(String[] args) {
int n=10;
for(int i =0;i<n;i++)
{
	System.out.print(fibbo(i) + " ");
}
	}
	public static int fibbo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fibbo(n-1)+fibbo(n-2);
		}
	}

	//amstrong
	//factorial using recursion
	//dassarium number
	//fibo 
	//anagram
}
