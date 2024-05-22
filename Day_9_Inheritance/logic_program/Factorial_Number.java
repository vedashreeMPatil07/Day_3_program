package logic_program;
import java.util.Scanner;
public class Factorial_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
int fact=1;
for (int i =1; i<=num;i++)
{
	fact =fact *i; //1 *2 * 3 *4 
}
System.out.println("fact : "+fact);
	}

}
