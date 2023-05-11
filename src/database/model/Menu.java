package database.model;

import java.util.ArrayList;

public class Menu {
    private int menuId;
    private String menuName;
    private int foodId; // refers to FoodItem.foodId

    public ArrayList<Supplier> suppliers;
    public ArrayList<Ingredient> ingredients;
    public ArrayList<FoodItem> foodItems;

    public Menu() {
        // add dummy food items

        suppliers = new ArrayList<>();
        suppliers.add(new Supplier("1", "23409883444", "Towson", "89 Gorkhali Lane"));
        suppliers.add(new Supplier("2", "1234567890", "Baltimore","89 Nepali Lane"));
        suppliers.add(new Supplier("3", "89333529024", "Washington, DC", "89 Himalayan Lane"));

        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "Rice", "Grain", 1.99, 1));
        ingredients.add(new Ingredient(2, "Lamb", "Meat", 2.99, 3));
        ingredients.add(new Ingredient(3, "Potato", "Vegetable", 3.99, 3));
        ingredients.add(new Ingredient(4, "Onion", "Vegetable", 4.99, 2));
        ingredients.add(new Ingredient(5, "Tomato", "Vegetable", 5.99, 1));

        foodItems = new ArrayList<>();
        foodItems.add(new FoodItem(1, "Raita", 3.99, 1));
        foodItems.add(new FoodItem(2, "Side of Rice", 2.99, 2));
        foodItems.add(new FoodItem(3, "Samosa", 4.99, 3));
        foodItems.add(new FoodItem(4, "Lamb Gorkhali", 5.99, 4));
        foodItems.add(new FoodItem(5, "Aloo Bonda", 17.99, 5));
    }

    public void addMenuItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public FoodItem getItemByIndex(int index) {
        return foodItems.get(index-1);
    }
    public int getMenuId() {
        return menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getFoodId() {
        return foodId;
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void inserMenuItems() {
        // insert supplier

    }

    public String toString() {
        return "Menu ID: " + menuId + "\n" +
               "Menu Name: " + menuName + "\n" +
               "Food ID: " + foodId + "\n";
    }
}
