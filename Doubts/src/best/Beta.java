package best;
class Alpha
{
    public String type = "a ";
    public Alpha() {  System.out.print("alpha "); }
}
public class Beta extends Alpha
{	//public String type="b";
    public Beta()  {  System.out.print("beta ");  }
    void go()
    {
        type = "b ";
        System.out.print(this.type + super.type);
    }
    public static void main(String[] args)
    {
        new Beta().go();
    }
}