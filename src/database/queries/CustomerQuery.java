package database.queries;

public class CustomerQuery {
    public static String createCustomer(int customerID, String customerFName, String customerLName, String customerSSN, long customerPhone, String customerAddress) {
        return "INSERT INTO CUSTOMER (customerID, customerFName, customerLName, customerSSN, customerPhone, customerAddress) " +
                "VALUES (" + customerID + ", '" + customerFName + "', '" + customerLName + "', " + customerSSN + ", " + customerPhone + ", '" + customerAddress + "')";
    }
}
