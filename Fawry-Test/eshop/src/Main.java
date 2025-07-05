import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        Product tv = new Product("tv", 2000d,20, 20.3, true);
        Product scratchCard = new Product("ScratchCard", 20d,20, 0, false);
        ProductWithExpire cheese = new ProductWithExpire("cheese", 2000d,20, 40.3, true, LocalDate.of(2025,03,21));
        Cart cart1 = new Cart();
        cart1.addItem(tv,1);
        cart1.addItem(cheese,1);
        cart1.addItem(scratchCard, 3);

        Customer abdo = new Customer("abdelsalam",400000d);

        checkout(abdo, cart1);

    }
    public static void checkout(Customer customer, Cart cart){
        Payment payment = new Payment(customer, cart);
        payment.printCheckOutNotice(cart.getCartItems());
        payment.printCheckOutReceipt(cart.getCartItems());
        payment.payCheckOut();

    }
}