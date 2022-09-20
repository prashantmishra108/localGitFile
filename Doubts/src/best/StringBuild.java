package best;

import java.util.Random;
public class StringBuild {
	private void add (){
		System.out.println("add1");
	}
	protected void add(int i){
		System.out.println("add2");
	}
	public static void main(String[] args) {
	Random rn = new Random();	/*int n = rn.nextInt(0);*/
	StringBuild sb = new addabc();
	sb.add();sb.add(4);
	
	String a = new String("hi");
	StringBuilder sbld = new StringBuilder("hi");
	StringBuffer sbfr = new StringBuffer("hi");
	System.out.println("check1"+a.equals(sbfr));


	String a0 = "hi";
/*	StringBuilder sbld0 = "hi";
	StringBuffer sbfr0 = "hi";
	System.out.println("check1"+a.equals(sbfr));
*/	}
}
class  addabc extends StringBuild{
	private void add(){
		System.out.println("hi");
	}
	public void add(int i){
		System.out.println("hi2");
	}
}