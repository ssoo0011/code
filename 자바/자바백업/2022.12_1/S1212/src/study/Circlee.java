package study;


	public class Circlee {
		int radius;
		String name;
		
		public Circlee() {}
		public Circlee(int a, String s) {}
		public Circlee(int b) {}
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		public double getArea() {
			return radius * radius * 3.14;
		}



	public static void main(String[] args) {
	
		Circlee pizza;
		pizza = new Circlee();
		System.out.print(">>");
		
		pizza.radius = 15;
		pizza.name = "���ְڴ�!";
		double area = pizza.getArea();
		System.out.println(area);
		
		
		Circlee donut;
		donut = new Circlee();
		donut.radius = 5;
		donut.name = "���ҵ�����";
		double area2 = donut.getArea();
		System.out.println(area2);
		
				
		
		
	}
}
//���庸��~

