package assignment_6;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by starhaotian on 20/10/2017.
 */
@RunWith(Arquillian.class)
public class ATMTest {

    User Lee = new User("Lee", 20, "1001 45th Street, seattle", "13013013013");
    UserData Lee_data = new UserData(Lee);
    //create a new ATM
    ATM atm_2 = new ATM(0, 15, Lee_data);

    @Test
    public boolean ask_isCurrentUser() throws Exception {
        return atm_2.Ask_isCurrentUser();
    }

    @Test
    public void create_newAccount() throws Exception {
        atm_2.create_newAccount(Lee_data,"666666666","11111");
    }

    @Test
    public boolean login() throws Exception {
        return atm_2.login(Lee_data,"66666666","111111");
    }



    @Test
    public boolean forgot_password() throws Exception {
        return atm_2.forgot_password(Lee_data, "Lee", 20, "13113113111");
    }

    @Test
    public void change_password() throws Exception {
        atm_2.change_password(Lee_data, "888888");
    }

    @Test
    public void withDrawal() throws Exception {
        atm_2.withDrawal(200);
    }

    @Test
    public void deposit() throws Exception {
        atm_2.deposit(100);
    }

    @Test
    public void recentTransactions() throws Exception {
        atm_2.recentTransactions();
    }


    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(ATM.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

}
