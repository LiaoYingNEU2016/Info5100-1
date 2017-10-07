/**
 * Created by starhaotian on 03/10/2017.
 */
public class Hw_4_ex {


    public static void main(String[] args){
        int[] num1 = new int[]{1,2};
        int[] num2 = new int[]{3,4};
        Find_medium(num1,num2);

    }

    public static void Find_medium(int[] num1, int[] num2){
        int n1 = num1.length;
        int n2 = num2.length;
        int[] aux = new int[n1 + n2];//create a new array
        int i = 0;
        int j = 0;
        int count = 0;

        while(i < n1 && j < n2){//compare the numbers between num1 and num2
            if(num1[i] < num2[j]){
                aux[count++] = num1[i];//put the result in the array called aux
                i++;
            }
            else {
                aux[count++] = num2[j];
                j++;
            }
        }

        while (i < n1){
            aux[count++] = num1[i];
            i++;
        }

        while(j < n2){
            aux[count++] = num2[j];
            j++;
        }
        //aux is sorted
        //calculate the middle number
        double mid = new Double((aux[(n1+n2)/2 - 1] + aux[(n1+n2)/2 ]) );

        System.out.println("middle is:");
        System.out.println(mid / 2);
    }
}
