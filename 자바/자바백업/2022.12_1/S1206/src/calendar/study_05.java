package calendar;

import java.util.Calendar;

import calendar.Week;

public class study_05 {

	public static void main(String[] args) {
		
		Week today = null; //Week type ���� �� ����!!! �ٸ��� ���� �� ���� , ������ �����~
		Calendar cal = Calendar.getInstance(); //��¥�� ���� ������ �аڵ�
		int w = cal.get(Calendar.DAY_OF_WEEK); //���� ������ �������·� ���� 1~7
		
		switch(w) {
			case 1 : 
				today = Week.SUNDAY; break; //week.~~day �� ����� �ٸ� �� �� �� ����! 5=0 �̶� ���� ����; 
											//�캯���� �� �� �ִ�! r-v �ڵ� �ȿ��� ���� �ٲ� �� ����, ���� ���� �ٲ����
			case 2 : 
				today = Week.MONDAY; break;
				
			case 3 : 
				today = Week.TUESDAY; break;
				
			case 4 : 
				today = Week.WEDNESDAY; break;
				
			case 5 : 
				today = Week.THURSDAY; break;
				
			case 6:
				today = Week.FRIDAY; break;
				
			case 7 : 
				today = Week.SATURDAY; break;
		}
		
		System.out.println("�ڡٿ��� �������١�" + today + "�١�");
		
		if ( today == Week.SUNDAY ) { //������ ����� ���ڷ� ġ�� == ���� ��!
			System.out.println("�ڡ١ڡ��Ͽ����� ¥�İ�Ƽ!�ڡ١ڡ�");
		} else {
			System.out.println("��������Ƽ~! ��^��");
		}
		

	}

}
