/*
 * This program calculates the average of an array.
 *
 * 1. Reads an integer `n`, which represents the number of elements.
 * 2. Takes `n` integers as input and stores them in an array.
 * 3. Calls the `calculateAverage` function to find the average.
 * 4. Prints the result as a floating-point number.
 */

import java.util.Scanner;

public class Problem_2 {
    public static double calculateAverage(int[] arr) {
        int sum = 0; // Variable to store the sum of elements

        for (int num : arr) {
            sum += num; // Add each element to sum
        }

        return (double) sum / arr.length; // Calculate and return average
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(calculateAverage(numbers)); // Print the average

    }
}
