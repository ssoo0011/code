package PDF_예제;
import java.util.Scanner;
public class pdf_03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int stuNum = 0;
		int[]sco = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 ");
			System.out.println("-------------------------------------------------");
			System.out.print("선택 >");
			
			int selectNo = Integer.parseInt(sc.nextLine());
		
			
			if (selectNo == 1) {
				
				System.out.print("학생 수 >"); 
				stuNum = sc.nextInt();
				sc.nextLine();
				
				
			}
			 if(selectNo == 2) {
				 	sco = new int [stuNum];
				for(int i = 0; i < stuNum; i++) {
					System.out.print("score["+ i + "]>");
					int score = sc.nextInt();
					sc.nextLine();
					sco[i] = score;
				}
				
			}else if(selectNo == 3) {
				for(int i = 0; i < stuNum; i++) {
					System.out.println("score[" + i + "]> " + sco[i]);
				}
				
				
			}else if(selectNo == 4) {
				int max = 0;
				double sum = 0;
				
				for (int i = 0; i < stuNum; i++) {
					sum += sco[i];
					if(sco[i] > max)
					{
					max = sco[i];
					}
					double avr = sum / (double)stuNum;
	
				}double avr = sum / (double)stuNum;
				System.out.println("최고점수 :" + max);
				System.out.println("평균점수  :" + avr);
				
			}else if(selectNo == 5) {
				run = false;
			}
			
			
		}
		System.out.println("시스템 종료");


	}

}
