package softuni.oop.polymorphism.animal;

public class Dog extends Animal{
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        StringBuilder out = new StringBuilder(super.explainSelf());

        out.append(System.lineSeparator())
                .append("DJAAF");

        return out.toString();
    }
}
