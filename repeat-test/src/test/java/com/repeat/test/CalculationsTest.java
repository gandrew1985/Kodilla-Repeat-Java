package com.repeat.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CalculationsTest {

    private Map<Student, Grades> prepareData() {
        Map<Student, Grades> entries = new HashMap<>();
        List<Integer> example1 = Arrays.asList(); //15
        List<Integer> example2 = Arrays.asList(); //22
        List<Integer> example3 = Arrays.asList(); //26

        entries.put(new Student("Jan", "Kowalski"), new Grades(example1, example2, example3));//63
        entries.put(new Student("Magda", "Nowak", "EN"),
                new Grades(example3, example3, example1)); //67
        entries.put(new Student("Kamila", "Los", "PL"),
                new Grades(example2, example2, example3)); //70
        return entries;
    }

    @Test
    public void testCalculateBestAverage() {
        //Given
        Calculations calculations = new Calculations();
        Map<Student, Grades> entries = prepareData();
        //When
        System.out.println(entries);
        double result = calculations.calculateBestAverage(entries);
        //System.out.println(result);
        //Then
        assertEquals(4.117, result, 0.001);
    }

    @Test
    public void testFindStudentNameWithBestAverage() {
        //Given
        Calculations calculations = new Calculations();
        Map<Student, Grades> entries = prepareData();
        //When
        List<String> studentsNameWithBestAverage = calculations.findStudentNameWithBestAverage(entries);

        //Then
        System.out.println(entries);
        System.out.println(studentsNameWithBestAverage);
        assertEquals(1, studentsNameWithBestAverage.size());
        assertEquals("Kamila Los", studentsNameWithBestAverage.get(0));
    }

    @Test
    public void testFindStudentWhoSpeaksPolishWithMathsAverage4() {
        //Given
        Calculations calculations = new Calculations();
        Map<Student, Grades> entries = prepareData();
        //When
        List<Student> result = calculations.findStudentsWhoSpeaksPolishWithAverageFromMathsAbove4(entries);
        //Then
        assertEquals(1, result.size());
        assertEquals("Los", result.get(0).getLastName());
    }
}