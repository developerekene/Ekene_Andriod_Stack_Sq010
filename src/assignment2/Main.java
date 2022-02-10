package assignment2;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//        Table woodenTable = new Table("green", 13, 44);
//        Table metalTable = new Table("ash", 55, 23);
//        Table plasticTable = new Table("yellow", 59, 33);
//
//        ArrayList<Table> tables = new ArrayList<>();
//        tables.add(woodenTable);
//        tables.add(metalTable);
//        tables.add(plasticTable);
//
//        StudyRoom roomOne = new StudyRoom("pink", "square", 8, 9);
//        StudyRoom roomTwo = new StudyRoom("blue", "triangle", 33, 98);
//
//        ArrayList<StudyRoom> studyRooms = new ArrayList<>();
//
//        studyRooms.add(roomOne);
//        studyRooms.add(roomTwo);
//
//        System.out.println(roomOne.color);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number of Tables");

        int numberInt = scanner.nextInt();

        ArrayList<Table> tables = new ArrayList<>();
        ArrayList<StudyRoom> studyRooms = new ArrayList<>();

        for(int i = 0; i < numberInt; i++){
            System.out.println("Please input the color for #" + i + 1);
            String color = scanner.next();

            System.out.println("Please input the width for #" + i + 1);
            int width = scanner.nextInt();

            System.out.println("Please input the height for #" + i + 1);
            int height = scanner.nextInt();

            Table table = new Table(color, width, height);
            tables.add(table);
        }

        for(int i = 0; i < tables.size(); i++){
            System.out.println(tables.get(i).colour);
        }

        System.out.println("Please input a number of Study Rooms");
        int numberIntTwo = scanner.nextInt();

        for(int i = 0; i < numberIntTwo; i++){
            System.out.println("Please input the color for #" + i + 1);
            String color = scanner.next();

            System.out.println("Please input the shape for #" + i + 1);
            String shape = scanner.next();

            System.out.println("Please input the length for #" + i + 1);
            int length = scanner.nextInt();

            System.out.println("Please input the width for #" + i + 1);
            int width = scanner.nextInt();

            StudyRoom studyRoom = new StudyRoom(tables, color, shape, length, width,);
            studyRooms.add(studyRoom);
        }

        for(int i = 0; i < studyRooms.size(); i++){
            System.out.println(studyRooms.get(i).tables.get(i).height);
        }

    }
}
