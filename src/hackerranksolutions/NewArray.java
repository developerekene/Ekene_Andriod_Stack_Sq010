package hackerranksolutions;

public class NewArray {
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[n];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for(int i = 0; i < a.length; i++){
            if(a.length < n){
                System.out.println("Not working");
            }else if(a.length > n){
                System.out.println("Not working");
            }else{
                System.out.println(a[i]);
            }
        }

    }
}
