package assignment5;

/**
 * Created by starhaotian on 13/10/2017.
 */
public class IceCream extends DessertItem{

    private int IceCream_price;

    public IceCream(String name, int price){
        super(name);
        IceCream_price = price;
    }
    public int getCost(){
        return IceCream_price;
    }
}
