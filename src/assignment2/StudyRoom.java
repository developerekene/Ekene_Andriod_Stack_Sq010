package assignment2;

import java.util.ArrayList;

public class StudyRoom {
    ArrayList<Table> tables;
    String color;
    String shape;
    int length;
    int width;

    public StudyRoom(String color, String shape, int length, int width){
        this.color = color;
        this.shape = shape;
        this.length = length;
        this.width = width;
    }
}
