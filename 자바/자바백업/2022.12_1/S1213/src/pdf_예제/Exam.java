package pdf_����;

public class Exam { //�Ӽ��� �尥�Ÿ� ������, �׿����� ����̳� ���� �������� �Լ�

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
		return "���� ����\nname=" + name + "\nkor=" + kor + "\neng=" + eng + "\nmath=" + math + "\nscience=" + science
				+ "\nsociety=" + society + "\n�����" + avar();
	}
	
	

	
}


