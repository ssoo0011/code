package pdf_����;

import java.util.Scanner;

public class RectangleEX {

	public static void main(String[] args) {
		
		Rectangle araa = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("�簢���� ���̿� �ʺ� �Է��ϼ���.");
		
		int high = scanner.nextInt();
		int wide = scanner.nextInt();
		
		araa.high = high;
		araa.wide =  wide;
		
		System.out.println("���̴�" + araa.high + "\n�ʺ��" + araa.wide);
		System.out.println("���̴� " +araa.area());

	}

}
