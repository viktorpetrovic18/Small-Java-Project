import java.util.ArrayList;

public class CartItem {

   static ArrayList<CartItem> item = new ArrayList<>();
    Product product;
    int quantity;

    public CartItem(Product product, int quantity) {
        if (quantity > 0 && quantity <= product.stock) {
            this.product = product;
            this.quantity = quantity;

        

            System.out.println("|Item added to cart |");
        }
    } 

    public CartItem getItem() {
        return this;
    }       


}
    
    

