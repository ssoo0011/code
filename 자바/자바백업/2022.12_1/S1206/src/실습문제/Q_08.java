package �ǽ�����;
import java.util.Scanner;
public class Q_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ��?");


		
		while(true) {			
			int a = sc.nextInt();
			int[] arr = new int[a];
			
				
				for(int i = 0; i < arr.length; i++) { //arr�迭 ��°�� ����
					
					int b = (int)(Math.random()*100) +1;//������ ����
					arr[i] = b; // ���� �� �迭�� ����ֱ�
					
					for(int j= 0; j< i ; j++){ //�ߺ� �� ã��
						if(arr[i] == arr[j]){
							i--; //�ߺ��� ã���� i-1�� ���ư���
						}
					}
					
		
				}
				
				for(int i= 0; i<arr.length; i++) {	
				System.out.print(arr[i] + " ");	
				
				}
				
			
		}

	}

}
