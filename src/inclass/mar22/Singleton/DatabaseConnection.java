package inclass.mar22.Singleton;

public class DatabaseConnection {


    private static DatabaseConnection Instance;

    private String connectionStatus;

    private DatabaseConnection() {
        connectionStatus = " connected to database ";
        System.out.println(" Database Connection created ");
    }

    public static DatabaseConnection getInstance() {
        if (Instance == null) {
            Instance = new DatabaseConnection();
        }
        return Instance;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }
}
