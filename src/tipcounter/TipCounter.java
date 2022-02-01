package tipcounter;

public class TipCounter {
    public static void main(String[] args){

        double percentage = 0.15;
        int hotelOneAndTwo = 400;
        int hotelThreeFourFive = 600;
        int hotelSix = 450;
        int hotelSeven = 250;
        int numberOfMonths = 12;
        int weeks = 4;

        int amountSpentInaWeek = hotelOneAndTwo + hotelThreeFourFive + hotelSix + hotelSeven;
        int spentInaMonthOnTips = amountSpentInaWeek * weeks;
        double storeTips = amountSpentInaWeek * percentage;
        double weekTip = storeTips * weeks;
        double monthlyTips = weekTip * numberOfMonths;





        System.out.println(monthlyTips);
    }
}
