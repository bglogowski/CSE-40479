/*
 * CommissionCalculator.java
 */

/**
 *
 * @author Bryan Glogowski
 */

import java.util.Scanner;

public class CommissionCalculator {

    private static Scanner scan;

    public static void main(String args[]) {

        int item = 0;
        double earnings = 200.0;
        scan = new Scanner(System.in);

        System.out.println("Item\tValue");
        System.out.println("1\t$239.99");
        System.out.println("2\t$129.75");
        System.out.println("3\t$99.95");
        System.out.println("4\t$350.89");

        System.out.format("Current compensation: $%.2f%n", earnings);
        System.out.print("Please select an item from the list above (or enter 0 to exit): ");
        item = scan.nextInt();

        while (item != 0) {

            if (item == 1) {
                earnings += 239.99 * 0.09;
            } else if (item == 2) {
                earnings += 129.75 * 0.09;
            } else if (item == 3) {
                earnings += 99.95 * 0.09;
            } else if (item == 4) {
                earnings += 350.89 * 0.09;
            } else {
                System.out.println("ERROR: Invalid input!");
            }

            System.out.println("Item\tValue");
            System.out.println("1\t$239.99");
            System.out.println("2\t$129.75");
            System.out.println("3\t$99.95");
            System.out.println("4\t$350.89");

            System.out.format("Current compensation: $%.2f%n", earnings);
            System.out.print("Please select an item from the list above (or enter 0 to exit): ");
            item = scan.nextInt();

        }

        System.out.format("Total earnings: $%.2f%n", earnings);

    }

}