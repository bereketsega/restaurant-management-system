package database.queries;

import java.util.Date;

public class OrderQuery {
    public static String addOrder(int customerId, int foodItemId) {
        Date now = new Date();
        Date d = new java.sql.Date(now.getTime());
        System.out.println(d);

        return "INSERT INTO ORDERS(orderDate, orderCustomerID, foodItemID)" +
                " VALUES ("+"'"+d+"'"+"," +customerId+"," +foodItemId+")";
    }
}
