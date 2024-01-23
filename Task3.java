import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Product product1 = new Product("a", 20.0, 1);
        Product product2 = new Product("b" , 13, 2);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1, 2);
        cart.addItem(product2, 1);

        // User user1 = new User("harish", "pass123");
        // if (user1.login("harish", "pass123")) {
        //     System.out.println("Login successful!");
        // } else {
        //     System.out.println("Invalid username or password");

        // }
        User user1 = new User("harish", "pass123");
        if (user1.login("Harish", "pass123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password");

        }

        cart.RemoveItem(product2);
        cart.RemoveItem(product2);



    }

    
}
class Product{
    private String name;
    private double price;
    private int StockQuantity;

    public Product(String name , double price, int StockQuantity){
        this.name = name;
        this.price  = price;
        this.StockQuantity = StockQuantity;
    }

    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }

    public int getStockQuantity(){
        return StockQuantity;
    }


}

class ShoppingCart{
    private HashMap<Product,Integer> items;

    public ShoppingCart(){
        this.items = new HashMap<>();
    }


    public void addItem(Product product, int quantity){
        items.put(product, quantity);

    }

    public void RemoveItem(Product product){
        if(items.containsKey(product)){
            items.remove(product);
        }
        else{
            System.out.println("No such product in kart");
        }

    }

}

class User{
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;

    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public boolean login (String username, String password){
        return this.username.equals(username) && this.password.equals(password);
    }

}