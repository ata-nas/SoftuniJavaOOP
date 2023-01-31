package softuni.oop.workingwithabstraction.lab.pointinrectangle;

public class Rectangle {
    final private Point A;
    final private Point B;
    final private Point C;
    final private Point D;

    public Rectangle(Point A, Point C) {
        this.A = A;
        this.B = new Point(C.getX(), A.getY());
        this.C = C;
        this.D = new Point(A.getX(), C.getY());
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public Point getC() {
        return C;
    }

    public Point getD() {
        return D;
    }

    public boolean contains(Point point) {
        return point.getX() >= A.getX() && point.getX() <= C.getX()
                && point.getY() >= A.getY() && point.getY() <= C.getY();
    }
}
