package movie;

public class Movie {
    String title;
    String studio;
    String rating;


    //First constructor to create instances or objects of this class
    public Movie(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    //Second constructor to create instances or objects of this class
    public Movie(String title, int studio, String rating){

        String ratingValue = "PG";
        this.title = title;
        this.studio = studio;
        this.rating = ratingValue;
    }



    public static double avgDate(int[] Holiday){
        int start = 0;
        for(int i = 0; i < Holiday.length; i++){
            start = start + Holiday[i];
        }

        double average = start / Holiday.length;

        return average;
    }



}
