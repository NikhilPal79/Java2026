package inclass.mar11.Encalpsulation;

public class LoginUser {

    private String username;
    private String password;

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    /*public String getPassword() {
        return password;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }

    ///  function

    public void isValidUser(String username, String password) {

        if (username.equals(this.username) && password.equals(this.password)) {
            System.out.println("valid user ");
        }else {
            System.out.println("invalid user ");
        }

    }
}
