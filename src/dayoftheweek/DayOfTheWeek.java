package dayoftheweek;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String args[]){
        // create an array that holds the days of the week
        String[] daysOfTheWeek = {"Empty", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //ask for a number input
        System.out.println("Pick a number from 1 to 7");

        //create a scanner to get the answer
        Scanner scanner = new Scanner(System.in);

        //store the information
        int num = scanner.nextInt();

        //run a loop on the array
        for(int i=0; i<daysOfTheWeek.length; i++){
            //if the user input is equal to the index(i)
            if(num == i){
                //print out that element
                System.out.println(daysOfTheWeek[i]);
            }
        }
    }
}
