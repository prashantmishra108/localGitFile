package best;

public final class ComplexX {
private final double real;
private final double imaginary;
public ComplexX(final double r, final double i){
	this.real = r;
	this.imaginary= i;
}
public ComplexX add(final ComplexX other){
	return new ComplexX(this.real+other.real,
			this.imaginary+other.imaginary);
}
//hashcode ommited
@Override
public boolean equals(Object o){
	if(o==null || this.getClass()!=o.getClass())return false;
	if(this==o)return true;
	ComplexX complex = (ComplexX)o;
	System.out.println("real= "+real+" complex.real="+complex.real);
	if(Double.compare(real, complex.real)!=0)return false;
	System.out.println("equals=2");
	if(Double.compare(complex.real, real)!=0) return false;
	return true;
}

public static void ComplexAddition(){
	final ComplexX result = new ComplexX(9, 5);
	final ComplexX add1 = new ComplexX(2, 4);
	final ComplexX add2 = new ComplexX(7, 1);
	System.out.println(add2.add(add1).imaginary+" "+add2.add(add1).real+" "+add1.imaginary);
	System.out.println(result.equals(add2.add(add1)));
	System.out.println(result.imaginary == (add2.add(add1).imaginary));
	//result.imaginary = result.imaginary+3;
	System.out.println(add1.imaginary);
}

public static void main(String[] args) {
	ComplexAddition();
}
}
