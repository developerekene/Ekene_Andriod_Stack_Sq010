package helloname;

import java.util.Scanner;

public class HelloName {
    public static void main(String args[]){
        System.out.println("INPUT YOUR FULL NAME!");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();

        System.out.println("Hi, " + string + " welcome to my world.");
    }
}
