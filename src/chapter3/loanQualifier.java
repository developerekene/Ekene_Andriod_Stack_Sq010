package chapter3;

import java.util.Scanner;

public class loanQualifier {
    public static void main(String args[]){
        //1. Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //2. Get what we don't know
        System.out.println("Enter your Salary!");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();
        scanner.close();

        //3. Make Decision
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congrats you qualify for the loan!");
            } else{
                System.out.println("Sorry you must have worked at your current job "
                        + requiredYearsEmployed + " years.");
            }
        } else{
            System.out.println("Sorry you must earn at least " + requiredSalary + " to qualify for the loan.");
        }



    }
}
