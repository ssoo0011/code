package seperate;

public class CarEx {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //메모리 만들어줘서 클래스 연결
		
//		System.out.println( "제작회사  " + myCar.company);
//		System.out.println( "모델  " + myCar.model);
//		System.out.println( "색깔  " + myCar.color);
//		System.out.println( "최고속도  " + myCar.maxSpeed);
//		System.out.println( "현재 속도  " + myCar.speed);
//		System.out.println( "배기량  " + myCar.cc);
//		System.out.println();
//		
//		Car newCar = new Car("은색", 3000);
//		
//		System.out.println( "제작회사  " + newCar.company);
//		System.out.println( "모델  " + newCar.model);
//		System.out.println( "색깔  " + newCar.color);
//		System.out.println( "최고속도  " + newCar.maxSpeed);
//		System.out.println( "현재 속도  " + newCar.speed);
//		System.out.println( "배기량  " + newCar.cc);
//		System.out.println();
//		
//		Car newACar = new Car("현대자동차", "소나타", "흰색", 3000, 250, 70);
//		
//		
//		System.out.println( "제작회사  " + newACar.company);
//		System.out.println( "모델  " + newACar.model);
//		System.out.println( "색깔  " + newACar.color);
//		System.out.println( "최고속도  " + newACar.maxSpeed);
//		System.out.println( "현재 속도  " + newACar.speed);
//		System.out.println( "배기량  " + newACar.cc);
////		
//		
//		myCar.speed = 60;
//		System.out.println( "수정된 현재속도  " + myCar.speed);
		
		Car car1 = new Car();
		System.out.println("Car1.company : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("그랜져");
		System.out.println("Car2.company : " + car2.company);
		System.out.println("Car2.model : " + car2.model);
		System.out.println();

		Car car3 = new Car("ev6", "흰색");
		System.out.println("Car3.company : " + car3.company);
		System.out.println("Car3.model : " + car3.model);
		System.out.println("Car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("캐스퍼", "흰색", 300);
		System.out.println("Car4.company : " + car4.company);
		System.out.println("Car4.model : " + car4.model);
		System.out.println("Car4.color : " + car4.color);
		System.out.println("Car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
	}

}
