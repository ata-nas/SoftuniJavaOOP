package softuni.oop.solid.lab.p03_LiskovSubstitution.p01_Square;

public class Square implements Quadrilateral {
    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
