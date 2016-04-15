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
        LoginService test;
        String[] noms = {"tata","toto","tutu"};
        test = new LoginService(noms);
        generator = new LoginGenerator(test);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        String nom = "mannevy";
        String prenom = "valentin";
        Assert.assertEquals("VMAN",generator.generateLoginForNomAndPrenom(nom,prenom));
        Assert.assertEquals("VMAN1",generator.generateLoginForNomAndPrenom(nom,prenom));
    }
}