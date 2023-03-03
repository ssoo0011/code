package study;

public class study_04 {

	public static void main(String[] args) {
		
		String[] a = {"java", "array", "copy", "string", "ovject"};
		String[] b = new String[a.length];
		
		a[0] = b[0];
		for(int i = 0; i < a.length; i++) { //참조값을!! 복사해감
			
			a[i] = b[i];
			//참조 변수의 값만 복사하는 건 = 얕은 복사
			//데이터 자체를 복사하는걸 = 깊은 복사
			
		}
		
		
	}

}
