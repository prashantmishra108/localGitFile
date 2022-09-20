package chap5;

import java.io.IOException;

public class MethodException extends IOClass
{
public void meth()throws NullPointerException{}
public static void main(String[] args) {
	System.out.println("a");
}
}
class IOClass{
	public void meth()throws IOException
	{}
}
