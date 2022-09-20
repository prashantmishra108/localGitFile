package best;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStreamsReuseNotPossible {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		Stream<Integer> s = arr.stream();
		
		System.out.println(s.filter(e->e%2==0).filter(e->e>2).collect(Collectors.toList())); //2,4
		//works
		//s.filter(e->e!=null).collect(Collectors.toList());
	/*	Multiple markers at this line
		- Type safety: The method collect(Collector) belongs to the raw type Stream. 
		 References to generic type Stream<T> should be parameterized
		- The operator % is undefined for the argument type(s) Object, int
		- Type safety: The method filter(Predicate) belongs to the raw type Stream. 
		 References to generic type Stream<T> should be parameterized
		 */
		System.out.println(arr);
		//s.filter(e->e%2!=0).collect(Collectors.toList());//1,3
		List odd = arr.stream().filter(e->e%2!=0).collect(Collectors.toList());//1,3
		System.out.println(odd);
	}
}
