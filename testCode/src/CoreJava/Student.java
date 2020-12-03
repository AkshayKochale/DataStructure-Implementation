package CoreJava;

import java.io.Serializable;

public class Student implements Serializable {

	int id;
	String name;
	int marks;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	
	public Student() {
	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

//	@Override
//	public int compareTo(Object o) {
//		
//		Student s= (Student)o;
//		if(this.marks>s.marks) return -1;
//		else if(this.marks<s.marks) return 1;
//		return this.name.compareTo(s.name);
//	}


	
	
	
	
	
}
