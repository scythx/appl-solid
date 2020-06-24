package io.github.raefaldhia.b.models;

import io.github.raefaldhia.b.interfaces.IShape;

public class Circle implements IShape {
    @Override
    public String draw() {
        return "I'm Circle";
    }
}