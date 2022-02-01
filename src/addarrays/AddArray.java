package addarrays;

import java.util.Arrays;

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
public class AddArray {
    public static void main(String args[]) {
        /*
        1. Run a for loop through the arr
        2. if the first two indexes equals to the target then
        3. push the index to a new array ouside the loop
        4. print out the new array

        */
        //initialize the nums array
        int[] nums = {5, 2, 3, 4, 1, 6, 7, 8, 9};

        //initialize target
        int target = 10;
        //
        System.out.println(Arrays.toString(solution(nums, target)));
    }


    public static int[] solution(int[] nums, int target) {
        //create an arr new array to hold the
        int[] newArray = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }

        }
        return (newArray);
    }
}


