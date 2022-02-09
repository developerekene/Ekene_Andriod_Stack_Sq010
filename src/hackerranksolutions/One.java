package hackerranksolutions;

import java.util.ArrayList;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        /**
         * You are given an integer , you have to convert it into a string.
         *
         * Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
         *
         *  can range between  to  inclusive.
         */

//        int myNew = 8;
//        String s=String.valueOf(myNew);
//        System.out.println(s);

//        String newString = "Ekenedilichukwu";
//        String newOne = newString.substring(3, 7);
//        System.out.println(newOne);
//
//

//        System.out.println("Please input your String");
//        Scanner scanner1 = new Scanner(System.in);
//        String inputString = scanner1.next();
//        System.out.println("First Integer");
//        Scanner scanner2 = new Scanner(System.in);
//        int myFirstInt = scanner2.nextInt();
//
//        System.out.println("Second Integer");
//        Scanner scanner3 = new Scanner(System.in);
//        int mySecondInt = scanner3.nextInt();
//        String mySubString = inputString.substring(myFirstInt, mySecondInt);
//
//        System.out.println(mySubString);

        System.out.println("Please input your String");
        Scanner scanner1 = new Scanner(System.in);
        String inputString = scanner1.next();
        String myPall = null;
        for(int i = inputString.length() - 1; i >= 0; i--){
//            ArrayList<String> myArr = new ArrayList<>();
//            myArr.add(inputString[i]);
            myPall += myPall + inputString.charAt(i);
            System.out.println(myPall);
        }

    }



}
