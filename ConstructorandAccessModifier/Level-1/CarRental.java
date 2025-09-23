public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    final double dailyRates = 50.0;

    CarRental(String customerName, String carModel, int rentalDays)
    {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    CarRental()
    {
        this("unknown", "unknown", 0);
    }

    public double calculateTotalCost()
    {
        return rentalDays*dailyRates;
    }
}
