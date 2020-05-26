package com.repeat.stream.lambda.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 4 lancuchy oddzielajac je znakiem spacji: ");
        List<String> strings = new ArrayList<>();

        for (int n = 0; n < 4; n++) {
            strings.add(scanner.nextLine());
        }
        System.out.println(strings);
        strings.sort((a,b) -> b.length() - a.length());
        System.out.println(strings);
        strings.sort((a,b) -> a.length() - b.length());
        System.out.println(strings);
    }
}
