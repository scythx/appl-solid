package io.github.raefaldhia.d.models;

import io.github.raefaldhia.d.interfaces.ISleeper;

public class Employee extends Worker implements ISleeper {
    public Employee(final String id) {
        super(id);
    }

    @Override
    public void sleep() {
        // sleep...
    }
}