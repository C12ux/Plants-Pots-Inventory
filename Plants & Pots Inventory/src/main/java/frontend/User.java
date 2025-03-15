package frontend;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;

public class User {
    private final StringProperty userId;
    private final StringProperty userName;
    private final IntegerProperty contactNo;

    private final StringProperty password;
    private final StringProperty position;

    public User(String userId, String userName, int contactNo, String password, String position) {
        this.userId = new SimpleStringProperty(userId);
        this.userName = new SimpleStringProperty(userName);
        this.contactNo = new SimpleIntegerProperty(contactNo);
        this.password = new SimpleStringProperty(password);
        this.position = new SimpleStringProperty(position);
    }

    public StringProperty userIdProperty() {
        return userId;
    }

    public String getUserId() {
        return userId.get();
    }

    public void setUserId(String userId) {
        this.userId.set(userId);
    }

    public StringProperty userNameProperty() {
        return userName;
    }

    public String getUserName() {
        return userName.get();
    }

    public void setUserName(String userName) {
        this.userName.set(userName);
    }

    public IntegerProperty contactNoProperty() {
        return contactNo;
    }

    public int getContactNo() {
        return contactNo.get();
    }

    public void setContactNo(int contactNo) {
        this.contactNo.set(contactNo);
    }

    public StringProperty passwordProperty() {
        return password;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String position) {
        this.password.set(position);
    }

    public StringProperty positionProperty() {
        return position;
    }

    public String getPosition() {
        return position.get();
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public Object getUserID() {
        return null;
    }
}





