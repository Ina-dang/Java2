package domain;

import java.io.Serializable;

//import java.util.Arrays;
// 클래스 설계도 그리는 시점에는 인스턴스가 없다는 걸 기억하고 인스턴스가 나중에 들어올 자리에 this로 이해

public class Student implements Serializable{
	
	private String no; 
	private String name;
	private int kor;             
	private int eng;
	private int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String no, String name) {
		this(no, name, getScore(), getScore(), getScore());
		this.no = no;
		this.name = name;
	}

	public Student(String no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getNo() {return no;}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {return name;}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {return kor;}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {return eng;}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {return math;}

	public void setMath(int math) {
		this.math = math;
	}

	//총점, 평균
	
	public int sum() {
		return this.kor + this.eng + this.math;
	}

	public double avg() {
		return (int)(sum() / 3d * 100) /100d;
	}

	public String toString() { //format으로 하는게 가장 좋음
		String str = no + "    "+ name + "    " + kor + "    " + eng + "    " + math +
				"    " + sum() + "    " + avg() ; 

		return str;
	}
	
	//점수 랜덤
	private static int getScore() { //스태틱으로 처리해서 먽
		return (int)(Math.random()*41)+60;
	}
}
