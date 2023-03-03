package pdf_예제;

public class BookEx {

	public static void main(String[] args) {
		
		Book book1 = new Book("어린왕자", "생텍쥐페리");
		Book book2 = new Book("춘향전");
		
		System.out.println("책 제목은 " + book1.author + "\n저자는  " + book1.author);
		System.out.println("책 제목은 " + book2.author + "\n저자는  " + book2.author);
		System.out.println();
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
	}

}
