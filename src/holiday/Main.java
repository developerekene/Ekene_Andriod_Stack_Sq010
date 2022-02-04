package holiday;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Holiday valentineDayOne = new Holiday("Val Day", 14, "October");
        Holiday independenceDay = new Holiday("Independence Day", 1, "October");

        ArrayList<Holiday> Holiday = new ArrayList<>();

        Holiday.add(valentineDayOne);
        Holiday.add(independenceDay);

        System.out.println(valentineDayOne.day);
        System.out.println(valentineDayOne.isSameMonth(valentineDayOne, independenceDay));


    }

}
