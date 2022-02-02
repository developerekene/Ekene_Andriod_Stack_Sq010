package class3;

public class ClassThree {
    public static void main(String[] args){
        int [] arr = {1, 3, 5, 7, 9};

        int totalNum = 0;

        for(int i = 0; i < arr.length; i++){
            totalNum = totalNum + arr[i];
        }

        int largestNumb = totalNum - arr[0];
        int smallestNumb = totalNum - arr[arr.length - 1];

        System.out.println(smallestNumb + " " + largestNumb);
    }

}
