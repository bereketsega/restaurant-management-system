import component.auth.Login;
import database.model.Customer;
import database.model.Menu;
import database.queries.*;
import service.OrderService;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Login login = new Login();
        login.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        login.setVisible(true);

        Menu menu = new Menu();
        OrderService orderService = new OrderService();
        // create customer
        Customer customer = new Customer(1,"John", "Doe", "123-456-7890", "1234 Main St", "3435353342");

        try {
            // Add customer
            orderService.s.execute(CustomerQuery.createCustomer(
                    customer.getCustomerId(),
                    customer.getCustomerFName(),
                    customer.getCustomerLName(),
                    customer.getCustomerSSN(),
                    customer.getCustomerPhone(),
                    customer.getCustomerAddress()));


            // Add suppliers
            for (int i = 0; i < menu.suppliers.size(); i++) {
                orderService.s.execute(SupplierQuery.createSupplier(
                        menu.suppliers.get(i).getSupplierId(),
                        menu.suppliers.get(i).getSupplierPhone(),
                        menu.suppliers.get(i).getSupplierCity(),
                        menu.suppliers.get(i).getSupplierAddress()));
            }

            // Add food ingredients
            for (int i = 0; i < menu.ingredients.size(); i++) {
                orderService.s.execute(IngredientQuery.createIngredient(
                        menu.ingredients.get(i).getIngredientId(),
                        menu.ingredients.get(i).getIngredientName(),
                        menu.ingredients.get(i).getIngredientSupplierId(),
                        menu.ingredients.get(i).getIngredientPrice()));
            }

            // Add food items
            for (int i = 0; i < menu.foodItems.size(); i++) {
                orderService.s.execute(FoodItemQuery.createFoodItem(
                        menu.foodItems.get(i).getFoodId(),
                        menu.foodItems.get(i).getFoodName(),
                        menu.foodItems.get(i).getFoodPrice(),
                        menu.foodItems.get(i).getFoodIngredientId()));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }
    }
}
