package study;

public class class_1 {

	public static void main(String[] args) { //void = 리턴값
		
		int a = 30;
		int b = 88;
		int sum = add(a , b);
		System.out.println(sum);

	}
	
	
	public static int add(int x, int y) { // 함수 호출하려면 2개의 값 넣어줘라! 
										  //a = int x , b = int y 값만 들어감!
		  								  //int a != int x , int b != int y 같은 함수는 아니다.
		int hap = x + y;
		
		return hap; //호출했던 자리로 돌아간다! add(a,b)로 값만 감
		
	
	
	}

}
