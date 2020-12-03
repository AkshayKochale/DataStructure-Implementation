package FileAdvance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import CoreJava.Student;

public class HandlingFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File f = new File("test.txt");

		FileWriter w = new FileWriter(f, true);

		Student s = new Student(01, "Akshay", 90);
		Student s1 = new Student(02, "jolsin0", 90);
		Student s2 = new Student(03, "sobet", 30);
		Student s3 = new Student(04, "Alvav", 60);
		Student s4 = new Student(05, "mava", 60);
		Student s5 = new Student(06, "java", 70);

		FileOutputStream fos= new FileOutputStream(f);
		ObjectOutputStream os= new ObjectOutputStream(fos);
		FileInputStream fi=new FileInputStream(f);
		ObjectInputStream oi= new ObjectInputStream(fi);
		os.writeObject(s);
		os.writeObject(s1);
		
//		PrintWriter p= new PrintWriter(w);
//		p.println(s.toString());
//		p.println(s1.toString());
//		p.println(s2.toString());
//		p.println(s3.toString());
//		p.println(s4.toString());
//		p.println(s5.toString());
//		
//
//		
//		w.close();p.close();
//		FileReader fr= new FileReader(f);
//		
//		Scanner sc= new Scanner(fr);
//		 Student s= new Student();
//		
//		while(sc.hasNext()) 
//		{
//		
//		
//		}
		
		Student st= (Student)oi.readObject();
		
		System.out.println(st);
		System.out.println("done");

	}

}
