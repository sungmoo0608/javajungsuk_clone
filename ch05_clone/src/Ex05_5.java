import java.util.Arrays;

public class Ex05_5 {

	public static void main(String[] args) {
		int[] ball = new int[45];	// 45개의 정수값을 저장
		
		// 배열의 각 요소에 1~45의 값을 저장
		for(int i=0; i < ball.length; i++) {
			ball[i] = i+1;	//ball[0]에 1이 저장된다.
		}
		System.out.println(Arrays.toString(ball));
		
		int tmp = 0;
		int j = 0;
		
		for(int i=0; i < 6 ; i++) {
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			System.out.println(Arrays.toString(ball));
		}
		
		for(int i=0; i<6;i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
	}

}
