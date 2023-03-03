package pdf_예제;

public class Boook {
	
	String title;
	String author;
	
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Boook(){
			this ("", "");
			System.out.println("생성자 호출됨");
	}

	public Boook(String title) {
		this(title, "작자미상");
	}
	
	public Boook(String title, String author) {
		this.title = title;
		this.author = author;
	}

}
