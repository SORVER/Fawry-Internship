public class Product {
    // Define products with name, price and quantity.

    private String name;
    private double price;
    private int quantity;
    private double weight;
    boolean shipIt = false;


    // constractor
    public Product(String name, double price, int quantity, double weight, boolean shipIt ){
         this.name = name;
         this.price = price;
         this.quantity = quantity;
         this.weight = weight;
         this.shipIt = shipIt;
    }

    // getters and setters
    // getters
    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
