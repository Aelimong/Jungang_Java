package test;
//proc --> process

//����Ͻ� ����(������ ���̽� ���� ó��) :DAO�� �մܰ�

public class UserProc {

	public UserProc() {
		// TODO Auto-generated constructor stub
	}

	public User getLoginUser(String id, String pw) {
		/*
		 * �Ű������� ���� pororo , 1234�� ���Ͽ� ������ entity ��ü�� ���� setter�� ���� id, pw, "�Ƿη�",
		 * 89.97�� �����ϼ���. entity�� �����ϼ���.
		 * 
		 */
		User entity = null; // null�� ���°� �ϳ� �־���� �ڡ�if�� �ȿ��� ����Ϸ��� �ʱ�ȭ ���������

		// �������� ������� "pororo"��� �����ͺ��̽����� ������ ���� ��
		if (id.equals("pororo") && pw.equals("1234")) {
			entity = new User(); // ������ ������ ��쿡�� ��ü�� ������ֱ� ���ؼ�
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("�Ƿη�");
			entity.setPoint(89.97);
		}
		return entity; // ���ǿ� �����Ǹ� entity �������� ������ ���� null�� ���ϵ�

	}

}
