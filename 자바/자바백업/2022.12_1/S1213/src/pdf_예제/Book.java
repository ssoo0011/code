package pdf_예제;

public class Book {

	String title;
	String author;
	
	public Book (String t) {
		title = t;
		author = "작자미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	@Override
	public String toString() {
		return "책 제목은" + title + "\n저자는 " + author ;
	}
	
	
}
