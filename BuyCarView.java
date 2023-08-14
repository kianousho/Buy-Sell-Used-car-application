import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BuyCarView {

    @FXML
    private Label fileContent;

    public void initialize() {
        // Specify the path to the file you want to display
        String filePath = "carlist.txt";

        // Read the file contents and set them as the label text
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            fileContent.setText(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
            fileContent.setText("Error reading file.");
        }
    }
}
