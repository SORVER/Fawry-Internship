import java.security.PublicKey;
import java.util.Map;

public class Payment {
    Customer customer;
    Cart cart;
    public static double calcCheckout(Map<Product, Integer> items){
        double checkOutSum = 0.0d;
        double fixedShipment = 40d;
     for(Map.Entry<Product, Integer> entry : items.entrySet()){
         Product product = entry.getKey();
         int quantity = entry.getValue();
         checkOutSum += product.getPrice()*quantity;

     }
     return checkOutSum +fixedShipment;
    }
    public Payment(Customer customer,Cart cart){

       this.cart = cart;
       this.customer = customer;

    }

    public void payCheckOut(){
        double finalCheckOut = calcCheckout(cart.getCartItems());
        if(customer.makePayment(finalCheckOut)){
                System.out.println("Transaction is Done!");
        }else {
                System.out.println("Customer does not have enough balance!");

        }
    }
    public void printCheckOut(){
        System.out.println("** Shipment notice **");


    }
}
