module com.example.bank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.bank to javafx.fxml;
    exports com.example.bank;
    exports com.example.bank.Controllers;
    exports com.example.bank.Controllers.Client;
    exports com.example.bank.Controllers.Admin;
    exports com.example.bank.Models;
    exports com.example.bank.Views;
}