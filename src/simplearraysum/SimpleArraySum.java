package simplearraysum;

public class SimpleArraySum {
    public static void main(String args[]){
        int[] arr = {1, 2, 3};
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }

        System.out.print(total);
    }
}
