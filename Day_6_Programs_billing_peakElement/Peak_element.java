import java.util.Scanner;
public class Peak_element {

	/*Input: array[]= {5, 10, 20, 15}
     Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
int a[]=new int[n];
for (int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
for (int i=1 ;i<a.length-1 ;i++)
{
	if (a[i]>a[i-1] && a[i]>a[i+1]){   //a[3] ="20" > i-1 =10  and 20>i+1=15
        System.out.println(a[i]);//20 is the peak element
        break;
}
	}
	}
}


