package study;

import java.util.Scanner;

class Rectangle{ //���ǿ� ���� �޼ҵ�

	int width;
	int height; //�ɹ�����
	
	public int getArea() {//�ɹ��Լ�. ���
		return width * height;
	}
}
public class RectApp { //��ü �� �ȿ��� �������~, ���࿡ ���� �޼ҵ�

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		System.out.println("�簢���� ������ " + rect.getArea());
	}

}
