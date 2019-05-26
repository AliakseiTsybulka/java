package com.class21;
public class Students {
    String studentName;
    int studentID;
    static int numberOfStudents;
    public static void main(String[] args) {
        Students obj = new Students();
        Students obj1 = new Students();
        Students obj2 = new Students();
        obj.studentName = "Adam";
        obj.studentID = 0001;
        numberOfStudents++;
        obj1.studentName = "Frank";
        obj1.studentID = 0002;
        numberOfStudents++;
        obj2.studentName = "Boris";
        obj2.studentID = 0003;
        numberOfStudents++;
        System.out.println("The total number of sutdents: "+numberOfStudents);
    }
}