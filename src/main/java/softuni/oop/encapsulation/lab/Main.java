package softuni.oop.encapsulation.lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(reader.readLine());
//
//        List<Person> people = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] input = reader.readLine().split(" ");
//            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
//        }
//
//        Collections.sort(people, (firstPerson, secondPerson) -> {
//            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
//
//            if (sComp != 0) {
//                return sComp;
//            } else {
//                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
//            }
//        });
//
//        for (Person person : people) {
//            System.out.println(person.toString());
//        }
//
//
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            Optional<Person> optionalPerson = Optional.empty();

            try {
                optionalPerson = Optional.of(new Person(
                        input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]))
                );
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }

            optionalPerson.ifPresent(people::add);
        }

//        double bonus = Double.parseDouble(reader.readLine());

        Team team = new Team("Black Eagles");

        for (Person person : people) {
            team.addPlayer(person);
        }


        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reverse team have " + team.getReserveTeam().size() + " players");
    }
}
