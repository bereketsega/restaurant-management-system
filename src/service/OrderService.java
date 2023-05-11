package service;

import database.Database;
import database.model.Cart;
import database.model.FoodItem;
import database.queries.OrderQuery;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderService {

    public Connection c = Database.getConnection();
    public Statement s;

    private Cart cart;

    public OrderService() {
        this.cart = new Cart(new ArrayList<>(), 0);
        try {
            s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    public void addToCart(FoodItem cartItem) {
        this.cart.addItemToCart(cartItem);
    }

    public void clearCart() {
        this.cart = new Cart(new ArrayList<>(), 0);
    }

    public Cart getCart() {
        return this.cart;
    }

    public void order() {
        System.out.println("Ordering...");
        for (int i = 0; i < this.cart.getCartItems().size(); i++) {
            FoodItem foodItem = this.cart.getCartItems().get(i);
            try {
                System.out.println(OrderQuery.addOrder(1, foodItem.getFoodId()));
                s.execute(OrderQuery.addOrder(1, foodItem.getFoodId()));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        this.clearCart();
        System.out.println("Order placed!");
    }
}
