package best;
 class Base
{
    //private
   public  int multiplier(int data)
    {
        return data*5;
    }
}
 
class Q11GeeksForGeeks extends Base
{
    private static int data;
    public Q11GeeksForGeeks()
    {
        data = 25;
    }
    public static void main(String[] args)
    {
        Base temp = new Q11GeeksForGeeks();
        System.out.println(temp.multiplier(data));
    }
}
