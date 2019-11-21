package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testLogin(){
        String[] logExistant = { "er", "re", "bv"};
        LoginService essai1 = new LoginService(logExistant);
        assertFalse(essai1.loginExists("fg"));
    }
    @Test
    public void testLoginFalse(){
        String[] logExistant = { "er", "re, bv"};
        LoginService essai1 = new LoginService(logExistant);
        boolean exist = essai1.loginExists("fg");
        assertFalse(exist);
    }


    @Test
    public void addLogin() throws Exception {
        ArrayList <String> essai = new ArrayList<>();
        essai.add("thierry");
        essai.add("henry");
        if (essai.isEmpty()){
            throw new Exception();
        }
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        String[] login = {};
        LoginService all = new LoginService(login);
        List<String> test = all.findAllLogins();
        if(test == null){
            throw new Exception();
        }
    }

    public void testAllLoginsEmpty() throws Exception {
        List<String> all1 = new ArrayList<>();
        if(all1.isEmpty() == false){
            throw new Exception();
        }
    }

    @Test
    public void findAllLogins() throws Exception {
        String[] login = {};
        LoginService all = new LoginService(login);
        List<String> test = all.findAllLogins();
        if(test == null){
            throw new Exception();
        }
    }
}