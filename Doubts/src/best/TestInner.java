package best;
public class TestInner
{
    private static int value = 20;
    public int s = 15;
    public static int temp = 10;  
    public static class Nested
    {  
      private void display()
      {
          System.out.println(temp + s + value);
  /*//10: error: non-static variable s cannot be referenced from a static context
  System.out.println(temp + s + value);
  ^*/
      }  
    }  
      
    public static void main(String args[])
    {  
      TestInner.Nested inner = new TestInner.Nested();  
      inner.display();  
    } 
}

 interface aint{
	private int i;
	private int ram(){}
}