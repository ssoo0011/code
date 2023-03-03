package study;
import java.util.Scanner;

public class study_02 {

	public static void main(String[] args) {
		int a [] = new int [5];
		
		a[0] = 10;
		a[1] = 22;
		a[2] = 39;
		a[3] = 99;
		a[4] = 88;
		
		Scanner sc = new Scanner(System.in);
		
		
		int [] b = {22, 33, 44, 55, 66, 77}; //new int[6], 참조변수를 주면서 바로 줘야함
		int [] c ; //참조변수만 선언하는거 가능
		c = new int [11]; //요로케 새로 넣어주면 됨!
		
//		int []d;
//		d = {1, 2, 3, 4, 5}; 요건 안되지/ 배열을 맨 처음 생성할때만 값을 넣어줄 수 있다!
		
		int []d = {1, 2, 3, 4, 100};
		
		int[]e;
		e = new int [] {1, 2, 6, 4, 143}; //이건 또 됨;		
	}

}
