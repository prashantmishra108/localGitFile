package best;
class Writer
{
    public  static void write()
    {
        System.out.println("Writing...");
    }
}
class Author extends Writer
{
    public  static void write()
    {	
        System.out.println("Writing book");
    }
}
public class ProgrammerExtendStatic extends Author
{
    public  static void write()
    {	
        System.out.println("Writing code");
    }
 
    public static void main(String[] args)
    {
    	Author a1 = new Author();
    	Author a  = new ProgrammerExtendStatic();
        a.write();
    }
}