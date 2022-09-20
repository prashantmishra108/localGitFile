package best;
public class TestGC
{
    public static void main(String [] args) 
    {
        TestGC t1 = new TestGC();System.out.println(t1.hashCode());
        TestGC t2 = m1(t1); System.out.println(t1.hashCode()+" "+t2.hashCode());// line 6
        TestGC t3 = new TestGC();System.out.println(t3.hashCode());
        t2 = t3; // line 8
    }
    static TestGC m1(TestGC temp) 
    {
        temp = new TestGC();
        return temp;
    }
}
/* By the time line 8 has executed, the only object without a reference is the one generated i.e as a result of line 6. 
 * Remember that “Java is strictly pass by value” so the reference variable t1 is not affected by the m1() method.
 * We can check it using finalize() method. The statement “System.out.println(this.hashcode())” in finalize() method 
 * print the object hashcode value on which finalize()
 *  method is called,and then just compare the value with other objects hashcode values created in main method.
 **/