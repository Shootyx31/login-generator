package dcll;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by valentin on 15/04/16.
 */
public class LoginServiceTest {
    LoginService test;

    @Before
    public void setUp() throws Exception {
        String[] noms = {"tata","toto","tutu"};
        test = new LoginService(noms);
    }

    @Test
    public void testLoginExists() throws Exception {
        String login = "toto";
        Assert.assertEquals(true,test.loginExists(login));
    }

    @Test
    public void testAddLogin() throws Exception {
        String login = "titi";
        test.addLogin(login);
        Assert.assertEquals(true,test.loginExists(login));
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        List<String> AllLogins = Arrays.asList("tata", "toto", "tutu");
        Assert.assertEquals(AllLogins,test.findAllLoginsStartingWith("t"));
    }

    @Test
    public void testFindAllLogins() throws Exception {
        List<String> AllLogins = Arrays.asList("tata", "toto", "tutu");
        Assert.assertEquals(AllLogins,test.findAllLogins());
    }
}