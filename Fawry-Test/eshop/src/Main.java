import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void checkout(Customer customer, Cart cart){

    }
    public static void main(String[] args) {

        Product tv = new Product("tv", 2000d,20, 20.3, true);
        ProductWithExpire cheese = new ProductWithExpire("cheese", 2000d,20, 40.3, true, LocalDate.of(2025,03,21));
        Cart cart1 = new Cart();
        cart1.addItem(tv,1);
        cart1.addItem(cheese,3);

        Customer abdo = new Customer("abdelsalam",400d);

        checkcout(abdo, cart1);

    }
}