package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void whenPasswordGeneratedUsingCommonsText_thenSuccessful() {
        PasswordGeneration gen = new PasswordGeneration();
        StringBuffer password = getRandomPasswrd();
        System.out.println(getRandomPasswrd());
    }

    private StringBuffer getRandomPasswrd() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < 8; i++){
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            s.append(c);
            ;
        }
        System.out.println(s);
        return  s;
    }
}