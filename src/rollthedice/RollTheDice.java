package rollthedice;

import java.util.Random;

public class RollTheDice {
    public static void main(String args[]){
        //initialize the total number of spaces
        int totalNumberOfSpaces = 20;

        //initialize the total number of rolls
        int totalNumberOfRoll = 6;

        //initialize a variable to 0 to add the result from the dice
        int myAddedNumber = 0;

        //run a loop 5 times or row the dice 5 times
        for(int i=0; i<totalNumberOfRoll + 1; i++){
            //generate a random number from 1-6
            Random random = new Random();
            //store the random number in a variable
            int theDie = random.nextInt(6) + 1;
            //Add the value of each row to initialize variable
            myAddedNumber = myAddedNumber + theDie;

        }
        //print out the added result
        System.out.println(myAddedNumber);

        //run a conditional to display the final results
        if(myAddedNumber == totalNumberOfSpaces){
            System.out.println("The Game ends, you have scored a total of " + myAddedNumber);
        } else if(myAddedNumber > totalNumberOfSpaces){
            System.out.println("You loose, you scored " + myAddedNumber + " above " + totalNumberOfSpaces);
        } else{
            System.out.println("You loose, you scored " + myAddedNumber + " below " + totalNumberOfSpaces);
        }


    }
}
