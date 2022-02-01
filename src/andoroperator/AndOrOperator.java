package andoroperator;

public class AndOrOperator {
    public static void main(String[] args){
        int jamesAge = 12;
        int sallyAge = 15;

        if(jamesAge > 10 && sallyAge > 10){
            System.out.println("The are both older than 10 Years!");
        }

        if(jamesAge >= 15 || sallyAge >= 15){
            System.out.println("One is greater than 15!");
        }
    }

}
