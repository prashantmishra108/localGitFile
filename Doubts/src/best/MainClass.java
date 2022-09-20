package best;
class A
{
    static int i = 1111;
    static
    {    	System.out.println("1.1 =  "+i);   i = i-- - --i;System.out.println("A2.1 =  "+i);}
    {     	System.out.println("3s.2 =  "+i);       i = i++ + ++i;System.out.println("4.1 =  "+i);    }
}
class B extends A
{    static
    {		System.out.println("B2.1  =  "+i);  
        i = --i - i--;
    }
    {	System.out.println("B2.2  =  "+i);
        i =  i++ + --i;
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
        System.out.println(b.i);
    }
}