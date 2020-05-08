package emp;
/*dao (data access object) : 데이터베이스에서 자원을 가져올 용도로 사용하는 클래스
 *                           데이터를 가져오고 저장하고
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	List<EmpVO> list = null;

	public EmpDao() {
		list = new ArrayList<EmpVO>(); // EmpVO:클래스자료형의 리스트(배열)생성
		list.add(new EmpVO("kim", "영업부", 1000000));
		list.add(new EmpVO("lee", "개발부", 1500000));
		list.add(new EmpVO("park", "관리부", 2000000));
	}

	public List<EmpVO> getEmpList() {
		return list;
	}

	public EmpVO getEmp(String name) {
		for (EmpVO vo : list) {
			if (vo.getEname().equals(name))
				return vo;
		}
		return null;
	}

}
