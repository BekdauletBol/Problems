/*
 * This program prints numbers in reverse order using recursion.
 *
 * 1. Reads an integer `n` (number of elements).
 * 2. Reads `n` integers one by one.
 * 3. Uses recursion to print them in reverse order.
 */
import java.util.Scanner;

public class Problem_7 {
    public static void reversePrint(int count, Scanner scanner) {
        if (count == 0) {
            return; // Base case: when no more numbers to read, stop recursion
        }

        int num = scanner.nextInt(); // Read the number
        reversePrint(count - 1, scanner); // Recursive call before printing (stores the order)
        System.out.print(num + " "); // Print number after recursive call (reverse order)
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Read the number of elements
        reversePrint(n, scanner); // Call recursive function to print in reverse


    }
}
