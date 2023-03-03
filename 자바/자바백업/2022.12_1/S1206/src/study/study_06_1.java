package study;
import java.util.Scanner;

public class study_06_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 홀수만 입력하세요");
		
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[][] a =  new int[b][c];

		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
				if (i == j || i+j == a[i].length -1 ) {
					a[i][j] = 1;
				} 
				
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j <a[i].length; j++) {
			System.out.print(a[i][j] + " ");	
			}
			System.out.println();
		}
	}

}
