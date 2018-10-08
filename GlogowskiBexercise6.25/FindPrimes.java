/*
 * FindPrimes.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class FindPrimes {

    public static void main(String[] args) {

        System.out.println("Prime numbers < 10k:");

        /*
         * Loop 10000 times, checking every number along the way for primeness... Let
         * the isPrime method do the heavy lifting If a given number is prime it should
         * be displayed on its own line (non prime numbers are not displayed at all)
         */

        for (int i = 1; i < 10001; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = (int) Math.floor(Math.sqrt((double) num)); i > 1; i--) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

}