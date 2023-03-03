package 실습문제;

public class Q_01 {

	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		
		
		while(i < 100) {
			sum = sum + i;
			i +=2;
		}System.out.println(sum);
		
		
		for( i = 0; i < 100; i+=2) {
			sum = sum + i;
			
		}System.out.println(sum);
		
		
		

	}

}
