package movie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        School decagon = new School("Decagon Software Institution", 80, "Edo Tech Park");
//        School andela = new School("Andela", "Lagos");
//        School puralSight = new School("Pural Sight", 50, "Online School");

        ArrayList<School> obj = new ArrayList<>(List.of(new School("Decagon Software Institution", 80, "Edo Tech Park"),
                new School("Andela", "Lagos"),
                new School("Pural Sight", 50, "Online School")));

        ArrayList<School> schools = new ArrayList<>();
//        schools.add(decagon);
//        schools.add(andela);
//        schools.add(puralSight);
        for (int i = 0; i < obj.size(); i++){
           schools.add(obj.get(i));
        }
        System.out.println(School.getAverage(schools));
    }
}
