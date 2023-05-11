package database.queries;

public class FoodItemQuery {
    public static String createFoodItem(int foodId, String foodName, double foodPrice, int foodIngredientId) {
        return "INSERT INTO FOOD_ITEM (foodID, foodName, foodPrice, foodIngredientID) VALUES ('" + foodId + "', '" + foodName + "', '" + foodPrice + "', '" + foodIngredientId + "')";
    }
}
