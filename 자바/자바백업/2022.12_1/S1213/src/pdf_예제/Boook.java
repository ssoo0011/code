package pdf_����;

public class Boook {
	
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Boook(){
			this ("", "");
			System.out.println("������ ȣ���");
	}

	public Boook(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Boook(String title, String author) {
		this.title = title;
		this.author = author;
	}

}
