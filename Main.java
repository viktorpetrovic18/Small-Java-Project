import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
    boolean running = true;
    while (running) {
        System.out.println("Shopping Cart Simulator");
        System.out.print("1. Add product 2. Reduce Stock 3. Create Customers array");
        int input2 = scanner.nextInt();

        if (input2 == 1) {
             System.out.println("Enter product id: ");
            int id = scanner.nextInt();
            System.out.println("Enter product name: ");
            String name = scanner.next();
            System.out.println("Enter product price: ");
            double price = scanner.nextDouble();
            System.out.println("Enter product category: ");
            String category = scanner.next();
            System.out.println("Enter product stock: ");
            int stock = scanner.nextInt();

            Product product = new Product(id, name, price, category, stock);
            products.add(product);
    
        } else if (input2 == 2) {
                System.out.println("Enter the id of the product: ");
                int searchId = scanner.nextInt();
                System.out.println("How much do you want to reduce the stock by? ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                // Find the product with that id
                Product found = null;
                for (Product p : products) {
                    if (p.getId() == searchId) {
                        found = p;
                        break;
                    }
                }

                if (found == null) {
                    System.out.println("Product not found.");
                } else {
                    found.reduceStock(amount);
                    System.out.println("Stock reduced.");
                }

            } else if (input2 == 3) {
                System.out.println("Enter customer id: ");
                int customerId = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter customer name: ");
                String customerName = scanner.nextLine();
                System.out.println("Enter customer email: ");
                String customerEmail = scanner.nextLine();
                System.out.println("Enter customer balance: ");
                double customerBalance = scanner.nextDouble();
                scanner.nextLine();

                customers.add(new Customer(customerId, customerName, customerEmail, customerBalance));

            } else if (input2 == 4) {
                running = false;
            }
        }

        System.out.println(products);
        scanner.close();
    }
}