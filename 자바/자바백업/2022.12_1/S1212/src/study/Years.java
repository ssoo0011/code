package study;

import java.util.Scanner;

class Date{
	int years;
	
	public int all () {
		return years * 365;
	}
}

public class Years {

	public static void main(String[] args) {
		
		Date days = new Date();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(">>");
		days.years = scanner.nextInt();
		System.out.println("��ƿ� �ϼ��� " + days.all());

	}

}
