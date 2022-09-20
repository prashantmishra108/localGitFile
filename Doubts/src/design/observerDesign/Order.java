package design.observerDesign;

public class Order {
	int i=2,j=++i;
	{System.out.println("hello"+j);}
	public Order(){
		System.out.println(i);
	}
	public static void main(String[] args) {
		new Order();
	}
}
