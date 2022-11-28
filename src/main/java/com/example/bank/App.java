package com.example.bank;

import com.example.bank.Models.Model;
import com.example.bank.Views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showLoginWindow();
        Model.getInstance().getViewFactory();

    }
}
