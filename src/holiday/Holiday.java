package holiday;

public abstract class Holiday {

    String name;
    int day;
    String month;


    //constructor to create instances or objects of this class
    public Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    //Creates a method that compares two instances of
    public boolean isSameMonth(){
        if(valentineDay == NewYearDay){
            return true;
        }else{
            return false;
        }
    }

    public static double avgDate(String[] Movie){
        String onlyPg;
        for(int i = 0; i < Movie.length; i++){

        }

        double average = start / Holiday.length;

        return average;
    }
}
