
/*
 * RockNRollah.java
 */

import java.util.Random;

/**
 * @author Bryan Glogowski
 */

public class RockNRollah {

    public static void main(String[] args) {

        int rolls = 36000000;

        // Magic number with which to shift indexes
        int shiftIndexBy = 2;

        // Create a Random object
        Random rand = new Random();

        // Initialize a couple of variables to hold the values of the two dice
        int die1;
        int die2;

        // Initialize the array that will hold the results
        int[] results = new int[11];

        // Roll the dice (a lot) and sum and tally the results
        for (int i = 0; i < rolls; i++) {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            results[(die1 + die2) - shiftIndexBy]++;
        }

        // Display the frequencies
        System.out.println("Results after " + rolls + " rolls");
        System.out.println("-------------------------");
        System.out.println("Value\tFrequency");

        // Loop, displaying the rows for the body of the table, each on its own line.
        // The required format for each row is to display the sum, followed by a tab,
        // followed by the number of times that sum came up. Do not include any
        // additional formatting
        for (int i = 0; i < results.length; i++) {
            System.out.println(i + shiftIndexBy + "\t" + results[i]);
        }

    }

}