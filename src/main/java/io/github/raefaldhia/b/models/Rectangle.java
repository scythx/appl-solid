package io.github.raefaldhia.b.models;

import io.github.raefaldhia.b.interfaces.IShape;

public class Rectangle implements IShape {
    @Override
    public String draw() {
        return "I'm Rectangle";
    }
}