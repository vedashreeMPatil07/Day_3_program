
public class ArithmeticOperators {

	public static void main(String[] args) {
		/*
		 * 		+ addition
		 * 		- subtraction
		 * 		* multiplication
		 * 		/ will divide number and give quotient as result
		 * 		% will divide numbers and give remainder as result
		 * 
		 * We use bracket in print statement so that the operation is done first and the result of
		 * operation is attached to the message.
		 * If we do not use bracket simply the values of a and b will be displayed in front of
		 * message. Addition will not happen.
		 */
		
		int a=11;
		int b=2;
		
		System.out.println("After adding a+b= "+(a+b));
		System.out.println("After subtracting a-b= "+(a-b));
		System.out.println("Multiplying a* b= "+(a*b));
		System.out.println("Using / to divide= "+(a/b));
		System.out.println("Using % to divide= "+(a%b));

	}

}
