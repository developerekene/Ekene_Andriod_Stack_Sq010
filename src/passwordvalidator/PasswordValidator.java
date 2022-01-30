package passwordvalidator;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String args[]){
        //create a variable to hold the minimum number of characters
        int characterLong = 8;

        //create a variable to hold the old password
        String oldPassword = "Iamekene@23";
        char[] ch = new char[oldPassword.length()];

        //create a variable to hold all special characters
        String specialCharacter = "!@#$%&*()_-";

        //create a variable to hold username
        String userName = "devekene";

        //ask for the password
        System.out.println("Please input your password!");
        System.out.println("It must contain at least one upper case letter, a special character " +
                "and must be 8 characters long");

        //store it in a variable
        Scanner scanner = new Scanner(System.in);
        String newPassword = scanner.next();

        //create a for loop to scan the input
        for(int i=0; i<newPassword.length(); i++){
            int smaller = characterLong - newPassword.length();

            if(newPassword.length() < characterLong){
                System.out.println("Error! Your New Password is smaller than 8 characters by " + smaller);
            } else{
                System.out.println("Congratulations, Your password has at least 8 character");
            }
        }

        for(int i=0; i<oldPassword.length(); i++){
            if(newPassword == oldPassword){
                System.out.println("Your new password matches the old one, choose another Password");
            } else{
                System.out.println("Your password is not the same as the old one, congratulations!");
            }
        }

        for(int i=0; i<userName.length(); i++){
            if(newPassword == userName){
                System.out.println("Your new username matches the old one, choose another username");
            } else{
                System.out.println("Your new Username is not the same as the old one, congratulations!");
            }
        }

        for(int i=0; i<newPassword.length(); i++){
            if(newPassword.contains(specialCharacter)){
                String message1 = "Special character found, Congratulations!";
                System.out.println(message1);

            } else{
                String message2 = "Please try again, no special character found in your new password!\"";
                System.out.println(message2);
//                System.out.println(");
            }
        }

        for(int i=0; i<newPassword.length(); i++){
            if(newPassword == newPassword.toUpperCase()){
                System.out.println("You have an upper case letter!");

            } else{
                System.out.println("You don't have an upper case letter!");
            }
        }

    }

}
