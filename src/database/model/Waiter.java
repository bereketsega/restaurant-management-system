package database.model;

public class Waiter {
    private String waiterId;
    private String fname;
    private String lname;
    private String SSN;
    private String phoneNumber;
    private String mgrSSN;

    public Waiter(String waiterId, String fname, String lname, String SSN, String phoneNumber, String mgrSSN) {
        this.waiterId = waiterId;
        this.fname = fname;
        this.lname = lname;
        this.SSN = SSN;
        this.phoneNumber = phoneNumber;
        this.mgrSSN = mgrSSN;
    }
    public Waiter(String waiterId, String fname, String lname, String SSN, String phoneNumber) {
        this.waiterId = waiterId;
        this.fname = fname;
        this.lname = lname;
        this.SSN = SSN;
        this.phoneNumber = phoneNumber;
    }

    public String getWaiterId() {
        return waiterId;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getSSN() {
        return SSN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMgrSSN() {
        return mgrSSN;
    }

    public void setWaiterId(String waiterId) {
        this.waiterId = waiterId;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMgrSSN(String mgrSSN) {
        this.mgrSSN = mgrSSN;
    }
}
