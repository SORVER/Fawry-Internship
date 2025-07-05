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
    public void printCheckOutNotice(Map<Product, Integer> items){
        System.out.println("** Shipment notice **");
        double countWeight = 0d ;
        for(Map.Entry<Product, Integer> entry : items.entrySet()){

            Product product = entry.getKey();
            int quantity = entry.getValue();
            if(product.isShipIt() == false) continue;
            System.out.println(quantity +"x " +product.getName()+ "    " +product.getWeight());
            countWeight+= product.getWeight();


        }
        System.out.println("Total package weight " +countWeight);
        System.out.println();




    }
    public boolean expireDateChecker(Map<Product, Integer> items){

        for(Map.Entry<Product, Integer> entry : items.entrySet()){
            Product product = entry.getKey();
            int quantity = entry.getValue();
            // TODO: handle expire date test case


        }
        return false;


    }
    public void printCheckOutReceipt(Map<Product, Integer> items){
        System.out.println("** Checkout receipt **");
        double countSubTotal = 0d ;
        for(Map.Entry<Product, Integer> entry : items.entrySet()){
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(quantity +"x " +product.getName()+ "    " +quantity*product.getPrice());
            countSubTotal+= product.getWeight();


        }
        System.out.println("--------------------------");
        System.out.println("Subtotal       " +countSubTotal);
        System.out.println("Shipping          40");
        System.out.println("Amount        " +(40+countSubTotal));




    }
}
