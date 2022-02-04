package aliceandbob;

import java.util.Arrays;

public class AliceAndBob {
    public static void main(String[] args){

        int alice = 0;
        int bob = 0;

        int[] fullArr = new int[2];

        int[] aSet = {1 ,2, 3};
        int[] bSet = {3, 2, 1};
        // create a for loop
        for(int i = 0; i< aSet.length; i++){
            for (int j = 0; j< bSet.length; j++){
                if(aSet[i] > bSet[j]){
                    alice = alice + 1;
                }else{
                    bob = bob + 1;
                }
            }
        }

        alice = fullArr[0];
        bob = fullArr[1];


        //if the first index of i is greater than the first index of j add one point for Alice

        //if the first index of j is greater than the first index of i add one point for Bob
        System.out.print(Arrays.toString(fullArr));
    }


}
