package seperate;

public class CarEx2 {

	String company;
	String model;
	String color;
	int maxSpeed;
//	int speed; //���� �ϰ� ���� ���� ������ 0 / 0.0���� ���
//	int cc;
	
	CarEx2(){
		
	}
	CarEx2(String model){
		this.model = model;
	}
	CarEx2(String model, String color){
		this(model);
//		this.model = model;
		this.color = color;
	}
	CarEx2(String model, String color, int maxSpeed){
		this(model, color); //�� ù�ٿ��� ��� ����, �Լ��� ũ�� �����ؾ��ϱ� ������! ���� �Ҵ���� �޸� �������ִ� ��
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

