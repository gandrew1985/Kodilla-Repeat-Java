package com.repeat.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main (String[] args) {

        Student student1 = new Student("Edward", "Kowalski", "12345678432");
        Student student2 = new Student("Tom", "Kowalczy", "3456178965");
        Student student3 = new Student("Mike", "Nowak", "23564378654");
        Student student4 = new Student("Antoni", "Koziol", "21345676532");

        SubjectMark marks1 = new SubjectMark(3.0, 4.0, 3.5, 4.5, 3.5, 5.0,5.0);
        SubjectMark marks2 = new SubjectMark(2.0, 3.0, 4.5, 3.5, 2.5, 4.5, 3.0,4.0,3.5,2.5);
        SubjectMark marks3 = new SubjectMark(5.0, 2.0, 3.5, 4.5, 4.5, 2.5, 5.0,2.0);
        SubjectMark marks4 = new SubjectMark(4.0, 5.0, 4.5, 4.5, 4.5, 3.5, 5.0,4.0);

        Map<Student,SubjectMark> studentMarks = new HashMap<>();

        studentMarks.put(student1, marks1);
        studentMarks.put(student2,marks2);
        studentMarks.put(student3,marks3);
        studentMarks.put(student4,marks4);

       for(Map.Entry<Student,SubjectMark> entry : studentMarks.entrySet()) {
           System.out.println("Student: " + entry.getKey() + "Average:" + entry.getValue().getAverage());
        }
    }
}
