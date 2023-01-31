package softuni.oop.workingwithabstraction.lab.pointinrectangle;

public class Point {
    final private int x;
    final private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getCoordinate() {
        return new int[]{x, y};
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


