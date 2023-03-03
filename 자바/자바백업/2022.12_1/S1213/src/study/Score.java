package study;

public class Score {

	Score(){
		String name;
		int kor;
		int eng;
		int math;
	}
	int aver(int Kor, int Eng, int Math){
		return  (Kor + Eng + Math ) /3;
	}
	
}
