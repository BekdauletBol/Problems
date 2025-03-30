/*
 * This program checks if a given string consists only of digits using recursion.
 *
 * 1. Reads a string `s`.
 * 2. Calls `isAllDigits` function to verify if all characters are digits.
 * 3. Prints "Yes" if all characters are digits, otherwise prints "No".
 */

import java.util.Scanner;

public class Problem_8 {
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return isAllDigits(s, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
