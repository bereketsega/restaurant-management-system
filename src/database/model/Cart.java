package database.model;

import java.util.List;

/**
 *
 * @author Sopnopriyo
 */
public class Cart {

    private List<FoodItem> cartItems;
    private double totalPrice;

    public Cart(List<FoodItem> cartItems, double totalPrice) {
        this.cartItems = cartItems;
        this.totalPrice = totalPrice;
    }

    public List<FoodItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<FoodItem> cartItems) {
        this.cartItems = cartItems;
    }



    public void addItemToCart(FoodItem cartItem) {
        this.cartItems.add(cartItem);
    }

    public double getTotalPrice() {
        totalPrice = 0;
        cartItems.forEach((cartItem) -> {
            totalPrice += cartItem.getFoodPrice();
        });
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}