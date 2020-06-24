package io.github.raefaldhia.c.models;

public class Employee {
    private final String
    name;

    public Employee(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}