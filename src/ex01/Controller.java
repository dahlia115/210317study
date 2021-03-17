package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{//상속받는다(초기화 시켜주는 기능)
	@FXML Button btn; //fxml에 지정한 fxid값과 같아야한다.
	@FXML TextField txtField; 
	@FXML TextField txtField02; 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("컨트롤러 실행");//자동호출
		
		btn.setOnAction(e ->{
			System.out.println("버튼 클릭");
			testAction();
		});
	}
	public void testAction() {
		System.out.println(txtField.getText());
		txtField02.setText(txtField.getText());
		//txtField.setText("");
		txtField.clear();
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("문제 발생");
		alert.setContentText("반갑습니다 : "+txtField02.getText());
		alert.show();
	}

}











