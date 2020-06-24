package io.github.raefaldhia.d.models;

import io.github.raefaldhia.d.interfaces.IRechargeable;

public class Robot extends Worker implements IRechargeable {
    private final int
    capacity;
    
    private int
    currentPower;

    public Robot(final String id, final int capacity) {
        super(id);
        this.capacity = capacity;
    }

    public int getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(final int currentPower) {
        this.currentPower = currentPower;
    }

    @Override
    public void work(final Integer hours) {
        super.work((hours > this.currentPower) ? hours
                                               : this.currentPower);

        this.currentPower -= hours;
    }

    @Override
    public void recharge() {
        this.currentPower = this.capacity;
    }
}