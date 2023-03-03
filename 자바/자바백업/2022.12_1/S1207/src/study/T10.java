package study;

import java.util.Scanner;

public class T10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] Arr = new int[4][4];
		
		int x, y, result=0;
		
		while(result<10) {
			x=(int)(Math.random()*4);
			y=(int)(Math.random()*4);
			if(Arr[y][x]==0) { //Arr[x][y]에 값이 없으면 랜덤 수 넣는법
				Arr[y][x]=(int)(Math.random()*10+1);
				result++;
			}
		}
		
		for(int i=0;i<Arr.length;i++) {
			for(int j=0; j<Arr[i].length;j++) {
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}
				
		

	}

}
