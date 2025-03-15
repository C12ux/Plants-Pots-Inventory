package frontend;

import javafx.beans.property.*;

public class Customers {
    private final StringProperty custID;
    private final StringProperty custName;
    private final IntegerProperty custContactNo;
    private final StringProperty custEmail;

    public Customers(String custID, String custName, int custContactNo, String custEmail) {
        this.custID = new SimpleStringProperty(custID);
        this.custName = new SimpleStringProperty(custName);
        this.custContactNo = new SimpleIntegerProperty(custContactNo);
        this.custEmail = new SimpleStringProperty(custEmail);
    }

    public StringProperty custIDProperty() {
        return custID;
    }

    public String getCustID() {
        return custID.get();
    }

    public void setCustID(String userId) {
        this.custID.set(userId);
    }

    public StringProperty custNameProperty() {
        return custName;
    }

    public String getCustName() {
        return custName.get();
    }

    public void setCustName(String sppName) {
        this.custName.set(sppName);
    }

    public IntegerProperty contactNoProperty() {
        return custContactNo;
    }

    public int getContactNo() {
        return custContactNo.get();
    }

    public void setContactNo(int contactNo) {
        this.custContactNo.set(contactNo);
    }

    public StringProperty emailProperty() {
        return custEmail;
    }

    public String getEmail() {
        return custEmail.get();
    }

    public void setEmail(String email) {
        this.custEmail.set(email);
    }

    public Object getUserID() {
        return null;
    }
}
