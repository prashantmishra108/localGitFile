package chap3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriter {
public static void main(String[] args) throws IOException {
	FileWriter fr = new FileWriter("TextWriter.txt");
	fr.write("dwar1war");//(" sdg 1 , 2 , add 3 , 5 , 6 , 8 , 9 so on");
	fr.close();
	FileReader frdr = new FileReader("TextWriter.txt");
	try{	
Scanner scan = new Scanner(frdr);
scan.useDelimiter("\\war");
//System.out.println(scan.nextDouble());scan.next();
//System.out.println(scan.nextDouble());
//System.out.println(scan.next());
while(scan.hasNext()){
//System.out.println(scan.hasNext());
//System.out.println(scan.next());
	System.out.println("hi");
	System.out.println(scan.next());
	if(scan.hasNext()){
		
		//System.out.println(scan.next());
	}
	//scan.next();
}
}
catch(Exception e){
	e.printStackTrace();
	
}
	
frdr.close();
}
}
