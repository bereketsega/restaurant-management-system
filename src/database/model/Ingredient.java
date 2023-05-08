package database.model;

public class Ingredient {
    private int ingredientId;
    private String ingredientName;
    private String ingredientType;
    private double ingredientPrice;
    private int ingredientSupplierId; // refers to Supplier.supplierId

    public Ingredient(int ingredientId, String ingredientName, String ingredientType,
                      double ingredientPrice, int ingredientSupplierId) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
        this.ingredientType = ingredientType;
        this.ingredientPrice = ingredientPrice;
        this.ingredientSupplierId = ingredientSupplierId;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public String getIngredientType() {
        return ingredientType;
    }

    public double getIngredientPrice() {
        return ingredientPrice;
    }

    public int getIngredientSupplierId() {
        return ingredientSupplierId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public void setIngredientType(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    public void setIngredientPrice(double ingredientPrice) {
        this.ingredientPrice = ingredientPrice;
    }

    public void setIngredientSupplierId(int ingredientSupplierId) {
        this.ingredientSupplierId = ingredientSupplierId;
    }

    public String toString() {
        return "Ingredient ID: " + ingredientId + "\n" +
               "Ingredient Name: " + ingredientName + "\n" +
               "Ingredient Type: " + ingredientType + "\n" +
               "Ingredient Price: " + ingredientPrice + "\n" +
               "Ingredient Supplier ID: " + ingredientSupplierId + "\n";
    }
}
