package 실습문제;

public class Q_07 {

	public static void main(String[] args) {
		
		int[]a = new int[10];
		int sum = 0;

		for(int i = 0; i < (double)a.length; i++) {
			
			int b = (int)(Math.random()*10) +1;
			a[i] = b;
			sum += a[i];
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		System.out.print("평균은" + sum / (double)a.length);
		

	}

}
