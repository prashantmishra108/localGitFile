package chap1;

public class Staticmethod {
public static void main(String[] args) {
	mymd(3.00);
	mymd(new Double(4.00f));
	mymd(new Double("54.00"));
}
static void mymd(double d){System.out.println("primitive");}
static void mymd(Double d){System.out.println("DoubbleObject");}

}
