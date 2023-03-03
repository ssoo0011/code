package 실습문제;
import java.util.Scanner;
import java.util.Random;
public class OpenChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		
		while(true) {
			int quiz = r.nextInt(100);
			System.out.println("수를 결정하였습니다. 맞혀보세요.");
			System.out.println(quiz); //잘 돌아가나 한 번 만들어봄
		
			while(true) {
				int ans = sc.nextInt();
				
				if(ans < quiz) {
					System.out.println("더 크게");
					System.out.println((ans + 1) +"-" + 99);
					
				}else if(ans > quiz) {
					System.out.println("더 작게");
					System.out.println( 1 +"-" + (ans - 1));
					
				}else {
					System.out.println("맞혔습니다.");
					break;
				}
				

			}
			System.out.println("게임을 다시하겠습니까? Y / N >> ");
			String yes = sc.next();
			if(yes .equals("y")) { 
				continue;
			}else {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}
}
