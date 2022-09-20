package best;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;

/*
 * Java Program to sort a Map by values in Java 8
 * 
 */
public class SortMapByValue {
 
  public static void main(String[] args) throws Exception {
 
    // a Map with string keys and integer values
    Map<String, Integer> budget = new HashMap<>();
    budget.put("clothes", 120);
    budget.put("grocery", 150);
    budget.put("transportation", 100);
    budget.put("utility", 130);
    budget.put("rent", 1150);
    budget.put("miscellneous", 90);
    System.out.println("map before sorting: " + budget);
 
    // let's sort this map by values first
    Map<String, Integer> sorted = budget
        .entrySet()
        .stream()
        .sorted(comparingByValue())
        .collect(
            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                LinkedHashMap::new));
 
    System.out.println("map after sorting by values: " + sorted);
 
    // above code can be cleaned a bit by using method reference
    sorted = budget
        .entrySet()
        .stream()
        .sorted(comparingByValue())
        .collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
 
    // now let's sort the map in decreasing order of value
    sorted = budget
        .entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(
            toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                LinkedHashMap::new));
 
    System.out.println("map after sorting by values in descending order: "
        + sorted);
  }
 
}
/* 
Output
map before sorting: {grocery=150, utility=130, miscellneous=90, rent=1150,
 clothes=120, transportation=100}
map after sorting by values: {miscellneous=90, transportation=100,
 clothes=120, utility=130, grocery=150, rent=1150}
map after sorting by values in descending order: {rent=1150, grocery=150,
 utility=130, clothes=120, transportation=100, miscellneous=90}
 In short, here are the exact steps to sort a HashMap in Java 8 by values in ascending or descending order, assuming you already have a map object

Get the set of entries by calling the Map.entrySet() method
Get the stream of entries by calling stream() method
Call the sorted method with a Comparator
Use the Map.Entry.comparingByValue() comparator to sort entries by values
Collect the result using the collect() method
Use Collectors.toMap() method to get the result in another Map.
Provide LinkedHashMap::new to the last parameter to force it to return a LinkedHashMap, to keep the sorted order preserved
In order to sort in decreasing order, just reverse the order of Comparator using Collections.reverseOrder() or Comparator.reverse() method of Java 8.  See Java SE 8 for Really Impatient for the full list of new methods added into key Java classes e.g. Java Collection Framework, String, and Comparator etc.
*/