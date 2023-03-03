package 실습문제;
import java.util.Scanner;
public class Q_05 {

	public static void main(String[] args) {
		
		//양의 정수 10개 입력받고 3의 배수만 추출받기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수를 10개 입력하시오 ??>>");
		
		int[] a = new int[10]; //배열 이름 a
		
		for(int b = 0; b < a.length; b++) {
			
			int num = sc.nextInt(); //입력받는 정수 num
			a[b] = num;
			
			if(a[b] % 3 == 0) {
				System.out.print(a[b] + " ");
			} else continue;
		}
		
		
	}

}
