package io.github.raefaldhia.d.models;

public class Worker {
    private final String
    id;
    
    private Integer
    workingHours;

    public Worker(final String id) {
        this.id = id;
        this.workingHours = 0;
    }

    public void work(final Integer hours) {
        this.workingHours += hours;
    }
}