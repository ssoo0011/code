package �ǽ�����;

public class Q_13 {

	public static void main(String[] args) {
		
		for(int i = 1; i<100; i++) {
			if(i % 33 == 0 ||
					i % 30 == 3 ||
					i % 30 == 6 ||
					i % 30 == 9) {
				
				System.out.println(i + "�ڼ� ¦¦");
				
			}else if((i % 3 == 0 && i / 3 < 3 )||
					i % 10 == 3||
					i % 10 == 6 ||
					i % 10 == 9 ||
					i / 30 == 1 )
					 {
				System.out.println(i + "�ڼ�¦");
			} else {continue;}

		}

	}

}
