package seperate;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //�޸� ������༭ Ŭ���� ����
		
//		System.out.println( "����ȸ��  " + myCar.company);
//		System.out.println( "��  " + myCar.model);
//		System.out.println( "����  " + myCar.color);
//		System.out.println( "�ְ�ӵ�  " + myCar.maxSpeed);
//		System.out.println( "���� �ӵ�  " + myCar.speed);
//		System.out.println( "��ⷮ  " + myCar.cc);
//		System.out.println();
//		
//		Car newCar = new Car("����", 3000);
//		
//		System.out.println( "����ȸ��  " + newCar.company);
//		System.out.println( "��  " + newCar.model);
//		System.out.println( "����  " + newCar.color);
//		System.out.println( "�ְ�ӵ�  " + newCar.maxSpeed);
//		System.out.println( "���� �ӵ�  " + newCar.speed);
//		System.out.println( "��ⷮ  " + newCar.cc);
//		System.out.println();
//		
//		Car newACar = new Car("�����ڵ���", "�ҳ�Ÿ", "���", 3000, 250, 70);
//		
//		
//		System.out.println( "����ȸ��  " + newACar.company);
//		System.out.println( "��  " + newACar.model);
//		System.out.println( "����  " + newACar.color);
//		System.out.println( "�ְ�ӵ�  " + newACar.maxSpeed);
//		System.out.println( "���� �ӵ�  " + newACar.speed);
//		System.out.println( "��ⷮ  " + newACar.cc);
////		
//		
//		myCar.speed = 60;
//		System.out.println( "������ ����ӵ�  " + myCar.speed);
		
		Car car1 = new Car();
		System.out.println("Car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("�׷���");
		System.out.println("Car2.company : " + car2.company);
		System.out.println("Car2.model : " + car2.model);
		System.out.println();

		Car car3 = new Car("ev6", "���");
		System.out.println("Car3.company : " + car3.company);
		System.out.println("Car3.model : " + car3.model);
		System.out.println("Car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("ĳ����", "���", 300);
		System.out.println("Car4.company : " + car4.company);
		System.out.println("Car4.model : " + car4.model);
		System.out.println("Car4.color : " + car4.color);
		System.out.println("Car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}

}
