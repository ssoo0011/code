package study;

public class class_2 {

	public static void main(String[] args) { 
		
		int a = 30;
		int b = 88;
		int sum = add(a , b);
		System.out.println("add 함수 sum = " + sum);
		
		int[] score ;
		score = new int[]{33, 44, 77};
		int hap = addArr(score);
		System.out.println("hap : " + hap);

	}
	
	
	
	
	public static int addArr(int[]s) {
		
		int sum = 0;
		for (int i = 0; i <s.length; i++) {
			sum +=s[i];
		}
		return sum;
		
		
	}
	
	public static int add(int x, int y) {

		int hap = x + y;
		
		return hap; //호출했던 자리로 돌아간다! add(a,b)로 값만 감
		
	
	
	}

}
