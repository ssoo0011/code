package study;

public class RptksrlEx {

	public static void main(String[] args) {
		
		Rptksrl num = new Rptksrl();
		
		int a = num.plus(9, 10);
		int b = num.minus(17, 16);
		int c = num.rhq(7, 9);
		double d = num.div(99, 33);
		int e = num.wprhq(2, 10);
		
		System.out.println("���ϸ� : " + a);
		System.out.println("���� : " + b);
		System.out.println("���ϸ� : " + c);
		System.out.println("������ : " + d);
		System.out.println("��ŭ ���ϸ� : " + e);
	}

}
