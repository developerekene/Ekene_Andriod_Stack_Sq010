package holiday;

import java.util.ArrayList;

public class Holiday {

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
    public boolean isSameMonth(Holiday firstHoliday, Holiday secondHoliday){
        if(firstHoliday.month == secondHoliday.month){
            return true;
        }else{
            return false;
        }
    }

    public static double avgDate (ArrayList<Holiday> arr){
        double save = 0;

        if(){

        }
        return save;
    }
}

