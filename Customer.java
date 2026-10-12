
public class Customer {
    int id;
    String name;
    String email;
    double balance;
    
    // evaluating products information
    public Customer (int id, String name, String email, double balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return id + " |" + name + " |" + email + " |" + "$" + balance + " |";
    }

    
}

