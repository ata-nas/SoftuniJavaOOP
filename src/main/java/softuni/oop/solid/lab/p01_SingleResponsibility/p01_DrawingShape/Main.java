package softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape;

import softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;
import softuni.oop.solid.lab.p02_OpenClosedPrinciple.p02_DrawingShape.Circle;
import softuni.oop.solid.lab.p03_LiskovSubstitution.p01_Square.Square;

public class Main {
    public static void main(String[] args) {

        DrawingManager dm = new DrawingManagerImpl(new ConsoleRenderer());

        Shape rect = new Rectangle(4, 5);

        Shape circle = new Circle(5);

        Shape square = new Square(5);

        dm.draw(rect);
        dm.draw(circle);
        dm.draw(square);
    }
}
