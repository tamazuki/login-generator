package geco;

import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void generateLoginForNomAndPrenom(){
        String[] ajouts ={"e1","e2"};
        String verif = new String("PDUR");
        LoginService service = new LoginService(ajouts);
        LoginGenerator test = new LoginGenerator(service);
        test.generateLoginForNomAndPrenom("Paul","Durand");
        /**
         * les deux sont des objets donc ca marche
         */
        test.equals(verif);

    }

    public void testChaine(){
            //GIVEN
            ArrayList<String> maPile = new ArrayList<>();
            //WHEN
            maPile.add(new String());
            //THEN
            assertFalse("Une pile avec un élément n'est pas vide.", maPile.isEmpty());
    }

    public void testAllLoginsFull() throws Exception {
    }

}