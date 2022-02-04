package movie;

import java.util.ArrayList;

class School {
    String nameOfSchool;
    int numberOfStudents;
    String address;

    public School(String nameOfSchool, int numberOfStudents, String address) {
        this.nameOfSchool = nameOfSchool;
        this.numberOfStudents = numberOfStudents;
        this.address = address;
    }

    public School (String nameOfSchool, String address) {
        this.nameOfSchool = nameOfSchool;
        this.address = address;
        this.numberOfStudents = 100;
    }

    public static ArrayList<String> getAverage (ArrayList<School> arr) {
        ArrayList<String> newarr = new ArrayList<String>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).numberOfStudents > 50) {
                newarr.add(arr.get(i).nameOfSchool);
            }
        }

        return newarr;
    }
}