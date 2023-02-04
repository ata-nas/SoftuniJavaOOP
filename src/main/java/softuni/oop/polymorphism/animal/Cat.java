package softuni.oop.polymorphism.animal;

public class Cat extends Animal {
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        StringBuilder out = new StringBuilder(super.explainSelf());

        out.append(System.lineSeparator())
                .append("MEEOW");

        return out.toString();
    }
}
