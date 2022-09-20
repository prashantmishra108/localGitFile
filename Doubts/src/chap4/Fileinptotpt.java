package chap4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Fileinptotpt {
	static String s;
	/**
	 * @param args
	 * @throws IOException 
	 */public Fileinptotpt() {
	 s="trytrytry0";
	 }
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println(Fileinptotpt.s);
        FileOutputStream fos = new FileOutputStream("myfile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(Fileinptotpt.s);
		FileInputStream fis =new FileInputStream("myfile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Fileinptotpt fiobj = (Fileinptotpt)ois.readObject();
		System.out.println(Fileinptotpt.s);
		fis.close();
		
		
	
	}

}
