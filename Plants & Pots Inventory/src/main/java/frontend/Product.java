package frontend;

import javafx.beans.property.*;

public class Product {

    private final StringProperty productID;
    private final StringProperty categoryID;
    private final StringProperty supplierID;
    private final StringProperty productName;
    private final IntegerProperty price;
    private final StringProperty size;

    public Product(String productID, String categoryID, String supplierID, String productName, int price, String size) {
        this.productID = new SimpleStringProperty(productID);
        this.categoryID = new SimpleStringProperty(categoryID);
        this.supplierID = new SimpleStringProperty(supplierID);
        this.productName = new SimpleStringProperty(productName);
        this.price = new SimpleIntegerProperty(price);
        this.size = new SimpleStringProperty(size);
    }

    public String getProductID() {
        return productID.get();
    }

    public void setProductID(String productID) {
        this.productID.set(productID);
    }

    public StringProperty productIDProperty() {
        return productID;
    }

    public String getCategoryID() {
        return categoryID.get();
    }

    public void setCategoryID(String categoryID) {
        this.categoryID.set(categoryID);
    }

    public StringProperty categoryIDProperty() {
        return categoryID;
    }

    public String getSupplierID() {
        return supplierID.get();
    }

    public void setSupplierID(String supplierID) {
        this.supplierID.set(supplierID);
    }

    public StringProperty supplierIDProperty() {
        return supplierID;
    }

    public String getProductName() {
        return productName.get();
    }

    public void setProductName(String productName) {
        this.productName.set(productName);
    }

    public StringProperty productNameProperty() {
        return productName;
    }

    public int getPrice() {
        return price.get();
    }

    public void setPrice(int price) {
        this.price.set(price);
    }

    public IntegerProperty priceProperty() {
        return price;
    }

    public String getSize() {
        return size.get();
    }

    public void setSize(String size) {
        this.size.set(size);
    }

    public StringProperty sizeProperty() {
        return size;
    }
}
