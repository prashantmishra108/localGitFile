package best;

import java.util.Locale;
import java.util.spi.CurrencyNameProvider;

public class FinalizeExample {
	public void finalize() {
		System.out.println("finalize called");
	}

	public static void main(String[] args) {
		FinalizeExample f1 = new FinalizeExample();
		FinalizeExample f2 = new FinalizeExample();
		f1 = null;
		f2 = null;
//int i=1,j=2;System.out.println(i.equals());
		final Integer a = Integer.valueOf(2);
		final Integer b = Integer.valueOf(2);
		final Integer c = Integer.valueOf(200);
		final Integer d = Integer.valueOf(200);
		final Integer e = Integer.valueOf(2);
		final Integer f = Integer.valueOf(2);
		boolean flag =( a==b );
		System.out.print(a == b);
		System.out.print(c == d);
		System.out.println(e.hashCode() == f.hashCode());
// System.gc();  
		// is an SPI
		/*
		 * CurrencyNameProvider c = new CurrencyNameProvider() {
		 * 
		 * @Override public Locale[] getAvailableLocales() { // TODO Auto-generated
		 * method stub return null; }
		 * 
		 * @Override public String getSymbol(String arg0, Locale arg1) { // TODO
		 * Auto-generated method stub return null; } };
		 */
	}
}