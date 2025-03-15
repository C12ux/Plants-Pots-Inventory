package frontend;

import javafx.beans.property.*;

public class Stock {
    private final StringProperty stockID;
    private final StringProperty stockProdID;
    private final IntegerProperty intQty;

    public Stock(String stockID, String stckProdID, int intQty) {
        this.stockID = new SimpleStringProperty(stockID);
        this.stockProdID = new SimpleStringProperty(stckProdID);
        this.intQty = new SimpleIntegerProperty(intQty);
    }

    public StringProperty stockIDProperty() {
        return stockID;
    }

    public String getStockID() {
        return stockID.get();
    }

    public void setStockID(String stockID) {
        this.stockID.set(stockID);
    }

    public StringProperty stockProdIDProperty() {
        return stockProdID;
    }

    public String getStockProdID() {
        return stockProdID.get();
    }

    public void setStock(String stckProdID) {
        this.stockProdID.set(stckProdID);
    }

    public IntegerProperty stockQtyProperty() {
        return intQty;
    }

    public int getStockQty() {
        return intQty.get();
    }

    public void setStockQty(int intQty) {
        this.intQty.set(intQty);
    }

    public Object getStkID() {
        return null;
    }
}
