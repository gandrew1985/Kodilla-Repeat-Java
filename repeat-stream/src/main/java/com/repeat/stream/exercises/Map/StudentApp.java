package com.repeat.stream.exercises.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentApp {

    public static void main(String[] args) {

        Map<Student, Grades> entries = new HashMap<>();
        List<Integer> example1 = Arrays.asList(2, 3, 4, 5, 1); //15
        List<Integer> example2 = Arrays.asList(2, 5, 5, 5, 5); //22
        List<Integer> example3 = Arrays.asList(2, 3, 4, 5, 5, 5, 2); //26

        entries.put(new Student("Jan", "Kowalski"), new Grades(example1, example2, example3));//63
        entries.put(new Student("Magda", "Nowak", "EN"),
                new Grades(example3, example3, example1)); //67
        entries.put(new Student("Kamila", "Los", "PL"),
                new Grades(example2, example2, example3)); //70

        List<Double> bestStudent = entries.entrySet()
                .stream()
                .map(g -> g.getValue().calculateAverage(g.getValue().addLists()))
                .collect(Collectors.toList());
        //.max(Comparator.comparing(Double::doubleValue))
        //.get();
    }
}
