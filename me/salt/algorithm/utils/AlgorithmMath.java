package me.salt.algorithm.utils;

public class AlgorithmMath {
    public static void Sequence() {
        // variable declarations
        long startInt = 1l;
        long currentInt = 1l;

        // Main Loop
        System.out.println(currentInt);
        while (true) {
            // Case 1: If number is even
            if (currentInt % 2 == 0) {

                // Rule 1: If number is even, divide by 2
                currentInt = currentInt / 2;

                if (currentInt == 1 || currentInt == 2 || currentInt == 4) {
                    System.out.println("\n ---Iteration Failed--- \n");
                    startInt++;
                    currentInt = startInt;
                }

                // Print current number
                System.out.println(currentInt);
            }

            // Case 2: If number is odd
            else if (currentInt % 2 != 0) {

                // Rule 2: If number is odd, multiply by 3 and add 1
                currentInt = ((currentInt * 3) + 1);
                // If the array matches any of the looped sets increase number and try again
                if (currentInt == 1 || currentInt == 2 || currentInt == 4) {
                    System.out.println("\n ---Iteration Failed--- \n");
                    startInt++;
                    currentInt = startInt;
                }

                // Print current number
                System.out.println(currentInt);
            }
        }
    }
}
