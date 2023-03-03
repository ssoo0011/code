package study;

public class Circle {
	
	int radius;
	String name;
	
	public Circle/*생성자 함수이름*/() {}// 생성자, 써클 클래스, 뉴하고 새 공간 할당받은거 모양이랑 같음, 중괗ㄹ오 안에 내용 있으면 그거 실행, 메모리공간 할당받을 때 호출되는 함수~ 이해안가요~~
		//퍼블릭과 서클 사이에 리턴타입이 없음, void 돌려주는 값 없다! 이런거 둘 다 없다. 
	public double getArea() { //함수가 호출되면 매개변수로 함수 호출, getArea = 기능 정의
		return radius * radius * 3.14; //원의 넓이 같은 클래스 내에 있는 변수들 사용 가능~
	}

	public static void main(String[] args) {
		Circle pizza; //변수 선언 Circle = 변수 타입
		pizza = new Circle(); //써클만큼 공간 할당 해주쇼, 피자 = 참조변수, 객체화, 클래스 안에 묶임!!!
		
		pizza.radius/*속성값*/ = 24; //. = 직접 접근
		pizza.name = "자바피자";
		double area = pizza.getArea(); // 11번으로 리턴
		System.out.println(area);
		
		Circle donut;
		donut = new Circle(); // 써클에 메모리할당 받기, 도넛
		
		donut.radius = 6;
		donut.name = "등킨드나쓰";
		double area2 = donut.getArea();
		System.out.println(area2);
		
	}

}

