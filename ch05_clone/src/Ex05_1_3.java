
import java.util.Arrays;

public class Ex05_1_3 {

	public static void main(String[] args) {
		
		String str = "ABCDE";
		char ch = str.charAt(2);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1);
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
		
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0;i<10;i++) {
			int tmp =(int)(Math.random()*3);
			System.out.println(strArr[tmp]);
		}

	}

}