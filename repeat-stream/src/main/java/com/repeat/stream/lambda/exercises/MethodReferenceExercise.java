package com.repeat.stream.lambda.exercises;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceExercise {

    public static void main(String[] args) {
        Supplier <Object> objectCreator = Object::new;//odwolanie fo konstruktora
        Object objectInstance = objectCreator.get(); // wywolanie konstruktora

        System.out.println(objectInstance);

        BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
        System.out.println(equalsMethodOnClass.test(objectInstance, new Object()));

        Predicate<Object> equalsMethodOnObject = objectInstance::equals;
        System.out.println(equalsMethodOnObject.test(new Object()));

    }
}
