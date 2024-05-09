import java.util.*;
public class Diagonal_Element {
public static void main(String[] args) {
    

Scanner sc =new Scanner(System.in);
System.out.println("enter rows:");
		int m =sc.nextInt();
        System.out.println("enter colums:");
		int n =sc.nextInt();

		int a[][]=new int [m][n];
        System.out.println("enter element of matrix:");
for(int i =0;i< m ;i++)
{
	for(int j =0 ;j<n;j++)
	{
a[i][j]=sc.nextInt();
		}
}



for(int i =0;i< m ;i++)
{
	for(int j =0 ;j<n;j++)
	{
		if (i==j || i+j==n-1) {
		System.out.print(a[i][j] +" ");
        }
		else{
			System.out.print(" ");
        }
		}
	System.out.println();
}
}
}
