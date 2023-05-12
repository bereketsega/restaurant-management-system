package service;

import database.Database;
import database.queries.EmployeeQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeService {

    public Connection c = Database.getConnection();
    public Statement s;

    public EmployeeService() {
        try {
            s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean createWaiter(String waiterId, String fname, String lname, String SSN, String phoneNumber) {
        System.out.println("Creating Waiter...");
        try {
             s.execute(EmployeeQuery.insertWaiter(waiterId, fname, lname, SSN, phoneNumber));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Waiter created!");
        return true;
    }

    public boolean createChef(String chefId, String fname, String lname, String phoneNumber) {
        System.out.println("Creating Chef...");
        try {
            s.execute(EmployeeQuery.insertChef(chefId, fname, lname, phoneNumber));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Chef created!");
        return true;

    }

    public Object[][] getChefs() {
        try {
            ResultSet rs = s.executeQuery(EmployeeQuery.getChefs());
            rs.last();
            int size = rs.getRow();
            rs.beforeFirst();
            Object[][] chefs = new Object[size][4]; // chefId, chefFName, chefLName, chefPhone
            int i = 0;
            while (rs.next()) {
                chefs[i][0] = rs.getString("chefID");
                chefs[i][1] = rs.getString("chefFName");
                chefs[i][2] = rs.getString("chefLName");
                chefs[i][3] = rs.getString("chefPhone");
                i++;
            }
            return chefs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object[][] getWaiters() {
        System.out.println("hit");
        try {
            ResultSet rs = s.executeQuery(EmployeeQuery.getWaiters());
            rs.last();
            int size = rs.getRow();
            rs.beforeFirst();
            Object[][] waiters = new Object[size][5]; // waiterId, fname, lname, SSN, phoneNumber
            int i = 0;
            while (rs.next()) {
                waiters[i][0] = rs.getString("waiterID");
                waiters[i][1] = rs.getString("fname");
                waiters[i][2] = rs.getString("lname");
                waiters[i][3] = rs.getString("SSN");
                waiters[i][4] = rs.getString("phoneNumber");
                i++;
            }
            return waiters;
        } catch (SQLException e) {
            System.out.println("Error getting waiters");
            e.printStackTrace();
            System.out.println("Error getting waiters");
        }
        return null;
    }

    public boolean deleteWaiter(String waiterId) {
        System.out.println("Deleting waiter...");
        try {
            s.execute(EmployeeQuery.deleteWaiter(waiterId));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Waiter deleted!");
        return true;
    }

    public boolean deleteChef(String chefId) {
        System.out.println("Deleting chef...");
        try {
            s.execute(EmployeeQuery.deleteChef(chefId));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Chef deleted!");
        return true;
    }

    public boolean updateWaiterFirstName(String waiterId, String newFirstName) {
        System.out.println("Updating waiter first name...");
        try {
            s.execute(EmployeeQuery.updateWaiterFirstName(waiterId, newFirstName));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Waiter first name updated!");
        return true;
    }

    public boolean updateWaiterLastName(String waiterId, String newLastName) {
        System.out.println("Updating waiter last name...");
        try {
            s.execute(EmployeeQuery.updateWaiterLastName(waiterId, newLastName));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Waiter last name updated!");
        return true;
    }

    public boolean updateWaiterSSN(String waiterId, String newSSN) {
        System.out.println("Updating waiter SSN...");
        try {
            s.execute(EmployeeQuery.updateWaiterSSN(waiterId, newSSN));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Waiter SSN updated!");
        return true;
    }

    public boolean updateWaiterPhoneNumber(String waiterId, String newPhoneNumber) {
        System.out.println("Updating waiter phone number...");
        try {
            s.execute(EmployeeQuery.updateWaiterPhone(waiterId, newPhoneNumber));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Waiter phone number updated!");
        return true;
    }

    public boolean updateChefFirstName(String chefId, String newFirstName) {
        System.out.println("Updating chef first name...");
        try {
            s.execute(EmployeeQuery.updateChefFirstName(chefId, newFirstName));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Chef first name updated!");
        return true;
    }

    public boolean updateChefLastName(String chefId, String newLastName) {
        System.out.println("Updating chef last name...");
        try {
            s.execute(EmployeeQuery.updateChefLastName(chefId, newLastName));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Chef last name updated!");
        return true;
    }

    public boolean updateChefPhoneNumber(String chefId, String newPhoneNumber) {
        System.out.println("Updating chef phone number...");
        try {
            s.execute(EmployeeQuery.updateChefPhone(chefId, newPhoneNumber));
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Chef phone number updated!");
        return true;
    }
}
