package chap1;

public class AllWrapper {
public static void main(String[] args) {
	AllWrapper q = new AllWrapper();
	int num = 100;
	q.meth(num);
	Integer num1 = new Integer(200);
	q.meth(num1);
	q.meth(new Float(11.25f));
	float f = 11.11f;
	q.meth(f);q.meth(2.5);
}
void  meth(Double dobj){System.out.println("DoubleObject = "+ dobj);}

void  meth(Object obj){System.out.println("Object = "+ obj);}
//void  meth(int i){System.out.println("int = "+ i);}
//void  meth(double f){System.out.println("double primitvet = "+ f);}
//void  meth(float f){System.out.println("float primitvet = "+ f);}
///void meth(Float f){ System.out.println("FloatObj = "+f);}//for wrraper obj to primtive frt wrapper theh object clas the primitive class mehtod is preferred
void meth(Integer ii) {System.out.println("integer obj = "+ ii);}//first primitive then object and then wrapper is preferred for case of primitve to wrapper conv.
}
