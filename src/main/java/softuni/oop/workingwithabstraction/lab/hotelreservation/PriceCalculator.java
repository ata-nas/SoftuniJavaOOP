package softuni.oop.workingwithabstraction.lab.hotelreservation;

public class PriceCalculator {
    public static double calcHoliday(double pricePerDay,
                                             int durationDays,
                                             String seasonStr,
                                             String discountStr) {
        Season season = Season.parseSeason(seasonStr);
        Discount discount = Discount.parseDiscount(discountStr);
        return pricePerDay
                * durationDays
                * season.getMultiplierFactor()
                * discount.getDiscountFactor();
    }
}
