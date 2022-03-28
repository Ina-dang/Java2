package service;

import static utils.StudentUtil.nextInt;
import static utils.StudentUtil.nextLine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import app.StringFormatEx;
import domain.Student;
import exception.RangeException;

public class StudentService1 { //기능
	
	//학생데이터
//	Student[] students = new Student[10];
	List<Student> students = new ArrayList<Student>();
	{
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
			students = (List<Student>) ois.readObject();
			ois.close();
			System.out.println("파일 불러오기 완료");
			
		} catch (FileNotFoundException e) {
			String[] names = {"김경보", "김동엽", "김상현", "김승종", "김예찬", "김치형", "김태윤"};
			
				for (int i = 0; i < names.length; i++) {
					students.add(new Student(220000 + i + 1 + "", names[i]));
				}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
//	int cnt; //현재 학생 인원수

	
//	int getScore() {
//		return (int)(Math.random()*41)+60;
//	}
	
	//조회
	public void list() {
		System.out.println("학번\t  이름\t  국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("======================================================");

		for(Student s : students) {
			System.out.print(StringFormatEx.convert(s.getNo(), 10));
			System.out.print(StringFormatEx.convert(s.getName(), 20));
			System.out.print(StringFormatEx.convert(s.getKor()+"", 5));
			System.out.print(StringFormatEx.convert(s.getEng()+"", 5));
			System.out.print(StringFormatEx.convert(s.getMath()+"", 5));
			System.out.print(StringFormatEx.convert(s.sum()+"", 5));
			System.out.print(StringFormatEx.convert(s.avg()+"", 9));
		}
		
	}
	
	//등록
	public void register() { 
		
		students.add(new Student(nextLine("학번>"), nextLine("이름", true), nextInt("국어"), 
				nextInt("영어"), nextInt("수학")));
		save();
	}
	//등록부분 끝
	Student student = new Student();
	
	//수정하기
	public void modify() throws RangeException { 
		//학번으로 학생을 탐색 후 학생 데이터 중 이름 , 성적 수정
		Student student = findBy(nextLine("수정할 학생의 학번 >"));
			if (student == null) { //equals 확인
				System.out.println("존재하지 않는 학번입니다");
				return;
			
			} 
			student.setName(nextLine("이름 >", true));
			
			int kor = nextInt("국어>");
			if (kor < 0 || kor > 100) {
				throw new RangeException();
			}
			student.setKor(kor);
			student.setEng(nextInt("영어>"));
			student.setMath(nextInt("수학>"));
		save();
	}//modify 끝
	
	private Student findBy(String no) {
		Student student = null;
		//for (대입받을변수정의 : 변수)
		for ( Student s : students ) {
			if(s.getNo().equals(no)) {
				student = s ;
			}
		}
		return student;
	}
	
	//삭제
	public void remove() {

		students.remove(findBy(nextLine("삭제할 학생의 학번 >>")));
		System.out.println("삭제되었습니다.");
		
		save();
	}
	
	private void save() {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
			oos.writeObject(students);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
