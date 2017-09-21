import java.lang.reflect.Type;

/**
 * Created by starhaotian on 20/09/2017.
 */


 /*
    4. Write a java class called pizza with (Add detail as needed) :
              i. Create at least 3 attributes :pizza type , unit price and loyalty points. More attributes are welcome to have.
              ii. Create constructors . Extra-credit of 0.5 point if you write more than 1 right constructor to this class
     */


public class Hw_2_Q4 {

    private String type; // set private so that it could not be modified from outside
    private double unit_price;
    private double lo_points;
    private String flavor;
    private int quantity;

    public Hw_2_Q4(String pizza_type, double price, double point, String fla, int qua){

        this.type = pizza_type;
        this.unit_price = price;
        this.lo_points = point;
        this.flavor = fla;
        this.quantity = qua;

    }
    }








