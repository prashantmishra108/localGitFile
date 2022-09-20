package best;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 11);
		map.put(4, 11);
		System.out.println(map.hashCode());
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 11);
		map1.put(4, 11);
		System.out.println(map1.hashCode());
		if (map.equals(map1)) {
			System.out.println("equal ");
		}
	}
}
/*
 * static int hash(int h) { // This function ensures that hashCodes that differ
 * only by // constant multiples at each bit position have a bounded // number
 * of collisions (approximately 8 at default load factor). h ^= (h >>> 20) ^ (h
 * >>> 12); return h ^ (h >>> 7) ^ (h >>> 4); }
 */