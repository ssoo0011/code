package study;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �� �� �Է��ϼ���");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = myCalc.plus(a, b);
		System.out.println(result);
		
		System.out.println("���ڸ� �� �� �Է��ϼ���");
//		byte x  = 10;
//		byte y = 4;
		
		int result2 = myCalc.minus(a, b);
		System.out.println("�� ���� ���� " + result2);
		
		int result3 = myCalc.rhq(a, b);
		System.out.println("�� ���� ���� " + result3);
		
		int result4 = myCalc.wprhq(a);
		System.out.println("ù�� ° ���� ������ : " + result4);
		
		double result1 = myCalc.divide(a, b);//�ڵ� ����ȯ�� �Ͼ �� �ִ� ������ �����ʹ� ����Ÿ�� ������ ����ȯ�ȴ�
		System.out.println("ù��° ������ ���� �ι�° ���� ���� ����" + result1);
		
		int[]array1 = {1, 2, 3};
		int a1Sum = myCalc.sum(array1);
		System.out.println(a1Sum);
		
		int a2Sum = myCalc.sum(new int[] {4, 5, 6,7, 8});
		System.out.println(a2Sum);
		
		int a3Sum = myCalc.sumsum(3, 4, 5, 6, 7, 8, 9,14);
		System.out.println(a3Sum);
		
		myCalc.powerOff();
		
	}

}
