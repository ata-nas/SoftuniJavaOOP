package softuni.oop.polymorphism.shape;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(3.0, 4.0); // Circle(3.0);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }
}
