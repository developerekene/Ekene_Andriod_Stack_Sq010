package hackerranksolutions;

import java.util.Random;

public class NewAlgorithm {
    public static void main(String[] args) {
        /**
         * Write an Algorithm that generates a 5 digit number
         * ID for a user and verifies that none of the ID's are repeated.
         */

        int numbOfLength = 5;
        //run a for loop
        for(int i = 0; i < numbOfLength; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(10000,99999) + 1;
            System.out.println(randomNumber);
        }

    }
}
