import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class P16 {

	public static void main(String[] args) {
		String str = "qqq22qq@qqq.qqq";
		  //�ѱ����� �������� Ȯ���ϴ� �ڵ�
		if(Pattern.matches("[a-z][0-9a-z]{5,8}@[a-z]+.[a-z]+", str)) {
			System.out.println("���Ͽ� �����մϴ�");
		}else {
			System.out.println("�ƴմϴ�");
		}
		
		
	}

}
