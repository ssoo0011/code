package pdf_예제;

public class CircleEx {

	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "도미노피짜!");
		pizza.radius = 10;
		System.out.println(pizza.name + "의 면적은  " + pizza.area());

	}

}
