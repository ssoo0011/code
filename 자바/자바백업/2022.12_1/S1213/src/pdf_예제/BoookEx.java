package pdf_����;

public class BoookEx {

	public static void main(String[] args) {
		
		Boook a = new Boook();
		Boook prince = new Boook("�����", "�������丮");
		Boook hong = new Boook("ȫ�浿��", "���");
		Boook chun = new Boook("������");
		
		
		System.out.println(prince.title+ " " + prince.author);
		System.out.println(hong.title + " " + hong.author);
		System.out.println(chun.title + " " + chun.author);
	}

}
