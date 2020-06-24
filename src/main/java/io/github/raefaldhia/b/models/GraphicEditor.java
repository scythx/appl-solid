package io.github.raefaldhia.b.models;

import io.github.raefaldhia.b.interfaces.IShape;

public class GraphicEditor {
    public void DrawShape(final IShape shape) {
        shape.draw();
    }
}