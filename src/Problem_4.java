/*
 * This program calculates the factorial of a given number `n` using recursion.
 *
 * 1. Reads an integer `n`.
 * 2. Calls the `factorial` function, which recursively calculates `n!`.
 * 3. Prints the result.
 */

import java.util.Scanner;

public class Problem_4 {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(factorial(n)); // Print the factorial of n

    }
}
