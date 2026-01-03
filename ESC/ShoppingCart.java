package ESC;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds products and tracks quantities to fulfill assignment requirements.
 */
public class ShoppingCart {
    private Map<Product, Integer> cartItems; 
    private double totalPrice;

    public ShoppingCart() {
        this.cartItems = new HashMap<>();
        this.totalPrice = 0.0;
    }

    /** Adds a product with a specific quantity. */
    public void addProduct(Product product, int quantity) {
        if (product.checkAvailability()) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            calculateTotalPrice();
            System.out.println(quantity + " x " + product.getName() + " added to cart.");
        }
    }

    /** Removes a product entirely from the cart. */
    public void removeProduct(Product product) {
        if (cartItems.containsKey(product)) {
            cartItems.remove(product);
            calculateTotalPrice();
            System.out.println(product.getName() + " removed from cart.");
        }
    }

    /** Calculates total price based on price * quantity. */
    public void calculateTotalPrice() {
        totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
    }

    public void viewCartItems() {
        System.out.println("\nShopping Cart Content");
        cartItems.forEach((product, qty) -> 
            System.out.println(product.getDetails() + " | Quantity: " + qty));
        System.out.println("Total Cart Price: £" + totalPrice);
    }
}