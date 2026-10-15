import java.util.Scanner;

public class Checkout {
    int id;
    double balance;

    public Checkout (int id, double balance) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Do you want to checkout? Y/N");
        String input = scanner.next();
        if (input.equals("Y")) {
            System.out.println("Enter customer's id: ");
            int input1 = scanner.nextInt();
            if (Customer.id == input1 && Customer.balance >= Product.price) {
                System.out.println("Product ordered successfully! ");

            }

        }

        scanner.close();
    }
}

