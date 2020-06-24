package io.github.raefaldhia.c.models;

import java.util.List;

public class DetailsPrinter {
    private final List<Employee>
    employees;

    public DetailsPrinter(final List<Employee> employees) {
        this.employees = employees;
    }

    public void printDetails() {
        employees.forEach(employee -> {
            System.out.println(employee);
        });
    }
}