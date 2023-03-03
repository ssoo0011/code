package calendar;

import java.util.Calendar;

import calendar.Week;

public class study_05 {

	public static void main(String[] args) {
		
		Week today = null; //Week type 담을 수 있음!!! 다른거 담을 수 없음 , 열거형 상수임~
		Calendar cal = Calendar.getInstance(); //날짜에 대한 정보를 읽겠따
		int w = cal.get(Calendar.DAY_OF_WEEK); //요일 정보를 숫자형태로 들고옴 1~7
		
		switch(w) {
			case 1 : 
				today = Week.SUNDAY; break; //week.~~day 는 상수라 다른 값 줄 수 없음! 5=0 이랑 같은 개념; 
											//우변에만 올 수 있다! r-v 코드 안에서 값을 바꿀 수 없고, 저기 가서 바꿔야함
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
		
		System.out.println("★☆오늘 요일은☆★" + today + "☆★");
		
		if ( today == Week.SUNDAY ) { //열거형 상수라 숫자로 치고 == 으로 비교!
			System.out.println("★☆★☆일요일은 짜파게티!★☆★☆");
		} else {
			System.out.println("닭찌찌파티~! ㅠ^ㅠ");
		}
		

	}

}
