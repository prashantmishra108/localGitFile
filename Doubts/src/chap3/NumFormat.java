package chap3;

import java.text.NumberFormat;

public class NumFormat {
	public static void main(String[] args) {
		NumberFormat nf1 = NumberFormat.getPercentInstance();
		System.out.println("Percent format: " + nf1.format(0.53207));
		System.out.println(nf1.format(130));
		System.out.println(nf1.hashCode());
		System.out.println(nf1.format(134));
		System.out.println(nf1.hashCode());
		NumberFormat nf2 = NumberFormat.getInstance();
		nf2.setMaximumFractionDigits(4);
		System.out.println(nf2.format(1988766.835436));
		System.out.println(nf2.hashCode());
	}
}
