/*
 * This program finds the Greatest Common Divisor (GCD) of two numbers using recursion.
 *
 * Algorithm: Euclidean Algorithm
 * Formula: GCD(a, b) = GCD(b, a % b)
 * Base case: GCD(a, 0) = a
 */

import java.util.Scanner;

public class Problem_10 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: when b becomes 0, a is the GCD
        }
        return gcd(b, a % b); // Recursive call with (b, remainder of a / b)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd(a, b)); // Print GCD of a and b

        scanner.close();
    }
}
