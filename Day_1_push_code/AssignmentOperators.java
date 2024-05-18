
public class AssignmentOperators {

	public static void main(String[] args) {
		/*
		 *  = assign value to any variable
		 *  a +=b used between two variables. It means that a  will have the result of a+b as its new value
		 *  -=
		 *  *=
		 *   /=
		 *   %=
		 */

		int a=10;
		int b=2;
		
		
		System.out.println("Before....");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
	//	b+=a;//b=b+a=2+10=12;
	//	a-=b;//a=a-b=10-2=8
	//	a*=b;//a=a*b=10*2=20 	
		
	//	a/=b; ---> a=a/b=10/2=5
	 a%=b; //---> a=a%b=10%2=0	
		System.out.println("\nAfter....");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
