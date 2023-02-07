package softuni.oop.exceptionsanderrorhandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03EnterNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = 1;
        int end = 100;

        List<Integer> inRange = new ArrayList<>();

        while (inRange.size() < 10) {
            try {
                start = readNumber(start, end, sc);
                inRange.add(start);
            } catch (NumberFormatException ignored) {
                System.out.println("Invalid Number!");
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(inRange.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }

    private static int readNumber(int start, int end, Scanner sc) {
        int number = Integer.parseInt(sc.nextLine());

        if (start >= number || number >= end) {
            throw new IllegalStateException(String.format("Your number is not in range %d - 100!", start));
        }

        return number;
    }
}
