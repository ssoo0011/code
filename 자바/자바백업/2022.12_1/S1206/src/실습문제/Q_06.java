package 실습문제;

import java.util.Scanner;

public class Q_06 {

   public static void main(String[] args) {

   
      Scanner sc = new Scanner(System.in);
      System.out.println("금액을 입력하시오 >>");
      
      int mon = sc.nextInt(); //입력받을 돈
      int[]unit = {50000, 10000, 1000, 100, 50, 10, 1}; // 환산받을 돈의 종류
      int coun = 0; //환산받을 개수

   
      for (int i = 0; i < unit.length; i++) {
         
         if (mon /unit[i] > 0) {

            coun = mon /unit[i]; //돈 개수
            mon = mon % unit[i]; // 남는돈

            System.out.println(unit[i] + "원\t" + coun + "개");
         }
         
      }
      
   }

}