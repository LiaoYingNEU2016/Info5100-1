## MidTerm_PartB

### by HAO TIAN

#### 1. question 1

```
public static int[] reverseEvenIndices(int[] nums){
        if (nums == null){
            System.out.println("the input is null, please input again");
        }
        int i = 0;
        int n = nums.length -1;
        int j;
        if (n % 2 == 0){
            j = n;
        }else {
            j = n-1;
        }

        while (i <= j){
            if(i < 0 || j < 0){
                break;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i = i + 2;
            j = j - 2;
        }

        return nums;

    }
```

#### 2. question2
```
//problem 2
public static int arrangeCoins(int n){
        if(n < 0){
            return 0;
        }
        int floor = 1;//floor is the number of each floor
        int num = 0;// num is the number of entire upstairs
        System.out.println("The coins can form the following rows:");
        while (n >= floor){
            for(int i = floor; i > 0; i-- ){
                System.out.print("*");
            }
            System.out.println(" ");
            n -= floor;
            floor ++;
            num  ++;
        }

        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        // output the result
        if (n == 0){
            System.out.println("Because the " + num +"row is complete, we return");
        }else {
            System.out.println("Because the " + num +"row is incomplete, we return");
        }
        return num;
    }
```

#### 3. question3
```
//problem 3
public static int minMoves(int[] nums){

		//the solution is 
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }

        int sum_min = 0;
        for (int y : nums){
            if(y == min){
                sum_min++;
            }
        }

        int sum = 0;
        for(int x : nums){
            sum += x - min;
        }

        return sum;
    }
```

#### 4.question4
```
public int countNumberOfPossibleWays2(int n, int m, int sum) {

		/*
        the solution is based on the fact that
        the numbers of possible solutions when there are 3 dices, sum is 12, face is 6
        equals to 
        ways in 2 dices, sum = 11 +
        ways in 2 dices, sum = 10 +
        ways in 2 dices, sum = 9 +
        ways in 2 dices, sum = 8 +
        ways in 2 dices, sum = 7 +
        ways in 2 dices, sum = 6
        */
        int[][] ways = new int[n + 1][sum + 1];
        int min = Math.min(sum,m);
        for(int i = 1; i<= min; i++) {
            ways[1][i] = 1;
        }


        //n is the number of our dices
        //j is the sum with n dices
        //k is the number on the i dices 
        for (int i  = 2; i <= n ;i++) {
            for (int j  = 1; j <= sum ; j++)
                for (int k = 1; k <= m && k < j; k++)
                    ways[i][j] += ways[i-1][j - k];

        }
        return ways[n][sum];
    }
```

#### question 5
```
package mid_test;

import java.util.ArrayList;

/**
 * Created by starhaotian on 26/10/2017.
 */


public class Solution {
    public static void main(String args[]) {
        Solution rat = new Solution();
        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 1, 1},

        };
        rat.solveMaze(maze);
    }


    //the solution matrix is sol
    public ArrayList<Cell> findPath(int sol[][]) {

        ArrayList<Cell> array_cell = new ArrayList<>();
        //calculate the number of row and col of the array
        int maze_row = sol.length;
        int maze_col = sol[0].length;
        System.out.println("the matrix of path:");
        for (int i = 0; i < maze_row; i++) {
            for (int j = 0; j < maze_col; j++) {
                System.out.print(" " + sol[i][j] + " ");
                Cell cell_1 = new Cell(i, j);
                array_cell.add(cell_1);
            }

            System.out.println();
        }
        System.out.println("the path is:");
        return(array_cell);
    }

    // check if the point is valid
    boolean isSafe(int maze[][], int x, int y) {
        int maze_row = maze.length;
        int maze_col = maze[0].length;
        // if (x,y outside maze) return false
        return (x >= 0 && x < maze_row && y >= 0 &&
                y < maze_col && maze[x][y] == 1);
    }

    //set the solution matrix
    boolean solveMaze(int maze[][]) {
        int maze_row = maze.length;
        int maze_col = maze[0].length;
        int sol[][] = new int[maze_row][maze_col];
        for (int i = 0; i < maze_row; i++)
            for (int j = 0; j < maze_col; j++) {
                sol[i][j] = 0;
            }


        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        System.out.println(findPath(sol));
        return true;
    }

    //backtracking
    boolean solveMazeUtil(int maze[][], int x, int y,
                          int sol[][]) {
        int maze_row = maze.length;
        int maze_col = maze[0].length;
        // if arrive the final point
        if (x == maze_row - 1 && y == maze_col - 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {
            // mark x,y as part of solution path
            sol[x][y] = 1;

            //move in forward direction
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

			//move in down direction
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

			//if there is no path, return false
            sol[x][y] = 0;
            return false;
        }

        return false;
    }



}

class Cell {
    int x, y;

    Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + this.x + "," + this.y + "]";
    }
}




```
