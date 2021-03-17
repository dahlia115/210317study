package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("main start");
		
		//로드 할 때 컨트롤러 객채가 생성된다. (fxml과 controller와 연동 되어있다)
		Parent root = FXMLLoader.load(getClass().getResource("eventTest.fxml"));
		
		System.out.println("main end");
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
