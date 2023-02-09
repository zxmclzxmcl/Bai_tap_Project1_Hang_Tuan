package Tuan2;

import java.io.IOException;
import Tuan2.ctl.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.*;

public class t2 {

    int a;
    @FXML
    private Label db;

    @FXML
    void b1(ActionEvent event) {
        db.setText("Cho số tự nhiên N bất kỳ\nTính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)");
        a=1;
    }

    @FXML
    void b2(ActionEvent event) {
        db.setText("Cho số tự nhiên N bất kỳ, tính tổng\nS= 1+ 1/2! + 1/3! + … + 1/N!");
        a=2;
    }

    @FXML
    void b3(ActionEvent event) {
        db.setText("Cho số tự nhiên N bất kỳ\ntính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
        a=3;
    }

    @FXML
    void b4(ActionEvent event) {
        db.setText("Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.");
        a=4;
    }

    @FXML
    void menu(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();

    }

    @FXML
    void run(ActionEvent event) {
        if(a==1){
            System.out.println("\n\nBai 1 Tuan 2");
            bai1.main(null);
        }
        else if(a==2){
            System.out.println("\n\nBai 2 Tuan 2");
            bai2.main(null);
        }
        else if(a==3){
            System.out.println("\n\nBai 3 Tuan 2");
            bai3.main(null);
        }
        else if(a==4){
            System.out.println("\n\nBai 4 Tuan 2");
            bai4.main(null);
        }
        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("ERROR");
            alert.setHeaderText("Vui lòng chọn bài tập muốn chạy");
            alert.showAndWait();
        }
    }

}
