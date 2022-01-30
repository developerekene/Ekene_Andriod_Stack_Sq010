package season;

import java.util.Scanner;

public class YearlySeason {
    public static void main(String arg[]){
        //1. Ask for the Season of the Year
        System.out.println("What season of the year are you currently in?");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String season = scanner2.nextLine();

        //2. Ask for a whole number
        System.out.println("Please Pick a whole Number!");
        int wholeNumber = scanner.nextInt();

        //3. Ask for an adjective
        System.out.println("Please provide an Adjective of your choice");
        String adjective = scanner2.nextLine();
        scanner.close();

        //4. Displays result
        System.out.println("On a " + adjective + " " + season + " day, i drink a minimum of " + wholeNumber + " cups of coffee!");
    }
}
