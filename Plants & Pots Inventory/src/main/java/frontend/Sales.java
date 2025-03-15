package frontend;
import javafx.beans.property.*;
public class Sales {
    private final StringProperty cstOID;
    private final StringProperty cstID;
    private final StringProperty salesDate;
    private final StringProperty salesTranscID;
    private final StringProperty sToCustOrdrID;
    private final StringProperty salesProdID;
    private final StringProperty salesUserID;

    private final StringProperty salesQty;

    public Sales(String cstOID, String cstID, String salesDate, String salesTranscID, String sToCustOrdrID, String salesProdID, String salesQty, String salesUserID ) {
        this.cstOID = new SimpleStringProperty(cstOID);
        this.cstID = new SimpleStringProperty(cstID);
        this.salesDate = new SimpleStringProperty(salesDate);
        this.salesTranscID = new SimpleStringProperty(salesTranscID);
        this.sToCustOrdrID = new SimpleStringProperty(sToCustOrdrID);
        this.salesProdID = new SimpleStringProperty(salesProdID);
        this.salesQty = new SimpleStringProperty(salesQty);
        this.salesUserID = new SimpleStringProperty(salesUserID);
    }

    public String getSalesCstOID() {
        return cstOID.get();
    }

    public void setSalesCstOID(String cstOID) {
        this.cstOID.set(cstOID);
    }

    public StringProperty cstOIDProperty() {
        return cstOID;
    }

    public String getCstID() {
        return cstID.get();
    }

    public void setCstID(String cstID) {
        this.cstID.set(cstID);
    }

    public StringProperty cstIDProperty() {
        return cstID;
    }

    public String getSalesDate() {
        return salesDate.get();
    }

    public void setSalesDate(String salesDate) {
        this.salesDate.set(salesDate);
    }

    public StringProperty salesDateProperty() {
        return salesDate;
    }

    public String getSalesTranscID() {
        return salesTranscID.get();
    }

    public void setSalesTranscID(String salesTranscID) {
        this.salesTranscID.set(salesTranscID);
    }

    public StringProperty salesTranscIDProperty() {
        return salesTranscID;
    }

    public String getsToCustOrdrID() {
        return sToCustOrdrID.get();
    }

    public String setSToCustOrdrID(String sToCustOrdrID) {
        this.sToCustOrdrID.set(sToCustOrdrID);
        return sToCustOrdrID;
    }

    public String getSalesProdID() {
        return salesProdID.get();
    }

    public void setSalesProdID(String cstOID) {
        this.salesProdID.set(cstOID);
    }

    public StringProperty salesProdIDProperty() {
        return salesProdID;
    }

    public StringProperty getSalesQtyProperty() {
        return salesQty;
    }
    public void setSalesQty(String salesQty) {
        this.salesQty.set(salesQty);
    }

    public StringProperty salesQtyProperty() {
        return salesQty;
    }

    public String getSize() {
        return sToCustOrdrID.get();
    }

    public void setSize(String size) {
        this.sToCustOrdrID.set(size);
    }

    public StringProperty sToCustOrdrIDProperty() {
        return sToCustOrdrID;
    }

    public String getSalesUserID() {
        return salesUserID.get();
    }

    public void setSalesUserID(String salesUserID) {
        this.salesUserID.set(salesUserID);
    }

    public StringProperty salesUserIDProperty() {
        return salesUserID;
    }
}
