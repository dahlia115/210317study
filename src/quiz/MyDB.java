package quiz;

import java.util.HashMap;

public class MyDB {
	
	//현재 데이터 베이스 연동된게 없으므로, 저장되어 있는 데이터룰 만들어서 실습한다.
	private HashMap<String, String> table;
	public MyDB() {
		table = new HashMap<String, String>();
		table.put("홍길동", "1111");
		table.put("김개똥", "2222");
		table.put("이순신", "3333");
	}
	//필요한 기능이 있으면 추가해주세요.
	public HashMap<String, String> getTable() {
		return table;
	}
	
}
