package study;

public class ScoreEx {

	public static void main(String[] args) {
		
		Score sy = new Score();
		
		int avar1 = sy.aver(100, 100, 100);
	
		Score sm = new Score();
		int avar2 = sm.aver( 5, 2, 3);
		
		System.out.println("�ҿ����� ����� " + avar1);
		System.out.println("�������� �����  " + avar2);
		
		if (avar1 > avar2) {
			System.out.println("�輼���� �ٺ� �˲ٸ� ��û���Դϴ�! �ҿ�¯¯!~");
		}

	}

}
