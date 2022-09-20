package chap2;

public class ObjectNull {
public void raise() throws InstantiationException, ClassNotFoundException{

	InstantiationException ie=null;
	System.out.println("ie");
	throw ie;
	
}
	public static void main(String[] args) throws InstantiationException,ClassNotFoundException {
		//any excptn which is not a runntime exptn need to be shown in throws clause.
	ObjectNull obj=new ObjectNull();
	obj.raise();
	System.out.println("pp");
}
}
