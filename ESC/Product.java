package ESC;

/**
 * Represents a product with price and stock info.
 */
public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getDetails() {
        return "ID: " + productId + " | Name: " + name + " | Price: £" + price;
    }

    public boolean checkAvailability() {
        return stockQuantity > 0;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
}