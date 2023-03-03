package pdf_예제;

public class Exam { //속성이 드갈거면 생성자, 그에따른 계산이나 값을 받으려면 함수

	String name;
	int kor;
	int eng;
	int math;
	int science;
	int society;
	
	Exam(){
	
	}

	Exam(String name, int kor, int eng, int math, int science, int society){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}
	
	double avar(){
		return (kor + eng + math + science + society) / 5;
	}

	
	@Override
	public String toString() {
		return "시험 성적\nname=" + name + "\nkor=" + kor + "\neng=" + eng + "\nmath=" + math + "\nscience=" + science
				+ "\nsociety=" + society + "\n평균은" + avar();
	}
	
	

	
}


