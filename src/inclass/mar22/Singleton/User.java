package inclass.mar22.Singleton;

public class User {


    private static User SingleInstance = null;


    public static User getInstance() {
        if (SingleInstance== null) {
            SingleInstance = new User();
        }
        return SingleInstance;
    }


}
