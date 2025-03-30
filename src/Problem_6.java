/*
 * This program calculates "a^n" using recursion.
 *
 * 1. Reads two integers `a` (base) and `n` (exponent).
 * 2. Calls the `power` function to compute a^n recursively.
 * 3. Prints the result.
 */

import java.util.Scanner;

public class Problem_6 {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1; // Base case: any number to the power of 0 is 1
        }
        return a * power(a, n - 1); // Recursive call: a^n = a * a^(n-1)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(power(a, n)); // Print the result of a^n


    }
}
