package a220328;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
	List<Student> list = new ArrayList<Student>();
	list.add(new Student(1, "1길동", 80));
	list.add(new Student(2, "2길동", 100));
	list.add(new Student(3, "3길동", 20));
	
	System.out.println(list);
																		//직렬화 확장자
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
	oos.writeObject(list);
	}
}

class Student implements Serializable{
	int no;
	String name;
	int score;

	public Student(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", score=" + score + "]";
	}
	
	
}
