package study;

public class study_02 {

	public static void main(String[] args) {
		
		
		String cities[] = {"����", "�뱸", "����", "�λ�"};
		String nation[] = {"���ѹα�", "ũ�ξ�Ƽ��", "�Ϻ�", "�����", "����"};
		
		String newArr[] = new String [cities.length + nation.length];
		
		System.arraycopy(cities, 0, newArr, 0, cities.length);
		System.arraycopy(nation, 0, newArr, cities.length, nation.length);
		
		for(String str : newArr) {
			System.out.println(str);
		}

	}

}
