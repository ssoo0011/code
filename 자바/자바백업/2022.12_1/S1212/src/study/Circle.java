package study;

public class Circle {
	
	int radius;
	String name;
	
	public Circle/*������ �Լ��̸�*/() {}// ������, ��Ŭ Ŭ����, ���ϰ� �� ���� �Ҵ������ ����̶� ����, �߂D���� �ȿ� ���� ������ �װ� ����, �޸𸮰��� �Ҵ���� �� ȣ��Ǵ� �Լ�~ ���ؾȰ���~~
		//�ۺ��� ��Ŭ ���̿� ����Ÿ���� ����, void �����ִ� �� ����! �̷��� �� �� ����. 
	public double getArea() { //�Լ��� ȣ��Ǹ� �Ű������� �Լ� ȣ��, getArea = ��� ����
		return radius * radius * 3.14; //���� ���� ���� Ŭ���� ���� �ִ� ������ ��� ����~
	}

	public static void main(String[] args) {
		Circle pizza; //���� ���� Circle = ���� Ÿ��
		pizza = new Circle(); //��Ŭ��ŭ ���� �Ҵ� ���ּ�, ���� = ��������, ��üȭ, Ŭ���� �ȿ� ����!!!
		
		pizza.radius/*�Ӽ���*/ = 24; //. = ���� ����
		pizza.name = "�ڹ�����";
		double area = pizza.getArea(); // 11������ ����
		System.out.println(area);
		
		Circle donut;
		donut = new Circle(); // ��Ŭ�� �޸��Ҵ� �ޱ�, ����
		
		donut.radius = 6;
		donut.name = "��Ų�峪��";
		double area2 = donut.getArea();
		System.out.println(area2);
		
	}

}

