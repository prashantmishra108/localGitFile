package chap1;

public class Genericcasting {
public static void main(String[] args) {
	byte b = 5;
	int n=10;Integer i1=new Integer(10);
	long l = 100;
	System.out.println(disp(b));
	System.out.println(disp(i1));
	System.out.println(disp(l));
}
static String disp(Byte b){
	return "byte = "+b;}
static String  disp(Integer I){
	return "Integer = "+I;}
static String disp(Long l){
	return "Long = "+l;}

}
