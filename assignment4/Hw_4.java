import sun.security.util.Length;

/**
 * Created by starhaotian on 02/10/2017.
 */
public class Hw_4 {

    public static void main(String[] args){
        String a = "a";
        String b = a.toUpperCase();
        System.out.println(b);
        String test_1 = "2-4A0r7-4k";
        System.out.println(Q1(test_1,3));

        //test Q5
        int test_5 = 4;
        System.out.println("the input is "+ test_5 +" and the Roman numeral:");
        System.out.println(intToRoman(test_5));
    }

    //delete '-' from the string
    public static String Q1(String a, int k){
        if(a.length() < k){
            return "the input is wrong";
        }

        char[] ch = a.toUpperCase().toCharArray();
        char[] ch_1 = new char[ch.length];
        int j = 0;
        int num_1 = 0;//calculate the count of '-'
        for(int i = 0; i <ch.length; i++){
            if(ch[i] != '-'){
                ch_1[j++] = ch[i];
                num_1++;
            }
        }

        int count = 0;
        int num_fu = 0;
        char[] re = new char[a.length()];
        for (int h = 0; h < num_1; h++){
            re[count++] = ch_1[h];
            if((count == (num_1 % k ) || ((num_1-count+num_fu) % k ==0 ))&& h != num_1-1 ){
                re[count++] = '-';
                num_fu++;
            }
        }


        String rep = new String(re);
        System.out.println(num_1);
        return rep.substring(0,count);
    }

    public static String intToRoman(int input){
        if (input < 1 || input > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        while (input >= 1000){
            s = s + "M";
            input = input - 1000;
        }
        while (input >= 900) {
            s += "CM";
            input = input - 900;
        }
        while (input >= 500) {
            s += "D";
            input = input - 500;
        }
        while (input >= 400) {
            s += "CD";
            input = input - 400;
        }
        while (input >= 100) {
            s += "C";
            input = input - 100;
        }
        while (input >= 90) {
            s += "XC";
            input = input - 90;
        }
        while (input >= 50) {
            s += "L";
            input = input - 50;
        }
        while (input >= 40) {
            s += "XL";
            input = input - 40;
        }


        while (input >= 10){
            s = s + "X";
            input = input - 10;
        }
        if (input == 9){
            s = s + "IX";
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input == 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}




/*

 */
