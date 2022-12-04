import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Tablehocsinh implements Initializable{
    @FXML
    private TableView<Hocsinh> Table;

    @FXML
    private TextField HovaTen;

    @FXML
    private TextField QueQuan;

    @FXML
    private TextField Tuoi;

    @FXML
    private TableColumn<Hocsinh, String> queCol;

    @FXML
    private TextField searchQue;

    @FXML
    private CheckBox searchTuoi;

    @FXML
    private TableColumn<Hocsinh, String> tenCol;

    @FXML
    private TableColumn<Hocsinh, Integer> tuoiCol;

    private ObservableList<Hocsinh> hocsinhList;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {   
        hocsinhList = FXCollections.observableArrayList();

        //link each column data to different attribute of object
        tenCol.setCellValueFactory(new PropertyValueFactory<Hocsinh, String>("Hoten"));
        tuoiCol.setCellValueFactory(new PropertyValueFactory<Hocsinh, Integer>("Tuoi"));
        queCol.setCellValueFactory(new PropertyValueFactory<Hocsinh, String>("Quequan"));
        

        //set the item: the ObservableList of Staff, for display
        Table.setItems(hocsinhList);
      
        Table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        FilteredList<Hocsinh> filteredData = new FilteredList<>(hocsinhList);

        searchQue.textProperty().addListener((observ, oldValue, newValue) -> {
            filteredData.setPredicate(hocsinh ->{
                //if the TextField is empty, display all data
                if(newValue == null|| newValue.isEmpty()){
                    return true;
                }
                //lower case the value for easier searching, this will be temporary
                String lowerCaseFilter = newValue.toLowerCase();
                String upperCaseFilter = newValue.toUpperCase();

                //compare the lowercase version of both value (the staff'name and the newValue)
                if (hocsinh.getQuequan().toLowerCase().indexOf(lowerCaseFilter) != -1||
                hocsinh.getQuequan().toUpperCase().indexOf(upperCaseFilter) != -1||
                (searchTuoi.isSelected() && hocsinh.getTuoi() == 20)){
                    return true; // if the values are alike, return the data
                }
                // else if(searchTuoi.isSelected()){
                //     return hocsinh.getTuoi()==20;
                // }
                else
                    // if not, don't return the data
                    return false;
                
            });
        });
        SortedList<Hocsinh> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(Table.comparatorProperty());
        //set item of the table
        Table.setItems(sortedData);
    }

    @FXML
    void Add(ActionEvent event) {
        Hocsinh hocsinh = new Hocsinh();

        // from the value in the TextField, use set method to modify the object
        hocsinh.setHoten(HovaTen.getText());
        hocsinh.setQuequan(QueQuan.getText());
        hocsinh.setTuoi(Integer.parseInt(Tuoi.getText()));

        hocsinhList.add(hocsinh);
        //clear the TextField
        HovaTen.clear();
        QueQuan.clear();
        Tuoi.clear();
    }

    @FXML
    void sumOf23(ActionEvent event) throws IOException {
        Stage window = new Stage();
        FXMLLoader loading = new FXMLLoader();
        loading.setLocation(getClass().getResource("totalview.fxml"));
        Parent root = loading.load();
        Scene scene = new Scene(root);

        Tong controlscene = loading.getController();
        controlscene.addhocsinh(hocsinhList);

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Số lượng học sinh tuổi 23 và sống ở DN");
        window.setScene(scene);
        window.showAndWait();
    }
}

