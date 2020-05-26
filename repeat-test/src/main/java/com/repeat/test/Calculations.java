package com.repeat.test;

import java.util.*;

public class Calculations {

    private Grades grades = new Grades();

    public double calculateBestAverage(Map<Student, Grades> scores) {
        double bestAverage = 0;
        List<Double> averageList = new ArrayList<>();

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            if (entry.getValue() != null) {
                List<Integer> resultList = entry.getValue().addLists();
                double avg = grades.calculateAverage(resultList);
                System.out.println(avg);
                averageList.add(avg);
                bestAverage = Collections.max(averageList);
                System.out.println(resultList);
            }
        }
        return bestAverage;
    }

    public List<String> findStudentNameWithBestAverage(Map<Student, Grades> scores) {
        List<String> bestStudents = new ArrayList<>();
        Map<Student, Double> avgMap = new HashMap<>();

        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            double avg = entry.getValue().calculateAverage(entry.getValue().addLists());
            avgMap.put(entry.getKey(), avg);
        }
        if (avgMap.containsValue(0.0)) {
            return new ArrayList<>();
        } else {
            Student maxSurname = Collections.max(avgMap.entrySet(), Map.Entry.comparingByValue())
                    .getKey();
            String fullName = maxSurname.getFirstName() + " " + maxSurname.getLastName();
            bestStudents.add(fullName);
        }
        System.out.println("best " + bestStudents.size());
        return bestStudents;
    }

    public List<Student> findStudentsWhoSpeaksPolishWithAverageFromMathsAbove4(Map<Student, Grades> scores) {
        List<Student> polishSpeaks = new ArrayList<>();
        for (Map.Entry<Student, Grades> entry : scores.entrySet()) {
            double mathAvg = grades.calculateAverage(entry.getValue().getMaths());
            if (entry.getKey().getLanguage() == "PL" && mathAvg > 4) {
                polishSpeaks.add(entry.getKey());
            }
        }
        return polishSpeaks;
    }
}