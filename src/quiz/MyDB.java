package quiz;

import java.util.HashMap;

public class MyDB {
	
	//���� ������ ���̽� �����Ȱ� �����Ƿ�, ����Ǿ� �ִ� �����ͷ� ���� �ǽ��Ѵ�.
	private HashMap<String, String> table;
	public MyDB() {
		table = new HashMap<String, String>();
		table.put("ȫ�浿", "1111");
		table.put("�谳��", "2222");
		table.put("�̼���", "3333");
	}
	//�ʿ��� ����� ������ �߰����ּ���.
	public HashMap<String, String> getTable() {
		return table;
	}
	
}
