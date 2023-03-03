package seperate;

public class Car1 {
	
	public static void main(String[]args) {
		
		Car[]a;
		a = new Car[6];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = new Car("자동차" + i + "번");
			System.out.println(a[i].model);
		}
		
	}


}
