package frontend;

import javafx.beans.property.*;

public class Suppliers {
    private final StringProperty sppID;
    private final StringProperty sppName;
    private final IntegerProperty sppContactNo;
    private final StringProperty sppAddress;

    private final StringProperty sppDescription;

    public Suppliers(String sppID, String sppName, int sppContactNo, String sppAddress, String sppDescription) {
        this.sppID = new SimpleStringProperty(sppID);
        this.sppName = new SimpleStringProperty(sppName);
        this.sppContactNo = new SimpleIntegerProperty(sppContactNo);
        this.sppAddress = new SimpleStringProperty(sppAddress);
        this.sppDescription = new SimpleStringProperty(sppDescription);
    }

    public StringProperty sppIDProperty() {
        return sppID;
    }

    public String getSppID() {
        return sppID.get();
    }

    public void setSppID(String userId) {
        this.sppID.set(userId);
    }

    public StringProperty sppNameProperty() {
        return sppName;
    }

    public String getSppName() {
        return sppName.get();
    }

    public void setSppName(String sppName) {
        this.sppName.set(sppName);
    }

    public IntegerProperty sppContactNoProperty() {
        return sppContactNo;
    }

    public int getSppContactNo() {
        return sppContactNo.get();
    }

    public void setSppContactNo(int contactNo) {
        this.sppContactNo.set(contactNo);
    }

    public StringProperty sppAddressProperty() {
        return sppAddress;
    }

    public String getSppAddress() {
        return sppAddress.get();
    }

    public void setSppAddress(String sppAddress) {
        this.sppAddress.set(sppAddress);
    }

    public StringProperty sppDescProperty() {
        return sppDescription;
    }

    public String getSppDesc() {
        return sppDescription.get();
    }

    public void setSppDesc(String sppDesc) {
        this.sppDescription.set(sppDesc);
    }

    public Object getUserID() {
        return null;
    }
}
