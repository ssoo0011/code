package 실습문제;
import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int a = sc.nextInt();
			
			for(int i = a; i > 0; i--) {
				
				//i 5 j  1 2 3 4 5
				for (int j = 1; j <= i; j++) {
					System.out.print("*");	
				}
				System.out.println();
				
			}
		}
	}

}
