package study;

public class study_03 {

	public static void main(String[] args) {
		
		int[][] multiArr1 = new int[2][2];
		int multiArr2[][] = new int [3][3];		
		int multiArr3[][] = new int [4][]; //���� ���� ������ �ʾ���!
		int[/*��*/] multiArr4[/*��*/] = new int [5][5];

		
		String sA[] = new String[3];
		sA[0] = "java"; //sA[0] = sA[1] , ������ ����
		sA[1] = "java"; //������
		sA[2] = new String("java");
		
		if (sA[0] == sA[1]) {                                                  
			System.out.println("[0, 1]���� ��ü�Դϴ�.");
			
		}
		if (sA[0] .equals( sA[2])) {
			System.out.println("[0, 2]���ڿ� ������.");
		}
	
	
	}

}
