package ESC;

/**
 * Represents a customer and their actions.
 */
public class Customer {
    private String customerId, name, email, password;

    public Customer(String customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void register() {
        System.out.println("Account created for " + name);
    }

    public void login() {
        System.out.println("Customer " + email + " logged in.");
    }

    public void viewProducts() {
        System.out.println(name + " is viewing products...");
    }

    /** Adds products to their cart with a specific quantity. */
    public void addToCart(Product product, int quantity, ShoppingCart cart) {
        if (product.checkAvailability()) {
            cart.addProduct(product, quantity);
        }
    }

    public void checkout() {
        System.out.println("Checkout complete for " + name + ".");
    }
}