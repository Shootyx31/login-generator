package dcll;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by valentin on 15/04/16.
 */
public class LoginGeneratorTest {
    LoginGenerator generator;

    @Before
    public void setUp() throws Exception {
        LoginService loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        generator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        Assert.assertEquals("PDUR",generator.generateLoginForNomAndPrenom("Durand","Paul"));
        LoginService loginService2 = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        generator = new LoginGenerator(loginService2);
        Assert.assertEquals("JROL1",generator.generateLoginForNomAndPrenom("Rolling","Jean"));
        LoginService loginService3 = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        generator = new LoginGenerator(loginService3);
        Assert.assertEquals("PDUR",generator.generateLoginForNomAndPrenom("Dùrand","Paul"));
    }
}