package database.model;

public class Chef {
    private int chefId;
    private String chefFName;
    private String chefLName;
    private int chefPhone;
    private String chefOrderId; // refers to FoodItem.orderId

    public Chef(int chefId, String chefFName, String chefLName, int chefPhone, String chefOrderId) {
        this.chefId = chefId;
        this.chefFName = chefFName;
        this.chefLName = chefLName;
        this.chefPhone = chefPhone;
        this.chefOrderId = chefOrderId;
    }

    public int getChefId() {
        return chefId;
    }

    public String getChefFName() {
        return chefFName;
    }

    public String getChefLName() {
        return chefLName;
    }

    public int getChefPhone() {
        return chefPhone;
    }

    public String getChefOrderId() {
        return chefOrderId;
    }

    public void setChefId(int chefId) {
        this.chefId = chefId;
    }

    public void setChefFName(String chefFName) {
        this.chefFName = chefFName;
    }

    public void setChefLName(String chefLName) {
        this.chefLName = chefLName;
    }

    public void setChefPhone(int chefPhone) {
        this.chefPhone = chefPhone;
    }

    public void setChefOrderId(String chefOrderId) {
        this.chefOrderId = chefOrderId;
    }

    public String toString() {
        return "Chef ID: " + chefId + "\n" +
               "Chef First Name: " + chefFName + "\n" +
               "Chef Last Name: " + chefLName + "\n" +
               "Chef Phone: " + chefPhone + "\n" +
               "Chef Order ID: " + chefOrderId + "\n";
    }
}
