package database.queries;

public class EmployeeQuery {
    public static String insertWaiter(String waiterId, String fname, String lname, String SSN, String phoneNumber) {
        return "INSERT INTO WAITER (waiterID, fname, lname, SSN, phoneNumber) " +
                "VALUES ('" + waiterId + "', '" + fname + "', '" + lname + "', '" + SSN + "', '" + phoneNumber + "');";
    }

    public static String insertChef(String chefId, String chefFName, String chefLName, String chefPhone) {
        return "INSERT INTO CHEF (chefID, chefFName, chefLName, chefPhone) " +
                "VALUES ('" + chefId + "', '" + chefFName + "', '" + chefLName + "', '" + chefPhone + "');";
    }

    public static String getChefs() {
        return "SELECT * FROM CHEF;";
    }

    public static String getWaiters() {
        return "SELECT * FROM WAITER;";
    }

    public static String deleteWaiter(String waiterId) {
        return "DELETE FROM WAITER WHERE waiterID = '" + waiterId + "';";
    }

    public static String deleteChef(String chefId) {
        return "DELETE FROM CHEF WHERE chefID = '" + chefId + "';";
    }

    public static String updateWaiterPhone(String waiterId, String phoneNumber) {
        return "UPDATE WAITER SET phoneNumber = '" + phoneNumber + "' WHERE waiterID = '" + waiterId + "';";
    }

    public static String updateChefFirstName(String chefId, String chefFName) {
        return "UPDATE CHEF SET chefFName = '" + chefFName + "' WHERE chefID = '" + chefId + "';";
    }

    public static String updateWaiterLastName(String waiterId, String lname) {
        return "UPDATE WAITER SET lname = '" + lname + "' WHERE waiterID = '" + waiterId + "';";
    }

    public static String updateWaiterSSN(String waiterId, String SSN) {
        return "UPDATE WAITER SET SSN = '" + SSN + "' WHERE waiterID = '" + waiterId + "';";
    }

    public static String updateChefPhone(String chefId, String chefPhone) {
        return "UPDATE CHEF SET chefPhone = '" + chefPhone + "' WHERE chefID = '" + chefId + "';";
    }

    public static String updateWaiterFirstName(String waiterId, String fname) {
        return "UPDATE WAITER SET fname = '" + fname + "' WHERE waiterID = '" + waiterId + "';";
    }

    public static String updateChefLastName(String chefId, String chefLName) {
        return "UPDATE CHEF SET chefLName = '" + chefLName + "' WHERE chefID = '" + chefId + "';";
    }
}
