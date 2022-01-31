package solvemefirst;


//Complete the function solveMeFirst to compute the sum of two integers.

        //Example
        //a = 7
        //b = 3

import java.util.Scanner;

//Return 10
public class SolveMeFirst {
//    static int total;

    public static void main(String args[]){
        System.out.print("Input first number");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.print("Input Second number");
        int secondNumber = scanner.nextInt();

        int total = firstNumber + secondNumber;
        System.out.print(total);
    }

//
}
