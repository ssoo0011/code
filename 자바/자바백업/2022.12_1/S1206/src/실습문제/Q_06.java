package �ǽ�����;

import java.util.Scanner;

public class Q_06 {

   public static void main(String[] args) {

   
      Scanner sc = new Scanner(System.in);
      System.out.println("�ݾ��� �Է��Ͻÿ� >>");
      
      int mon = sc.nextInt(); //�Է¹��� ��
      int[]unit = {50000, 10000, 1000, 100, 50, 10, 1}; // ȯ����� ���� ����
      int coun = 0; //ȯ����� ����

   
      for (int i = 0; i < unit.length; i++) {
         
         if (mon /unit[i] > 0) {

            coun = mon /unit[i]; //�� ����
            mon = mon % unit[i]; // ���µ�

            System.out.println(unit[i] + "��\t" + coun + "��");
         }
         
      }
      
   }

}