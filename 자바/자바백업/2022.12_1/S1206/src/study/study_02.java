package study;

public class study_02 {

	public static void main(String[] args) {
		
		
		String cities[] = {"서울", "대구", "대전", "부산"};
		String nation[] = {"대한민국", "크로아티아", "일본", "브라질", "가나"};
		
		String newArr[] = new String [cities.length + nation.length];
		
		System.arraycopy(cities, 0, newArr, 0, cities.length);
		System.arraycopy(nation, 0, newArr, cities.length, nation.length);
		
		for(String str : newArr) {
			System.out.println(str);
		}

	}

}
