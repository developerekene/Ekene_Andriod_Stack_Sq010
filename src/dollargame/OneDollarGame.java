package dollargame;

import java.util.Scanner;

public class OneDollarGame {
    public static void main(String args[]) {
        //Ask for penny value and store
        System.out.println("Please input your penny value");
        Scanner scanner = new Scanner(System.in);
        double penny = scanner.nextDouble();

        //Ask for Nickle value and store
        System.out.println("Please input your Nickle value");
        double nickle = scanner.nextDouble();

        //Ask for Dimes value and store
        System.out.println("Please input your Dimes value");
        double dimes = scanner.nextDouble();

        //Ask for Quarter value and store
        System.out.println("Please input your Quarter value");
        double quarter = scanner.nextDouble();

        //Add all values and create conditionals

        double aTotal = penny + nickle + dimes + quarter;

        if(aTotal > 1){
            double solutionOne = aTotal - 1;
            System.out.println("So sorry, you went over by " + solutionOne + " Naira");
        } else if(aTotal < 1){
            double solutionTwo = 1 - aTotal;
            System.out.println("So sorry, you were under by " + solutionTwo + " Naira");
        } else {
            System.out.println("You win!");
        }

    }
}
