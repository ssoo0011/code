package study;

public class RptksrlEx {

	public static void main(String[] args) {
		
		Rptksrl num = new Rptksrl();
		
		int a = num.plus(9, 10);
		int b = num.minus(17, 16);
		int c = num.rhq(7, 9);
		double d = num.div(99, 33);
		int e = num.wprhq(2, 10);
		
		System.out.println("더하면 : " + a);
		System.out.println("빼면 : " + b);
		System.out.println("곱하면 : " + c);
		System.out.println("나누면 : " + d);
		System.out.println("만큼 곱하면 : " + e);
	}

}
