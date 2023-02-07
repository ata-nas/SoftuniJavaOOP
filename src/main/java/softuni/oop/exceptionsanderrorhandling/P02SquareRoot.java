package softuni.oop.exceptionsanderrorhandling;

import java.util.Scanner;

public class P02SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        try {
            double result = sqrt(input);
            System.out.printf("%.2f%n", result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }

    private static double sqrt(String input) {
        int number = Integer.parseInt(input);

        if (number < 0) {
            throw new IllegalArgumentException("Negative number: " + number);
        }

        return Math.sqrt(number);
    }
}
