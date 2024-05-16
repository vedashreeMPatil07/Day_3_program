package logic_program;

public class Amstrong_Number {

	public static void main(String[] args) {
		int num=153;
int temp =num;
int length =0;
while(temp!=0)
{ //find length
	length=length+1;
	temp=temp/10;
}
//number divide
int temp1=num;
int rem ,sum=0;

while(temp1!=0)
{
	rem =temp1%10;
	temp=temp1/10;
	int mul=1;
	for(int i=1;i<=length;i++)
	{
		mul=mul*rem;
	}
	sum=sum+mul;
	}
if(num==sum)
{
	System.out.println(num + "is amstrong number");
	
}
else
{
	System.out.println(num +" is not amstrong number");
}

	}

}
