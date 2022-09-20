package constructPack;

public class StaticTemp
{
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }
 
    // no-arg constructor
    StaticTemp()
    {
        System.out.println("default");
    }
 
    // constructor with one arguemnt.
    StaticTemp(int x)
    {
        System.out.println(x);
    }
 
    public static void main()
    {
        // Object creation by calling no-argument 
        // constructor.
        new StaticTemp();
 
        // Object creation by calling parameterized 
        // constructor with one parameter.
     //   new StaticTemp(10);
    }
}