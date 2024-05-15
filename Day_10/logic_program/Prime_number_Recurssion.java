package logic_program;
import java.util.*;
public class Prime_number_Recurssion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit to generate prime numbers: ");
        int limit = scanner.nextInt();

        System.out.println("Prime numbers up to " + limit + ":");
        printPrimes(2, limit);
    }

    public static void printPrimes(int current, int limit) {
        if (current <= limit) {
            if (isPrime(current)) {
                System.out.print(current + " ");
            }
            printPrimes(current + 1, limit);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
	}

}
