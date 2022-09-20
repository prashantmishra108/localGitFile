package best;
//You need to override hashCode if your class overrides equals but reverse is not true
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
//https://medium.com/javarevisited/internal-working-of-hashmap-in-java-97aeac3c7beb#:~:text=HashMap%20uses%20multiple%20buckets%20and,bucket(singly%20linked%20list).
public class HashcodeEqualsDuplicateKeys {

	public static void main(String a[]) {

		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(new Price("Banana", 20), "Banana");//when put then hashcode only gets called
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Orange", 30), "Orange");
		printMap(hm);
		Price key = new Price("Banana", 20);
		System.out.println("Adding duplicate key...");
		hm.put(key, "Grape");
		System.out.println("After adding dulicate key:");
		printMap(hm);
	}

	public static void printMap(HashMap<Price, String> map) {
		Set<Price> keys = map.keySet();
		Collection<String> hm = map.values();
		System.out.println("value" + hm);
		for (Price p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}

class Price {

	private String item;
	private int price;

	public Price(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}
//if only hashcode method is removed then program supports storing grape and banana values both
// for key as banana,
//hm.contains(new Price("Banana",20)) will not give true as result if hashcode is not overridden to 
//return same hashcode. inbuilt hashcode of java will always give diff hashcode
	public int hashCode() {
		
		int hashcode = 0;
		hashcode = price * 20;
		hashcode += item.hashCode();
		System.out.println("item="+item+"  hashcode="+hashcode);
		return hashcode;
	}
//if only equals is commented still program is adding all the values for duplicate banana keys
	public boolean equals(Object obj) {
		 System.out.println("item="+item+"  price="+price);
		if (obj instanceof Price) {
			Price pp = (Price) obj;
			
			return (pp.item.equals(this.item) && pp.price == this.price);
		} else {
			return false;
		}
	}
//if overriding or using both hashcode and equals then first hashcode verifies the last key's hashcode
//, they are same and then equals is called. Since equals says same or true the value gets overridden.
//size of map remains to be only 3.
	
//if i do not have any of the methods such as hashcode and equals then the duplicate key get
//added to hashmap into different bucket.
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
		return "item: " + item + "  price: " + price;
	}
}