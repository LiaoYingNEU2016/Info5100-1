package assignment5;

/**
 * Created by starhaotian on 13/10/2017.
 */
public class Sundae extends IceCream{
    String sundae_name;
    int topping;
    public Sundae(String name, int price, String sundae_name, int topping ){
        super(name, price);
        this.sundae_name = sundae_name;
        this.topping = topping;
    }

    @Override
    public int getCost(){
        return super.getCost() + topping;
    }

    public String toString(){
        return sundae_name+" Sundae with\n" + super.toString();
    }


}
