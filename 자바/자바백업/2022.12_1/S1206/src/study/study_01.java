package study;

public class study_01 {

	public static void main(String[] args) {
		
		int[] age;
		String names[];
		
		age = new int[3];
		names = new String[3];
		
		age[0] = 1; age[1] = 2; age[2] = 3;
		names[0] = "ȫ�浿"; names[1] = "����ġ"; names[2] = "�̵�";
		
		String names1[] = {"ȫ�浿" , "����ġ" , "�̵�"};
		String names2[] = new String[] {"ȫ�浿" , "����ġ" , "�̵�"};
		
		
		for(int i = 0; i < age.length; i++) {
			System.out.println("age["+i+"] = " + age[i]);
			System.out.println("names["+i+"] = " + names[i]);

		}
		for (String name : names2) {//2�� �ִ� ���� names�� �ϳ��ϳ� ��������
			System.out.println(name);
		}
		

	}

}
