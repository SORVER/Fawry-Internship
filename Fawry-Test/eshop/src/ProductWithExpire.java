import java.time.LocalDate;

public class ProductWithExpire extends Product{

    LocalDate expireDate;
    public  ProductWithExpire(String name, double price, int quantity,double weight,boolean shipIt, LocalDate expireDate){
        super(name, price, quantity, weight , shipIt);
        this.expireDate=expireDate;
    }

}
