package frontend;
import javafx.beans.property.*;

public class Purchase {
    private final StringProperty pOrdrSppID;
    private final StringProperty pSpID;
    private final StringProperty pDateOrdr;
    private final StringProperty pDateExpect;
    private final StringProperty pStatus;
    private final StringProperty pTranscID;

    private final StringProperty ppSppID;
    private final StringProperty pProdID;
    private final StringProperty pQuantity;

    private final StringProperty pTransacType;



    public Purchase(String pOrdrSppID, String pSpID, String pDateOrdr, String pDateExpect, String pStatus, String pTranscID, String ppSppID, String pProdID, String pQuantity, String pTransacType ) {
        this.pOrdrSppID = new SimpleStringProperty(pOrdrSppID);
        this.pSpID = new SimpleStringProperty(pSpID);
        this.pDateOrdr = new SimpleStringProperty(pDateOrdr);
        this.pDateExpect = new SimpleStringProperty(pDateExpect);
        this.pStatus = new SimpleStringProperty(pStatus);
        this.pTranscID = new SimpleStringProperty(pTranscID);
        this.ppSppID = new SimpleStringProperty(ppSppID);
        this.pProdID = new SimpleStringProperty(pProdID);
        this.pQuantity = new SimpleStringProperty(pQuantity);
        this.pTransacType = new SimpleStringProperty(pTransacType);
    }

    public String getpOrdrSppID() {
        return pOrdrSppID.get();
    }

    public void setpOrdrSppID(String pOrdrSppID) {
        this.pOrdrSppID.set(pOrdrSppID);
    }

    public StringProperty pOrdrSppIDProperty() {
        return pOrdrSppID;
    }

    public String getpSpID() {
        return pSpID.get();
    }

    public void setpSpID(String pSpID) {
        this.pSpID.set(pSpID);
    }

    public StringProperty pSpIDProperty() {
        return pSpID;
    }

    public String getpDateOrdr() {
        return pDateOrdr.get();
    }

    public void setpDateOrdr(String pDateOrdr) {
        this.pDateOrdr.set(pDateOrdr);
    }

    public StringProperty salespDateOrdr() {
        return pDateOrdr;
    }

    public String getpDateExpect() {
        return pDateExpect.get();
    }

    public void setpDateExpect(String pDateExpect) {
        this.pDateExpect.set(pDateExpect);
    }

    public StringProperty pDateExpectProperty() {
        return pDateExpect;
    }

    public String getspStatus() {
        return pStatus.get();
    }
    public void setpStatus(String pStatus) {
        this.pStatus.set(pStatus);
    }

    public StringProperty pStatusProperty() {
        return pStatus;
    }

    public String getpTranscID() {
        return pTranscID.get();
    }
    public void setpTranscID(String pTranscID) {
        this.pTranscID.set(pTranscID);
    }

    public StringProperty pTranscIDProperty() {
        return pTranscID;
    }

    public String getppSppID() {
        return ppSppID.get();
    }
    public void setpppSppID(String pTranscID) {
        this.ppSppID.set(pTranscID);
    }

    public StringProperty ppSppIDProperty() {
        return ppSppID;
    }

    public String getpProdID() {
        return pProdID.get();
    }
    public void setpProdID(String pProdID) {
        this.pProdID.set(pProdID);
    }

    public StringProperty pProdIDProperty() {
        return pProdID;
    }

    public String getpQuantity() {
        return pQuantity.get();
    }
    public void setpQuantity(String pProdID) {
        this.pQuantity.set(pProdID);
    }

    public StringProperty pQuantityProperty() {
        return pQuantity;
    }

    public String getpTransacType() {
        return pTransacType.get();
    }
    public void setpTransacType(String pTransacType) {
        this.pQuantity.set(pTransacType);
    }

    public StringProperty pTransacTypeProperty() {
        return pTransacType;
    }
}
