package study;

public class study_04 {

	public static void main(String[] args) {
		
		String[] a = {"java", "array", "copy", "string", "ovject"};
		String[] b = new String[a.length];
		
		a[0] = b[0];
		for(int i = 0; i < a.length; i++) { //��������!! �����ذ�
			
			a[i] = b[i];
			//���� ������ ���� �����ϴ� �� = ���� ����
			//������ ��ü�� �����ϴ°� = ���� ����
			
		}
		
		
	}

}
