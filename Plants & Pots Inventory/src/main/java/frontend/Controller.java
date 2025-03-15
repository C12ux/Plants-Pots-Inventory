package frontend;

import java.net.URL;
import javafx.scene.layout.AnchorPane;
import java.util.*;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.application.Platform;
import javax.swing.*;
import java.io.IOException;

public class Controller {

    // Login
    @FXML
    private Button btnsignin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML Button btnLogout;

    // Dashboard navigation buttons
    @FXML
    private Button btnProducts;
    @FXML
    private Button btnCurrentStock;
    @FXML
    private Button btnCustomers;
    @FXML
    private Button btnSuppliers;
    @FXML
    private Button btnSales;
    @FXML
    private Button btnPurchase;
    @FXML
    private Button btnusr;
    @FXML
    private Button btncategories;

    //Users
    @FXML
    private TextField userIDField;
    @FXML
    private TextField userNameField;
    @FXML
    private TextField userContactField;
    @FXML
    private TextField userPasswordField;
    @FXML
    private TextField userPositionField;

    //Suppliers
    @FXML
    private TextField supplierIDField;
    @FXML
    private TextField supplierNameField;
    @FXML
    private TextField supplierContactField;
    @FXML
    private TextField supplierAddressField;
    @FXML
    private TextField supplierDescField;

    //Stocks
    @FXML
    private TextField stockIDField;
    @FXML
    private TextField stockProductIDField;
    @FXML
    private TextField stockQuantityField;


    //Customers
    @FXML
    private TextField custIDField;
    @FXML
    private TextField custNameField;
    @FXML
    private TextField custContactField;
    @FXML
    private TextField custEmailField;

    //Category
    @FXML
    private TextField categoryIDField;
    @FXML
    private TextField categoryNameField;

    //Products
    @FXML
    private ComboBox<String> categoryComboBox;
    @FXML
    private ComboBox<String> supplierComboBox;
    @FXML
    private TextField productIDField;
    @FXML
    private TextField productNameField;
    @FXML
    private TextField productSizeField;
    @FXML
    private TextField productPriceField;

    //Sales
    @FXML
    private ComboBox<String> salesCustomerID;
    @FXML
    private ComboBox<String> sales2CustOrderIDField;
    @FXML
    private ComboBox<String> salesProductIDField;
    @FXML
    private TextField salesCustOrderIDField;
    @FXML
    private TextField salesCustOrderSummaryIDField;
    @FXML
    private TextField salesQuantityField;
    @FXML
    private TextField salesDateField;
    @FXML
    private ComboBox<String> salesUserIDField;

    //Purchase
    @FXML
    private TextField purchaseOrderforSupplierIDField;
    @FXML
    private TextField purchaseDateOrderedField;
    @FXML
    private TextField purchaseDateExpectField;
    @FXML
    private TextField purchaseStatusField;
    @FXML
    private TextField purchaseSupplierOrdersTransactionIDField;
    @FXML
    private TextField purchaseQuantityField;
    @FXML
    private TextField transactTypeField;
    @FXML
    private ComboBox<String> purchaseSupplierID;
    @FXML
    private ComboBox<String> purchaseOrderforSupplierID2Field;
    @FXML
    private ComboBox<String> purchaseProductIDField;


    //For Signin
    @FXML
    private void close() {
        Platform.exit();
    }

    @FXML
    private void logout(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/login.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.setScene(new Scene(root));
    }


    // To User FXML
    @FXML
    private void clkusr(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-users.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnusr.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // To Products FXML
    @FXML
    private void ClickBtnProducts(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-products.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnProducts.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // To Current Stock FXML
    @FXML
    private void ClickbtnCurrentStock(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-stock.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnCurrentStock.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // To Customer FXML
    @FXML
    private void ClickbtnCustomers(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-customers.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnCustomers.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // To Suppliers FXML
    @FXML
    private void ClickbtnSuppliers(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-suppliers.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnSuppliers.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // To Sales FXML
    @FXML
    private void ClickbtnSales(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-sales.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnSales.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // To Purchase FXML
    @FXML
    private void clickbtnPurchase(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-purchase.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnPurchase.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    @FXML
    private void clkCategories(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/frontend/dashboard-category.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btncategories.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // Sign-In
    @FXML
    public void signInButton(ActionEvent event) {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT COUNT(1) FROM tblUser WHERE strUserName = '" + username.getText() + "' AND password = '" + password.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            if (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    // Successful login, navigate to Users dashboard
                    loadDashboard("/frontend/dashboard-users.fxml");
                } else {
                    // Invalid login, show alert
                    showAlert(Alert.AlertType.ERROR, "Login Error", null, "Invalid username or password. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // User Functions
    @FXML
    private void clkUAdd(ActionEvent event) {
        String userID = userIDField.getText();
        String userName = userNameField.getText();
        String userContactNo = userContactField.getText();
        String userPassword = userPasswordField.getText();
        String userPosition = userPositionField.getText();


        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertUser = "INSERT INTO dbPotteryInventory.tblUser (strUserID, strUserName, password, intContactNo, strPosition) " +
                "VALUES ('" + userID + "', '" + userName + "', '" + userPassword + "', '" + userContactNo + "', '" + userPosition + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertUser);

            // Clear fields after successful add
            clearUserFields();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkUEdit(ActionEvent event) {
        String userID = userIDField.getText();
        String userName = userNameField.getText();
        String contactNo = userContactField.getText();
        String userPassword = userPasswordField.getText();
        String position = userPositionField.getText();

        // Check if contactNo is numeric
        /*if (!isNumeric(contactNo)) {
            JOptionPane.showMessageDialog(null, "Contact number must be numeric.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if the contact number is not numeric
        }*/

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateUser = "UPDATE dbPotteryInventory.tblUser " +
                "SET strUserName = '" + userName + "', password = '" + userPassword + "', intContactNo ='" + contactNo + "', strPosition = '" + position + "' " +
                "WHERE strUserID = '" + userID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateUser);

            // Clear fields after successful edit
            clearUserFields();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    // Numeric Checker
    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @FXML
    private void clkUDelete(ActionEvent event) {
        String userID = userIDField.getText();

        // Perform database delete logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteUser = "DELETE FROM dbPotteryInventory.tblUser WHERE strUserID = '" + userID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteUser);

            // Clear fields after successful delete
            clearUserFields();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    // To Load Dashboard
    private void loadDashboard(String resourcePath) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(resourcePath));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) btnsignin.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    // Alerts
    private void showAlert(Alert.AlertType alertType, String title, String headerText, String contentText) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        alert.showAndWait();
    }

    private void clearUserFields() {
        userIDField.clear();
        userNameField.clear();
        userContactField.clear();
        userPasswordField.clear();
        userPositionField.clear();
    }

    // Supplier Functions
    @FXML
    private void clkSAdd(ActionEvent event) {
        String sppID = supplierIDField.getText();
        String sppName = supplierNameField.getText();
        String sppCNo = supplierContactField.getText();
        String sppAddress = supplierAddressField.getText();
        String sppDesc = supplierDescField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertSupplier = "INSERT INTO dbPotteryInventory.tblSuppliers (strSupplierID, strSupplierName, intContactNo, strAddress, strDescription) " +
                "VALUES ('" + sppID + "', '" + sppName + "', '" + sppCNo + "', '" + sppAddress + "', '" + sppDesc + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertSupplier);

            // Clear fields after successful add
            clearSppFields();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkSEdit(ActionEvent event) {
        String sppID = supplierIDField.getText();
        String sppName = supplierNameField.getText();
        String sppCNo = supplierContactField.getText();
        String sppAddress = supplierAddressField.getText();
        String sppDesc = supplierDescField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblSuppliers " +
                "SET strSupplierName = '" + sppName + "', intContactNo = '" + sppCNo + "', strAddress = '" + sppAddress + "', strDescription = '" + sppDesc + "'"+
                "WHERE strSupplierID = '" + sppID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);

            // Clear fields after successful edit
            clearSppFields();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkSDelete(ActionEvent event) {
        String sppID = supplierIDField.getText();

        // Perform database delete logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblSuppliers WHERE strSupplierID = '" + sppID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            // Clear fields after successful delete
            clearSppFields();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void clearSppFields() {
        supplierIDField.clear();
        supplierNameField.clear();
        supplierContactField.clear();
        supplierAddressField.clear();
        supplierDescField.clear();
    }

    // Customer Functions
    @FXML
    private void clkCAdd(ActionEvent event) {
        String custID = custIDField.getText();
        String custName = custNameField.getText();
        String custCNo = custContactField.getText();
        String custEmail = custEmailField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertCustomer = "INSERT INTO dbPotteryInventory.tblCustomers (strCustomerID, strCustomerName, intContactNo, strEmail) " +
                "VALUES ('" + custID + "', '" + custName + "', '" + custCNo + "', '" + custEmail + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertCustomer);

            // Clear fields after successful add
            clearCustField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkCEdit(ActionEvent event) {
        String custID = custIDField.getText();
        String custName = custNameField.getText();
        String sppCNo = custContactField.getText();
        String custEmail = custEmailField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateCustomer = "UPDATE dbPotteryInventory.tblCustomers " +
                "SET strCustomerName = '" + custName + "', intContactNo = '" + sppCNo + "', strEmail = '" + custEmail + "' " +
                "WHERE strCustomerID = '" + custID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateCustomer);

            // Clear fields after successful edit
            clearCustField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkCDelete(ActionEvent event) {
        String custID = custIDField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteCustomer = "DELETE FROM dbPotteryInventory.tblCustomers WHERE strCustomerID = '" + custID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteCustomer);

            // Clear fields after successful delete
            clearCustField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void clearCustField() {
        custIDField.clear();
        custNameField.clear();
        custContactField.clear();
        custEmailField.clear();
    }


    //Stock Functions
    @FXML
    private void clkCSAdd(ActionEvent event) {
        String stockID = stockIDField.getText();
        String stockProdID = stockProductIDField.getText();
        String stockQty = stockQuantityField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertStock = "INSERT INTO dbPotteryInventory.tblProductStocks (strStockID, strProductID, intQuantity) " +
                "VALUES ('" + stockID + "', '" + stockProdID + "', '" + stockQty + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertStock);

            clearStockField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkCSEdit(ActionEvent event) {
        String stockID = stockIDField.getText();
        String stockProdID = stockProductIDField.getText();
        String stockQty = stockQuantityField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblProductStocks " +
                "SET strProductID = '" + stockProdID + "', intQuantity = '" + stockQty + "'" +
                "WHERE strStockID = '" + stockID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);


            // Clear fields after successful edit
            clearStockField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkCSDelete(ActionEvent event) {
        String stockID = stockIDField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblProductStocks WHERE strStockID = '" + stockID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            // Clear fields after successful delete
            clearStockField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }


    private void clearStockField() {
        stockIDField.clear();
        stockProductIDField.clear();
        stockQuantityField.clear();
    }

    //Categories Functions
    @FXML
    private void clkCTAdd(ActionEvent event) {
        String catID = categoryIDField.getText();
        String catName = categoryNameField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertSupplier = "INSERT INTO dbPotteryInventory.tblProductCategories (strCategoryID, strCategoryName) " +
                "VALUES ('" + catID + "', '" + catName + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertSupplier);

            // Clear fields after successful add
            clearCategoryField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkCTEdit(ActionEvent event) {
        String catID = categoryIDField.getText();
        String catName = categoryNameField.getText();

        // Perform database update logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblProductCategories " +
                "SET strCategoryName = '" + catName + "'" +
                "WHERE strCategoryID = '" + catID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);

            // Clear fields after successful edit
            clearCategoryField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkCTDelete(ActionEvent event) {
        String catID = categoryIDField.getText();

        // Perform database delete logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblProductCategories WHERE strCategoryID = '" + catID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            // Clear fields after successful delete
            clearCategoryField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void clearCategoryField() {
        categoryIDField.clear();
        categoryNameField.clear();
    }

    //Products Functions

    @FXML
    private void clkPAdd(ActionEvent event) {
        String productID = productIDField.getText();
        String strCatID = String.valueOf(categoryComboBox.getValue());
        String strSppID = String.valueOf(supplierComboBox.getValue());
        String strProdName = productNameField.getText();
        String intPrice = productPriceField.getText();
        String strSize = productSizeField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertSupplier = "INSERT INTO dbPotteryInventory.tblPotteryProducts (strProductID, strCategoryID, strSupplierID, strProductName, intPrice, strSize) " +
                "VALUES ('" + productID + "', '" + strCatID + "', '" + strSppID + "','" + strProdName + "','" + intPrice + "','" + strSize + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertSupplier);

            // Clear fields after successful add
            clearProductField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkPEdit(ActionEvent event) {
        String productID = productIDField.getText();
        String strCatID = String.valueOf(categoryComboBox.getValue());
        String strSppID = String.valueOf(supplierComboBox.getValue());
        String strProdName = productNameField.getText();
        String intPrice = productPriceField.getText();
        String strSize = productSizeField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblPotteryProducts " +
                "SET strCategoryID = '" + strCatID + "', strSupplierID = '" + strSppID + "', strProductName = '" + strProdName + "', intPrice = '" + intPrice + "', strSize = '" + strSize + "' " +
                "WHERE strProductID = '" + productID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);

            // Clear fields after successful edit
            clearProductField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void populateCategoryComboBox() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strCategoryID FROM dbPotteryInventory.tblProductCategories";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                categoryComboBox.getItems().add(resultSet.getString("strCategoryID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }

    private void populateSupplierComboBox() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strSupplierID FROM dbPotteryInventory.tblSuppliers";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                supplierComboBox.getItems().add(resultSet.getString("strSupplierID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }


    @FXML
    private void clkPDelete(ActionEvent event) {
        String prodID = productIDField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblPotteryProducts WHERE strProductID = '" + prodID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            // Clear fields after successful delete
            clearProductField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void clearProductField() {
        productIDField.clear();
        productNameField.clear();
        productPriceField.clear();
        productSizeField.clear();
        categoryComboBox.setValue(null);
        supplierComboBox.setValue(null);
    }

    //Sales
    //Top Part
    @FXML
    private void clkST1Add(ActionEvent event) {
        String stCustOrdrID = salesCustOrderIDField.getText();
        String custID = String.valueOf(salesCustomerID.getValue());
        String salesDate = salesDateField.getText();
        String stUserID = String.valueOf(salesUserIDField.getValue());

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertSupplier = "INSERT INTO dbPotteryInventory.tblCustomerOrders (strCustOrderID, datOrderDate, strCustomerID, strUserID) " +
                "VALUES ('" + stCustOrdrID + "', '" + salesDate + "', '" + custID + "', '" + stUserID + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertSupplier);

            // Clear fields after successful add
            clearSalesTopField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkST1Edit(ActionEvent event) {
        String stCustOrdrID = salesCustOrderIDField.getText();
        String custID = String.valueOf(salesCustomerID.getValue());
        String salesDate = salesDateField.getText();
        String stUserID = String.valueOf(salesUserIDField.getValue());

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblCustomerOrders " +
                "SET datOrderDate = '" + salesDate + "', strCustomerID = '" + custID + "', strUserID = '"+ stUserID + "'" +
                "WHERE strCustOrderID = '" + stCustOrdrID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);

            // Clear fields after successful edit
            clearSalesTopField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void populateCustomerIDComboBox() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strCustomerID FROM dbPotteryInventory.tblCustomers";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                salesCustomerID.getItems().add(resultSet.getString("strCustomerID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void populateSalesUserIDCombobox() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strUserID FROM dbPotteryInventory.tblUser";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                salesUserIDField.getItems().add(resultSet.getString("strUserID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }


    @FXML
    private void clkST1Delete(ActionEvent event) {
        String stCustOrdrID = salesCustOrderIDField.getText();

        // Perform database delete logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblCustomerOrders WHERE strCustOrderID = '" + stCustOrdrID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            clearSalesTopField();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }

    private void clearSalesTopField() {
        salesCustOrderIDField.clear();
        salesDateField.clear();
        salesCustomerID.setValue(null);
        salesUserIDField.setValue(null);


    }

    //Sales Bottom Part
    @FXML
    private void clkS2Add(ActionEvent event) {
        String custOrdrSummID = salesCustOrderSummaryIDField.getText();
        String custOrderID = String.valueOf(sales2CustOrderIDField.getValue());
        String prodID = String.valueOf(salesProductIDField.getValue());
        int intQty = Integer.parseInt(salesQuantityField.getText());


        // Perform database insertion logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertSupplier = "INSERT INTO dbPotteryInventory.tblCustomerOrderSummary (strCustOrderSummaryID, strCustOrderID, strProductID, intQuantity) " +
                "VALUES ('" + custOrdrSummID + "', '" + custOrderID + "', '" + prodID + "','" + intQty + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertSupplier);

            // Optional: Refresh table or UI after adding
            // Example: tableView.getItems().addAll(new User(userID, userName, contactNo, position));

            // Clear fields after successful add
            clearSalesBttmField();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }

    @FXML
    private void clkST2Edit(ActionEvent event) {
        String custOrdrSummID = salesCustOrderSummaryIDField.getText();
        String custOrderID = String.valueOf(sales2CustOrderIDField.getValue());
        String prodID = String.valueOf(salesProductIDField.getValue());
        String intQty = salesQuantityField.getText();

        // Perform database update logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblCustomerOrderSummary " +
                "SET strCustOrderID = '" + custOrderID + "', strProductID = '" + prodID + "', intQuantity = '" + intQty + "'" +
                "WHERE strCustOrderSummaryID = '" + custOrdrSummID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);

            // Optional: Refresh table or UI after editing
            // Example: tableView.getItems().set(selectedIndex, new User(userID, userName, contactNo, position));

            // Clear fields after successful edit
            clearSalesBttmField();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }

    @FXML
    private void clkST2Delete(ActionEvent event) {
        String custOrdrSummID = salesCustOrderSummaryIDField.getText();

        // Perform database delete logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblCustomerOrderSummary WHERE strCustOrderSummaryID = '" + custOrdrSummID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            // Optional: Refresh table or UI after deletion
            // Example: tableView.getItems().remove(selectedIndex);

            // Clear fields after successful delete
            clearSalesBttmField();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }
    private void populateCustomerOrderIDComboBox() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strCustOrderID FROM dbPotteryInventory.tblCustomerOrders";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                sales2CustOrderIDField.getItems().add(resultSet.getString("strCustOrderID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }
    private void populateProductIDComboBox() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strProductID FROM dbPotteryInventory.tblPotteryProducts";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                salesProductIDField.getItems().add(resultSet.getString("strProductID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }
    private void clearSalesBttmField() {
        salesCustOrderSummaryIDField.clear();
        salesQuantityField.clear();
        sales2CustOrderIDField.setValue(null);
        salesProductIDField.setValue(null);

    }

    //Purchase Top Part
    @FXML
    private void clkPTAdd(ActionEvent event) {
        String sppPID = purchaseOrderforSupplierIDField.getText();
        String psppID = String.valueOf(purchaseSupplierID.getValue());
        String pdateOrdr = purchaseDateOrderedField.getText();
        String pdateExpect = purchaseDateExpectField.getText();
        String pstatus = purchaseStatusField.getText();


        // Perform database insertion logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertSupplier = "INSERT INTO dbPotteryInventory.tblOrdersForSuppliers (strOrderForSuppliersID, strSupplierID, datOrderDate, datExpectedDate, strStatus)" +
                "VALUES ('" + sppPID + "', '" + psppID + "', '" + pdateOrdr + "', '" + pdateExpect + "', '" + pstatus + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertSupplier);

            // Optional: Refresh table or UI after adding
            // Example: tableView.getItems().addAll(new User(userID, userName, contactNo, position));

            // Clear fields after successful add
            clearPurchaseTopField();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }

    @FXML
    private void clkPTEdit(ActionEvent event) {
        String sppPID = purchaseOrderforSupplierIDField.getText();
        String psppID = String.valueOf(purchaseSupplierID.getValue());
        String pdateOrdr = purchaseDateOrderedField.getText();
        String pdateExpect = purchaseDateExpectField.getText();
        String pstatus = purchaseStatusField.getText();

        // Perform database update logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblOrdersForSuppliers " +
                "SET strSupplierID = '" + psppID + "', datOrderDate = '" + pdateOrdr + "', datExpectedDate = '" + pdateExpect + "', strStatus =  '" + pstatus + "' " +
                "WHERE strOrderForSuppliersID = '" + sppPID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);

            // Optional: Refresh table or UI after editing
            // Example: tableView.getItems().set(selectedIndex, new User(userID, userName, contactNo, position));

            // Clear fields after successful edit
            clearPurchaseTopField();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }

    private void populatePurchaseSupplierID() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strSupplierID FROM dbPotteryInventory.tblSuppliers";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                purchaseSupplierID.getItems().add(resultSet.getString("strSupplierID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }


    @FXML
    private void clkPTDelete(ActionEvent event) {
        String pOrdrSppID = purchaseOrderforSupplierIDField.getText();

        // Perform database delete logic here
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblOrdersForSuppliers WHERE strOrderForSuppliersID = '" + pOrdrSppID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            clearPurchaseTopField();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle database errors or display error message
        }
    }

    @FXML
    private void initialize() {
        populateCategoryComboBox();
        populateSupplierComboBox();
        populateCustomerIDComboBox();
        populateSalesUserIDCombobox();
        populateProductIDComboBox();
        populateCustomerOrderIDComboBox();
        populatePurchaseSupplierID();
        populatepurchaseOrderforSupplierID2Field();
        populatepurchaseProductIDField();
    }

    private void clearPurchaseTopField() {
        purchaseOrderforSupplierIDField.clear();
        purchaseDateOrderedField.clear();
        purchaseDateExpectField.clear();
        purchaseStatusField.clear();
        purchaseSupplierID.setValue(null);

    }

    //Purchase Bottom Part

    @FXML
    private void clkPBAdd(ActionEvent event) {
        String transacID = purchaseSupplierOrdersTransactionIDField.getText();
        String sppPurID = String.valueOf(purchaseOrderforSupplierID2Field.getValue());
        String prodID = String.valueOf(purchaseProductIDField.getValue());
        String pQty = purchaseQuantityField.getText();
        String pTransacType = transactTypeField.getText();


        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String insertSupplier = "INSERT INTO dbPotteryInventory.tblSupplierOrderTransaction (strSupplierOrdersTransactionID, strOrderForSuppliersID, strSupplierProductsID, intQuantity, strTransactionType) " +
                "VALUES ('" + transacID + "', '" + sppPurID + "', '" + prodID + "', '" + pQty + "', '" + pTransacType + "')";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(insertSupplier);


            // Clear fields after successful add
            clearPurchaseTBtmField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    @FXML
    private void clkPBEdit(ActionEvent event) {
        String transacID = purchaseSupplierOrdersTransactionIDField.getText();
        String sppPurID = String.valueOf(purchaseOrderforSupplierID2Field.getValue());
        String prodID = String.valueOf(purchaseProductIDField.getValue());
        String pQty = purchaseQuantityField.getText();
        String pTransacType = transactTypeField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String updateSupplier = "UPDATE dbPotteryInventory.tblSupplierOrderTransaction " +
                "SET strOrderForSuppliersID = '" + sppPurID + "', strSupplierProductsID = '" + prodID + "', intQuantity = '" + pQty + "', strTransactionType =  '" + pTransacType + "' " +
                "WHERE strSupplierOrdersTransactionID = '" + transacID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(updateSupplier);


            // Clear fields after successful edit
            clearPurchaseTBtmField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void populatepurchaseOrderforSupplierID2Field() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strOrderForSuppliersID FROM dbPotteryInventory.tblOrdersForSuppliers";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                purchaseOrderforSupplierID2Field.getItems().add(resultSet.getString("strOrderForSuppliersID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }

    private void populatepurchaseProductIDField() {
        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "SELECT DISTINCT strSupplierProductsID FROM dbPotteryInventory.tblSupplierProducts";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                purchaseProductIDField.getItems().add(resultSet.getString("strSupplierProductsID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }


    @FXML
    private void clkPBDelete(ActionEvent event) {
        String transacID = purchaseSupplierOrdersTransactionIDField.getText();

        dbConnection connectNow = new dbConnection();
        Connection connectDB = connectNow.getConnection();

        String deleteSupplier = "DELETE FROM dbPotteryInventory.tblSupplierOrderTransaction WHERE strSupplierOrdersTransactionID = '" + transacID + "'";

        try {
            Statement statement = connectDB.createStatement();
            statement.executeUpdate(deleteSupplier);

            clearPurchaseTBtmField();
        } catch (Exception e) {
            e.printStackTrace();
            // Error Handling
        }
    }
    private void clearPurchaseTBtmField() {
        purchaseSupplierOrdersTransactionIDField.clear();
        purchaseQuantityField.clear();
        transactTypeField.clear();
        purchaseOrderforSupplierID2Field.setValue(null);
        purchaseProductIDField.setValue(null);

    }

}



