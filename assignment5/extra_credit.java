package assignment5;

import java.util.ArrayList;

/**
 * Created by starhaotian on 13/10/2017.
 */
public class extra_credit {

    public static void main(String[] args){

        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> f = spiralOrder(a);
        for (int i = 0 ; i < f.size(); i++){
            System.out.print(f.get(i) + ",");
        }
    }

    public static ArrayList<Integer> spiralOrder(int[][] matrix) {


            ArrayList<Integer> result=new ArrayList<Integer>();
            if(matrix==null||matrix.length==0||matrix[0].length==0) return result;
            int xStart=0;
            int xEnd=matrix.length-1;
            int yStart=0;
            int yEnd=matrix[0].length-1;
            while(true){
                for(int i=yStart;i<=yEnd;i++) result.add(matrix[xStart][i]);
                //if it is the last row, break
                if(++xStart>xEnd) break;

                for(int i=xStart;i<=xEnd;i++) result.add(matrix[i][yEnd]);
                //if it is the first col, break
                if(--yEnd<yStart) break;


                for(int i=yEnd;i>=yStart;i--) result.add(matrix[xEnd][i]);
                //if it is the first col
                if(--xEnd<xStart) break;


                for(int i=xEnd;i>=xStart;i--) result.add(matrix[i][yStart]);
                // if it is the
                if(++yStart > yEnd) break;
            }
            return result;





            }
            //write your code here

}
