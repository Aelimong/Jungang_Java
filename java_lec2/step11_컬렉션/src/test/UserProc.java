package test;
//proc --> process

//비즈니스 로직(데이터 베이스 연동 처리) :DAO의 앞단계

public class UserProc {

	public UserProc() {
		// TODO Auto-generated constructor stub
	}

	public User getLoginUser(String id, String pw) {
		/*
		 * 매개변수로 들어온 pororo , 1234를 비교하여 맞으면 entity 객체를 만들어서 setter를 통해 id, pw, "뽀로로",
		 * 89.97을 대입하세요. entity를 리턴하세요.
		 * 
		 */
		User entity = null; // null인 상태가 하나 있어야함 ★★if문 안에서 사용하려면 초기화 시켜줘야함

		// 정상적인 구조라면 "pororo"대신 데이터베이스에서 가져온 값과 비교
		if (id.equals("pororo") && pw.equals("1234")) {
			entity = new User(); // 조건이 만족할 경우에만 객체를 만들어주기 위해서
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("뽀로로");
			entity.setPoint(89.97);
		}
		return entity; // 조건에 만족되면 entity 만족되지 않으면 위에 null이 리턴됨

	}

}
