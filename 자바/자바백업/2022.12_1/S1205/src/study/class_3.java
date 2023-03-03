package study;

public class class_3 {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("매개변수의 수가 부족합니다.");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println(num1 + num2);
		
		int []arr = new int [4]; //heap 4칸 받기!

		arr[0] = 7; //arr = # 제공
		arr[1] = 8;
		arr[2] = 11;
		arr[3] = 20;
		
		int sum = f(arr); //값만 전달!!!!!!!값만!!!!!!값만~!!!!!!!
		
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
//frr = 배열 이름
//f = 함수
//arr 값 가지고 f함수 이름 찾기!
//값만 왔으니 변수 frr을 만들어주기