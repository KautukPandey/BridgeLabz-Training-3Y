public class Product {
    String productName;
    double price;
    static int totalProducts;

    Product(String productName, double price)
    {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails()
    {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
    }

    public static void displayTotalProducts()
    {
        System.out.println("Total Number of Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Shampoo", 40);
        Product p2 = new Product("Shampoo", 40);
        
        displayTotalProducts();
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
