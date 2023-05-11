package database.queries;

public class IngredientQuery {
    public static String createIngredient(int ingredientID, String ingredientName, int ingredientSuppID, double ingredientPrice) {
        return "INSERT INTO INGREDIENT (ingredientID, ingredientName, ingredientSuppID, ingredientPrice) VALUES (" + ingredientID + ", '" + ingredientName + "', " + ingredientSuppID + ", " + ingredientPrice + ");";
    }
}
