package softuni.oop.workingwithabstraction.lab.hotelreservation;

public enum Discount {
    VIP(0.80),
    SECOND_VISIT(0.90),
    NONE(1);
    private final double discountFactor;

    Discount(double discountFactor) {
        this.discountFactor = discountFactor;
    }

    public double getDiscountFactor() {
        return discountFactor;
    }

    public static Discount parseDiscount(String token) {
        switch (token) {
            case "VIP":
                return Discount.VIP;
            case "SecondVisit":
                return Discount.SECOND_VISIT;
            case "None":
                return Discount.NONE;
            default:
                throw new IllegalArgumentException("No such constant defined in this enum: " + token);
        }
    }
}
