package phonebillcalculator;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double userCharge = 0.25;
    static int percentage = 15;
    static Scanner scanner = new Scanner(System.in);
//    int planCost = scanner.nextInt();

    public static void main(String args[]){

        double getTax = ToGetTheTax();
//        double calculatedTax = calculateTheTax();
        double calculate = (percentage / 100) * getTax;

        double getFees = overageFees();

        double sumFees = getFees * userCharge;
        scanner.close();

        double total = getTax + calculate + sumFees;
        System.out.println("The total is " + total);
    }

    public static double ToGetTheTax(){
        System.out.println("Please input your plan cost!");
        double getTax = scanner.nextDouble();
        return getTax;
    }

    public static double overageFees(){
        System.out.println("Please input your minutes!");
        double getFees = scanner.nextDouble();
        return getFees;
    }

}
