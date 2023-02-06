package softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape;

import softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;

public class ConsoleRenderer implements Renderer {
    @Override
    public void render(Shape shape) {
        System.out.println("Rendering shape with area: " + shape.getArea());
    }
}
