package EffectiveJava.project1;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetClass1 {
	public static void main(String[] args) {
		HashSet<Object> hash1 = new HashSet<Object>();
hash1.add(new String("Hello"));hash1.add(new String("Hello"));
hash1.add(new Float(1.00f));hash1.add(new Float(1.0f));
System.out.println(hash1.size());
TreeSet<Object> tree1 = new TreeSet<Object>();
tree1.add(new String("Hello"));tree1.add(new String("Hello"));
System.out.println(tree1.size());
HashSet<BigDecimal> hash3 = new HashSet<BigDecimal>();
hash3.add(new BigDecimal("1.00"));hash3.add(new BigDecimal(1.0));
System.out.println(hash3.size());
TreeSet<BigDecimal> tree3 = new TreeSet<BigDecimal>();
tree3.add(new BigDecimal(1.00));tree3.add(new BigDecimal(1.0));
System.out.println(tree3.size());
	}
}
