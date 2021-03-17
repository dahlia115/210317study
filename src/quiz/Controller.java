package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable {
	@FXML TextField id;
	@FXML PasswordField pw;
	@FXML Button login;
	@FXML CheckBox saveId;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		login.setOnAction(e ->{
			action();
		});
	}
	public void myAlert(String content) {
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("메시지");
		alert.setContentText(content);
		alert.show();
	}
	public void action() {
		
		
		if(id.getText().isEmpty() == true) {//입력된 값이 있나 확인
			myAlert("id를 입력해주세요");
			id.requestFocus();
		}else if(pw.getText().isEmpty() == true ) {
			myAlert("pw를 입력해주세요");//입력된 값이 있나 확인
			pw.requestFocus();
		}else {
			MyDB db = new MyDB();//db
			if(db.getTable().containsKey(id.getText())) {//입력한 아이디가 디비에 있나 확인
				if(db.getTable().get(id.getText()).equals(pw.getText())) {//아이디가 있으면 비밀번호 비교
					myAlert("성공");					
				}
				else {
					myAlert("비밀번호가 다릅니다");
					pw.clear();
				}
			}else {
				myAlert("아이디가 없습니다");
				id.clear();
			}
		}
		pw.clear();
		id.clear();
	}
}












