package EffectiveJava.project1;
import java.util.Comparator;
public class PhoneNumber {
	int areaCode , prefix , lineNum;
	// Comparable with comparator construction methods
	private static final Comparator<PhoneNumber> COMPARATOR
	= Comparator.comparingInt((PhoneNumber pn) -> pn.areaCode)
	.thenComparingInt(pn -> pn.prefix)
	.thenComparingInt(pn -> pn.lineNum);
	public int compareTo(PhoneNumber pn) {
	return COMPARATOR.compare(this, pn);
	}
	public static void main(String[] args) {
	PhoneNumber p1 = new PhoneNumber(333, 222, 333);
	PhoneNumber p2 = new PhoneNumber(222, 222, 333);
	System.out.println(p1.compareTo(p2));
}
	public PhoneNumber(int a, int p, int l) {
		areaCode=a;lineNum=l;prefix=p;
	}
}