package design.builderPattern;

public class Phone {

	private int i;
	private String s;
	public Phone(int i,String s){
	super();
	this.i = i;
	this.s = s;
	}
	
	public String toString(){
		return "type = "+i+" model ="+s;
	}
}
