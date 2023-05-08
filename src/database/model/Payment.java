package database.model;

public class Payment {
    private int paymentId;
    private int cutomerId; // refers to Customer.customerId
    private double paymentAmount;
    private String paymentDate;
    private String paymentType;

    public Payment(int paymentId, int cutomerId, double paymentAmount, String paymentDate, String paymentType) {
        this.paymentId = paymentId;
        this.cutomerId = cutomerId;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentType = paymentType;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public int getCutomerId() {
        return cutomerId;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setCutomerId(int cutomerId) {
        this.cutomerId = cutomerId;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String toString() {
        return "Payment ID: " + paymentId + "\n" +
               "Customer ID: " + cutomerId + "\n" +
               "Payment Amount: " + paymentAmount + "\n" +
               "Payment Date: " + paymentDate + "\n" +
               "Payment Type: " + paymentType + "\n";
    }
}
