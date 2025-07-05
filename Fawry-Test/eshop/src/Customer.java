public class Customer {
    private String name;
    private double balance;
    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean makePayment(double payment){
        if(this.balance>= payment ){
            this.balance -= payment;
            return true;
        }else {
            return false;
        }
    }

}
