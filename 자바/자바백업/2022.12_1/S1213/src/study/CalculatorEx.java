package study;

import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 두 개 입력하세요");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int result = myCalc.plus(a, b);
		System.out.println(result);
		
		System.out.println("숫자를 두 개 입력하세요");
//		byte x  = 10;
//		byte y = 4;
		
		int result2 = myCalc.minus(a, b);
		System.out.println("두 수의 합은 " + result2);
		
		int result3 = myCalc.rhq(a, b);
		System.out.println("두 수의 차는 " + result3);
		
		int result4 = myCalc.wprhq(a);
		System.out.println("첫번 째 수의 제곱은 : " + result4);
		
		double result1 = myCalc.divide(a, b);//자동 형변환이 일어날 수 있는 범위의 데이터는 리턴타입 형으로 형변환된다
		System.out.println("첫번째 수에서 에서 두번째 수를 나눈 값은" + result1);
		
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
