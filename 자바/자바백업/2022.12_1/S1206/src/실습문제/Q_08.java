package 실습문제;
import java.util.Scanner;
public class Q_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 몇 개?");


		
		while(true) {			
			int a = sc.nextInt();
			int[] arr = new int[a];
			
				
				for(int i = 0; i < arr.length; i++) { //arr배열 번째수 제공
					
					int b = (int)(Math.random()*100) +1;//랜덤수 제공
					arr[i] = b; // 랜덤 값 배열에 집어넣기
					
					for(int j= 0; j< i ; j++){ //중복 수 찾기
						if(arr[i] == arr[j]){
							i--; //중복수 찾으면 i-1로 돌아가기
						}
					}
					
		
				}
				
				for(int i= 0; i<arr.length; i++) {	
				System.out.print(arr[i] + " ");	
				
				}
				
			
		}

	}

}
