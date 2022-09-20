package chap3;

public class valueof {
@SuppressWarnings("static-access")
public static void main(String[] args) {
    int i=0;
	Integer num = null;
	System.out.println(Integer.valueOf("200"));
	System.out.println(num.valueOf("200"));
    System.out.println("k"+null);
    int numb = Character.getNumericValue('9');
//System.out.println(9*null);
  //System.out.println("k"+null);
   System.out.println(numb);

}
}
