package pdf_����;

public class Book {

	String title;
	String author;
	
	public Book (String t) {
		title = t;
		author = "���ڹ̻�";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}

	@Override
	public String toString() {
		return "å ������" + title + "\n���ڴ� " + author ;
	}
	
	
}
