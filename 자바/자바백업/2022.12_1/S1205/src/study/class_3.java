package study;

public class class_3 {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("�Ű������� ���� �����մϴ�.");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + num2);
		
		int []arr = new int [4]; //heap 4ĭ �ޱ�!

		arr[0] = 7; //arr = # ����
		arr[1] = 8;
		arr[2] = 11;
		arr[3] = 20;
		
		int sum = f(arr); //���� ����!!!!!!!����!!!!!!����~!!!!!!!
		
		System.out.println(sum);
		
		
	} 
	
	public static int f(int[] frr) {
		
		int sum = 0;
		
		for(int i = 0; i<frr.length ; i++) {
			sum += frr[i];
			
		}
		return sum;
	}

}
//frr = �迭 �̸�
//f = �Լ�
//arr �� ������ f�Լ� �̸� ã��!
//���� ������ ���� frr�� ������ֱ�