import java.util.HashMap;
import java.util.Map;

public class Cart {
    // it counts the number of the selected items
    private Map<Product,Integer> cart;

    public Cart(){
        cart = new HashMap<>();
    }

    public void addItem(Product item, int quantity){

            if(quantity > item.getQuantity()){
                System.out.println("Our " +item.getName()+ " Storage is lower than the needed quantity");
            }else {
                item.setQuantity( item.getQuantity() - quantity);
                if(cart.containsKey(item)){
                    cart.put(item,cart.get(item) + quantity);
                }else {
                    cart.put(item, quantity);
                }



            }

    }

    public void RemoveItem(Product item, int quantity){

        if(quantity > cart.get(item)){
            System.out.println("your cart " +item.getName()+ " Storage is lower than the needed quantity to remove.");
        }else {
            item.setQuantity( item.getQuantity() + quantity);
            if(cart.containsKey(item)){
                cart.put(item,cart.get(item) - quantity);
            }



        }

    }
    public Map<Product, Integer > getCartItems(){
        return cart;
    }




}
