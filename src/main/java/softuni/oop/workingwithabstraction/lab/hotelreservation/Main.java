package softuni.oop.workingwithabstraction.lab.hotelreservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] userArgs = sc.nextLine().split("\\s+");

        double result = PriceCalculator.calcHoliday(
                Double.parseDouble(userArgs[0]),
                Integer.parseInt(userArgs[1]),
                userArgs[2],
                userArgs[3]
        );
        System.out.printf("%.02f", result);
    }
}
