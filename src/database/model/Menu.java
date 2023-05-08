package database.model;

public class Menu {
    private int menuId;
    private String menuName;
    private int foodId; // refers to FoodItem.foodId

    public Menu(int menuId, String menuName, int foodId) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.foodId = foodId;
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

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String toString() {
        return "Menu ID: " + menuId + "\n" +
               "Menu Name: " + menuName + "\n" +
               "Food ID: " + foodId + "\n";
    }
}
