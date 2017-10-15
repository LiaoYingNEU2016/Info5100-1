package assignment5;

/**
 * Created by starhaotian on 13/10/2017.
 */
public class Cookie extends DessertItem{

    private int Cookie_number;
    private int Cookie_price;

    public Cookie(String name, int number, int price){
        super(name);
        Cookie_number = number;
        Cookie_price = price;

    }
    public int getCost(){
        return (int)(Cookie_number * Cookie_price / 12 + 0.5f);
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append(Cookie_number+ " @ "+Cookie_price+" /dz.\n");
        builder.append(super.toString());
        return builder.toString();
    }
}
