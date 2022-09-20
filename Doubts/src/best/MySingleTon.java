package best;
public  class MySingleTon {
   int a=20;
	private static MySingleTon myObj;
   /**    * Create private constructor*/
   private MySingleTon(){ }
   /** * Create a static method to get instance.*/
   public static MySingleTon getInstance(){
       if(myObj == null){
           myObj = new MySingleTon();
       }
       return myObj;
   }
   public void getSomeThing(){
       // do something here
       System.out.println("I am here...."+a);
   }
    
   public static void main(String a[]){
       MySingleTon st = MySingleTon.getInstance();
       MySingleTon sit = MySingleTon.getInstance();
       st.getSomeThing();sit.a=30;System.out.println(st.a==sit.a);
       MySingleTon sit1 = new MySingleTon();
       sit.getSomeThing();
       st.getSomeThing();
   }
}