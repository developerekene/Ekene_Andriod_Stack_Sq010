package passwordvalidator;

import java.util.Scanner;

public class NewPasswordValidator {
//    private static System.out.println("Please input your password!");

    static int eightCharacter = 8;
    static Scanner scanner = new Scanner(System.in);
    static String newPassword = scanner.next();

    public static void main(){
        System.out.println("Please input your password!");

        atLeastEightCharacters();

        upperCaseLetter();

        specialCharacter();

        userName();

    }

    private static void upperCaseLetter() {

    }

    public static void atLeastEightCharacters(){
        for(int i=0; i<newPassword.length(); i++ ){
            if(newPassword.length() == eightCharacter){
                String save;
                System.out.println("Your password is Eight Character +");
            }
        }
    }

    public static void userName(){

    }

    public static void specialCharacter(){

    }

}
