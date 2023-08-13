import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.*;
import javafx.stage.Stage;

public class SellCarController extends CarsData{

    private Stage stage;
    private Scene scene;
    private Parent root;

    ObservableList<String> cbBodyTypeList = FXCollections.observableArrayList("Sedan", "Hatchback",
        "Truck", "SUV");

    @FXML
    protected Button btnNextPage;

    @FXML
    protected RadioButton sedan;

    @FXML
    protected RadioButton hatchback;

    @FXML
    protected RadioButton truck;

    @FXML
    protected RadioButton SUV;

    @FXML
    protected TextField txtCarKM;

    @FXML
    protected TextField txtCarMake;

    @FXML
    protected TextField txtCarModel;

    @FXML
    protected TextField txtCarPrice;

    @FXML
    protected TextField txtCarVin;

    @FXML
    protected TextField txtCarYear;

    @FXML
    void btnNextPage(ActionEvent event) throws IOException {
        // double carKM = Double.parseDouble(txtCarKM.getText());
        // String carMake = txtCarMake.getText();
        // String carModel = txtCarModel.getText();
        // double carPrice = Double.parseDouble(txtCarPrice.getText());
        // String carVin = txtCarVin.getText();
        // int carYear = Integer.parseInt(txtCarYear.getText());
        if(sedan.isSelected()){
            // FXMLLoader loader  = new FXMLLoader(getClass().getResource("SedanAddView.fxml"));
            // root = loader.load();

            // SedanAddController sedanController = loader.getController();
            // sedanController.addCar(event);

            root = FXMLLoader.load(getClass().getResource("SedanAddView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(hatchback.isSelected()){
            root = FXMLLoader.load(getClass().getResource("HatchbackAddView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(truck.isSelected()) {
            root = FXMLLoader.load(getClass().getResource("TruckAddView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else if(SUV.isSelected()) {
            root = FXMLLoader.load(getClass().getResource("SUVAddView.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
    
}
