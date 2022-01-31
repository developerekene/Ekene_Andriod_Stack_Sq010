package rollthedice;

import java.util.Random;

public class RollTheDice {
    public static void main(String args[]){
        int totalSpace = 20;
        int thecurrentSpace = 0;
        int totalrolls = 5;

        Random random = new Random();

        System.out.println("Please roll the dice");

        for(int i=1; i<=totalrolls; i++){

            int dice = random.nextInt(6) + 1;
            thecurrentSpace = thecurrentSpace + dice;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, dice));

            if(thecurrentSpace == totalSpace){
                System.out.print("You're on space " + thecurrentSpace + ". Congrats, you win!");
                break;
            }
            else if(thecurrentSpace > totalSpace){
                System.out.print("Unfortunately, that takes you past " + totalSpace + " spaces. You lose!");
                break;
            }
            else if(i==totalrolls && thecurrentSpace < totalSpace){
                System.out.println("You're on space " + thecurrentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        totalSpace + " spaces. You lose!");
            }
            else{
                int spacesleft = totalSpace - thecurrentSpace;
                System.out.print("You are now on space " + thecurrentSpace +
                        " and have " + spacesleft + " more to go.");
            }

            System.out.println();
        }
    }
}
