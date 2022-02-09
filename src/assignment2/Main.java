package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        Table woodenTable = new Table("green", 13, 44);
        Table metalTable = new Table("ash", 55, 23);
        Table plasticTable = new Table("yellow", 59, 33);

        ArrayList<Table> tables = new ArrayList<>();
        tables.add(woodenTable);
        tables.add(metalTable);
        tables.add(plasticTable);

        StudyRoom roomOne = new StudyRoom("pink", "square", 8, 9);
        StudyRoom roomTwo = new StudyRoom("blue", "triangle", 33, 98);

        ArrayList<StudyRoom> studyRooms = new ArrayList<>();

        studyRooms.add(roomOne);
        studyRooms.add(roomTwo);

        System.out.println(roomOne.color);

    }

//
//    studyRooms.add(roomOne);
}
