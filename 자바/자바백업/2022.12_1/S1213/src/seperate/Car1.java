package seperate;

public class Car1 {
	
	public static void main(String[]args) {
		
		Car[]a;
		a = new Car[6];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = new Car("�ڵ���" + i + "��");
			System.out.println(a[i].model);
		}
		
	}


}
