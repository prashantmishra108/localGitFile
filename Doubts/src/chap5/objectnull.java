package chap5;
public class objectnull {
public static void main(String[] args) {
	Vehicle obj=new truck(); ;//= null;
	obj.wheel();
	truck tr = new truck();
	scooter sc = new scooter();
	obj = tr;
	obj.wheel();
	obj = sc;
	sc.wheel();
	//tr = (Vehicle)sc;//not possible
 }
}
abstract class Vehicle{
	public abstract void wheel();
}
class truck extends Vehicle{
	public void wheel(){
		System.out.println("truck");
	}
}
class scooter extends Vehicle{
	public void wheel(){
		System.out.println("scooter");
	}
	
}