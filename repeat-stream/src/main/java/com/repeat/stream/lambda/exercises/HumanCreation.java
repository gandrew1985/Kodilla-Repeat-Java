package com.repeat.stream.lambda.exercises;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class HumanCreation {
    public static void main (String[] args) {
        BiFunction<Integer, String,Human> humanCreator = Human::new;
        Human andrzej = humanCreator.apply(12, "andrzej");
        System.out.println(andrzej.getAge());
        System.out.println(andrzej.getName());
    }
}
