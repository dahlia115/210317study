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
		alert.setTitle("�޽���");
		alert.setContentText(content);
		alert.show();
	}
	public void action() {
		
		
		if(id.getText().isEmpty() == true) {//�Էµ� ���� �ֳ� Ȯ��
			myAlert("id�� �Է����ּ���");
			id.requestFocus();
		}else if(pw.getText().isEmpty() == true ) {
			myAlert("pw�� �Է����ּ���");//�Էµ� ���� �ֳ� Ȯ��
			pw.requestFocus();
		}else {
			MyDB db = new MyDB();//db
			if(db.getTable().containsKey(id.getText())) {//�Է��� ���̵� ��� �ֳ� Ȯ��
				if(db.getTable().get(id.getText()).equals(pw.getText())) {//���̵� ������ ��й�ȣ ��
					myAlert("����");					
				}
				else {
					myAlert("��й�ȣ�� �ٸ��ϴ�");
					pw.clear();
				}
			}else {
				myAlert("���̵� �����ϴ�");
				id.clear();
			}
		}
		pw.clear();
		id.clear();
	}
}












