package com.repeat.collection.map;

import java.util.ArrayList;
import java.util.List;

public class SubjectMark {

    private List<Double> grades = new ArrayList<>();

    public SubjectMark(double... marks) {
        for(int i =0; i < marks.length; i++ ) {
            grades.add(marks[i]);
        }
    }

    public double getAverage() {
        double sum = 0;

        for(Double mark : grades) {
            sum += mark;
        }
        return sum/grades.size();
    }

    @Override
    public String toString() {
        return grades.toString();
    }
}
