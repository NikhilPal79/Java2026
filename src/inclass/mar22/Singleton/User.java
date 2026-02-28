package inclass.mar22.Singleton;

public class User {


    private static User SinleInstance = null;


    public static User getInstance() {
        if (SinleInstance == null) {
            SinleInstance = new User();
        }
        return SinleInstance;
    }


}
