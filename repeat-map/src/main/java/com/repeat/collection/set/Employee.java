package com.repeat.collection.set;

import java.time.LocalDate;

public class Employee {

    String firstName;
    String lastName;
    LocalDate birthDate;

    public Employee(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return (firstName).equals(e.firstName) &&
                (lastName).equals(e.lastName) &&
                (birthDate).equals(e.birthDate);
    }

    public int hashcode() {
        return birthDate.getYear() * 100 + birthDate.getMonthValue();
    }

    public String toString() {
        return firstName + " " + lastName + " born: " + birthDate;
    }
}
