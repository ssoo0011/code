package pdf_예제;

import java.util.Scanner;

public class RectangleEX {

	public static void main(String[] args) {
		
		Rectangle araa = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("사각형의 높이와 너비를 입력하세요.");
		
		int high = scanner.nextInt();
		int wide = scanner.nextInt();
		
		araa.high = high;
		araa.wide =  wide;
		
		System.out.println("높이는" + araa.high + "\n너비는" + araa.wide);
		System.out.println("넓이는 " +araa.area());

	}

}
