package Tuan3;

import java.io.IOException;
import Tuan3.ctl.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.*;

public class t3 {

    int a;
    @FXML
    private Label db;

    @FXML
    void b1(ActionEvent event) {
        db.setText("Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.");
        a=1;
    }

    @FXML
    void b2(ActionEvent event) {
        db.setText("Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này.");
        a=2;
    }

    @FXML
    void b3(ActionEvent event) {
        db.setText("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy\n này và tất cả các chỉ số ứng với giá trị min này.");
        a=3;
    }

    @FXML
    void b4(ActionEvent event) {
        db.setText("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy\n này và tất cả các chỉ số ứng với giá trị max này.");
        a=4;
    }

    @FXML
    void b5(ActionEvent event) {
        db.setText("Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có\n bao nhiêu số nguyên tố, có bao nhiêu hợp số.");
        a=5;
    }

    @FXML
    void b6(ActionEvent event) {
        db.setText("Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên\n thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.");
        a=6;
    }

    @FXML
    void menu(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();

    }

    @FXML
    void run(ActionEvent event) {
        if(a==1){
            System.out.println("\n\nBai 1 Tuan 3");
            bai1.main(null);
        }
        else if(a==2){
            System.out.println("\n\nBai 2 Tuan 3");
            bai2.main(null);
        }
        else if(a==3){
            System.out.println("\n\nBai 3 Tuan 3");
            bai3.main(null);
        }
        else if(a==4){
            System.out.println("\n\nBai 4 Tuan 3");
            bai4.main(null);
        }
        else if(a==5){
            System.out.println("\n\nBai 5 Tuan 3");
            bai5.main(null);
        }
        else if(a==6){
            System.out.println("\n\nBai 6 Tuan 3");
        }

        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("ERROR");
            alert.setHeaderText("Vui lòng chọn bài tập muốn chạy");
            alert.showAndWait();
        }
    }

}
