package Hw_5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by starhaotian on 13/10/2017.
 */
public abstract class DessertItem {

    private String name;


    //constructor 1
    public DessertItem(){

    }
    //constructor2
    public DessertItem(String name){
        if(name.length()<=DessertShoppe.max_size) {
            this.name = name;
        }
    }

    public String toString() {
        StringBuilder builder=new StringBuilder();
        int pad=DessertShoppe.width-name.length();
        builder.append(name);
        builder.append(String.format("%"+pad+"s", DessertShoppe.cents2dollarsAndCentsmethod(getCost())));
        return builder.toString();
    }

    public final String getName(){
        return this.name;
    }

    public abstract int getCost();
}










