public class Second_largest {

	public static void main(String[] args) {
		int first = 0;
		int second = 0;
		int a[] = { 8, 8, 8, 6, 5, 2, 1 };
		for (int i = 2; i < a.length; i++) {

			if (a[i] > first) {
				second = first;
				first = a[i];
			} else if (a[i] > second && a[i] != first) {
				second = a[i];
			}

		}
		System.out.println("second largest:" + second);

	}

}
