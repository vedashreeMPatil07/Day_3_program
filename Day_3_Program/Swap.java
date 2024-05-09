public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping");
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		System.out.println("===============================");
        System.out.println("using temp varible:");
		int x = 50;
		int y = 80;
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
