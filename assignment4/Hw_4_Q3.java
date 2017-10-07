/**
 * Created by starhaotian on 03/10/2017.
 */
public class Hw_4_Q3 {
}

class driver{
    public static void main(String args[]){

        IpAddress ip = new IpAddress("216.27.6.136");
        System.out.println(ip.getDottedDecimal());
        System.out.println(ip.getOctet(4));
        System.out.println(ip.getOctet(1));
        System.out.println(ip.getOctet(3));
        System.out.println(ip.getOctet(2));

    }

}

class IpAddress{
    String dottedDecimal;
    String[] str = new String[4];



    public IpAddress(String st){
        dottedDecimal = st;
        //str = st.split("\\.");  this is the method 2, we can use the split method
        for (int j = 0; j < 4; j++){
            str[j] = "";
        }
        int count = 0;
        char[] str_char = st.toCharArray();
        for (int i = 0; i <st.length(); i++){
            if(str_char[i] == '.'){
                count++;
                i++;
            }
            str[count] += str_char[i];
        }
    }

    public String getDottedDecimal(){
        return dottedDecimal;
    }

    public String getOctet(int p){
        return str[p-1];
    }
}
