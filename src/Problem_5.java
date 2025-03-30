/*
 * This program finds the n-th Fibonacci number using recursion.
 *
 * 1. Reads an integer `n`.
 * 2. Calls the `fibonacci` function, which recursively calculates the n-th Fibonacci number.
 * 3. Prints the result.
 */

import java.util.Scanner;

public class Problem_5 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        }
        if (n == 1) {
            return 1; // Base case: F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call: F(n) = F(n-1) + F(n-2)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(fibonacci(n)); // Print the n-th Fibonacci numbers


    }
}
