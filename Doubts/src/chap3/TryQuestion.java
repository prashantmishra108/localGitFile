package chap3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryQuestion {
public static void main(String[] args) {
	try{
		FileWriter fw = new FileWriter("TestFile.txt");
		fw.write("1 = one, 2 = two, 3= three");
		fw.close();
		FileReader fr = new FileReader("TestFile.txt");
		Scanner scan = new Scanner(fr);
		while(scan.hasNext()){
			System.out.println(scan.next()+"");
		}
	}
	catch(IOException ie){}
}
}
