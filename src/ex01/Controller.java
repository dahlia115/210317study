package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{//��ӹ޴´�(�ʱ�ȭ �����ִ� ���)
	@FXML Button btn; //fxml�� ������ fxid���� ���ƾ��Ѵ�.
	@FXML TextField txtField; 
	@FXML TextField txtField02; 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("��Ʈ�ѷ� ����");//�ڵ�ȣ��
		
		btn.setOnAction(e ->{
			System.out.println("��ư Ŭ��");
			testAction();
		});
	}
	public void testAction() {
		System.out.println(txtField.getText());
		txtField02.setText(txtField.getText());
		//txtField.setText("");
		txtField.clear();
		Alert alert = new Alert(AlertType.WARNING);
		alert.setTitle("���� �߻�");
		alert.setContentText("�ݰ����ϴ� : "+txtField02.getText());
		alert.show();
	}

}











