package randomnumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        double randomNumber = 0;
        ArrayList<Integer> userId = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 6; j++) {
                int multiplier = 100000;
                Random random = new Random();
                randomNumber = Math.floor(random.nextDouble(multiplier));

            }
            userId.add((int) randomNumber);
            for (int k = 0; k < userId.size() ; k++) {
                if(userId.get(i) < 5){

                }
            }
        }

    }
}
