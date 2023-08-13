import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SedanAddController extends SellCarController{

    double carKM = Double.parseDouble(txtCarKM.getText());
    String carMake = txtCarMake.getText();
    String carModel = txtCarModel.getText();
    double carPrice = Double.parseDouble(txtCarPrice.getText());
    String carVin = txtCarVin.getText();
    int carYear = Integer.parseInt(txtCarYear.getText());

    @FXML
    private RadioButton coupeyes;

    @FXML
    private RadioButton coupeno;

    @FXML
    private RadioButton convyes;

    @FXML
    private RadioButton convno;

    @FXML
    private TextField txtDoorNum;

    @FXML
    private RadioButton sportno;

    @FXML
    private RadioButton sportyes;

    @FXML
    private RadioButton trunklarge;

    @FXML
    private RadioButton trunkmedium;

    @FXML
    private RadioButton trunksmall;

    @FXML 
    private Label txtValidate;

    @FXML
    void addCar(ActionEvent event) {
        // Even when making the variables from SellCarContoller protected, these data members are null. 
        Sedan sedanUser = new Sedan(txtCarMake.getText(), txtCarVin.getText(), txtCarModel.getText(), Double.parseDouble(txtCarPrice.getText()), Integer.parseInt(txtCarYear.getText()), Double.parseDouble(txtCarKM.getText()), sedCoupe(), sedConv(), sedDoorNum(), sedSports(), sedTrunk());
        carsList.add(sedanUser);
        txtValidate.setText("Sedan listed for Sale!");
    }

    public boolean sedCoupe(){
        if(coupeyes.isSelected()){
            return true;
        } else {
            return false;
        }
    } 

    public boolean sedConv(){
        if(convyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    public int sedDoorNum(){
        return Integer.parseInt(txtDoorNum.getText());
    }

    public boolean sedSports(){
        if(sportyes.isSelected()){
            return true;
        } else {
            return false;
        }
    }

    public String sedTrunk(){
        if(trunksmall.isSelected()){
            return "Small";
        } else if(trunkmedium.isSelected()){
            return "Medium";
        } else{
            return "Large";
        }
    }
}
