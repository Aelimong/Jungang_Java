package userclass;
//MVC

//model / viewer / controller

//데이터 입출력 담당...
public class STMModel {
	private STData[] stList = new STData[100];
	private int stCount = 0;
	// 핵심적인 속성은 멤버로 선언 stList, stCount

	// 주요 기능
	public int getCurrentStudentCount() {
		return stCount;  
	}
	
	
	
	public void addStudentData(STData data) {
		stList[stCount] = data;
		stCount++;
	}

	public STData getStudentData(int index) {
		return stList[index];
	}

	public int removeStudentDataByName(String name) {
		int removeCount = 0;
		for (int i = 0; i < stCount; i++) {
			if (stList[i].getName().equals(name)) {
				for (int x = i; x < stCount; x++) {
					stList[x] = stList[x + 1];
				}
				i--;
				stCount--;

				removeCount++;
			}
		}
		return removeCount;
	}

}
