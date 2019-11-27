package geco;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PasswordGeneration {


    StringBuffer getRandomPasswrd(){
        for (int i = 0; i < 8; i++){
            Random r = new Random();
            char c = (char)(r.nextInt(26) + 'a');
            StringBuffer password = new StringBuffer(8);
            password.append(c);
            ;
        }
        System.out.println(getRandomPasswrd());
        return getRandomPasswrd();
    }
}
