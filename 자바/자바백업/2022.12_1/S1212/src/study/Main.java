package study;

class Student{
    //�ʵ�(Field)
String name; //�̸�
int age; //����
int korean_scroe; //�����
int math_score; //���м���
int english_score; //�����

//������(Constructor)
Student(String name, int age, int kor_score, int mat_score, int eng_score){
    this.name = name;
    this.age = age;
    this.korean_scroe = kor_score;
    this.math_score = mat_score;
    this.english_score = eng_score;
}

//�޼ҵ�(Method)
public void printScore() {
    System.out.println("�̸� : " + name);
    System.out.println("���� : " + age);
    System.out.println("����� : " + korean_scroe);
    System.out.println("���м��� : " + math_score);
    System.out.println("����� : " + english_score);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("ȫ�浿", 18, 100, 90, 80);
    student.printScore(); //�ν��Ͻ� �޼ҵ� ȣ��
    }
}