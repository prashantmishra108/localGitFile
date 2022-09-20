package best;
public class TestStaticGC
{
    public static void main(String[] args)
    {
        // How many objects are eligible for 
        // garbage collection after this line?
        m1();  // Line 5
        new TestStaticGC().m2();
    }
 
    static void m1() 
    {
    	System.out.println("Main GC");
        TestStaticGC t1 = new TestStaticGC();
        TestStaticGC t2 = new TestStaticGC();
    } 
    void m2() 
    {	m1();//m3();
    	System.out.println("M2");
    }
    void m3()//name m1 is not permitted here 
    {	TestStaticGC.m1();
    	System.out.println("M3");
    }
}
