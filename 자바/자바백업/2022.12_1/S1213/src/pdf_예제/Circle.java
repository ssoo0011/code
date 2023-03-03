package pdf_¿¹Á¦;

public class Circle {
	
	int radius;
	String name;

	public Circle() {
		
	}
	
	public Circle(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double area() {
		return radius * radius * 3.14;
	}
	
	

}
