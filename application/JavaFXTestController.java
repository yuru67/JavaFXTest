/**
 * "JavaFXTest.fxml"コントローラ・クラスのサンプル・スケルトン
 */

package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXTestController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="button1"
    private Button button1; // Value injected by FXMLLoader

    @FXML // fx:id="textField1"
    private TextField textField1; // Value injected by FXMLLoader

    @FXML
    void onButton1Action(ActionEvent event) {
    	/*Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setTitle("Title");
    	alert.setHeaderText("Header!");
    	alert.setContentText("You entered: " + textField1.getText());
    	Optional<ButtonType> result = alert.showAndWait();
    	if (result.isPresent() && result.get() == ButtonType.OK) {
    		System.out.println("You clicked OK");
    	}
    	*/
    	try {
        	SecondWindow();
    	} catch (Exception e){
			e.printStackTrace();
    	}
    }
    void SecondWindow() throws IOException {

 		FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondWindow.fxml"));
 		VBox root = (VBox) loader.load();
 		Scene scene = new Scene(root);
 		Stage stage = new Stage();

 	  //ぬるぽエラー
 	  //SecondWindowController SecondWindow = new SecondWindowController;
 		SecondWindowController SecondWindow = loader.<SecondWindowController>getController();
 		SecondWindow.label.setText("TestLabelSet");
 		
 		stage.setTitle("Second Window");
 		stage.setScene(scene);
 		stage.showAndWait();
 		
 	}


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'JavaFXTest.fxml'.";
        assert textField1 != null : "fx:id=\"textField1\" was not injected: check your FXML file 'JavaFXTest.fxml'.";

    }
}
