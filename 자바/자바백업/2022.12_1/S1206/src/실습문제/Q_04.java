package �ǽ�����;
import java.util.Scanner;
public class Q_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ��� �Է��ϼ���");
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
