package chap4;

public class Jude extends Thread
{
public Jude(){}
String msg = "Hello Java";
public void run(){
	msg = msg+"class";		System.out.println("end");

//	notify();
}
public static void main(String[] args) {
	Jude thrd = new Jude();
	thrd.start();
synchronized(thrd){
	try{
		System.out.println("hi");
		thrd.wait(2000);//cannot make static ref to non-static methd
	}
	catch(Exception e){}
}
}









}
