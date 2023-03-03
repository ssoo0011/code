package study;

public class Book {
	
	String title; // 속성, 맴버변수
	String author;
	
	public Book() { //기본 생성자
		
	}

	public Book (String title) { //리턴타입 없음! 객체가 만들어졌다는 뜻
		this.title = title;			 //입력받은 값으로 맴버변수의 값을 초기화
		this.author = "작자 미상";
	}
	public Book (String title, String author) { //매개변수만 다른거 - 함수의 오버로딩 가능
		//this = 이건 클래스에 있는 변수야~								// 오버로딩 = 매개변수가 맞는 생성자 찾아가는 것
		this.title = title;
		this.author = author;
	}
	
	
	public static void main(String[] args) {
		
		
		Book little = new Book("어린왕자", "생텍쥐페리");
		Book lovestory = new Book("춘향전");
		Book empty = new Book();
		
		System.out.println(little.title + " " + little.author);
		System.out.println(lovestory.title + " " + lovestory.author);


	}

}
