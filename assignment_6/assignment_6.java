package assignment_6;

import javax.security.auth.login.LoginContext;

/**
 * Created by starhaotian on 20/10/2017.
 */

// this is the problem 3
public class assignment_6 {
    public static void main(String[] args){

        // create a new User
        User Ann = new User("Ann", 22, "1001 23th Street, seattle", "13144114591");
        UserData Ann_data = new UserData(Ann);
        //create a new ATM
        ATM atm_1 = new ATM(0, 0.5, Ann_data);

        if (atm_1.Ask_isCurrentUser()){
            //the user is a current user
            //login
            if(atm_1.login(Ann_data, Ann_data.user.bankAccountNumber, Ann_data.password)){
                System.out.println("login successful");

                atm_1.deposit(100);
                atm_1.withDrawal(80);
                atm_1.recentTransactions();
                atm_1.exit();

            }else if (atm_1.forgot_password(Ann_data,Ann_data.user.name, Ann_data.user.age,Ann_data.user.phoneNumber)){
                System.out.println("login failed");
                atm_1.change_password(Ann_data, "14789632");

            }else {
                System.out.println("the program is end");
                atm_1.exit();// terminal the project
            }
        }else {

            //the user is a new user
            //create a new Account;
            atm_1.create_newAccount(Ann_data,"88888888", "123456");
        }


    }
}
