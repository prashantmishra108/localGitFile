package Oracke;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class fileinptfileotpt {
public static void main(String[] args) {
	
	studentinfoo sii ;  
	try
	  {
	    sii = new studentinfoo("Abhi", 104, "110044");
	   FileOutputStream fos = new FileOutputStream("student.txt");
	   ObjectOutputStream oos = new ObjectOutputStream(fos);
	   oos.writeObject(sii);
	   oos.close();
	   fos.close();System.out.println(sii.contact);
	   }
	   catch (Exception e)
	   { e. printStackTrace(); }

	studentinfoo des = null;
	  try  
	  {
	   FileInputStream fis = new FileInputStream("student.txt");
	   ObjectInputStream ois = new ObjectInputStream(fis);
	   des = (studentinfoo)ois.readObject();
	  } 
	  catch (Exception e)
	   { e.printStackTrace(); }
	  System.out.println(des.name);
	  System.out. println(des.rid);
	  System.out.println(des.contact);
	 }
	}
class studentinfoo implements Serializable 
{
	private static final long serialVersionUID = 1L;
	 String name;
	 int rid;
	  String contact="9474204240";
	 studentinfoo(String n, int r, String c)
	 {
	  this.name = n;
	  this.rid = r;
	  this.contact = c;
	 }
}

