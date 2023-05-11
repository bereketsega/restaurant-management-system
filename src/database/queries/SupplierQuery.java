package database.queries;

public class SupplierQuery {
    public static String createSupplier(String supplierID, String supplierPhone, String supplierCity, String supplierAddress) {
        return "INSERT INTO SUPPLIER (supplierID, supplierPhone, supplierCity, supplierAddress) " +
                "VALUES (" + supplierID + ", " + supplierPhone + ", '" + supplierCity + "', '" + supplierAddress + "')";
    }
}
