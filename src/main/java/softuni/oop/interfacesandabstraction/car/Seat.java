package softuni.oop.interfacesandabstraction.car;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model,
                String color,
                Integer horsePower,
                String countryProduced,
                Double price
    ) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }


    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder(super.toString());

        out.append(System.lineSeparator())
                .append(getModel())
                .append(" sells for ")
                .append(String.format("%f", price));

        return out.toString();
    }
}
