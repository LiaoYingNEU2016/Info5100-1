homework 3
by HaoTian

/*
question 1
*/

public class Book{
          int size;
          int price;
          String name;
          public Book(int size){
              this.size = size;
}
          public Book(int size, int price, String name){
              super();// Class book do not have a father class
              this.size = size;
              this.price = price;
              this.name = name;
}
          public Book(int price){ //class can not have more than one constructors with same type and amont of arguments 
              this.price = price; // maybe you could set price as an attribute of double type 
}
          public setName(String name){ //this method need a valid return type(such like string)
              return name;
} }


/*
question 2
*/

class Clock{
        String time;
        void getTime(){ // if the type is void, there should not be return 
            return time; 
}
        void setTime(String t){
            time = t ;
} }


/*
question 3
*/
import  java.util.Scanner;
public class  removeVowelsFromString{

    // Consider making it a method not class, and also think about upper case vowels
    public  static void main(String[] args){
        System.out.println("Please input your string");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(s);
        String s1 = s.replaceAll("a",""); //replace a by ""
        String s2 = s1.replaceAll("e", ""); // replace e by ""
        String s3 = s2.replaceAll("i", ""); // replace i bt ""
        String s4 = s3.replaceAll("o", ""); // replace o by ""
        String s5 = s4.replaceAll("u", ""); // replace u by ""
        System.out.println("the result is:");
        System.out.println(s5);

    }

}

/*
question 4
*/
public class checkIfTwoStringsAreAnagrams {


    public static void main(String[] args){
        String s1 = "adac";
        String s2 = "adacc";
        checkIfTwoStringsAreAnagrams n1 = new checkIfTwoStringsAreAnagrams();
        System.out.println(n1.checkIfTwoStringsAreAnagrams(s1,s2));
    }

    public boolean checkIfTwoStringsAreAnagrams(String s1, String s2){
        if (s1 == null || s2 == null || s1.length() != s2.length()){
            return false;// if the length of s1 is not equal to s2's length, return false
        }
        int l1 = s1.length();
        for(int i = 0; i < l1; i++){
            // Wrong approach, think about test case of "think" and "nhitk" which should return true
            // In your approach, it will return false in second loop, cuz "think" does not contain "nh"
            if (s2.contains(s1.substring(i)) == false){ // if s1's substring is not  in s2, return false
                return false;
            }
        }
        return true;
    }

}

/*
question 5
*/
package hw_3;

// I achived the function by build constructors
public class calculator {
    double result = 0;
    double[] solution = new double[2];
    public calculator(double a, double b, char c){
        if(c == '+'){
            result = a + b;
        }
        else if(c == '*')
        {
            result = a * b;
        }
        else if(c == '-')
        {
            result = a - b;
        }
        else if(c == '/')
        {
            result = a / b;
        }else {
            System.out.println(" your input is illegal");
        }
    }




    public calculator(double num, String type){
        if (type.equals("Fahrenheit")){
            System.out.println("the Celsius is:");
            result = (num - 32) / 1.8;
        }
        else if(type.equals("Celsius")){
            System.out.println("the Fahrenheit is:");
            result = num * 1.8 + 32;
        }
        else if(type.equals("feet")){
            result = num * 12;
        }
        else if(type.equals("inch")){
            result = num * 0.083;
        }
        else if(type.equals("cube")){
            if (num < 0){
                System.out.println("you input wrong number");
            }
            result = num * num * num;
        }else if(type.equals("square")){
            result = num * num;
        }
        else if(type.equals("squareRoot")){
            result = Math.sqrt(num);
        }
        else {
            System.out.println(" your input is illegal");
        }


    }

    public calculator(double a, double b, double c){
        if (a == 0){
            // What if b == 0?
            this.result = -c / b;
            System.out.println("the solution is");
            System.out.println(result);
        }
        else {
            double con = Math.sqrt(b * b - 4 * a * c);
            double k1 = (-b + con) / (2 * a);
            double k2 = (-b - con) / (2 * a);
            this.solution[0] = k1;
            this.solution[1] = k2;
            System.out.println("the solution is ");
            for(int i = 0; i < 2; i++){
                System.out.println(solution[i]);
            }
        }
    }

    public static void main(String[] args){
        calculator calculator_1 = new calculator(4, "squareRoot");//finde the squareRoot of 4
        System.out.println(calculator_1.result);
        calculator calculator_2 = new calculator(16, "Celsius");// find the transfer
        System.out.println(calculator_2.result);
        calculator calculator_3 = new calculator(1, 0, -4); //find the solution
    }
}


