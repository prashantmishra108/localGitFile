package best;

//You need to override hashCode if your class overrides equals but reverse is not true
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//https://medium.com/javarevisited/internal-working-of-hashmap-in-java-97aeac3c7beb#:~:text=HashMap%20uses%20multiple%20buckets%20and,bucket(singly%20linked%20list).
public class HashcodeEquals {

	public static void main(String a[]) {

		HashMap<PriceII, String> hm = new HashMap<PriceII, String>();
		hm.put(new PriceII("Banana", 20), "Banana");// when put then hashcode only gets called
		hm.put(new PriceII("Apple", 40), "Apple");
		hm.put(new PriceII("Orange", 30), "Orange");
		//printMap(hm);
		PriceII key = new PriceII("Banana", 20);
		System.out.println("Adding duplicate key...");
		hm.put(key, "Grape");
		PriceII diffkey = new PriceII("Banana", 30);
		hm.put(diffkey, "Lemon");
		System.out.println("After adding dulicate key:");
		printMap(hm);
	}

	public static void printMap(HashMap<PriceII, String> map) {
		Set<PriceII> keys = map.keySet();
		Collection<String> hm = map.values();
		System.out.println("printMap value" + hm);
		for (PriceII p : keys) {
			//System.out.print(p);
			//System.out.println();
			//System.out.println("==>" + map.get(p));
		}
	}
}

class PriceII {

	private String item;
	private int price;

	public PriceII(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}

	// if only hashcode method is removed then program supports storing grape and
	// banana values both
	// for key as banana,
	// hm.contains(new Price("Banana",20)) will not give true as result if hashcode
	// is not overridden to
	// return same hashcode. inbuilt hashcode of java will always give diff hashcode
	public int hashCode() {

		int hashcode = 0;
		//hashcode = price * 20;
		hashcode += item.hashCode();
		//System.out.println("hashcode called");
		//System.out.println("item=" + item + "  hashcode=" + hashcode);
		return hashcode;
	}
//hashcode is same but the two keys are not same and hence they are not equals 
	// if only equals is commented still program is adding all the values for
	// duplicate banana keys
	public boolean equals(Object obj) {
		//System.out.println("equals meth called \n item=" + item + "  price=" + price);
		if (obj instanceof PriceII) {
			PriceII pp = (PriceII) obj;
			System.out.println(pp.item.equals(this.item) && pp.price == this.price);
			return (pp.item.equals(this.item) && pp.price == this.price);
		} else {
			System.out.println("eq meth return false");
			return false;
		}
	}
	// if overriding or using both hashcode and equals then first hashcode verifies
	// the last key's hashcode
	// , they are same and then equals is called. Since equals says same or true the
	// value gets overridden.
	// size of map remains to be only 3.

	// if i do not have any of the methods such as hashcode and equals then the
	// duplicate key get
	// added to hashmap into different bucket.
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "ToString item: " + item + "  price: " + price;
	}
}