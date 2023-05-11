package database.model;

public class Order {
    private int orderId;
    private String orderDate;
    private int customerId; // refers to Customer.customerId
    private int foodItemId; // refers to FoodItem.foodId

    public Order(int orderId, String orderDate, int customerId, int foodItemId) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.customerId = customerId;
        this.foodItemId = foodItemId;
    }



    public Order(Order order) {
        this.orderId = order.getOrderId();
        this.orderDate = order.getOrderDate();
        this.customerId = order.getCustomerId();
        this.foodItemId = order.getFoodItemId();
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getFoodItemId() {
        return foodItemId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setFoodItemId(int foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String toString() {
        return "Order ID: " + orderId + "\n" +
               "Order Date: " + orderDate + "\n" +
               "Customer ID: " + customerId + "\n" +
               "Food Item ID: " + foodItemId + "\n";
    }
}
