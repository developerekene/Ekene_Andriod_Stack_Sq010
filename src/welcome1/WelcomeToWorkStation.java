package welcome1;

import java.util.Scanner;

public class WelcomeToWorkStation {
    public static void main(String arg[]){
        //1. Says welcome to the work Station
        System.out.println("Welcome to the work station.");

        //2. Ask the user to enter his name
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();

        //3. Displays "Welcome[Username]"
        System.out.println("Welcome " + name);
    }
}
