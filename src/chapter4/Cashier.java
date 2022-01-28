package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]){
        //getting the number of items to scan
        System.out.println("Please Enter the number of Items you'll like to scan!");
        Scanner scanner = new Scanner(System.in);
        int myQuantity = scanner.nextInt();
//        scanner.close();

        double total = 0;

        for(int i=0; i<myQuantity; i++){
            System.out.println("Enter the cost of the Item");
            double price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Your total is N" + total);
    }
}
