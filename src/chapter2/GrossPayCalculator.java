package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //1. Get the Number of Hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the Hourly pay rate
        System.out.println("Enter the Employee's pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiple hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("The Employee's gross pay is $" + grossPay);

    }
}
