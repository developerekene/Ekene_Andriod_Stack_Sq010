package programmingconceptexcersice;

import java.util.Scanner;

public class ProgrammingConceptExcersice {
    //A security protocol for letting in only my kids into the house.
    public static void main(String args[]){


        System.out.print("Please put in your Name!");
        Scanner scanner = new Scanner(System.in);
        int yourAge = scanner.nextInt();

        int minimumAge = 18;

        if(yourAge == minimumAge){
            System.out.println("You are of age to begin driving lessons!");
        } else if(yourAge > minimumAge){
            System.out.println("You are of age to begin driving lessons!");
        }else{
            System.out.println("You are not of age!");
        }
    }


}

