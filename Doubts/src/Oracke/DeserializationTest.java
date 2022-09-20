package Oracke;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class DeserializationTest {
	public static void main(String[] args) {
		studentinfo si = null;
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			si = (studentinfo) ois.readObject();//
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(si.name);
		System.out.println(si.rid);
		System.out.println(si.contact);
	}
}