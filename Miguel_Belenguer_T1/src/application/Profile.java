package application;

/**
 * Date: Marzo 02-2018
 * 
 * This is an application to swip between scenes
 * @author 21650936
 * @version 1.0
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Profile extends Application {
	public static void main(String[] args) {
		Application.launch(Profile.class, args);
	}
	
	static Stage stg;

	@Override
	public void start(Stage stage) throws Exception {
		this.stg = stage;
		
		Parent root = FXMLLoader.load(getClass().getResource("view/Profile.fxml"));
		stage.setScene(new Scene(root, 600, 400));
		stage.show();
		
	}
	
	public void pressButton(ActionEvent event) {
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("detail.fxml"));
			Parent root = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Profile.stg.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}