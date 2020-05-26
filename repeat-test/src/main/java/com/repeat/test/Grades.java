package com.repeat.test;

import java.util.ArrayList;
import java.util.List;

public class Grades {

    private List<Integer> maths = new ArrayList<>();
    private List<Integer> english = new ArrayList<>();
    private List<Integer> polish = new ArrayList<>();

    public Grades(List<Integer> maths, List<Integer> english, List<Integer> polish) {
        this.maths = maths;
        this.english = english;
        this.polish = polish;
    }



    public Grades() {}

    public List<Integer> addLists() {
        List<Integer> allSubject = new ArrayList<>();
        allSubject.addAll(maths);
        allSubject.addAll(english);
        allSubject.addAll(polish);

        return allSubject;
    }

    public double calculateAverage(List<Integer> subject) {
        double avg = 0.0;
        double sum = 0;
        if(subject.size() >= 1) {
            for (Integer mark : subject) {
                sum += mark;
            }
            avg = sum / subject.size();
        } else {
            avg =0.0;
        }
        return avg;
    }

    public List<Integer> getMaths() {
        return maths;
    }

    public List<Integer> getEnglish() {
        return english;
    }

    public List<Integer> getPolish() {
        return polish;
    }

    public void setMaths(List<Integer> maths) {
        this.maths = maths;
    }

    public void setEnglish(List<Integer> english) {
        this.english = english;
    }

    public void setPolish(List<Integer> polish) {
        this.polish = polish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grades grades = (Grades) o;

        if (maths != null ? !maths.equals(grades.maths) : grades.maths != null) return false;
        if (english != null ? !english.equals(grades.english) : grades.english != null) return false;
        return polish != null ? polish.equals(grades.polish) : grades.polish == null;
    }

    @Override
    public int hashCode() {
        int result = maths != null ? maths.hashCode() : 0;
        result = 31 * result + (english != null ? english.hashCode() : 0);
        result = 31 * result + (polish != null ? polish.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "maths=" + maths +
                ", english=" + english +
                ", polish=" + polish +
                '}';
    }
}
