/*
 * This program checks whether a given number `n` is prime.
 *
 * 1. Reads an integer `n`.
 * 2. Calls the `isPrime` function to determine if `n` is prime.
 * 3. Prints "Prime" if the number is prime, otherwise prints "Composite".
 */

import java.util.Scanner;

public class Problem_3 {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Numbers less than 2 are not prime
        }

        for (int i = 2; i * i <= n; i++) { // Check divisibility up to sqrt(n)
            if (n % i == 0) {
                return false; // If divisible, it's not a prime
            }
        }

        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

    }
}

