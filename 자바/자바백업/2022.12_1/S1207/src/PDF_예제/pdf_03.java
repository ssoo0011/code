package PDF_����;
import java.util.Scanner;
public class pdf_03 {

	public static void main(String[] args) {
		
		boolean run = true;
		int stuNum = 0;
		int[]sco = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5. ���� ");
			System.out.println("-------------------------------------------------");
			System.out.print("���� >");
			
			int selectNo = Integer.parseInt(sc.nextLine());
		
			
			if (selectNo == 1) {
				
				System.out.print("�л� �� >"); 
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
				System.out.println("�ְ����� :" + max);
				System.out.println("�������  :" + avr);
				
			}else if(selectNo == 5) {
				run = false;
			}
			
			
		}
		System.out.println("�ý��� ����");


	}

}
