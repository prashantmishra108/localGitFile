package best;

public class TestStaticMethod {
	static int i = 1;//int 1_yy;
	public static void main(String args[])
	{
	System.out.println(i+" , ");
	m(i);
	System.out.println(i);
	System.out.print("Hello,\n world!");
	}
	public static void m(int j)
	{
	i += 2;
	}
	}