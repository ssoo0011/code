package �ǽ�����;
import java.util.Scanner;
import java.util.Random;
public class OpenChallenge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		
		while(true) {
			int quiz = r.nextInt(100);
			System.out.println("���� �����Ͽ����ϴ�. ����������.");
			System.out.println(quiz); //�� ���ư��� �� �� ����
		
			while(true) {
				int ans = sc.nextInt();
				
				if(ans < quiz) {
					System.out.println("�� ũ��");
					System.out.println((ans + 1) +"-" + 99);
					
				}else if(ans > quiz) {
					System.out.println("�� �۰�");
					System.out.println( 1 +"-" + (ans - 1));
					
				}else {
					System.out.println("�������ϴ�.");
					break;
				}
				

			}
			System.out.println("������ �ٽ��ϰڽ��ϱ�? Y / N >> ");
			String yes = sc.next();
			if(yes .equals("y")) { 
				continue;
			}else {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
	}
}
