import java.util.Arrays;

public class Ex05_1_4 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};	// 1차원 배열 arr
		int[][] arr2D = {{11,22},{21,22}};	// 2차원 배열

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));	

		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};

		System.out.println(str2D==str2D2);	// 참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2));

		int[] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));

		int[] arr3 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr3));

		int[] arr4 = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(arr4));

		int[] arr5 = Arrays.copyOfRange(arr, 2,4);
		System.out.println(Arrays.toString(arr5));

		int[] arr6 = {3,0,1,4,2};
		System.out.println(Arrays.toString(arr6));
		Arrays.sort(arr6);
		System.out.println(Arrays.toString(arr6));
	}

}
