package com.repeat.stream.lambda.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main (String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4);
        //Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(System.out :: println); //odwolanie sie bezposrednio do metody
    }
}
