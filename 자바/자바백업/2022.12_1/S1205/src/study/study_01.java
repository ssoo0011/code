package study;
import java.util.Scanner;


public class study_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score [] = {13, 55, 99};
		
		System.out.println("score [0 ]" + score [0]);
		System.out.println("score [1] " + score[1]);
		System.out.println("score [2] " + score[2]);
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			
		} 
		System.out.println("sum = " + sum);

	}

}
