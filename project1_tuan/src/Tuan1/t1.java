package Tuan1;

import java.io.IOException;
import Tuan1.ctl.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.*;

public class t1 {

    int a;
    @FXML
    private Label db;

    @FXML
    void b1(ActionEvent event) {
        db.setText("In ra màn hình tất cả các hợp số <100");
        a=1;
    }

    @FXML
    void b2(ActionEvent event) {
        db.setText("In ra màn hình 20 số nguyên tố đầu tiên");
        a=2;
    }

    @FXML
    void b3(ActionEvent event) {
        db.setText("In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
        a=3;
    }

    @FXML
    void b4(ActionEvent event) {
        db.setText("In ra màn hình các số <100 và chia hết cho 3,7");
        a=4;
    }

    @FXML
    void b5(ActionEvent event) {
        db.setText("In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");
        a=5;
    }

    @FXML
    void b6(ActionEvent event) {
        db.setText("In ra màn hình 5 số hoàn hảo đầu tiên \n(Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1)");
        a=6;
    }

    @FXML
    void b7(ActionEvent event) {
        db.setText("Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số\na. Chia hết cho 5\nb. Chia 5 dư 1\nc. Chia 5 dư 2\nd. Chia 5 dư 3");
        a=7;
    }

    @FXML
    void menu(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();

    }

    @FXML
    void run(ActionEvent event) {
        if(a==1){
            System.out.println("\n\nBai 1 Tuan 1");
            Bai1.main(null);
        }
        else if(a==2){
            System.out.println("\n\nBai 2 Tuan 1");
            bai2.main(null);
        }
        else if(a==3){
            System.out.println("\n\nBai 3 Tuan 1");
            bai3.main(null);
        }
        else if(a==4){
            System.out.println("\n\nBai 4 Tuan 1");
            bai4.main(null);
        }
        else if(a==5){
            System.out.println("\n\nBai 5 Tuan 1");
            bai5.main(null);
        }
        else if(a==6){
            System.out.println("\n\nBai 6 Tuan 1");
            bai6.main(null);
        }
        else if(a==7){
            System.out.println("\n\nBai 7 Tuan 1");
            bai7.main(null);
        }
        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("ERROR");
            alert.setHeaderText("Vui lòng chọn bài tập muốn chạy");
            alert.showAndWait();
        }
    }

}
