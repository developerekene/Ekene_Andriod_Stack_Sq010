package hackerranksolutions;

import java.util.Locale;
import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        //Take in the first word
        System.out.println("Input first word in uppercase");
        //Scan the input
        Scanner scanner = new Scanner(System.in);
        //save the input
        String firstInput = scanner.next();
        //Ask for the next input
        System.out.println("Input first word in uppercase");
        //save the next input
        String secondInput = scanner.next();
        //convert the input to upper case to lower case
        String toLowerCaseSecondInput = secondInput.toLowerCase();
        String toLowerCaseFirstInput = firstInput.toLowerCase();

        //pass an if condition to print out the respective output if the condition is true
        if(toLowerCaseFirstInput.equals(toLowerCaseSecondInput)){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
//        System.out.println(toLowerCaseFirstInput);
    }
}
