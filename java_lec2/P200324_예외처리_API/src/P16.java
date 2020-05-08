import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class P16 {

	public static void main(String[] args) {
		String str = "qqq22qq@qqq.qqq";
		  //한글자의 숫자인지 확인하는 코드
		if(Pattern.matches("[a-z][0-9a-z]{5,8}@[a-z]+.[a-z]+", str)) {
			System.out.println("패턴에 부합합니다");
		}else {
			System.out.println("아닙니다");
		}
		
		
	}

}
