package chap7;

public class intcheck extends A
{
// extends A{
public static void main(String[] args) {
	System.out.println(5/2+8/2+9.008f);
//System.out.println(new intdouble().meth(9));
}
 int meth(final int a){
	int h = a;h++;
	int temp = ++h;
	return temp;
}
}
 class A{}
final class B extends A{}//no class can extends a final class