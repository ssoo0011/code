package 실습문제;

public class Q_10 {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		int count = 0;
		
		while(count < 10) {
			
			int c = (int)(Math.random()*4);//j배열
			int b = (int)(Math.random()*4);// i배열 길번수	
				if(arr[b][c] == 0) {
					arr[b][c] = (int)(Math.random()*10+1);
				count++;
				}
		}
				
				
		for(int i = 0; i < arr.length; i++) { // arr[i]범위 생성, 3까지 만들어짐
			for (int j = 0; j < arr[i].length; j++) {

			System.out.print(arr[i][j] + " ");
			
			}System.out.println();
			
		}
	}

}
