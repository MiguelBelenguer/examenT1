package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

public class Procontrol implements Initializable{
	@FXML
	private Pane rootPane;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	@FXML
	private void handleButtonClick(ActionEvent e) throws IOException {
		
		}
	
	
	@FXML
	private void loadSecond (ActionEvent e) throws IOException {
		Pane pane = FXMLLoader.load(getClass().getResource("detail.fxml"));
		rootPane.getChildren().setAll(pane);
		
	}
}


