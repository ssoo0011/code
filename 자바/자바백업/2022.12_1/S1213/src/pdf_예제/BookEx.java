package pdf_����;

public class BookEx {

	public static void main(String[] args) {
		
		Book book1 = new Book("�����", "�������丮");
		Book book2 = new Book("������");
		
		System.out.println("å ������ " + book1.author + "\n���ڴ�  " + book1.author);
		System.out.println("å ������ " + book2.author + "\n���ڴ�  " + book2.author);
		System.out.println();
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		
	}

}
