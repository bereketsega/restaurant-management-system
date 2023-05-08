package database.model;

public class FoodItem {
    private int foodId;
    private String foodName;
    private double foodPrice;
    private int foodIngredientId; // refers to Ingredient.ingredientId

    public FoodItem(int foodId, String foodName, double foodPrice, int foodIngredientId) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodIngredientId = foodIngredientId;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public int getFoodIngredientId() {
        return foodIngredientId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodIngredientId(int foodIngredientId) {
        this.foodIngredientId = foodIngredientId;
    }

    public String toString() {
        return "Food ID: " + foodId + "\n" +
               "Food Name: " + foodName + "\n" +
               "Food Price: " + foodPrice + "\n" +
               "Food Ingredient ID: " + foodIngredientId + "\n";
    }
}
