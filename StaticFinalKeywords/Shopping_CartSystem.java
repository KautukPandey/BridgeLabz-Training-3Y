public class Shopping_CartSystem {
    private static double discount = 0.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Shopping_CartSystem(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0.0 && newDiscount <= 100.0) {
            discount = newDiscount;
        }
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public void displayProductDetails() {
        if (this instanceof Shopping_CartSystem) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        }
    }

    public String getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Shopping_CartSystem.updateDiscount(10.0);

        Shopping_CartSystem product1 = new Shopping_CartSystem("P001", "Laptop", 1200.00, 5);
        Shopping_CartSystem product2 = new Shopping_CartSystem("P002", "Smartphone", 800.00, 10);

        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}
