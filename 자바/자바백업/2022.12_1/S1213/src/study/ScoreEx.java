package study;

public class ScoreEx {

	public static void main(String[] args) {
		
		Score sy = new Score();
		
		int avar1 = sy.aver(100, 100, 100);
	
		Score sm = new Score();
		int avar2 = sm.aver( 5, 2, 3);
		
		System.out.println("소영이의 평균은 " + avar1);
		System.out.println("세민이의 평균은  " + avar2);
		
		if (avar1 > avar2) {
			System.out.println("배세민은 바보 똥꾸멍 멍청이입니다! 소영짱짱!~");
		}

	}

}
