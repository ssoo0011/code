package 실습문제;

public class Q_09 {

	public static void main(String[] args) {
		
		int[][]a = new int[4][4];
		
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j< a.length; j++) {
				int b = (int)(Math.random()*10)+1;
				a[i][j] = b;

				System.out.print(a[i][j] + " ");
				
			}System.out.println();
		}

	}

}
