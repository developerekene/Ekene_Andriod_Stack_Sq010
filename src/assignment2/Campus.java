package assignment2;

import java.util.ArrayList;

public class Campus {
    ArrayList<StudyRoom> studyRooms;

    public Campus(ArrayList<StudyRoom> studyRooms){
        this.studyRooms = studyRooms;
    }

    public void setStudyRooms(ArrayList<StudyRoom> studyRooms) {
        this.studyRooms = studyRooms;
    }

    public ArrayList<StudyRoom> getStudyRoom() {
        return studyRooms;
    }
}
