
public class P12 {

	public static void main(String[] args) {
		String str="aaaa.ssss.txt";
		int commaIndex = str.indexOf(".");
		String ext = str.substring(commaIndex);
		System.out.println(ext);
		System.out.println(str);
		
		int lastComma = str.lastIndexOf(".");
		String last= str.substring(lastComma);
		System.out.println(last);
	
	
	}

}
