package com.example.bank.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    public Button trans_to_cv_btn;
    public TextField amount_to_ch;
    public TextField amount_to_sv;
    public Button trans_to_sv_btn;
    public Label sv_acc_bal;
    public Label sv_acc_date;
    public Label withdrawal_limit;
    public Label sv_acc_num;
    public Label ch_acc_bal;
    public Label ch_acc_date;
    public Label transaction_limit;
    public Label ch_acc_num;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
