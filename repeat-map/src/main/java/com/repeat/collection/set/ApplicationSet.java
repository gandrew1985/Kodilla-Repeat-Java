package com.repeat.collection.set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class ApplicationSet {

    public static void main(String[] args) {

        Employee worker1 = new Employee("Steven", "Newmack", LocalDate.of(1987, 6, 30));
        Employee worker2 = new Employee("Jennifer", "Nowak", LocalDate.of(1988, 2, 28));
        Employee worker3 = new Employee("Robert", "Greenfield", LocalDate.of(1987, 6, 15));
        Employee worker4 = new Employee("Monica", "Smith", LocalDate.of(1984, 10, 18));
        Employee worker5 = new Employee("Stephanie", "Jackson", LocalDate.of(1985, 4, 3));

        Set<Employee> workersSet = new HashSet<>();

        workersSet.add(worker1);
        workersSet.add(worker2);
        workersSet.add(worker3);
        workersSet.add(worker4);
        workersSet.add(worker5);

        Iterator<Employee> employeeIterator = workersSet.iterator();
        while (employeeIterator.hasNext()) {
            Employee currentWorker = employeeIterator.next();
            System.out.println(currentWorker);
        }
    }
}
