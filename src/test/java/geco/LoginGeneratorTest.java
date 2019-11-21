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
    public void generateLoginForNomAndPrenom() {
        ArrayList <String> essai = new ArrayList<>();
        LoginService ajout = null;
        LoginGenerator login = new LoginGenerator(ajout);
        essai.add("jean");
        essai.add("val");
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
        String[] login = {};
       LoginService all = new LoginService(login);
       List<String> test = all.findAllLogins();
       if(test == null){
           throw new Exception();
       }
    }

}