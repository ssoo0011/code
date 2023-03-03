package study;

public class study_01 {

	public static void main(String[] args) {
		
		int[] age;
		String names[];
		
		age = new int[3];
		names = new String[3];
		
		age[0] = 1; age[1] = 2; age[2] = 3;
		names[0] = "홍길동"; names[1] = "전우치"; names[2] = "이도";
		
		String names1[] = {"홍길동" , "전우치" , "이도"};
		String names2[] = new String[] {"홍길동" , "전우치" , "이도"};
		
		
		for(int i = 0; i < age.length; i++) {
			System.out.println("age["+i+"] = " + age[i]);
			System.out.println("names["+i+"] = " + names[i]);

		}
		for (String name : names2) {//2에 있는 값을 names로 하나하나 가져와줘
			System.out.println(name);
		}
		

	}

}
