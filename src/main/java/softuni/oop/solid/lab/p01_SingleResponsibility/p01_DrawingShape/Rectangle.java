package softuni.oop.solid.lab.p01_SingleResponsibility.p01_DrawingShape;

import softuni.oop.solid.lab.p03_LiskovSubstitution.p01_Square.Quadrilateral;

public class Rectangle implements Quadrilateral {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

}
