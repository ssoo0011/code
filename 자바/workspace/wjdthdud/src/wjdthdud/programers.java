package wjdthdud;

public class programers {
	public static void main(String[]args) {
		
		int[]number = {0, -31, 24, 10, 1, 9};
		int max = 0;
		for(int i = 0; i< number.length; i++) {
			for(int j = 0; j< number.length; j++) {
				if(i != j && max <number[i]*number[j]) {
					max = number[i]*number[j];
				}else if (number[i]*number[j] < 0) {
					
				}
			}
		}
		
		System.out.println(max);
	}
}
