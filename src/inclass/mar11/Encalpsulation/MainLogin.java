package inclass.mar11.Encalpsulation;

import java.util.Locale;

public class MainLogin {
    static void main(String[] args) {


        LoginUser loginUser = new LoginUser("nikhil","12449052");
        loginUser.isValidUser("nikhil","12449052");

        /*loginUser.password = "mayank";*/

        loginUser.isValidUser("nikhil","mayank");

        System.out.println(loginUser.getUsername());

        loginUser.setPassword("12345");

        loginUser.isValidUser("nikhil","12345");

    }
}
