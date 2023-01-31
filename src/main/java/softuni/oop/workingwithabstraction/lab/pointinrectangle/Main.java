package softuni.oop.workingwithabstraction.lab.pointinrectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pointsCoord = getCoord(sc);

        Point A = new Point(pointsCoord[0], pointsCoord[1]);
        Point C = new Point(pointsCoord[2], pointsCoord[3]);

        Rectangle r = new Rectangle(A, C);

        int iterations = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < iterations; i++) {
            int[] compareCoord = getCoord(sc);
            Point pCompare = new Point(compareCoord[0], compareCoord[1]);

            System.out.println(r.contains(pCompare));
        }
    }

    private static int[] getCoord(Scanner sc) {
        return Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
