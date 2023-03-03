package study;

import java.util.Scanner;

class Rectangle{ //정의에 관한 메소드

	int width;
	int height; //맴버변수
	
	public int getArea() {//맴버함수. 기능
		return width * height;
	}
}
public class RectApp { //객체 이 안에서 만들거임~, 실행에 관한 메소드

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
	}

}
