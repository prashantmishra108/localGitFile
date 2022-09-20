package constructPack;

class Temp1
{
    // block to be executed before any constructor.
	   {
	        System.out.println("init block");
	    }
	static   {
	        System.out.println("static block");
	    }
	 
    // no-arg constructor
    Temp1()
    {
        System.out.println("default");
    }
 
    // constructor with one arguemnt.
    Temp1(int x)
    {
        System.out.println(x);
    }
 
    public static void main(String args[])
    {
        // Object creation by calling no-argument 
        // constructor.
        new Temp1();
 
        // Object creation by calling parameterized 
        // constructor with one parameter.
        new Temp1(10);
    }
}