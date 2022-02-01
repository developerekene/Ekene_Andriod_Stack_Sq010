package mobileapp;

import java.util.Scanner;

public class MobileApp {
    public static void main(String args[]){
        //get an input from the user
        System.out.println("What is the relevance of Mobile Apps in the 21st Century");
        //Create a scanner to take in the input
        Scanner scanner = new Scanner(System.in);

        //Store the input
        String words = scanner.nextLine();

        //Display the input
        System.out.println(words);
    }

}
