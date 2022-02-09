package hackerranksolutions;

import java.util.ArrayList;
import java.util.List;

public class HackerRankSolutions {
    public static void miniMaxSum(List<Integer> myArr) {
        // Write your code here
        List<Integer> arr = new ArrayList<>();
        int total = 0;
        for(int i = 0; i < arr.size(); i++){
            total += arr.get(i);
        }

        System.out.println(total);
    }
}
