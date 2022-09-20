package chap5;

class parent{public void methoday(){}}
public class methodCall extends parent {

	public void methodY(){}
	
	public static void main(String[] args) {
	parent obj = new methodCall();
	obj.methody();//object of child class cnt 
	//called parent class methd
	
}
}
