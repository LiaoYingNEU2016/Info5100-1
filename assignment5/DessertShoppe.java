package Hw_5;

import java.text.DecimalFormat;

/**
 * Created by starhaotian on 14/10/2017.
 */


public class DessertShoppe{
    static double tax_rate = 0.065d;
    static String store_name = "M & M Dessert Shoppe";
    static int max_size = 23;
    static int width = 30;

    //static final DecimalFormat currencyFormat=new DecimalFormat("#.00");

    public  static String cents2dollarsAndCentsmethod(int cent){
        String re = "";
        re = Integer.toString(cent / 100) +"."+ Integer.toString(cent % 100);
        return re;
    }
}
