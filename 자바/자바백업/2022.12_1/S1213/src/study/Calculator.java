package study;

public class Calculator {

	void powerOn() {
		System.out.println("전원을 켭니다");
		
	}
	
	int plus (int x, int y) {
		int result = x + y;
		return result;
	}
	
	int minus (int x, int y) {
		return x - y;
	}
	
	int rhq(int x , int y) {
		return x * y;
	}
	
	int wprhq(int x) {
		return x*x;
	}

	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	int sum(int[] v) {
		int hap = 0;
		for (int i = 0; i < v.length; i++) {
			hap += v[i];
		}
		return hap;
	}
	
	int sumsum(int... values) {
		int plus = 0;
		for (int i = 0; i < values.length; i++) {
			plus += values[i];
		}
		return plus;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}


}
