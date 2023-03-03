package 실습문제;
import java.util.Scanner;
public class Q_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하세요");
		char a = sc.next().charAt(0);
		char b = (char)97;
		
//		System.out.println(b);
		
		
		
		for(int i = a ; i >= b ; i-- ) {
			
			for (int j = (char)b ; j <= i; j++ ) {
				System.out.print((char)j);
				
			}
			System.out.println();

		}
		
		

	}

	
}
