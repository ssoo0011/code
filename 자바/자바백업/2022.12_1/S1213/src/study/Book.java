package study;

public class Book {
	
	String title; // �Ӽ�, �ɹ�����
	String author;
	
	public Book() { //�⺻ ������
		
	}

	public Book (String title) { //����Ÿ�� ����! ��ü�� ��������ٴ� ��
		this.title = title;			 //�Է¹��� ������ �ɹ������� ���� �ʱ�ȭ
		this.author = "���� �̻�";
	}
	public Book (String title, String author) { //�Ű������� �ٸ��� - �Լ��� �����ε� ����
		//this = �̰� Ŭ������ �ִ� ������~								// �����ε� = �Ű������� �´� ������ ã�ư��� ��
		this.title = title;
		this.author = author;
	}
	
	
	public static void main(String[] args) {
		
		
		Book little = new Book("�����", "�������丮");
		Book lovestory = new Book("������");
		Book empty = new Book();
		
		System.out.println(little.title + " " + little.author);
		System.out.println(lovestory.title + " " + lovestory.author);


	}

}
