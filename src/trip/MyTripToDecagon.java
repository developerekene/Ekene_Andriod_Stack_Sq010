package trip;

import java.util.Scanner;

public class MyTripToDecagon {
    public static void main(String arg[]){
        //1. Where you currently are
        System.out.println("What state were you on the day you started coming to Decagon?");
        Scanner scanner = new Scanner(System.in);
        String state = scanner.next();

        //2. Preparations and morning rituals
        System.out.println("Name an Item you packed with you while coming");
        String item = scanner.next();

        //3. Initial movement to bus park
        System.out.println("What park did you use?");
        String park = scanner.next();

        //4. Bus park to ring road
        System.out.println("Where did you first drop in Benin?");
        String dropBus = scanner.next();

        //5. Ring road to Estate Junction
        System.out.println("Where did you drop later on in Benin?");
        String secondDrop = scanner.next();

        //6. Estate Junction to Edo Tech Park
        System.out.println("Where did you finally drop?");
        String finalDrop = scanner.next();

        //7. Display Result
        System.out.println
                ("After waking up in the morning, in "
                        + state + " state, i added " + item + " to my bag and took the "
                        + park + " park to " + dropBus + " where i later dropped at " + secondDrop +
                        " and finally at " + finalDrop + ".");
    }
}
