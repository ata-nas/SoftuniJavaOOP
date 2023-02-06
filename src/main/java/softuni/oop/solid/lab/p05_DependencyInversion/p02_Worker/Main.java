package softuni.oop.solid.lab.p05_DependencyInversion.p02_Worker;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager(new Worker());
    }
}
