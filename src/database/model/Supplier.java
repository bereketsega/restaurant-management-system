package database.model;

public class Supplier {
    private int supplierId;
    private int supplierPhone;
    private String supplierCity;
    private String supplierAddress;

    public Supplier(int supplierId, int supplierPhone, String supplierCity, String supplierAddress) {
        this.supplierId = supplierId;
        this.supplierPhone = supplierPhone;
        this.supplierCity = supplierCity;
        this.supplierAddress = supplierAddress;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public int getSupplierPhone() {
        return supplierPhone;
    }

    public String getSupplierCity() {
        return supplierCity;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setSupplierPhone(int supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public void setSupplierCity(String supplierCity) {
        this.supplierCity = supplierCity;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String toString() {
        return "Supplier ID: " + supplierId + "\n" +
               "Supplier Phone: " + supplierPhone + "\n" +
               "Supplier City: " + supplierCity + "\n" +
               "Supplier Address: " + supplierAddress + "\n";
    }
}
