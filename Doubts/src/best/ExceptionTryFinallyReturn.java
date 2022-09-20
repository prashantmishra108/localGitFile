package best;
public class ExceptionTryFinallyReturn {
    public static void main(String args[]) {
        int x=10;
        int y=25;
        int z=x+y;
        System.out.println("Sum of x+y = " + z);
        System.out.println(meth());
    }
    static String meth() {
        try{
            throw new Exception();
        //    return "1";
        }catch(Exception e) {
        	System.out.println("return");
        	return "1.5";
//        	System.out.println("return");//does not compile
        } 
        finally{
            return "2";
        }
    }
}
