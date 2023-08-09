package EffectiveJava.project1;

public class RelationVsCompareTo {
public static void main(String[] args) {
	double d1 =Double.NaN;
    double d2 = Double.NaN;

    System.out.println(Double.valueOf(d1).equals(d2));    //---> true
    System.out.println(Double.valueOf(d1).compareTo(d2));  //---> 0
    System.out.println(d1 == d2);                          //--->false
    System.out.println(d1 > Double.POSITIVE_INFINITY);
    System.out.println(Double.valueOf(d1).compareTo(Double.POSITIVE_INFINITY));
    System.out.println(Double.valueOf(0.0).compareTo(-0.0d));
    System.out.println(0.0d>(-0.0d));
    
}
}
