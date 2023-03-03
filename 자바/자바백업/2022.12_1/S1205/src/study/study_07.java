package study;

public class study_07 {

	public static void main(String[] args) {
		
		int[][]grade = new int[3][4];
		
		int [][]score = new int [3][];
		score[0] = new int [4];
		score[1] = new int [2];
		score[2] = new int [3];
		
		
		for(int i = 0; i < grade.length ; i++) {
			
			for (int j = 0; j < 4; j++) {
				grade[i][j] = i+j;
				System.out.print(grade[i][j] + " ");

			}
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = i+j;
				System.out.print(score[i][j] + " ");
			}
		}

	}

}
