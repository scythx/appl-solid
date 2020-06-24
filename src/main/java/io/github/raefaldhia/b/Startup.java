package io.github.raefaldhia.b;

import io.github.raefaldhia.b.models.Circle;
import io.github.raefaldhia.b.models.GraphicEditor;
import io.github.raefaldhia.b.models.Rectangle;
import io.github.raefaldhia.b.models.Square;

public class Startup {
    public static void main(final String[] args) {
        final GraphicEditor
        editor = new GraphicEditor();
        editor.DrawShape(new Circle());
        editor.DrawShape(new Rectangle());
        editor.DrawShape(new Square());
    }
}