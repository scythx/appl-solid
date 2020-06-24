package io.github.raefaldhia.b.models;

import io.github.raefaldhia.b.interfaces.IShape;

public class Square implements IShape {
    @Override
    public String draw() {
        return "I'm Square";
    }   
}