package softuni.oop.workingwithabstraction.lab.hotelreservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private final double multiplierFactor;
    Season(int multiplierFactor) {
        this.multiplierFactor = multiplierFactor;
    }

    public double getMultiplierFactor() {
        return multiplierFactor;
    }

    public static Season parseSeason(String token) {
        return Season.valueOf(token.toUpperCase());
    }
}
