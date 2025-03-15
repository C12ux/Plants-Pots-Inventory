package frontend;

import javafx.beans.property.*;


public class Category {
    private final StringProperty catID;
    private final StringProperty catName;

    public Category(String catID, String catName) {
        this.catID = new SimpleStringProperty(catID);
        this.catName = new SimpleStringProperty(catName);
    }

    public StringProperty categoryIDProperty() {
        return catID;
    }

    public String getCatID() {
        return catID.get();
    }

    public void setCatID(String userId) {
        this.catID.set(userId);
    }

    public StringProperty catNameProperty() {
        return catName;
    }

    public String getCatName() {
        return catName.get();
    }

    public void setCatName(String sppName) {
        this.catName.set(sppName);
    }

    public Object getCategoryID() {
        return null;
    }
}
