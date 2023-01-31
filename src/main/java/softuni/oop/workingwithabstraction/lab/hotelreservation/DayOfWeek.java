package softuni.oop.workingwithabstraction.lab.hotelreservation;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayNumber;
    DayOfWeek(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public static int getDifference(DayOfWeek d1, DayOfWeek d2) {
        return Math.abs(d1.dayNumber - d2.dayNumber);
    }
}
