package chap2;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UTFDataFormatException;

class ab{ public void meth()throws IOException{}
public void metd()throws IOException,ClassNotFoundException {System.out.println("hi1");}}
public class excptn extends ab
{
	public static void main(String[] args) throws ClassNotFoundException,ClassCastException,
	FileNotFoundException,EOFException,InterruptedIOException,
	UTFDataFormatException {
		new excptn().esceptionMethod();
	}
	public void metd() throws ClassCastException,ClassNotFoundException//class not found exception not works here..
	{System.out.println("hi2");}
	
	public void esceptionMethod()throws FileNotFoundException,EOFException,InterruptedIOException,ArithmeticException,
	ClassCastException{ System.out.println("hi3");}
}
