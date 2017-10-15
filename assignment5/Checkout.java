package Hw_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by starhaotian on 14/10/2017.
 */
public class Checkout {


    private List<DessertItem> list;
    private static final String TAX_TEXT = "Tax";
    private static final String TOTAL_COST_TEXT = "Total Cost";

    public Checkout() {
        this.list = new ArrayList<>();
    }

    public int numberOfItems() {
        //return numbers of Items in the list
        return list.size();
    }

    public void enterItem(DessertItem item) {
        // A dessert item is added to the list
        list.add(item);

    }

    public void clear() {
        list.clear();
    }


    public int totalCost() {
        // return the total cost of items in cents(without tax)
        int total_cost = 0;
        for(DessertItem item : list){
            total_cost += item.getCost();
        }
        return total_cost;
    }

    public int totalTax() {
        return Math.round((int)(totalCost() * DessertShoppe.tax_rate + 0.5f));
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append(this.getReceiptHeader());
        builder.append(getReceiptBodyItems());
        builder.append(getReceiptFooter());
        builder.append("\n\n");
        return builder.toString();

    }
    private String alignCenter(String str){
        return String.format("%"+((DessertShoppe.width+DessertShoppe.store_name.length())/2)+"s",str);
    }

    private String getReceiptHeader(){
        StringBuilder header=new StringBuilder();
        header.append(alignCenter(DessertShoppe.store_name)+"\n");

        char[] seperateLine=new char[DessertShoppe.store_name.length()];
        Arrays.fill(seperateLine, '-');
        header.append(alignCenter(String.valueOf(seperateLine))+"\n\n");

        return header.toString();
    }

    private String getReceiptFooter(){
        StringBuilder footer=new StringBuilder("\n");
        footer.append(alignBothSides(TAX_TEXT, totalTax()));
        footer.append(alignBothSides(TOTAL_COST_TEXT, totalCost()+totalTax()));
        return footer.toString();
    }

    /**
     * Align the input string to left and the cost
     */
    private String alignBothSides(String str, int cost){
        StringBuilder footer=new StringBuilder();
        footer.append(str);
        int pad=DessertShoppe.width-str.length();
        footer.append(String.format("%"+pad+"s", DessertShoppe.cents2dollarsAndCentsmethod(cost)));
        footer.append("\n");
        return footer.toString();
    }

    private String getReceiptBodyItems(){
        StringBuilder builder=new StringBuilder();
        for(DessertItem item: this.list){
            builder.append(item.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}


