package softuni.oop.exceptionsanderrorhandling;


import java.util.Optional;
import java.util.Scanner;

public class P01NumberInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] range = sc.nextLine().split("\\s+");

        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        System.out.println("Range: [" + start + "..." + end + "]");

        boolean validInput = false;
        while (!validInput) {
            String nextIn = sc.nextLine();
            Optional<Integer> current = Optional.empty();

            try {
                current = Optional.of(Integer.parseInt(nextIn));
            } catch (NumberFormatException ignored) {
            }

            String out = "Invalid number: " + nextIn;

            if (current.isPresent() && inRange(start, end, current.get())) {
                out = "Valid number: " + current.get();
                validInput = true;
            }

            System.out.println(out);
        }
    }

    private static boolean inRange(int start, int end, int number) {
        return number >= start && number <= end;
    }
}
