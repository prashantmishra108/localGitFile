package tricky;

public class Point {
int x,y;
	public Point(int i, int j) {
		x=i;y=j;
	}
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public void tricky(Point arg1, Point arg2) {
		arg1.x = 100;
		arg1.y = 100;
		Point temp = arg1;//arg1.x=1;
		arg1 = arg2;//arg1.x=2;
		arg2 = temp;//arg1.x=3;
		System.out.println("arg1="+arg1+" "+"arg2="+arg2+" temp="+temp);
		System.out.println("arg1.x="+arg1.x+" "+"arg2.x="+arg2.x+" temp.x="+temp.x);
	}
	public static void main(String [] args) {
		Point pnt1 = new Point(0,0);
		Point pnt2 = new Point(0,0);
		System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
		System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
		System.out.println(" ");
		new Point().tricky(pnt1,pnt2);System.out.println("pnt1="+pnt1+" "+"pnt2="+pnt2);
		System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
		System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
	}
}