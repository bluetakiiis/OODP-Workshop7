package ESC;

public class EcommerceApp {
    public static void main(String[] args) {
        Customer user = new Customer("C001", "Alice Smith", "alice@example.com", "pass123");
        Product phone = new Product("P10", "Smartphone", 499.99, 10);
        Product headphones = new Product("P20", "Headphones", 89.50, 0);
        ShoppingCart myCart = new ShoppingCart();

        user.register();
        user.login();
        
        user.addToCart(phone, 2, myCart); 
        user.addToCart(headphones, 1, myCart);

        myCart.viewCartItems();
        user.checkout();
    }
}