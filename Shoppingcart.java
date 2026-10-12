import java.util.Scanner;
import java.util.ArrayList;


public class Shoppingcart {


// add PRODUCT method
    public void addProduct() {
    
        Scanner scanner = new Scanner(System.in);


        int id = scanner.nextInt();
        String name = scanner.next();
        Double price = scanner.nextDouble();
        String category = scanner.next();
        int stock = scanner.nextInt();

        int quantity = scanner.nextInt();

        Product product = new Product(id, name, price, category, stock);


        CartItem.item.add(new CartItem(product, quantity));
        
    }
} 

