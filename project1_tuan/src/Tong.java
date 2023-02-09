import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.*;

public class Tong implements Initializable{

    @FXML
    private Label totalHocsinh;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    void btnback(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.close();
    }
    
    public void addhocsinh(ObservableList<Hocsinh>hocsinhList){
        int i;
        Hocsinh hocsinh = new Hocsinh();
        long tong = 0;
        for (i = 0; i < hocsinhList.size() ; i++) {
            hocsinh = hocsinhList.get(i);
            if(hocsinh.getTuoi()==23 && hocsinh.getQuequan().contains("DN")){
                tong +=1;
            }
        }
        totalHocsinh.setText(tong +" Học Sinh");
    }

}
