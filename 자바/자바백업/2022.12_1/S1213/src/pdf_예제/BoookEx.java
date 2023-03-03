package pdf_예제;

public class BoookEx {

	public static void main(String[] args) {
		
		Boook a = new Boook();
		Boook prince = new Boook("어린왕자", "생텍쥐페리");
		Boook hong = new Boook("홍길동전", "허균");
		Boook chun = new Boook("춘향전");
		
		
		System.out.println(prince.title+ " " + prince.author);
		System.out.println(hong.title + " " + hong.author);
		System.out.println(chun.title + " " + chun.author);
	}

}
