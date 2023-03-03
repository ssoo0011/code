package seperate;

public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
//	int speed; //선언만 하고 값을 넣지 않으면 0 / 0.0으로 출력
//	int cc;
	
	Car(){
		
	}
	Car(String model){
		this.model = model;
	}
	Car(String model, String color){
		this(model);
//		this.model = model;
		this.color = color;
	}
	Car(String model, String color, int maxSpeed){
		this(model, color); //젤 첫줄에만 사용 가능, 함수로 크기 졀정해야하기 때무네! 현재 할당받은 메모리 참조해주는 것
//		this.model = model;
//		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//	Car(String color, int cc){
//		this.color = color;
//		this.cc = cc;
//	}
//	Car(String company, String model, String color, int cc, int maxSpeed, int speed){
//		this.company = company;
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//		this.speed = speed;
//		this.cc = cc;
//		
//		
//	}
//	@Override
//	public String toString() {
//		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
//				+ ", speed=" + speed + ", cc=" + cc + "]";
//	}

}

