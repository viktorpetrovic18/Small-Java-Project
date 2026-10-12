public class Product {
    int id;
    String name;
    Double price;
    String category;
    int stock;

    // declaring parameters for product
    public Product (int id, String name, Double price, String category, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    
        @Override
        public String toString() {
            return id + " | " + name + " | $" + price + " | "

                + category + " | " + stock;
    

        }
    public int getId() {
        return id;
    }
    public void reduceStock (int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println("New stock is " + stock);
        } else {
            System.out.println("The desired number is out of reach");

        }

    }
    
}

