package softuni.oop.interfacesandabstraction.bordercontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Identifiable> entities = new ArrayList<>();

        while (true) {
            String command = sc.nextLine();

            if (command.equals("End")) {
                break;
            }

            String[] constructorArgs = command.split("\\s+");

            if (constructorArgs.length == 2) {
                entities.add(new Robot(
                        constructorArgs[1],
                        constructorArgs[0]
                ));
            } else if (constructorArgs.length == 3) {
                entities.add(new Citizen(
                        constructorArgs[0],
                        Integer.parseInt(constructorArgs[1]),
                        constructorArgs[2]
                ));
            }
        }

        String suffix = sc.nextLine();

        entities.stream()
                .map(Identifiable::getId)
                .filter(id -> id.endsWith(suffix))
                .forEach(System.out::println);
    }
}
