package database;

import java.sql.Connection;
import java.sql.DriverManager;


public class Database {
    private static Connection connection;
    private static final String url = "jdbc:mysql://triton.towosn.edu:3360/bsega1db";
    private static final String user = "bsega1";
    private static final String password = "COSC*k9aol";

    private Database(){}

    /**
     * Get a connection to database
     *
     * @return Connection object
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                System.out.println("Error Connecting to Database!");
            }
        }
        return connection;
    }

    /**
     * Close the connection to database
     */
    public static void closeConnection() {
        try {
            connection.close();
        } catch (Exception e) {
            System.out.println("Error Closing Database Connection!");
        }
    }

    public static void main(String[] args) {
        System.out.print(getConnection());
    }
}
