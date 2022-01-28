package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        //get the test score
        System.out.println("Enter your test score!");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch(grade){
            case "A":
                message = "Excelent job!";
                break;
            case "B":
                message = "Great job!";
                break;

        }


    }
}
