package assignment_6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by starhaotian on 20/10/2017.
 */
public class ATM {
    static double availableAmountInMachine;
    static double transactionFee;
    UserData userData;
    static Queue<String> recent = new LinkedList<>();


    //ATM constructor
    public ATM(double availableAmountInMachine, double transactionFee, UserData userData) {
        this.availableAmountInMachine = availableAmountInMachine;
        this.transactionFee = transactionFee;
        this.userData = userData;
    }

    //Ask weather it is a current user
    public boolean Ask_isCurrentUser() {
        Scanner scan = new Scanner(System.in);
        if (scan.next() == "true") {
            return true;
        }

        return false;

    }

    //create a new account
    public void create_newAccount(UserData userData, String bankAccountNumber, String password) {
        userData.user.bankAccountNumber = bankAccountNumber;
        userData.password = password;
    }


    //login function
    public boolean login(UserData userData, String bankAccountNumber, String password) {
        if (userData.user.bankAccountNumber == bankAccountNumber && userData.password == password) {
            return true;
        }
        return false;
    }


    public void exit() {
        System.exit(0);
    }


    public boolean forgot_password(UserData userData, String name, int age, String phoneNumber) {
        if (userData.user.age == age && userData.user.name.equals(name) && userData.user.phoneNumber.equals(phoneNumber)) {
            //the user could change the password
            System.out.println();
            return true;
        } else {
            return false;
        }
    }


    public void change_password(UserData userData, String new_password) {
        userData.password = new_password;
    }

    public void withDrawal(double withDeawal_money) {
        if (withDeawal_money < 0) {
            System.out.println("the mount you input is illegl");
            return;
        }
        if (withDeawal_money > ATM.availableAmountInMachine - ATM.transactionFee) {
            System.out.println(" you can not do the action");
            return;
        } else {
            if (recent.size() == 10) {
                recent.poll();
            }
            recent.offer("withDeawal ->" + withDeawal_money);
            ATM.availableAmountInMachine -= ATM.transactionFee;
            ATM.availableAmountInMachine -= withDeawal_money;
        }
    }

    public void deposit(double deposit_money) {
        if (deposit_money < 0) {
            System.out.println("the mount you input is illegl");
            return;
        }
        if (recent.size() == 10) {
            recent.poll();
        }
        recent.offer("deposit -> " + deposit_money);
        ATM.availableAmountInMachine -= ATM.transactionFee;
        ATM.availableAmountInMachine += deposit_money;
    }

    public void recentTransactions() {
        System.out.println(recent);
    }
}
