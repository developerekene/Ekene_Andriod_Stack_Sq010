package programmingconceptexcersice;

import java.util.Scanner;

public class ProgrammingConceptExcersice {
    //A security protocol for checking the driving age of a person
    public static void main(String args[]){

        //Ask of an input
        System.out.print("Please put in your Name!");
        //create a scanner to take in an input
        Scanner scanner = new Scanner(System.in);
        //store the input
        int yourAge = scanner.nextInt();
        //ste out the minimum age
        int minimumAge = 18;

        /*
            run a conditional on the input given to check if the Input age is equal or greater than the minimum age then
            print out you are of age to begin else print out you are not of age.


        */
        if(yourAge == minimumAge){
            System.out.println("You are of age to begin driving lessons!");
        } else if(yourAge > minimumAge){
            System.out.println("You are of age to begin driving lessons!");
        }else{
            System.out.println("You are not of age!");
        }
    }


}

