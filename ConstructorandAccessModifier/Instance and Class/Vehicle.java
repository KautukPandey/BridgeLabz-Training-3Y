public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("--------------------");
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        updateRegistrationFee(1500);

        Vehicle v1 = new Vehicle("Rahul", "Car");
        Vehicle v2 = new Vehicle("Sneha", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(2000); 
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
