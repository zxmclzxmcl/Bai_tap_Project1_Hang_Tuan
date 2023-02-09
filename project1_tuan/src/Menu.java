
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
public class Menu {
    @FXML
    void t1(ActionEvent event) throws IOException {
        Stage window = new Stage();
        FXMLLoader loading = new FXMLLoader();
        loading.setLocation(getClass().getResource("Tuan1/t1.fxml"));
        Parent root = loading.load();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("Bài tập tuần 1");
        window.showAndWait();
    }

    @FXML
    void t2(ActionEvent event) throws IOException {
        Stage window = new Stage();
        FXMLLoader loading = new FXMLLoader();
        loading.setLocation(getClass().getResource("Tuan2/t2.fxml"));
        Parent root = loading.load();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("Bài tập tuần 2");
        window.showAndWait();
    }

    @FXML
    void t3(ActionEvent event) throws IOException {
        Stage window = new Stage();
        FXMLLoader loading = new FXMLLoader();
        loading.setLocation(getClass().getResource("Tuan3/t3.fxml"));
        Parent root = loading.load();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("Bài tập tuần 3");
        window.showAndWait();
    }

    @FXML
    void t4(ActionEvent event) throws IOException {
        Stage window = new Stage();
        FXMLLoader loading = new FXMLLoader();
        loading.setLocation(getClass().getResource("Tuan4/t4.fxml"));
        Parent root = loading.load();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("Bài tập tuần 4");
        window.showAndWait();
    }

    @FXML
    void t5(ActionEvent event) throws IOException {
        Stage window = new Stage();
        FXMLLoader loading = new FXMLLoader();
        loading.setLocation(getClass().getResource("tablehocsinh.fxml"));
        Parent root = loading.load();
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("Bài tập tuần 5 - Quản lý học sinh");
        window.showAndWait();
    }

}
