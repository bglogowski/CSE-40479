/*
 * SmallestInt.java
 */

/**
 *
 * @author Bryan Glogowski
 */

import java.util.Scanner;

public class SmallestInt {

    private static Scanner scan;

    public static void main(String[] args) {

        int positiveInteger;
        int[] intArray;
        boolean invalidInput = true;

        scan = new Scanner(System.in);

        do {
            System.out.print("How many integers shall we compare? (Enter a positive integer): ");
            positiveInteger = scan.nextInt();

            if (positiveInteger > 0) {
                invalidInput = false;
            } else {
                System.out.println("Invalid input!");
            }

        } while (invalidInput);

        intArray = new int[positiveInteger];

        for (int i = 1; i < positiveInteger + 1; i++) {
            System.out.print("Enter value " + i + ": ");
            intArray[i - 1] = scan.nextInt();
        }

        System.out.println("The smallest number entered was: " + findMin(intArray));
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i <= array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return (min);
    }

}