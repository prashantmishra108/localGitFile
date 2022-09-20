package hashMap;

import java.util.HashMap;

public class HashMapJava8 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("teri", 1);
		map.put("mitti", 2);
		map.put("sarso", 3);
		map.put("khalihan", 4);
		map.put("kurban", 5);
		map.put("gul", 6);
		map.put("nadiyo", 7);
		map.put("dilki", 8);
		System.out.println("Using forEach and Lambda in Java 8");
		map.forEach((id, name) -> {
			System.out.println("Key : " + id + " value : " + name);
		});
		System.out.println("Using stream in Java 8");
		map.entrySet().stream().forEach(e -> System.out.println("Key : " + e.getKey() + " value : " + e.getValue()));
		System.out.println("Using keySet in Java 8");
		for (String key : map.keySet()) {
			System.out.println("Key : " + key + " value : " + map.get(key));
		}

	}
}
