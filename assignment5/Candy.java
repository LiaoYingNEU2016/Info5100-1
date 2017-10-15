package assignment5;

/**
 * Created by starhaotian on 13/10/2017.
 */
public class Candy extends DessertItem{
    private double weight;
    private int price;

    public Candy( String name, double weight, int price){
        super(name);
        this.weight = weight;
        this.price = price;
    }
    public int getCost(){
        return (int)(weight * price + 0.5f);
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append(weight+" lbs. @ "+price+ " /lb.\n");
        builder.append(super.toString());

        return builder.toString();
    }
}
