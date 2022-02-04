//package class4;
//
//import java.util.List;
//
//public class ClassFour {
//    public static void plusMinus(List<Integer> arr) {
//        // Write your code here
//
//
//        //Declearing our variables
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        // looping through the list
//        for(int i = 0; i < arr.size(); i++){
//            if(arr.get(i) > 0){
//                positive += 1;
//            } else if(arr.get(i) < 0){
//                negative += 1;
//            } else {
//                zero += 1;
//            }
//        }
//
//        // Format Outputs
//        double positiveDivision = ((double)positive / (double)arr.size());
//        double negativeDivision = ((double)negative / (double)arr.size());
//        double zeroDivision = ((double)zero / (double)arr.size());
//
//        // Print Outputs
//        System.out.println(String.format("%.6f", positiveDivision));
//        System.out.println(String.format("%.6f", negativeDivision));
//        System.out.println(String.format("%.6f", zeroDivision));
//
//    }
//
//}
//}
//
//
