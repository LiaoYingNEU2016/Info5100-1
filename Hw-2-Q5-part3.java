
/**
 * Created by starhaotian on 20/09/2017.
 */

/*

5. Write a java class called customer (Add detail as needed) :
  i. Create Attributes: customer name and which pizzas customer has ordered.
    ii. Think about what kind of data structure can be used to record the pizza name and number of each kind of pizza.( Give me your thought, Extra credit of 1 point)
      iii. In main method , sum up how much money the customer spent.
*/

public class Hw_2_Q5 {

    public static void main(String[] args){

        pizza beef_p = new pizza("beef", 20);
        pizza pork_p = new pizza("beef", 28.5);
        customer peter = new customer("peter");
        int peter_o1 =peter.order(pork_p.pizza_name, 4);
        int peter_o2 =peter.order(beef_p.pizza_name, 2);//peter input his order information
        double sum = peter_o1 * pork_p.pizza_price + peter_o2 * beef_p.pizza_price;
        System.out.println(sum);




    }


}

class customer{

    String name;
    double sum;


    public customer(String name1){
        this.name = name1;
    }

    public int order(String pizza_name, int pizza_quantity){
     return pizza_quantity;
    }

}

class pizza{
    String pizza_name;
    double pizza_price;
    int pizza_quantity;

    public pizza(String name, double price){
        this.pizza_name = name;
        this.pizza_price = price;
    }
}


