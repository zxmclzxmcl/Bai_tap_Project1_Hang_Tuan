package Tuan4;

import java.io.IOException;
import Tuan4.ctl.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.*;

public class t4 {

    int a;
    @FXML
    private Label db;

    @FXML
    void b1(ActionEvent event) {
        db.setText("Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một\n số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.");
        a=1;
    }

    @FXML
    void b2(ActionEvent event) {
        db.setText("Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất\n hiện xâu con “abc”");
        a=2;
    }

    @FXML
    void b3(ActionEvent event) {
        db.setText("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
        a=3;
    }

    @FXML
    void b4(ActionEvent event) {
        db.setText("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
        a=4;
    }

    @FXML
    void b5(ActionEvent event) {
        db.setText("Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo\n cách 01 -> 10 và in ra kết quả.");
        a=5;
    }

    @FXML
    void b6(ActionEvent event) {
        db.setText("Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.");
        a=6;
    }

    @FXML
    void b7(ActionEvent event) {
        db.setText("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.");
        a=7;
    }

    @FXML
    void b8(ActionEvent event) {
        db.setText(": Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần\n đệm là  “Thị”.");
        a=8;
    }

    @FXML
    void b9(ActionEvent event) {
        db.setText("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên\n bắt đầu bằng chữ “H”.");
        a=9;
    }

    @FXML
    void menu(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();

    }

    @FXML
    void run(ActionEvent event) {
        if(a==1){
            System.out.println("\n\nBai 1 Tuan 4");
            bai1.main(null);
        }
        else if(a==2){
            System.out.println("\n\nBai 2 Tuan 4");
            bai2.main(null);
        }
        else if(a==3){
            System.out.println("\n\nBai 3 Tuan 4");
            bai3.main(null);
        }
        else if(a==4){
            System.out.println("\n\nBai 4 Tuan 4");
            bai4.main(null);
        }
        else if(a==5){
            System.out.println("\n\nBai 5 Tuan 4");
            bai5.main(null);
        }
        else if(a==6){
            System.out.println("\n\nBai 6 Tuan 4");
            bai6.main(null);
        }
        else if(a==7){
            System.out.println("\n\nBai 7 Tuan 4");
            bai78.main(null);
        }
        else if(a==8){
            System.out.println("\n\nBai 8 Tuan 4");
            bai78.main(null);
        }
        else if(a==9){
            System.out.println("\n\nBai 9 Tuan 4");
            bai9.main(null);
        }
        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("ERROR");
            alert.setHeaderText("Vui lòng chọn bài tập muốn chạy");
            alert.showAndWait();
        }
    }

}
