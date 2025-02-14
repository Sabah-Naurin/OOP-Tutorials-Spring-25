package com.bankmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {

    @FXML
    private TextField initialBalanceField;
    @FXML
    private TextField idField;
    @FXML
    private Label detailsLabel;
    @FXML
    private TextField searchAmountField;
    @FXML
    private TextField searchIdFIeld;

    private ArrayList<BankAccount> accountList = new ArrayList<>();

    @FXML
    public void onDepositButtonClick(ActionEvent actionEvent) {
        String id = searchIdFIeld.getText();
        double depositAmount = Double.parseDouble(searchAmountField.getText());

        for (BankAccount ba: accountList) {
            if (ba.getId().equals(id)) {
                if (ba.deposit(depositAmount)) {
                    detailsLabel.setText("Amount successfully Deposited.");
                } else detailsLabel.setText("There was an issue with depositing money");
            }
        }
    }

    @FXML
    public void onCreateAccountButtonClick(ActionEvent actionEvent) {
        String id = idField.getText();
        double balance = Double.parseDouble(initialBalanceField.getText());

        BankAccount account = new BankAccount(id, balance);
        accountList.add(account);

        detailsLabel.setText("Bank Account Successfully Created!");

    }

    @FXML
    public void onShowBalanceButtonClick(ActionEvent actionEvent) {
        String id = searchIdFIeld.getText();

        for (BankAccount ba: accountList) {
            if (ba.getId().equals(id)) {
                detailsLabel.setText("Account Balance: " + ba.getBalance());
            }
        }

    }

    @FXML
    public void onWithdrawButtonClick(ActionEvent actionEvent) {
        String id = searchIdFIeld.getText();
        double withdrawAmount = Double.parseDouble(searchAmountField.getText());

        for (BankAccount ba: accountList) {
            if (ba.getId().equals(id)) {
                if (ba.withdraw(withdrawAmount)) {
                    detailsLabel.setText("Amount successfully Withdrawn.");
                } else detailsLabel.setText("There was an issue with withdrawing money");
            }
        }
    }
}