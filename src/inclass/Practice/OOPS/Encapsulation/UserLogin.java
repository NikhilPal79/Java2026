package inclass.Practice.OOPS.Encapsulation;

public class UserLogin {
    static void main(String[] args) {

        User user = new User("nikhil", "nikhil1244");

        System.out.println(user.getUserName());
        System.out.println();
        System.out.println(user.getPassword());
        System.out.println();
        user.validation("mayank", "124578");
        System.out.println();
        user.setUserName("mayank");
        System.out.println(user.getUserName());
        System.out.println();
        System.out.println(user.getPassword());
        System.out.println();
        user.validation("mayank", " nikhil");
        System.out.println();

        System.out.println(" we can change getter and setter of the built our own logic");
    }
}
