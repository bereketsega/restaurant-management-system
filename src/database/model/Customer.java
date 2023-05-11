package database.model;

public class Customer {
    private int customerId;
    private String customerFName;
    private String customerLName;
    private String customerSSN;
    private String customerAddress;
    private long customerPhone;
    private String customerPayId; // refers to Payment.paymentId
    private String cutomerFoodId; // refers to FoodItem.foodId

    public Customer(int customerId, String customerFName, String customerLName, String customerSSN,
                    String customerAddress, long customerPhone, String customerPayId, String cutomerFoodId) {
        this.customerId = customerId;
        this.customerFName = customerFName;
        this.customerLName = customerLName;
        this.customerSSN = customerSSN;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.customerPayId = customerPayId;
        this.cutomerFoodId = cutomerFoodId;
    }

    public Customer(int customerId, String customerFName, String customerLName, String customerSSN,
                    String customerAddress, long customerPhone) {
        this.customerId = customerId;
        this.customerFName = customerFName;
        this.customerLName = customerLName;
        this.customerSSN = customerSSN;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public String getCustomerSSN() {
        return customerSSN;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public long getCustomerPhone() {
        return customerPhone;
    }

    public String getCustomerPayId() {
        return customerPayId;
    }

    public String getCutomerFoodId() {
        return cutomerFoodId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerFName(String customerFName) {
        this.customerFName = customerFName;
    }

    public void setCustomerLName(String customerLName) {
        this.customerLName = customerLName;
    }

    public void setCustomerSSN(String customerSSN) {
        this.customerSSN = customerSSN;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPhone(long customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setCustomerPayId(String customerPayId) {
        this.customerPayId = customerPayId;
    }

    public void setCutomerFoodId(String cutomerFoodId) {
        this.cutomerFoodId = cutomerFoodId;
    }

public String toString() {
        return "Customer ID: " + customerId + "\n" +
               "Customer First Name: " + customerFName + "\n" +
               "Customer Last Name: " + customerLName + "\n" +
               "Customer SSN: " + customerSSN + "\n" +
               "Customer Address: " + customerAddress + "\n" +
               "Customer Phone: " + customerPhone + "\n" +
               "Customer Payment ID: " + customerPayId + "\n" +
               "Customer Food ID: " + cutomerFoodId + "\n";
    }
}
