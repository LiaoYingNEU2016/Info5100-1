package assignment_6;

import Hw_6.MyIndexOutOfBoundException;

import java.util.Scanner;

/**
 * Created by starhaotian on 16/10/2017.
 */
public class Problem_1 {

    public static void main(String[] args) throws MyIndexOutOfBoundException {

        System.out.println("Please inpute a number");
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();
        MyIndexOutOfBoundException problem = new MyIndexOutOfBoundException("Index:" + val + ", but Lower bound: " + MyIndexOutOfBoundException.lowerBound + ", Upper bound:" + MyIndexOutOfBoundException.upperBound);
        if (val < MyIndexOutOfBoundException.lowerBound || val > MyIndexOutOfBoundException.upperBound) {
            throw problem;
        }
        System.out.println("the game is end");

    }
}
