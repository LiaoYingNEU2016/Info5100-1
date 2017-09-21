import sun.applet.Main;

import java.util.Scanner;

/**
 * Created by starhaotian on 20/09/2017.
 */
public class Hw_2 {

    // main function
    public static void main(String[] args){
        System.out.println("question 1");
        Hw_2 test_1 = new Hw_2();// test for question 1
        System.out.println(test_1.employeeSalary(50));

        System.out.println("\n");
        System.out.println("question 2");
        Hw_2 test_2 = new Hw_2();//test for question 2
        test_2.printPerfectNumbers(10);

        System.out.println("\n");
        System.out.println("question 3");
        Hw_2 test_3 = new Hw_2();// test for question 3
        System.out.println(test_3.addDigits(37));


        System.out.println("\n");
        System.out.println("question 6");
        Hw_2 test_6 = new Hw_2();
        test_6.printIsoscelesTriangle(10);
    }



    /*
     Write a java function to calculate the salary of an employee based on the following rules.
		i. function takes input of number of hours an employee worked and returns the salary.
		ii.  The first 36 hours worked are paid at a rate of 15.0, then the next 5 hours are paid at a rate of 15 * 1.5. Hours after that up to a max of 48 are paid at a rate of 15 * 2.

		Here is the prototype you can work with
		*/

    public double employeeSalary( double hours){

        if (hours < 0 || hours > 48){
            return (0);
        }

        if (hours <= 36){
            return (15 * hours);
        }else if (hours > 36 && hours <= 41){
            return (15 * 36 + (hours - 36) * 15 * 1.5);
        }else if (hours > 41 && hours <= 48){
            return (36 * 15 + 5 * 1.5 + (hours - 41) * 15 * 2);
        }

        return 0;
    }

    /*
    Write a java function that adds all the digits of an integer until it is single digit.
		i. function takes an integer as input and returns its sum of digits.
		ii. for example input = 37, sum = 3+7 = 10, sum = 1+0 = 1. result = 1.

		Here is the prototype you can work with
     */
    public int addDigits( int input){

        int sum = 0;
        while(input > 0){
            sum = sum + input % 10;
            input = input /10;
        }
        if(sum / 10 == 0){//if sum < 10, then return sum
            return sum;
        }
        return addDigits(sum);//begin iterate
    }


    /*
     Write a java function to print all perfect number between 1 and n.
		i. Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
		ii. For example: 6 is the first perfect number, Proper divisors of 6 are 1, 2, 3. Sum of its proper divisors = 1 + 2 + 3 = 6.

     */

    public void printPerfectNumbers( int n){
        int sum = 6;
        int[] arr = new int[n];
        int count = 0;
        if (n < 6){
            System.out.println(" there is no perfect number in [1,n]");
        }

        for(int i = 4; i <= n; i++){ //put all the sum in an array
            arr[count++] = sum;
            sum = sum +i;
        }



        for(int j = 6; j <= n; j++){
            for (int k = 0; k < n; k++){
                if (arr[k] == j){
                    System.out.println(arr[k]);
                }
            }
        }
    }


    /*
    6. Write a Java program that generates an isosceles right angled triangle made of asterisks.
		i. function should take input of one equal side as integer. Other than the edges the inner part of the triangle should be empty.
		ii. For example input is 6. the function should print
     */

    public void printIsoscelesTriangle( int n){

            System.out.println("*");

        for(int i = 2;i < n; i++){
            int k = i;
            System.out.print("*");
            while (k - 2 > 0){
                System.out.print(" ");
                k--;
            }
            System.out.println("*");
        }

        for (int j = 1; j <= n; j++){
            System.out.print("*");
        }}













}
