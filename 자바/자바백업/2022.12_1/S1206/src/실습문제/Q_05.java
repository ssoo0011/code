package �ǽ�����;
import java.util.Scanner;
public class Q_05 {

	public static void main(String[] args) {
		
		//���� ���� 10�� �Է¹ް� 3�� ����� ����ޱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������ 10�� �Է��Ͻÿ� ??>>");
		
		int[] a = new int[10]; //�迭 �̸� a
		
		for(int b = 0; b < a.length; b++) {
			
			int num = sc.nextInt(); //�Է¹޴� ���� num
			a[b] = num;
			
			if(a[b] % 3 == 0) {
				System.out.print(a[b] + " ");
			} else continue;
		}
		
		
	}

}
