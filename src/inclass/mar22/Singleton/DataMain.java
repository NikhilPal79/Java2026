package inclass.mar22.Singleton;

public class DataMain {
    static void main(String[] args) {

        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection3 = DatabaseConnection.getInstance();
        System.out.println(" printed only ONCE no matter how many times getInstance() is called");
        System.out.println();
        System.out.println(databaseConnection1.getConnectionStatus());
        System.out.println(databaseConnection2.getConnectionStatus());
        System.out.println();
        System.out.println("Prove they are the same object");
        System.out.println(databaseConnection1 == databaseConnection2);
        System.out.println(databaseConnection2 == databaseConnection1);


    }
}
